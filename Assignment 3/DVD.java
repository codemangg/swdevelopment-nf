public class DVD extends LibraryItem {
    private int duration;
    private String director;

    public DVD(String title, String publisher, int year, int duration, String director) {
        super(title, publisher, year);
        this.duration = duration;
        this.director = director;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Director: " + director);
        System.out.println();
    }
}