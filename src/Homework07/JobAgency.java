package Homework07;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    @Override
    public void sendOffer(Vacancy vacancy) {
        registerVacancy(vacancy);
        for (Observer observer : observers) {
            if (observer.getFinderStatus())
                observer.recieveOffer(vacancy.getCompanyName(), vacancy.getName(), vacancy.getSalary());
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

    @Override
    public void registerVacancy(Vacancy vacancy) {
        vacancies.add(vacancy);
    }

    @Override
    public void removeVacancy(Vacancy vacancy) {
        vacancies.remove(vacancy);
    }

    List<Observer> observers = new ArrayList<>();
    List<Vacancy> vacancies = new ArrayList<>();

}
