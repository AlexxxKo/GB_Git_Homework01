package Homework05.models;

import Homework05.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Получить список всех столиков
     *
     * @return коллекция столиков
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     *
     * @param reservationDate дата
     * @param tableNo         номер столика
     * @param name            имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
//        throw new RuntimeException("Некорректный номер столика");
        return -1;
    }

    /**
     * Поменять бронь столика
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public boolean changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table el : loadTables()) {
            Iterator<Reservation> i = el.getReservations().iterator();
            while (i.hasNext()) {
                Reservation e = i.next();
                if (e.getId() == oldReservation) {
                    i.remove();
                    return true;
                }
            }
        }
        return false;
    }


}
