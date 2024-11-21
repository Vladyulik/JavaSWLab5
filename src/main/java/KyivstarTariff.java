/**
 * Represents a Kyivstar tariff plan with a subscription fee and a client count.
 * This class is abstract and intended to be extended for specific tariff implementations.
 * Implements {@code Comparable} to allow tariffs to be compared by their subscription fee.
 */
public abstract class KyivstarTariff implements Comparable<KyivstarTariff> {
    private int subscriptionFeeUAH;
    private int clientsCount;

    /**
     * Constructs a new {@code KyivstarTariff} with the specified subscription fee and client count.
     *
     * @param subscriptionFeeUAH the subscription fee in UAH.
     * @param clientsCount       the number of clients.
     */
    public KyivstarTariff(int subscriptionFeeUAH, int clientsCount) {
        this.subscriptionFeeUAH = subscriptionFeeUAH;
        this.clientsCount = clientsCount;
    }

    /**
     * Returns the subscription fee of this tariff in UAH.
     *
     * @return the subscription fee in UAH.
     */
    public int getSubscriptionFeeUAH() {
        return this.subscriptionFeeUAH;
    }

    /**
     * Returns the number of clients subscribed to this tariff.
     *
     * @return the number of clients.
     */
    public int getClientsCount() {
        return this.clientsCount;
    }

    /**
     * Sets the number of clients subscribed to this tariff.
     *
     * @param clientsCount the new number of clients.
     */
    public void setClientsCount(int clientsCount) {
        this.clientsCount = clientsCount;
    }

    /**
     * Compares this tariff with another based on their subscription fees.
     * Tariffs are ordered by their subscription fee in ascending order.
     *
     * @param other the {@code KyivstarTariff} to be compared with.
     * @return a negative integer, zero, or a positive integer as this tariff's subscription fee
     *         is less than, equal to, or greater than the specified tariff's subscription fee.
     */
    @Override
    public int compareTo(KyivstarTariff other) {
        if (this.getSubscriptionFeeUAH() > other.getSubscriptionFeeUAH()) { return 1; }
        if (this.getSubscriptionFeeUAH() < other.getSubscriptionFeeUAH()) { return -1; }
        return 0;
    }

    /**
     * Returns a string representation of this tariff.
     * The string includes the subscription fee and the number of clients.
     *
     * @return a string representation of this tariff.
     */
    @Override
    public String toString() {
        return "KyivstarTariff {" +
               "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
               ", clientsCount=" + this.getClientsCount() +
               "}";
    }
}
