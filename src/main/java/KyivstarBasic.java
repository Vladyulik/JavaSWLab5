/**
 * Represents a basic Kyivstar tariff plan with a fixed subscription fee and configurable client count.
 * Extends {@code KyivstarTariff} and provides a concrete implementation for a basic tariff.
 */
public class KyivstarBasic extends KyivstarTariff {

    /**
     * Constructs a new {@code KyivstarBasic} tariff with a fixed subscription fee of 140 UAH
     * and the specified number of clients.
     *
     * @param clientsCount the number of clients subscribed to this basic tariff.
     */
    public KyivstarBasic(int clientsCount) {
        super(140, clientsCount);
    }

    /**
     * Returns a string representation of this basic tariff.
     * The string includes the subscription fee (fixed at 140 UAH) and the number of clients.
     *
     * @return a string representation of this basic tariff.
     */
    @Override
    public String toString() {
        return "KyivstarBasic {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
