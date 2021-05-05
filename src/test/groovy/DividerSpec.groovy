import spock.lang.Specification

class DividerSpec extends Specification {

    def "should divide by itself"() {
        expect:
        r == new Divider(dividend).divide(divisor)

        where:
        dividend                 | divisor                 || r
        new BigDecimal("8.98")   | new BigDecimal("8.98")  || new BigDecimal("1.00")
        new BigDecimal("1.00")   | new BigDecimal("2.00")  || new BigDecimal("0.50")
        new BigDecimal("-10.00") | new BigDecimal("5.00")  || new BigDecimal("-2.00")
        new BigDecimal("10.00")  | new BigDecimal("-5.00") || new BigDecimal("-2.00")
    }
}
