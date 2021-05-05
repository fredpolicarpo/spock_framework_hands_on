import spock.lang.Specification

public interface A {
    String x()
}

class BabysitterFinderSpec extends Specification {

    def "One Babysitter was found, and she's immediately available to the full-time service"() {
        given: "A mother seeking for a babysitter"

        and: "her children are 3 and 1 years old"
        List<Child> children = List.of(new Child(3 * 12), new Child(12))

        and: 'He has  R$ 500,00 in her wallet'
        Wallet wallet = new Wallet()
        wallet.deposit(new BigDecimal("500.00"))
        Customer mother = new Customer(children, wallet)

        and: "She needs the service for 4 hours"
        BabysitterRequest request = new BabysitterRequest(children, 4)

        and: "There is a babysitter that accepts up to 3 children between 6 months and 4 years old available for 4 hours of service"
        ChildrenRuleAcceptance ruleAcceptance = new ChildrenRuleAcceptance(6, 4 * 12)
        Babysitter babysitter = new Babysitter("Fred", ruleAcceptance, 4, new BigDecimal(150))

        BabysitterFinder babysitterFinder = new BabysitterFinder()
        babysitterFinder.register(babysitter)

        and:
        A a = Spy(A) {
            x() >> "Oi"
        }

        when: "The mother request a babysitter"
        def babysitterList = babysitterFinder.findAll(request)
        println a.x()

        then: "The system matches the request with the available babysitter"
        1 == babysitterList.size()
        babysitter == babysitterList[0]
        babysitterList.contains(babysitter)
        2 * a.x()

        and: "The value is discounted of the customer account"
        new BigDecimal("350.00") == mother.getWallet().getBalance()

        and: "The parents receive a confirmation with the details (the babysitter, the cost, and the service period)"
        // Spy that verify it the notification system was invoked
    }
}
