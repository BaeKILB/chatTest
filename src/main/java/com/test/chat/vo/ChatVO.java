package com.test.chat.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ChatVO {
	private int	chat_id;
    private int room_id;
    private String chat_writer;
    private String chat_content;
    private Timestamp chat_date;
}
