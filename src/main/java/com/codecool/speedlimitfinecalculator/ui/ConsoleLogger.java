package com.codecool.speedlimitfinecalculator.ui;

import com.codecool.speedlimitfinecalculator.service.logger.Logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    public void logInfo(String message) {
        logMessage(message, "INFO");
    }

    public void logError(String message) {
        logMessage(message, "ERROR");
    }

    private void logMessage(String message, String type) {
        String entry = "[" + LocalDateTime.now() + "] " + type + ": " + message;
        System.out.println(entry);
    }
}
