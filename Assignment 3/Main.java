public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("A Game of Thrones", "Random House", 1996, "George R. R. Martin", 694);
        Book book2 = new Book("A Clash of Kings", "Random House", 1998, "George R. R. Martin", 768);

        DVD dvd1 = new DVD("Law Abiding Citizen", "Overture Films", 2009, 109, "F. Gary Gray");
        DVD dvd2 = new DVD("Shutter Island", "Paramount Pictures ", 2010, 138, "Martin Scorsese");

        Magazine magazine1 = new Magazine("National Geographic", "National Geographic Society", 2024, 1, "Jannuary");
        Magazine magazine2 = new Magazine("National Geographic", "National Geographic Society", 2025, 2, "February");

        book1.displayDetails();
        book2.displayDetails();

        dvd1.displayDetails();
        dvd2.displayDetails();

        magazine1.displayDetails();
        magazine2.displayDetails();

        System.out.println(book1.isPublishedBefore(1997));
        System.out.println(book2.isPublishedBefore(1997));
        System.out.println(dvd1.isPublishedBefore(2010));
        System.out.println(dvd2.isPublishedBefore(2010));
        System.out.println(magazine1.isPublishedBefore(2025));
        System.out.println(magazine2.isPublishedBefore(2024));

    }
}
