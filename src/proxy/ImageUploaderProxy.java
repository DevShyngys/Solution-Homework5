package src.proxy;

public class ImageUploaderProxy extends ProxyImage {
    private boolean userLoggedIn;

    public ImageUploaderProxy(String filename, boolean userLoggedIn) {
        super(filename);
        this.userLoggedIn = userLoggedIn;
    }

    @Override
    public void displayFullImage() {
        if (!userLoggedIn) {
            System.out.println("Access Denied. Please log in to view high-res images.");
        } else {
            super.displayFullImage();
        }
    }
}
