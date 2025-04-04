package src;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading high-res image: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying " + filename);
    }
}

