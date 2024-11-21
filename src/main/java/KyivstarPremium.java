/**
 * Represents a premium Kyivstar tariff plan with a fixed subscription fee and configurable client count.
 * Extends {@code KyivstarTariff} and provides a concrete implementation for a premium tariff.
 */
public class KyivstarPremium extends KyivstarTariff {

    /**
     * Constructs a new {@code KyivstarPremium} tariff with a fixed subscription fee of 220 UAH
     * and the specified number of clients.
     *
     * @param clientsCount the number of clients subscribed to this premium tariff.
     */
    public KyivstarPremium(int clientsCount) {
        super(220, clientsCount);
    }

    /**
     * Returns a string representation of this premium tariff.
     * The string includes the subscription fee (fixed at 220 UAH) and the number of clients.
     *
     * @return a string representation of this premium tariff.
     */
    @Override
    public String toString() {
        return "KyivstarPremium {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
