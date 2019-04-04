package perfect.android.view.recyclervier.simple;

public class New {
    private String title;
    private String content;
    private String time;
    private String from;

    public New(String title, String content, String time, String from) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}
