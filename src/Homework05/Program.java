package Homework05;

import Homework05.models.TableModel;
import Homework05.presenters.BookingPresenter;
import Homework05.views.BookingView;

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
