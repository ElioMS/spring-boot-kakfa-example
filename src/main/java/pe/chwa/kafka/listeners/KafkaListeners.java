package pe.chwa.kafka.listeners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "#{${chwa.kafka.topic-name}}", groupId = "groupCHWA")
    void listener(String data) {
        System.out.println("Listener received "+ data);
    }
}
