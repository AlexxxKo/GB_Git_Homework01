package Homework05;

import OOP_Seminar05.Task01.models.TableModel;
import OOP_Seminar05.Task01.presenters.BookingPresenter;
import OOP_Seminar05.Task01.views.BookingView;

import java.util.Date;

/**
 * Спроектировать программный комплекс, который позволяет бронировать столики в ресторане
 */

public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(101, new Date(), 1, "Станислав");
    }
}
