package com.ai.service;

/**
 * @author aibinru
 * @date 24-8-7 13:28
 * @description:
 */
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;

public interface ChatService {
    GenerationResult chatAi(String question) throws NoApiKeyException, InputRequiredException;
}
