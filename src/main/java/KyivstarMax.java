/**
 * Represents the Kyivstar Max tariff plan with a fixed subscription fee and configurable client count.
 * Extends {@code KyivstarTariff} and provides a concrete implementation for the Max tariff.
 */
public class KyivstarMax extends KyivstarTariff {

    /**
     * Constructs a new {@code KyivstarMax} tariff with a fixed subscription fee of 350 UAH
     * and the specified number of clients.
     *
     * @param clientsCount the number of clients subscribed to this Max tariff.
     */
    public KyivstarMax(int clientsCount) {
        super(350, clientsCount);
    }

    /**
     * Returns a string representation of this Max tariff.
     * The string includes the subscription fee (fixed at 350 UAH) and the number of clients.
     *
     * @return a string representation of this Max tariff.
     */
    @Override
    public String toString() {
        return "KyivstarMax {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
