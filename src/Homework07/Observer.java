package Homework07;

public interface Observer {
    void recieveOffer(String nameCompany, String vacancy, int salary);

    boolean getFinderStatus();
}
