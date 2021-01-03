package pl.put.poznan.builder.logic;

public class Metatags implements Page {


    String title;
    String description;
    String keywords;
    String code;

    /**
     * Class constructor
     *
     * @param title         text of meta tag's title
     * @param description   text of meta tag's description
     * @param keywords      text of meta tag's keywords
     * @param code          text of HTML page's code
     */
    public Metatags(String title, String description, String keywords, String code) {
        this.title = title;
        this.description = description;
        this.keywords = keywords;
        this.code = code;
    }

    /**
     * Adds the meta tags to the code
     *
     * Returns code text of HTML page's code
     */
    @Override
    public String addSection() {
        return code +   "<title>" + this.title + "</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"description\" content=\"" + this.description + "\">\n" +
                "<meta name=\"keywords\" content=\"" + this.keywords + "\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n\n";
    }
}
