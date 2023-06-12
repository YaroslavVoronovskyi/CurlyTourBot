package com.gmail.voronovskyi.yaroslav.curlytourbot.config;

import com.gmail.voronovskyi.yaroslav.curlytourbot.bot.CurlyTourBot;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Data
@Component
public class BotInitializer {

    @Autowired
    private CurlyTourBot curlyTourBot;

    @EventListener({ContextRefreshedEvent.class})
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        try {
            telegramBotsApi.registerBot(curlyTourBot);
        } catch (TelegramApiException exception) {
            throw new RuntimeException("Exception ....");
        }
    }
}
