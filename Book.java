class Book {
        static String title;
        static int year;
        static String author;

        /*Book(String title, int year, String author) {
            this.title = title;
            this.year = year;
            this.author = author; 
        } */

        public static void displayInfo(String newName, int newYear, String newAuthor) {
            title = newName;
            year = newYear;
            author = newAuthor;
        }
    }
