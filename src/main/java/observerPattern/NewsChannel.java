package observerPattern;

public class NewsChannel implements Channel {
    String news;

    @Override
    public void update(Object o) {
        this.setNews((String)o);
    }

    public void setNews(String news) {
        this.news = news;
        System.out.println("Got a normal notification: " + this.news);
    }

    public String getNews() {
        return "Normal news " + this.news;
    }
}
