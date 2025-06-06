package qimo.shiyan3;

public class TestBook {
    public static void main(String[] args) {
        Book beek = new Book("JavaCoding科学","帅轩轩",2023);

        beek.showInfo();
        beek.modifyYearPublished(2026);
        beek.showInfo();
    }
}