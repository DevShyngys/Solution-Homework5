Proxy Pattern
What problem was solved?
The Proxy Pattern helps solve the problem of efficiently loading images. For example, in a real estate application, high-resolution images can be large and take time to load. With Proxy Pattern, images are only loaded when needed — like when the user clicks on an image to view it in full size. Also, the Protection Proxy can restrict access, ensuring that only authorized users can upload or modify images.

How did the pattern simplify or optimize the design?
The Proxy Pattern simplified the process by separating the image loading logic from the display logic. The Proxy acts as an intermediary, loading the image only when necessary. This improves performance because the images don’t all load at once; they load only when requested. Also, using the Protection Proxy adds security by allowing only authorized users to upload or change images.

Flyweight Pattern
What problem was solved?
The Flyweight Pattern helps solve the memory issue when dealing with many objects that share common data. For example, in a map application displaying thousands of markers for different places (restaurants, gas stations, hospitals), each marker could have its own style (icon, color, label). Without the Flyweight Pattern, each marker would store the same data (like the restaurant icon), leading to high memory usage. Flyweight helps store the style once and reuse it across multiple markers with the same style.

How did the pattern simplify or optimize the design?
The Flyweight Pattern saved memory by ensuring that one style (like the restaurant icon) is used across all markers that share the same style, rather than creating a new style for each marker. This dramatically reduced memory consumption and made the application more efficient, especially when displaying thousands of markers on the map.

