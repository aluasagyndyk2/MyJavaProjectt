// Product class
public class Report {
    private final String title;
    private final String author;
    private final String content;
    private final String footer;
    private final boolean hasTable;
    private final boolean hasChart;

    // Private constructor (тек Builder қолдансын)
    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.footer = builder.footer;
        this.hasTable = builder.hasTable;
        this.hasChart = builder.hasChart;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getContent() { return content; }
    public String getFooter() { return footer; }
    public boolean hasTable() { return hasTable; }
    public boolean hasChart() { return hasChart; }

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

    // Builder inner class
    public static class Builder {
        private String title;
        private String author;
        private String content;
        private String footer;
        private boolean hasTable;
        private boolean hasChart;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
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

        public Builder includeTable(boolean hasTable) {
            this.hasTable = hasTable;
            return this;
        }

        public Builder includeChart(boolean hasChart) {
            this.hasChart = hasChart;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}