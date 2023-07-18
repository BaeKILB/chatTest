package com.test.chat.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.chat.mapper.ChatMapper;
import com.test.chat.vo.ChatRoomVO;
import com.test.chat.vo.ChatVO;

@Service
public class ChatService {

	@Autowired
	private ChatMapper mapper;
	
	public int addChat(ChatVO chat) {
		return mapper.insertChat(chat);
	}
	
	public int makeChatRoom(String room_title) {
		ChatRoomVO chatRoom = new ChatRoomVO();
		chatRoom.setRoom_title(room_title);
		System.out.println(chatRoom);
		return mapper.insertChatRoom(chatRoom);
	}
	
	public List<ChatVO> getChatList(int room_id){
		return mapper.selectChatList(room_id);
	}
	
	public List<ChatRoomVO> getChatRoomList(){
		return mapper.selectChatRoomList();
	}
	public ChatRoomVO getChatRoom(int room_id){
		return mapper.selectChatRoom(room_id);
	}
	
}
