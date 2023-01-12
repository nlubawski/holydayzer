public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidays = new Holidays();

        String[] allHolydays = holidays.getHolidays();

        for (int i = 0; i < allHolydays.length; i++)
            System.out.println(allHolydays[i]);
    }
}
