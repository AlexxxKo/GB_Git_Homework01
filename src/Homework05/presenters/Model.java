package Homework05.presenters;

import Homework05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);

    boolean changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
