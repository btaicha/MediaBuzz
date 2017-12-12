package business;

public class Tag {
    
    private Long id;
    private String tag ;
    private static Long count = (long) 0;
    
    

    public Tag() {
        id = ++count;
    }

    public Tag(String tag) {
        this();
        this.tag = "#" + tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return (tag != null ?  tag : "") ;
    }
    
    

}
