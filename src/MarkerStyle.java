package src;

public class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void display(String location) {
        System.out.println("Displaying " + icon + " at " + location + " with " + color + " label in " + labelStyle + " style.");
    }
}

