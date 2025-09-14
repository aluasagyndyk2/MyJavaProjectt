// Product + Builder
public class Report {
    private final String title;
    private final String author;
    private final int pages;
    private final boolean hasGraphs;
    private final boolean hasSummary;

    // Приватный конструктор — создаем только через Builder
    private Report(ReportBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
        this.hasGraphs = builder.hasGraphs;
        this.hasSummary = builder.hasSummary;
    }

    // -------- Вложенный класс Builder --------
    public static class ReportBuilder {
        private String title;
        private String author;
        private int pages;
        private boolean hasGraphs;
        private boolean hasSummary;

        public ReportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public ReportBuilder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public ReportBuilder setHasGraphs(boolean hasGraphs) {
            this.hasGraphs = hasGraphs;
            return this;
        }

        public ReportBuilder setHasSummary(boolean hasSummary) {
            this.hasSummary = hasSummary;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

    @Override
    public String toString() {
        return "Report {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", hasGraphs=" + hasGraphs +
                ", hasSummary=" + hasSummary +
                '}';
    }
}
