package pl.put.poznan.builder.logic;

public class BootstrapBuilder {
    public static String initPage() {
        Page builder = new Start("");
        return builder.addSection();
    }

    public static String addMetaTags(String title, String description, String keywords, String codeText) {
        return new Metatags(title, description, keywords, codeText).addSection();
    }

    public static String addMetaTwitter(String title, String description, String tw_linkImg, String card, String codeText) {
        return new MetaTwitter(title, description, tw_linkImg, card, codeText).addSection();
    }

    public static String addMetaOg(String title, String description, String og_linkImg, String linkUrl, String codeText) {
        return new MetaOg(title, description, og_linkImg, linkUrl, codeText).addSection();
    }

    public static String addMiddle(String codeText){
        return new Middle(codeText).addSection();
    }

    public static String addHeader(String codeText){
        return new Header(codeText).addSection();
    }

    public static String addFixedHeader(String codeText){
        codeText = addHeader(codeText);
        return new FixedHeader(codeText).addSection();
    }

    public static String addObject(String codeText){
        return new Object(codeText).addSection();
    }

    public static String addFooter(String codeText){
        return new Footer(codeText).addSection();
    }

    public static String closeTags(String codeText){
        return new End(codeText).addSection();
    }
}




