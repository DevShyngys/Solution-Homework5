package src;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("property.jpg");
        image.displayFullImage();
    }
}

