/**
 * Demonstrates the usage of the {@code TariffCollection} class and its associated
 * methods for managing a collection of Kyivstar tariffs.
 * <p>
 * The program creates a {@code TariffCollection}, adds various types of tariffs
 * ({@code KyivstarMax}, {@code KyivstarBasic}, {@code KyivstarPremium}), sorts them
 * by subscription fee, calculates the total number of clients, and finds a tariff
 * within a specified subscription fee range.
 * </p>
 */
public class App {

    /**
     * The main entry point of the application.
     * Executes the following steps:
     * 1. Creates a {@code TariffCollection} instance.
     * 2. Adds various tariffs to the collection.
     * 3. Displays the tariffs before and after sorting by subscription fee.
     * 4. Calculates and displays the total number of clients across all tariffs.
     * 5. Finds and displays the first tariff within a subscription fee range of 200 UAH to 300 UAH.
     *
     * @param args command-line arguments passed to the application (not used in this example).
     */
    public static void main(String[] args) {
        TariffCollection tariffs = new TariffCollection();

        tariffs.add(new KyivstarMax(100000));
        tariffs.add(new KyivstarBasic(1600000));
        tariffs.add(new KyivstarPremium(300000));

        System.out.println("Tariffs before sorting:");
        System.out.println(tariffs);
        System.out.println();

        tariffs.sortByFee();

        System.out.println("Tariffs after sorting:");
        System.out.println(tariffs);
        System.out.println();

        int clientsCount = tariffs.countClients();
        System.out.println("Total clients count: " + clientsCount);
        System.out.println();

        KyivstarTariff tariff = tariffs.findInRange(200, 300);
        System.out.println("Found tariff in 200UAH - 300UAH price range:");
        System.out.println(tariff);
    }
}
