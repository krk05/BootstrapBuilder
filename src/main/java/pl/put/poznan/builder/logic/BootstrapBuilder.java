package pl.put.poznan.builder.logic;

/**
 * Adds specified sections to HTML page's code
 */
public class BootstrapBuilder {
    /**
     * Inits the HTML page as empty page
     *
     * @return code of HTML page
     */
    public static String initPage() {
        Page builder = new Start("");
        return builder.addSection();
    }

    /**
     * Adds meta tag to the code
     *
     * @param title         content of meta tag's title
     * @param description   description of content
     * @param keywords      keywords used in positioning the page
     * @param codeText      code of HTML page
     *
     * @return code updated of meta tag using to positioning
     */
    public static String addMetaTags(String title, String description, String keywords, String codeText) {
        return new Metatags(title, description, keywords, codeText).addSection();
    }

    /**
     * Adds Twitter meta tag to the code
     *
     * @param title         content of Twitter meta tag's title
     * @param description   description of content
     * @param tw_linkImg    URL of image to use in the card in twitter's meta tags
     * @param card          key-value pair defined in an HTML twitter's meta tags
     * @param codeText      code of HTML page
     *
     * @return code updated of meta tag of twitter using to positioning
     */
    public static String addMetaTwitter(String title, String description, String tw_linkImg, String card, String codeText) {
        return new MetaTwitter(title, description, tw_linkImg, card, codeText).addSection();
    }

    /**
     * Adds OpenGraph meta tag to the code
     *
     * @param title         content of OpenGraph meta tag's title
     * @param description   description of content
     * @param og_linkImg    URL of image to use in the card in open graph's meta tags
     * @param linkUrl       the canonical URL for your page using in open graph's meta tags
     * @param codeText      code of Open Graph using in HTML
     *
     * @return code updated of meta tags of open graph using to positioning
     */
    public static String addMetaOg(String title, String description, String og_linkImg, String linkUrl, String codeText) {
        return new MetaOg(title, description, og_linkImg, linkUrl, codeText).addSection();
    }

    /**
     * Adds body section to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of ended head section and started body section
     */
    public static String addMiddle(String codeText){
        return new Middle(codeText).addSection();
    }

    /**
     * Adds header section to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of header
     */
    public static String addHeader(String codeText){
        return new Header(codeText).addSection();
    }

    /**
     * Adds header section which is specified as fixed to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of fixed header
     */
    public static String addFixedHeader(String codeText){
        codeText = addHeader(codeText);
        return new FixedHeader(codeText).addSection();
    }

    /**
     * Adds object section to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of main tag with class container
     */
    public static String addObject(String codeText){
        return new Object(codeText).addSection();
    }

    /**
     * Adds footer section to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of footer
     */
    public static String addFooter(String codeText){
        return new Footer(codeText).addSection();
    }

    /**
     * Adds closes tags sections to the code
     *
     * @param codeText      code of HTML page
     *
     * @return code updated of end
     */
    public static String closeTags(String codeText){
        return new End(codeText).addSection();
    }
}




