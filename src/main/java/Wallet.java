import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Wallet {
    private BigDecimal balance = new BigDecimal("0.00");

    public BigDecimal deposit(final BigDecimal deposit) {
        this.balance = this.balance.add(deposit);
        return this.balance;
    }

    public BigDecimal withdraw(final BigDecimal withdraw) {
        this.balance = this.balance.subtract(withdraw);
        return this.balance;
    }
}
