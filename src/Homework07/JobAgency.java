package Homework07;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers) {
            observer.recieveOffer(companyName, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    List<Observer> observers = new ArrayList<>();

}
