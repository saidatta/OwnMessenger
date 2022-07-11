package message;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode
public class ChatMessage {
    @Getter
    private String id;

    @Getter
    @Setter
    private String content;

    // The chat this message is associated to.
    @Getter
    private String chatId;

    @Getter
    @Setter
    private Boolean hasBeenRead;

    @Getter
    private List<User> messageReadBy;

    public ChatMessage(String chatId, String content) {
        this.id =  UUID.randomUUID().toString();
        this.chatId = chatId;
        this.content = content;
        this.messageReadBy = new ArrayList<>();
    }
}
