package Homework07;

public interface Publisher {
    void sendOffer(Vacancy vacancy);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);


    void registerVacancy(Vacancy vacancy);
    void removeVacancy(Vacancy vacancy);
}
