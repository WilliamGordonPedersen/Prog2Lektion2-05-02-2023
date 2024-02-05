package Controller;

import Model.Basket;
import Model.Book;
import Model.Discount;
import Model.DiscountType;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addDiscount(new Discount("10% rabat på alt", 10, 0, 0, DiscountType.PROCENT));
        basket.addDiscount(new Discount("25 kr rabat på beløb over 500 kr.", 0, -25, 500, DiscountType.FIXED));
        basket.addDiscount(new Discount("50 kr rabat på beløb over 1000 kr.", 0,-50, 1000, DiscountType.FIXED));
        basket.printTotal();


    }
}
