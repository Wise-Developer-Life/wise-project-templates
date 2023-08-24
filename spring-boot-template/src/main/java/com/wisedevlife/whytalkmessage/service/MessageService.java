package com.wisedevlife.whytalkmessage.service;

import com.wisedevlife.whytalkmessage.dto.request.MessageRequest;
import com.wisedevlife.whytalkmessage.entity.Message;
import org.springframework.data.domain.Page;

public interface MessageService {
    Page<Message> getPagedMessagesByChatRoomId(String chatRoomId, int offset, int limit);

    Message saveMessage(MessageRequest messageRequest);
}
