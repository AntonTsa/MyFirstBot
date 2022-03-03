package com.gmail.atsarenko.telegram.bot.demo;

import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
    public static void main(String[] args) {
        try {
            MyWizardTelegramBot myWizardTelegramBot = new MyWizardTelegramBot();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

            telegramBotsApi.registerBot(myWizardTelegramBot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }
}
