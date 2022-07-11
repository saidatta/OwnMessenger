package chat;

import lombok.EqualsAndHashCode;
import model.User;

import java.util.List;

@EqualsAndHashCode
public class GroupChat extends Chat {

    public GroupChat(List<User> users, String groupChatName) {
        super(users, groupChatName);
//        this.setIsGroupChat(Boolean.TRUE);
    }
}
