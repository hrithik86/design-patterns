package observerPattern;

public class Main {
    public static void main(String[] args) {
        NewsPublisher pb = new NewsPublisher();
        Channel newsChannel = new NewsChannel();
        Channel slackChannel = new SlackChannel();
        pb.addSubscriber(newsChannel);
        pb.addSubscriber(slackChannel);
        pb.setNews("News - 1");
        pb.removeSubscriber(slackChannel);
        pb.setNews("News - 2");
    }
}
