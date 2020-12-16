package pl.put.poznan.builder.logic;

public class MetaTwitter implements Page {

    String title;
    String description;
    String image;
    String card;

    public MetaTwitter(String title, String description, String image, String card)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.card = card;
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
        return "<meta name=\"twitter:title\" content=" + this.title + ">\n" +
                "<meta name=\"twitter:description\" content= " + this.description + " >\n" +
                "<meta name=\"twitter:image\" content=" + this.image + ">\n" +
                "<meta name=\"twitter:card\" content=" + this.card + ">";
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
