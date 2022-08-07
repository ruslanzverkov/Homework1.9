public class Main {


    public static void main(String[] args) {

        Author LeoTolstoy = new Author("Leo","Tolstoy");
        Author AlexandrPushkin = new Author("Alexandr", "Pushkin");
        Book WarAndPeace= new Book(1863,"WarAndPeace",LeoTolstoy);
        Book RuslanAndLyudmila = new Book(1820, "RuslanAndLyudmila", AlexandrPushkin);

        WarAndPeace.setYearOfPublication(1870);

        System.out.println(WarAndPeace.yearOfPublication);
    }
}