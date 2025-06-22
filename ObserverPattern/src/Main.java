import Publisher.YoutubeChannel;
import Subscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber s1 = new Subscriber("Vishnu");
        Subscriber s2 = new Subscriber("Geetha");
        channel.attach(s1);
        channel.attach(s2);
        channel.uploadVideo("Single");
    }
}