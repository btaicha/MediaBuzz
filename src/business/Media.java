package business;

import java.util.Set;

public abstract class Media {
    
    private String title;
    private String description;
    private Set<Tag> tags;
    private int id ;
    private static int count;
      
    
    public Media() {
        count++;
        id = count;
    }

    public Media(String title) {
        this();
        this.title = title;
    }

    public Media(String title, String description) {
        this();
        this.title = title;
        this.description = description;
    }

    public Media(String title, String description, Set<Tag> tags) {
        this();
        this.title = title;
        this.description = description;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Media.count = count;
    }

    @Override
    public String toString() {
        return "Media [" + (title != null ? "title=" + title + ", " : "")
                + (description != null ? "description=" + description + ", " : "")
                + (tags != null ? "tags=" + tags + ", " : "") + "id=" + id + "]";
    }
    
    

}
