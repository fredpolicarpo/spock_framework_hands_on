import java.math.BigDecimal;

public class Divider {
    private final BigDecimal dividend;

    public Divider(final BigDecimal dividend) {
        this.dividend = dividend;
    }

    public BigDecimal divide(final BigDecimal divisor) {
       return this.dividend.divide(divisor);
    }
}
