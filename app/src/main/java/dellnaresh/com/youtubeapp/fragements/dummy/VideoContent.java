package dellnaresh.com.youtubeapp.fragements.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class VideoContent {

    /**
     * An array of sample (dummy) videos.
     */
    public static List<Video> videos = new ArrayList<Video>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Video> videoItemMap = new HashMap<String, Video>();

    static {
        // Add 3 sample items.
        addItem(new Video("1", "Video 1"));
        addItem(new Video("2", "Video 2"));
        addItem(new Video("3", "Video 3"));
    }

    private static void addItem(Video video) {
        videos.add(video);
        videoItemMap.put(video.id, video);
    }

    /**
     * A dummy item representing a piece of title.
     */
    public static class Video {
        public String id;
        public String title;
        public boolean downloaded;

        public boolean isDownloaded() {
            return downloaded;
        }

        public void setDownloaded(boolean downloaded) {
            this.downloaded = downloaded;
        }

        public Video(String id, String title) {
            this.id = id;
            this.title = title;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
