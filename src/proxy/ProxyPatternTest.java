package src.proxy;

import src.proxy.Image;
import src.proxy.ProxyImage;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("property.jpg");
        image.displayFullImage();
    }
}

