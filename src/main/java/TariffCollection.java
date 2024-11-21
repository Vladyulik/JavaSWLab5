import java.util.Arrays;

/**
 * Manages a collection of Kyivstar tariffs, providing functionality to add, sort,
 * and retrieve tariffs as well as perform client and price range operations.
 */
public class TariffCollection {
    private KyivstarTariff[] tariffs;

    /**
     * Constructs an empty {@code TariffCollection}.
     * Initializes the collection with no tariffs.
     */
    public TariffCollection() {
        this.tariffs = new KyivstarTariff[0];
    }

    /**
     * Constructs a {@code TariffCollection} initialized with the specified tariffs.
     *
     * @param tariffs an array of {@code KyivstarTariff} objects to initialize the collection with.
     */
    public TariffCollection(KyivstarTariff[] tariffs) {
        this.tariffs = tariffs;
    }

    /**
     * Adds a new tariff to the collection.
     *
     * @param tariff the {@code KyivstarTariff} to be added.
     */
    public void add(KyivstarTariff tariff) {
        KyivstarTariff[] newTariffs = new KyivstarTariff[this.tariffs.length + 1];
        for (int i = 0; i < this.tariffs.length; i++) {
            newTariffs[i] = this.tariffs[i];
        }
        newTariffs[newTariffs.length - 1] = tariff;
        this.tariffs = newTariffs;
    }

    /**
     * Returns all tariffs in the collection as an array.
     *
     * @return an array of {@code KyivstarTariff} objects.
     */
    public KyivstarTariff[] getTariffs() {
        return this.tariffs;
    }

    /**
     * Sets the tariffs in the collection to the specified array.
     *
     * @param tariffs an array of {@code KyivstarTariff} objects to replace the current collection.
     */
    public void setTariffs(KyivstarTariff[] tariffs) {
        this.tariffs = tariffs;
    }

    /**
     * Counts the total number of clients subscribed to all tariffs in the collection.
     *
     * @return the total number of clients.
     */
    public int countClients() {
        int total = 0;
        for (KyivstarTariff tariff : this.tariffs) {
            total += tariff.getClientsCount();
        }
        return total;
    }

    /**
     * Sorts the tariffs in the collection by subscription fee in ascending order.
     * Uses the natural ordering defined by {@code KyivstarTariff#compareTo}.
     */
    public void sortByFee() {
        Arrays.sort(this.tariffs);
    }

    /**
     * Finds the first tariff within the specified subscription fee range.
     *
     * @param minPrice the minimum subscription fee (inclusive).
     * @param maxPrice the maximum subscription fee (inclusive).
     * @return the first {@code KyivstarTariff} within the specified range,
     *         or {@code null} if no such tariff exists.
     */
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

    /**
     * Returns a string representation of all tariffs in the collection.
     * Each tariff is represented on a new line.
     *
     * @return a string containing the details of all tariffs in the collection.
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (KyivstarTariff tariff : this.tariffs) {
            sb.append(tariff.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
