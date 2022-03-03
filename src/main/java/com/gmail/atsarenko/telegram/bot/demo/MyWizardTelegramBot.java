package com.gmail.atsarenko.telegram.bot.demo;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyWizardTelegramBot extends TelegramLongPollingBot {
    private final PropertiesHandler handler = new PropertiesHandler();

    @Override
    public String getBotUsername() {
        return handler.getUsername();
    }

    @Override
    public String getBotToken() {
        return handler.getBotToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            try {
                execute(new SendMessage(chatId.toString(), "Hi " + update.getMessage().getText()));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
