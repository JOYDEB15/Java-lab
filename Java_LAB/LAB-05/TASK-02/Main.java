    package project1;
    class LibraryBook { 
        String title; 
        String author; 
        int bookID; 
    
        LibraryBook(String title, String author, int bookID) { 
            this.title = title; 
            this.author = author; 
            this.bookID = bookID; 
        } 
    
        void displayBookInfo() { 
            System.out.println("Book ID: " + bookID); 
            System.out.println("Title: " + title); 
            System.out.println("Author: " + author); 
            System.out.println("---------------------------"); 
        } 
    } 
    
    public class Main { 
        public static void main(String[] args) { 
            LibraryBook book1 = new LibraryBook("Banalata Sen", "Jibanananda das", 1); 
            LibraryBook book2 = new LibraryBook("Abar Asibo Phire", "Jibanananda das", 2); 
    
            System.out.println("Library Book Records:"); 
            book1.displayBookInfo(); 
            book2.displayBookInfo(); 
        } 
    } 
