package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    List<Channel> subscribers = new ArrayList<>();
    String news;

    public void addSubscriber(Channel channel) {
        this.subscribers.add(channel);
    }

    public void removeSubscriber(Channel channel) {
        this.subscribers.remove(channel);
    }

    void setNews(String news) {
        this.news = news;
        for (Channel subscriber: this.subscribers) {
           subscriber.update(news);
        }
    }
}
