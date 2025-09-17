// Our Product class – Report
public class Report {
    // Fields of the report
    private final String title;
    private final String author;
    private final String content;
    private final String footer;
    private final boolean hasTable;
    private final boolean hasChart;

    // Private constructor – can only be called from Builder
    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.footer = builder.footer;
        this.hasTable = builder.hasTable;
        this.hasChart = builder.hasChart;
    }

    // Getters – used to read values
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
    public String getFooter() { return footer; }
    public boolean hasTable() { return hasTable; }
    public boolean hasChart() { return hasChart; }

    // toString – makes object readable when we print it
    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", footer='" + footer + '\'' +
                ", hasTable=" + hasTable +
                ", hasChart=" + hasChart +
                '}';
    }

    // Builder class – step by step construction of Report
    public static class Builder {
        private String title;
        private String author;
        private String content;
        private String footer;
        private boolean hasTable;
        private boolean hasChart;

        // Each method sets one field and returns Builder again
        public Builder setTitle(String title) {
            this.title = title;
            return this; // allows chain calls
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        // Add or remove table
        public Builder includeTable(boolean hasTable) {
            this.hasTable = hasTable;
            return this;
        }

        // Add or remove chart
        public Builder includeChart(boolean hasChart) {
            this.hasChart = hasChart;
            return this;
        }

        // Final step – return the ready Report object
        public Report build() {
            return new Report(this);
        }
    }
}
