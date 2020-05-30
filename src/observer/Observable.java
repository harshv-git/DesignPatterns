package observer;

import java.util.LinkedList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new LinkedList<>();

    protected void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(Observable observable) {
        observers.forEach(observer -> observer.update(observable));
    }
}
