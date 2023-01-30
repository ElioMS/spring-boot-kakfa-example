package pe.chwa.kafka.http;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.chwa.kafka.http.model.MessageRequest;

@RestController
@RequestMapping("/api/messages")
public record MessageController(MessageService messageService) {
    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest){
        messageService.publish(messageRequest.message());
    }
}
