package Homework05.views;

import Homework05.models.Table;
import Homework05.presenters.View;
import Homework05.presenters.ViewObserver;

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
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    @Override
    public void printChangeReservationTableResult(boolean reservation) {
        System.out.println(reservation ? "Ваша прошлая бронь аннулирована" : "Неверно указан номер предыдущего бронирование. Укажите, пожалуйста, правильный номер");
    }
}
