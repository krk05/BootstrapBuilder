package pl.put.poznan.builder.logic;

public class MetaOg implements Page {

    String title;
    String description;
    String image;
    String url;
    String code;

    public MetaOg(String title, String description, String image, String url, String code)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
        this.code = code;
    }
    @Override
    public String addSection() {
        return code + "<meta property=\"og:title\" content=\"" + this.title + "\">\n" +
                "<meta property=\"og:description\" content=\"" + this.description + "\">\n" +
                "<meta property=\"og:image\" content=\"" + this.image + "\">\n" +
                "<meta property=\"og:url\" content=\"" + this.url + "\">\n\n";
    }
}
