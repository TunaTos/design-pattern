package creation.simple_factory;

import java.time.LocalDateTime;

public class NewsPost extends Post{

    private String headLine;
    private LocalDateTime newTime;

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public LocalDateTime getNewTime() {
        return newTime;
    }

    public void setNewTime(LocalDateTime newTime) {
        this.newTime = newTime;
    }
}
