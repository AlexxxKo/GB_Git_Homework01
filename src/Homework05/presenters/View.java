package Homework05.presenters;

import OOP_Seminar05.Task01.models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отобразить списка столиков в представлении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Регистраци наблюдателя
     * @param observer
     */
    void setObserver(ViewObserver observer);

    /**
     * Распечатать результат бронирования столика
     * @param reservationNo
     */
    void printReservationTableResult(int reservationNo);

    void printChangeReservationTableResult(int[] reservationNo);
}
