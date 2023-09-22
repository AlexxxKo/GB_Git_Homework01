package Homework05.views;

import OOP_Seminar05.Task01.models.Table;
import OOP_Seminar05.Task01.presenters.View;
import OOP_Seminar05.Task01.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте выполнить операцию позже.");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name) {
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
    }

    @Override
    public void printChangeReservationTableResult(int[] reservationNo) {
        System.out.printf("Ваша прошлая бронь #%d анулирована.  Новый столик успешно забронирован. Номер брони #%d\n",
                reservationNo[0], reservationNo[1]);
    }
}
