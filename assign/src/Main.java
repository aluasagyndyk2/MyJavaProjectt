public class Main {
    public static void main(String[] args) {
        Report salesReport = new Report.Builder()
                .setTitle("Monthly Sales Report")
                .setAuthor("Alua Sagyndyk")
                .setContent("This report contains monthly sales data.")
                .setFooter("Confidential")
                .includeTable(true)
                .includeChart(true)
                .build();

        // Getters қолдану → warning кетеді
        System.out.println("Title: " + salesReport.getTitle());
        System.out.println("Author: " + salesReport.getAuthor());
        System.out.println("Content: " + salesReport.getContent());
        System.out.println("Footer: " + salesReport.getFooter());
        System.out.println("Table included: " + salesReport.hasTable());
        System.out.println("Chart included: " + salesReport.hasChart());
    }
}