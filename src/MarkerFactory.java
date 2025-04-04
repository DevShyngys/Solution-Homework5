package src;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static Map<String, MarkerStyle> styleCache = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String icon, String color, String labelStyle) {
        String key = icon + color + labelStyle;
        if (!styleCache.containsKey(key)) {
            styleCache.put(key, new MarkerStyle(icon, color, labelStyle));
        }
        return styleCache.get(key);
    }

    public static int getUniqueStylesCount() {
        return styleCache.size();
    }
}

