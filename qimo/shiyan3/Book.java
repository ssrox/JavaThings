package qimo.shiyan3;

public class Book {

    private String bookNo;
    private String bookTitle;
    private String author;
    private int yearPublished;

    // 构造方法
    public Book(String bookNo, String bookTitle, String author, int yearPublished) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter和Setter方法
    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int year) {
        if (year > 0 && year <= 2025) {
            this.yearPublished = year; // 直接赋值给成员变量
        } else {
            System.out.println("输入的年份不合法");
        }
    }

    // 显示信息方法
    public void showInfo() {
        System.out.println("书名：" + bookTitle);
        System.out.println("书号：" + bookNo);
        System.out.println("作者：" + author);
        System.out.println("出版年份：" + yearPublished);
    }
}
