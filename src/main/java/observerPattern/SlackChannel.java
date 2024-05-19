package observerPattern;

public class SlackChannel implements Channel{
    String news;

    @Override
    public void update(Object o) {
        this.setNews((String)o);
    }

    public void setNews(String news) {
        this.news = news;
        System.out.println("Got a slack notification: " + this.news);
    }

    public String getNews() {
        return "Slack news " + this.news;
    }
}
