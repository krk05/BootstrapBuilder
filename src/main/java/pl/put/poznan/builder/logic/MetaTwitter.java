package pl.put.poznan.builder.logic;

public class MetaTwitter implements Page {

    String title;
    String description;
    String image;
    String card;
    String code;

    public MetaTwitter(String title, String description, String image, String card, String code)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.card = card;
        this.code = code;
    }

    @Override
    public String addSection() {
        return code +   "<meta name=\"twitter:title\" content=\"" + this.title + "\">\n" +
                "<meta name=\"twitter:description\" content=\"" + this.description + "\" >\n" +
                "<meta name=\"twitter:image\" content=\"" + this.image + "\">\n" +
                "<meta name=\"twitter:card\" content=\"" + this.card + "\">\n\n";
    }
}
