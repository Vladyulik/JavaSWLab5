public class KyivstarBasic extends KyivstarTariff {
    public KyivstarBasic(int clientsCount) {
        super(140, clientsCount);
    }

    @Override
    public String toString() {
        return "KyivstarBasic {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
