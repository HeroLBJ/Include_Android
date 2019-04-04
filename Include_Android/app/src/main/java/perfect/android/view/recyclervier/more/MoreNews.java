package perfect.android.view.recyclervier.more;

import java.io.Serializable;

/**
 * @author libingjun
 * @date 2019/4/4
 */
public class MoreNews implements Serializable {
    private String title;
    private String content;
    private String url;
    private String from;
    private String time;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MoreNews{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", from='" + from + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
