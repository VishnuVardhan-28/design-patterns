package Publisher;

import Subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> observers = new ArrayList<>();

    private String latestVideo;

    public void uploadVideo(String title){
        this.latestVideo = title;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void dettach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observers){
            obs.update(latestVideo);
        }
    }
}
