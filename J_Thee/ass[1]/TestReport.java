public class TestReport {
    public static void main(String[] args) {
        Report WeatherReport = new WeatherReport();
        Report PM25Report = new PM25Report();
        Report PeopleReport = new PeopleReport();

        System.out.println(WeatherReport.getReport());
        System.out.println(PM25Report.getReport());
        System.out.println(PeopleReport.getReport());


        
    }
}
