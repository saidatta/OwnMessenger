package chat;

import lombok.EqualsAndHashCode;
import model.User;

import java.util.List;

@EqualsAndHashCode
public class DuoChat extends Chat {

    public DuoChat(List<User> users, String chatName) {
        super(users, chatName);
//        this.setIsGroupChat(Boolean.FALSE);
    }
}
