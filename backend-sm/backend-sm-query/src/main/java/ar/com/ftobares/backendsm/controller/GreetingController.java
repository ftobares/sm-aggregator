package ar.com.ftobares.backendsm.controller;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.HtmlUtils;

import ar.com.ftobares.backendsm.message.Greeting;
import ar.com.ftobares.backendsm.message.HelloMessage;

@Controller
public class GreetingController {

	
	// Ver esto 
	// https://stackoverflow.com/questions/32826309/how-to-invoke-spring-stomp-web-socket-method-from-rest-client
	@MessageMapping("/{user}/{boardId}")
    @SendTo("/topic/greetings")
    public Greeting greeting(@PathVariable("user") String user, @PathVariable("boardId") Long boardId) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Sending interest of board "+ boardId.toString() + " usuario "+ user);
    }
	
}
