package Publisher;

import Subscriber.Observer;

public interface Subject {
    public void attach(Observer obs);
    public void dettach(Observer obs);
    public void notifyObservers();
}
