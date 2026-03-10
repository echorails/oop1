package Task1.Taskb;

public class Book extends LibraryItem {

    private int numberOfPages;

    public Book(String title, String author, int year){
        super(title, author, year);
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setNumberOfPages(int pages){
        this.numberOfPages = pages;
    }

    @Override
    public String toString(){
        return super.toString() + ", Pages: " + numberOfPages;
    }
{
    
}
}