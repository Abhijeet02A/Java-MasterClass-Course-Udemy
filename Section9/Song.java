package Section9;

public class Song {
    private String title;
    private double duration;

    public Song(String argTitle, double argduration) {
        title = argTitle;
        duration = argduration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
