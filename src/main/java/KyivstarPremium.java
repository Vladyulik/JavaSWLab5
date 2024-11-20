public class KyivstarPremium extends KyivstarTariff {
    public KyivstarPremium(int clientsCount) {
        super(220, clientsCount);
    }

    @Override
    public String toString() {
        return "KyivstarPremium {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
