package src;

public class FlyweightPatternTest {
    public static void main(String[] args) {
        MarkerStyle restaurantStyle = MarkerFactory.getMarkerStyle("restaurant_icon.png", "green", "bold");
        Marker marker1 = new Marker("Location 1", restaurantStyle);
        Marker marker2 = new Marker("Location 2", restaurantStyle);
        marker1.render();
        marker2.render();
        
        System.out.println("Unique marker styles: " + MarkerFactory.getUniqueStylesCount());
    }
}
