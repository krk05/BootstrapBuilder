package pl.put.poznan.builder.logic;

public class Metatags implements Page {

    String title;
    String description;
    String keywords;

    public Metatags(String title, String description, String keywords)
    {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
    }

    @Override
    public String start(){
        return "";
    }

    @Override
    public String simpleMeta() {
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
