package com.epam.training.student_aliaksandr_kavaliou.web_Driver_Task.Links;

public enum Links {
    HomepageGmail("https://www.google.com/intl/ru/gmail/about/"),
    HomepageYandex("https://360.yandex.ru/mail/");

    private final String link;

    Links(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }
}
