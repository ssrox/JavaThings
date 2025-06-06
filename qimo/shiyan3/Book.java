package qimo.shiyan3;

public class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void showInfo(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
    }
    public void modifyYearPublished(int newYear){
        this.year = newYear;
    }
}