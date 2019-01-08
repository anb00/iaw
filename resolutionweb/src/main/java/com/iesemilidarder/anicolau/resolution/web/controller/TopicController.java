package com.iesemilidarder.anicolau.resolution.web.controller;


import java.util.ArrayList;
import java.util.List;

import com.iesemilidarder.anicolau.resolution.web.bean.Topic;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	private List<Topic> topics = new ArrayList<Topic>();
	
	public TopicController () {
	  	topics.add(new Topic(1L, "Actividad Swimming",100,"Palma Piscinas Los Hugos"));
    	topics.add(new Topic(2L, "Restaurante CHINA MING",50,"Inca AV Principal"));
    	topics.add(new Topic(3L, "Discotek",15,"Manacor Plaza Central"));
	}
	
    @RequestMapping("/topic/all")
    public List<Topic> getAllTopics() {
        return topics;
    }
    
    @RequestMapping("/topic/{idx}")
    public Topic getTopic(@PathVariable("idx") Integer idx) {
        return topics.get(idx);
    }
}