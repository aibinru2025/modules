package com.ai.service.impl;

/**
 * @author aibinru
 * @date 24-8-7 13:28
 * @description:
 */
import com.ai.service.ChatService;
import com.ai.service.QianWenChat;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public GenerationResult chatAi(String question) throws NoApiKeyException, InputRequiredException {
        return  QianWenChat.callWithMessage(question);
    }
}
