import java.util.Arrays;

public class TariffCollection {
    private KyivstarTariff[] tariffs;

    public TariffCollection() {
        this.tariffs = new KyivstarTariff[0];
    }

    public TariffCollection(KyivstarTariff[] tariffs) {
        this.tariffs = tariffs;
    }

    public void add(KyivstarTariff tariff) {
        KyivstarTariff[] newTariffs = new KyivstarTariff[this.tariffs.length + 1];
        for (int i = 0; i < this.tariffs.length; i++) {
            newTariffs[i] = this.tariffs[i];
        }
        newTariffs[newTariffs.length - 1] = tariff;
        this.tariffs = newTariffs;
    }

    public KyivstarTariff[] getTariffs() {
        return this.tariffs;
    }

    public void setTariffs(KyivstarTariff[] tariffs) {
        this.tariffs = tariffs;
    }

    public int countClients() {
        int total = 0;
        for (KyivstarTariff tariff : this.tariffs) {
            total += tariff.getClientsCount();
        }
        return total;
    }

    public void sortByFee() {
        Arrays.sort(this.tariffs);
    }

    public KyivstarTariff findInRange(int minPrice, int maxPrice) {
        for (KyivstarTariff tariff : this.tariffs) {
            if (tariff.getSubscriptionFeeUAH() >= minPrice) {
                if (tariff.getSubscriptionFeeUAH() <= maxPrice) {
                    return tariff;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (KyivstarTariff tariff : this.tariffs) {
            sb.append(tariff.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
