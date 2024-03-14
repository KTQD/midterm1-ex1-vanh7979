public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("em cua ngay hom qua", "son tung", "1234", 100000, 12);
        Book book = new Book("harry poter", "phep thuat", "1234", 200000, "someone", 3000, "magic");

        mp3.showInfo();
        book.showInfo();
    }
}
