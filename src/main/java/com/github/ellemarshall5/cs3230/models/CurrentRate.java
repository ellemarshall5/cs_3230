package com.github.ellemarshall5.cs3230.models;

public class CurrentRate {
    //copy infor from postman

    private String date;
    private String explanation;
    private String url;
    private String title;

    public CurrentRate(String date, String explanation, String url, String title) {
        this.date = date;
        this.explanation = explanation;
        this.url = url;
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Apod{" +
                "\n\tdate='" + date + '\'' +
                ",\n\texplanation='" + explanation + '\'' +
                ",\n\t url='" + url + '\'' +
                ",\n\t title='" + title + '\'' +
                '}';
    }
}
