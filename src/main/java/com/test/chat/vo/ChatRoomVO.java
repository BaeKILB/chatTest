package com.test.chat.vo;

import java.util.HashSet;
import java.util.Set;
import org.springframework.web.socket.WebSocketSession;

import lombok.Data;

@Data
public class ChatRoomVO {
	private int room_id;
	private String room_title;
	private Set<WebSocketSession> sessions = new HashSet<>();
	
}
