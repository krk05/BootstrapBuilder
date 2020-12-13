package pl.put.poznan.builder.logic;

public class metatagi implements page {

    String title;
    String description;
    String keywords;

    public metatagi(String title, String description, String keywords)
    {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
    }

    @Override
    public String poczatek(){
        return "";
    }

    @Override
    public String zwykleMeta() {
        return "<title>" + this.title + "</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"description\" content=\"" + this.description + "\"/>" +
                "<meta name=\"keywords\" content=\"" + this.keywords + "\"/>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">";
    }

    @Override
    public String twitterMeta(){
        return "";
    }

    @Override
    public String ogMeta() {
        return "";
    }

    @Override
    public String pomiedzy() {
        return "";
    }

    @Override
    public String naglowek() {
        return "";
    }

    @Override
    public String fixed() {
        return "";
    }

    @Override
    public String akapit() {
        return "";
    }

    @Override
    public String stopka() {
        return "";
    }

    @Override
    public String koniec() { return ""; }
}
