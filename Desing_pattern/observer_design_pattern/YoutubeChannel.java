package Desing_pattern.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;
    private String latestVedioTitle;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void uploadVedio(String title) {
        this.latestVedioTitle = title;
        notifyObserver(title);
    }

    public void addObserver(Observer userName){
        observers.add(userName);
    }

    public void removeObserver(Observer username) {
        observers.remove(username);
    }

    @Override
    public void notifyObserver(String title){
        this.latestVedioTitle = title;
        for ( Observer observer : observers){
            observer.update(channelName, latestVedioTitle);
        }
    }
}