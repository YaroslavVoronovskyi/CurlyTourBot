package com.gmail.voronovskyi.yaroslav.curlytourbot.bot;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@PropertySource("telegram.properties")
public class CurlyTourBot extends TelegramLongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }
}
