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
    public String start(){
        return "";
    }

    @Override
    public String simpleMeta() {
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
    public String middle() {
        return "";
    }

    @Override
    public String header() {
        return "";
    }

    @Override
    public String fixed() {
        return "";
    }

    @Override
    public String paragraph() {
        return "";
    }

    @Override
    public String footer() {
        return "";
    }

    @Override
    public String end() { return ""; }
}
