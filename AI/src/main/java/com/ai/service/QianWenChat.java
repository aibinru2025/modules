package com.ai.service;

/**
 * @author aibinru
 * @date 24-8-7 13:27
 * @description:
 */
import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.aigc.generation.models.QwenParam;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.MessageManager;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.alibaba.dashscope.utils.Constants;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QianWenChat {
    public static GenerationResult callWithMessage(String question) throws NoApiKeyException, ApiException, InputRequiredException
    {
        Constants.apiKey="sk-f14961f730ad4ac59c20e1420b073122";
        Generation gen = new Generation();
        MessageManager msgManager = new MessageManager(10);
        Message systemMsg =
                Message.builder().role(Role.SYSTEM.getValue()).content("You are a helpful assistant.").build();
        Message userMsg = Message.builder().role(Role.USER.getValue()).content(question).build();
        msgManager.add(systemMsg);
        msgManager.add(userMsg);
        QwenParam param =
                QwenParam.builder().model(Generation.Models.QWEN_TURBO).messages(msgManager.get())
                        .resultFormat(QwenParam.ResultFormat.MESSAGE)
                        .topP(0.8)
                        .enableSearch(true)
                        .build();
        GenerationResult result = gen.call(param);
        log.info("千问api回答的话语为：{}",result);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws NoApiKeyException, InputRequiredException {
        //需要JDK17
        QianWenChat.callWithMessage("hello");
    }
}
