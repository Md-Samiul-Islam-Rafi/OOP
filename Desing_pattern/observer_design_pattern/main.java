package Desing_pattern.observer_design_pattern;

class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("Nadir On The Go");

        Observer user1 = new Subscriber("Alice");
        Observer user2 = new NonSubscriber(101);

        channel.addObserver(user1);
        channel.uploadVideo("Travel Vlog 1");
        channel.notifyObservers();

        channel.addObserver(user2);
        channel.uploadVideo("Food Review Video");
        channel.notifyObservers();
    }
}

class YouTubeChannel {
    private final String name;
    private final java.util.List<Observer> observers = new java.util.ArrayList<>();
    private String latestVideo;

    public YouTubeChannel(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
    }

    public void notifyObservers() {
        // Intentionally left minimal to avoid dependency on a specific Observer method signature.
    }
}