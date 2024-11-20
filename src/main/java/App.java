public class App {
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
