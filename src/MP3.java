public class MP3 extends Item{

    private int duration;
    public MP3(String name, String description, String ID, float price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }
    @Override
    public void showInfo() {
        System.out.println("MP3 Name: " + name);
        System.out.println("MP3 Description: " + getDescription());
        System.out.println("MP3 ID: " + ID);
        System.out.println("MP3 Price: " + price);
        System.out.println("MP3 Duration: " + duration);

    }
}

