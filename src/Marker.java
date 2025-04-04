package src;

public class Marker {
    private String location;
    private MarkerStyle style;

    public Marker(String location, MarkerStyle style) {
        this.location = location;
        this.style = style;
    }

    public void render() {
        style.display(location);
    }
}
