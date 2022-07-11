package controller;

import lombok.extern.slf4j.Slf4j;
import service.ChatMessagingService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@Path("chat")
@Slf4j
public class MessagingController {

    ChatMessagingService chatMessagingService = new ChatMessagingService();

    @Path("{chat_id}/{message_id}")
    @Consumes({TEXT_PLAIN})
    @DELETE
    public Response deleteMessage() {
        return null;
    }

    @Path("send/{own_user_id}/{user_id}")
    @Consumes({TEXT_PLAIN})
    @POST
    public Response sendMessage(@PathParam("own_user_id") String ownUserId, @PathParam("user_id") String targetUserId,
                                final String textMessage) {

        return Response.ok(chatMessagingService.sendMessage(ownUserId, targetUserId, textMessage)).build();
    }

    @Path("{chat_id}/{message_id}")
    @Consumes({TEXT_PLAIN})
    @PUT
    public Response updateMessage() {
    return null;
    }
}
