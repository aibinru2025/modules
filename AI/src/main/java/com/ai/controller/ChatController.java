package com.ai.controller;

/**
 * @author aibinru
 * @date 24-8-7 13:29
 * @description:
 */
import com.ai.service.ChatService;
import com.ai.util.R;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping("/chat/{question}")
    public R chatAi(@PathVariable String question) throws NoApiKeyException, InputRequiredException {
        GenerationResult generationResult = chatService.chatAi(question);
        return R.success("success",generationResult);
    }
}
