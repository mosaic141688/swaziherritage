package io.github.mosaic141688.swaziherritage.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<MenuItem> ITEMS = new ArrayList<MenuItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, MenuItem> ITEM_MAP = new HashMap<String, MenuItem>();

    private static final int COUNT = 25;

    /*static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }*/

    static {
        addItem(new MenuItem("01","Swazi4U","This Section gives you access to Swazi Mobile USSD Codes","Swazi4U"));
        addItem(new MenuItem("02","News","Get the latest news from local news outlets' websites","News"));
        addItem(new MenuItem("03","Sports","Recent summary of local and international sports","Sports"));
        addItem(new MenuItem("04","Entertainment & Tourism","Updates in Tourism and Entertainment","Entertainment & Tourism"));
    }

    private static void addItem(MenuItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*private static MenuItem createDummyItem(int position) {
        return new MenuItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class MenuItem {
        public final String id;
        public final String content;
        public final String details;
        public final String title;



        public MenuItem(String id, String content, String details, String title) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.title = title;
        }


        @Override
        public String toString() {
            return content;
        }
    }
}
