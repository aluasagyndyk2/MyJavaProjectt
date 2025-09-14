public class Main {
    public static void main(String[] args) {
        Report salesReport = new Report.Builder()
                .setTitle("Monthly Sales Report")
                .setAuthor("Alua Sag")
                .setContent("This report contains monthly sales data...")
                .setFooter("Confidential")
                .includeTable(true)
                .includeChart(true)
                .build();

        Report summaryReport = new Report.Builder()
                .setTitle("Weekly Summary")
                .setAuthor("Team Lead")
                .setContent("This is a weekly summary of project progress.")
                .includeTable(false)
                .includeChart(false)
                .build();

        System.out.println(salesReport);
        System.out.println(summaryReport);
    }
}