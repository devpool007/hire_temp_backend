package hello;

import java.util.Date;
import java.util.List;

public class Messages {
    public int id;
    public Date timestamp;
    public String message_content,message_link;
    public String tags;

    public Messages(int id, Date timestamp, String message_content, String message_link,String tags){
        this.id = id;
        this.timestamp = timestamp;
        this.message_content = message_content;
        this.message_link = message_link;
        this.tags = tags;

    }
}
