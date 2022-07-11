package chat;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import message.ChatMessage;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chat {
    @Getter
    private String id;

    @NotNull
    @Getter
    private String chatName;

    @Getter
    private List<User> users;

    @Getter
    private List<ChatMessage> chatMessages;

    @Getter
    @Setter
    private Boolean isGroupChat;

    public Chat(List<User> users, String chatName) {
        this.id = UUID.randomUUID().toString();
        this.users = users;
        this.chatMessages = new ArrayList<>();
        this.chatName = chatName;
    }
}
