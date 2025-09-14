public class Main {
    public static void main(String[] args) {
        Report report = new Report.ReportBuilder()
                .setTitle("Annual Sales Report")
                .setAuthor("Alua Sagyndyk")
                .setPages(30)
                .setHasGraphs(true)
                .setHasSummary(true)
                .build();

        System.out.println(report);
    }
}
