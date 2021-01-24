package pl.put.poznan.builder.logic;
/**
 * Implements the content of twitter's meta tags to the HTML page's code
 */
public class MetaTwitter implements Page {
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
     * stores the key-value pair
     */
    String card;
    /**
     * stores the code of HTML's page
     */
    String code;

    /**
     *
     * @param title         title of content
     * @param description   description of content
     * @param image         URL of image to use in the card
     * @param card          key-value pair of twitter defined in an HTML meta tag
     * @param code          code of HTML page
     */
    public MetaTwitter(String title, String description, String image, String card, String code)
    {
        this.title = title;
        this.description = description;
        this.image = image;
        this.card = card;
        this.code = code;
    }

    /**
     * Adds to the code Twitter meta tags
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code +   "<meta name=\"twitter:title\" content=\"" + this.title + "\">\n" +
                "<meta name=\"twitter:description\" content=\"" + this.description + "\">\n" +
                "<meta name=\"twitter:image\" content=\"" + this.image + "\">\n" +
                "<meta name=\"twitter:card\" content=\"" + this.card + "\">\n\n";
    }
}
