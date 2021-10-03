package cz.wesecon.kafkaclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaClientApplication {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaClientApplication.class, args);
	}

	@KafkaListener(id = "my-group", topics = "my-topic")
	public void listen(String message) {
		LOG.info("Received message:" + message);
	}

}
