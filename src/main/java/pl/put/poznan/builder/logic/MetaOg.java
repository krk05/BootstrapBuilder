package pl.put.poznan.builder.logic;

/**
 * Implements the content of the open graph's meta tags to the HTML page's code
 */
public class MetaOg implements Page {
    /**
     *  stores the title of content
     */
    String title;
    /**
     * stores the description of content
     */
    String description;
    /**
     * stores the URL of the image
     */
    String image;
    /**
     * stores the canonical URL for your page
     */
    String url;
    /**
     * stores the code of HTML's page
     */
    String code;

    /**
     * Class constructor
     *
     * @param title         title of content
     * @param description   description of content
     * @param image         the URL of the image that appears when someone shares the content to Facebook
     * @param url           the canonical URL for your page
     * @param code          code of HTML page
     */
    public MetaOg(String title, String description, String image, String url, String code)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
        this.code = code;
    }

    /**
     * Adds to code the meta objects (blocks) with title, description, image and url
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code + "<meta property=\"og:title\" content=\"" + this.title + "\">\n" +
                "<meta property=\"og:description\" content=\"" + this.description + "\">\n" +
                "<meta property=\"og:image\" content=\"" + this.image + "\">\n" +
                "<meta property=\"og:url\" content=\"" + this.url + "\">\n\n";
    }
}
