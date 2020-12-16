package pl.put.poznan.builder.logic;

public class MetaOg implements Page {

    String title;
    String description;
    String image;
    String url;

    public MetaOg(String title, String description, String image, String url)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    @Override
    public String poczatek(){
        return "";
    }

    @Override
    public String zwykleMeta() {
        return "";
    }

    @Override
    public String twitterMeta(){
        return "";
    }

    @Override
    public String ogMeta() {
        return "<meta property=\"og:title\" content=" + this.title + ">\n" +
                "<meta property=\"og:description\" content=" + this.description + ">\n" +
                "<meta property=\"og:image\" content=" + this.image + ">\n" +
                "<meta property=\"og:url\" content=" + this.url + ">";
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
