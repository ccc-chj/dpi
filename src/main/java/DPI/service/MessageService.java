package DPI.service;

import java.util.List;

import DPI.entity.Message;

public interface MessageService {
	void insertMessage(Message message);
	/**
	 * 
	 * @param sender 发送人
	 * @param addressee 收信人
	 * @return
	 */
	List<Message> loadMessageByUser(String sender, String addressee);
}
