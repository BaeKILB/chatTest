package com.test.chat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.chat.vo.ChatRoomVO;
import com.test.chat.vo.ChatVO;

@Mapper
public interface ChatMapper {
	
	int insertChat(ChatVO chat);
	int insertChatRoom(ChatRoomVO chatRoom);
	List<ChatRoomVO> selectChatRoomList();
	List<ChatVO> selectChatList(int room_id);
	ChatRoomVO selectChatRoom(int room_id);
}
