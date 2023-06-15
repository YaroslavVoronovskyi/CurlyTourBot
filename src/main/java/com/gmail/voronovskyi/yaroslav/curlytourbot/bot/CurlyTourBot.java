package com.gmail.voronovskyi.yaroslav.curlytourbot.bot;

import com.gmail.voronovskyi.yaroslav.curlytourbot.service.IUserService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Data
@Component
@EqualsAndHashCode(callSuper = false)
@PropertySource("telegram.properties")
public class CurlyTourBot extends TelegramLongPollingBot {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurlyTourBot.class);

    @Value("${bot.name}")
    private String botName;

    @Value("${bot.token}")
    private String botToken;

    private final IUserService userService;

    @Autowired
    public CurlyTourBot(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
