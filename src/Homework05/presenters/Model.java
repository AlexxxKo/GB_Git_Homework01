package Homework05.presenters;

import OOP_Seminar05.Task01.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);

    int[] changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
