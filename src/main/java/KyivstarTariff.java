public abstract class KyivstarTariff implements Comparable<KyivstarTariff> {
    private int subscriptionFeeUAH;
    private int clientsCount;

    public KyivstarTariff(int subscriptionFeeUAH, int clientsCount) {
        this.subscriptionFeeUAH = subscriptionFeeUAH;
        this.clientsCount = clientsCount;
    }

    public int getSubscriptionFeeUAH() {
        return this.subscriptionFeeUAH;
    }

    public int getClientsCount() {
        return this.clientsCount;
    }

    public void setClientsCount(int clientsCount) {
        this.clientsCount = clientsCount;
    }

    @Override
    public int compareTo(KyivstarTariff other) {
        if (this.getSubscriptionFeeUAH() > other.getSubscriptionFeeUAH()) { return 1; }
        if (this.getSubscriptionFeeUAH() < other.getSubscriptionFeeUAH()) { return -1; }
        return 0;
    }

    @Override
    public String toString() {
        return "KyivstarTariff {" +
               "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
               ", clientsCount=" + this.getClientsCount() +
               "}";
    }
}
