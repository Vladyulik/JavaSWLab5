public class KyivstarMax extends KyivstarTariff {
    public KyivstarMax(int clientsCount) {
        super(350, clientsCount);
    }

    @Override
    public String toString() {
        return "KyivstarMax {" +
                "subscriptionFeeUAH=" + this.getSubscriptionFeeUAH() +
                ", clientsCount=" + this.getClientsCount() +
                "}";
    }
}
