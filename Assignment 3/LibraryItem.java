public abstract class LibraryItem {
    protected String title;
    protected String publisher;
    protected int year;
    /*
     * Since this wasnt specified, I used protected in order to save some writing
     * effort ;)
     */

    public LibraryItem(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public abstract void displayDetails();

    public boolean isPublishedBefore(int year) {
        return this.year < year;
    }
}
