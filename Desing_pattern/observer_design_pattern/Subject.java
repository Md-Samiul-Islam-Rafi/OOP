package Desing_pattern.observer_design_pattern;

// Subject interface
public interface Subject {

    void addObserver(Observer userName);
    void removeObserver(Observer userName);
    void notifyObserver(String Message);
}
