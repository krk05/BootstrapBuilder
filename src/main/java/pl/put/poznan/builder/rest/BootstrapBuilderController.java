package pl.put.poznan.builder.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.builder.logic.BootstrapBuilder;

/**
 * Is responsible for building a HTML page's code
 *
 */
@RestController
@RequestMapping("/bootstrap")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    /**
     * Creates a HTML page's code
     *
     * @param header        content of a HTML's header
     * @param footer        content of a HTML's footer
     * @param title         content of a HTML's title
     * @param description   description of content
     * @param keywords      keywords used in positioning the page
     * @param tw_linkImg    URL of image to use in the card in twitter's meta tags
     * @param card          key-value pair defined in an HTML twitter's meta tags
     * @param og_linkImg    URL of image to use in the card in open graph's meta tags
     * @param linkUrl       the canonical URL for your page using in open graph's meta tags
     *
     * @return code of HTML page
     *
     */
    public static String buildPage(String header, Boolean footer, String title, String description, String keywords, String tw_linkImg, String card, String og_linkImg, String linkUrl) {

        String loggerTmp;
        String codeText = BootstrapBuilder.initPage();

        logger.info("Page build started");

        if (!title.isEmpty() || !description.isEmpty() || !keywords.isEmpty()) {
            codeText = BootstrapBuilder.addMetaTags(title, description, keywords, codeText);
            loggerTmp = "OK";
        } else loggerTmp = "SKIP";

        logger.info("Meta tags: {}", loggerTmp);

        if (!title.isEmpty() || !description.isEmpty() || !card.isEmpty() || !tw_linkImg.isEmpty()) {
            codeText = BootstrapBuilder.addMetaTwitter(title, description, tw_linkImg, card, codeText);
            loggerTmp = "OK";
        } else loggerTmp = "SKIP";

        logger.info("Meta twitter: {}", loggerTmp);

        if (!title.isEmpty() || !description.isEmpty() || !linkUrl.isEmpty() || !og_linkImg.isEmpty()) {
            codeText = BootstrapBuilder.addMetaOg(title, description, og_linkImg, linkUrl, codeText);
            loggerTmp = "OK";
        } else loggerTmp = "SKIP";

        logger.info("Meta og: {}", loggerTmp);

        codeText = BootstrapBuilder.addMiddle(codeText);

        logger.info("Middle added");

        if (header.equals("static")) {
            codeText = BootstrapBuilder.addHeader(codeText);
            loggerTmp = "Static";
        } else if (header.equals("fixed")) {
            codeText = BootstrapBuilder.addFixedHeader(codeText);
            loggerTmp = "Fixed";
        }
        else loggerTmp = "No";

        logger.info("{} header added", loggerTmp);

        codeText = BootstrapBuilder.addObject(codeText);

        logger.info("Object added");

        if (footer.equals("true")) {
            codeText = BootstrapBuilder.addFooter(codeText);
            loggerTmp = "OK";
        } else loggerTmp = "SKIP";

        logger.info("Footer: {}", loggerTmp);

        codeText = BootstrapBuilder.closeTags(codeText);

        logger.info("Tags closed");

        return codeText;
    }

    /**
     * Returns a final String text of HTML page's code specified by user
     *
     * @param header        content of a HTML's header
     * @param footer        content of a HTML's footer
     * @param title         content of a HTML's title
     * @param description   description of content
     * @param keywords      keywords used in positioning the page
     * @param tw_linkImg    URL of image to use in the card in twitter's meta tags
     * @param card          key-value pair defined in an HTML twitter's meta tags
     * @param og_linkImg    URL of image to use in the card in open graph's meta tags
     * @param linkUrl       the canonical URL for your page using in open graph's meta tags
     *
     * @return code of HTML page
     *
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(
            @RequestParam(value = "header", defaultValue = "") String header, //fixed or static or null
            @RequestParam(value = "footer", defaultValue = "false") String footer,
            @RequestParam(value = "title", defaultValue = "") String title,
            @RequestParam(value = "description", defaultValue = "") String description,
            @RequestParam(value = "keywords", defaultValue = "") String keywords,
            @RequestParam(value = "tw_linkImg", defaultValue = "") String tw_linkImg,
            @RequestParam(value = "card", defaultValue = "") String card,
            @RequestParam(value = "og_linkImg", defaultValue = "") String og_linkImg,
            @RequestParam(value = "linkUrl", defaultValue = "") String linkUrl

    ) {
        logger.info("Incoming GET request");

        logger.debug(
                "Header: {}\nFooter: {}\nTitle: {}\nDescription: {}\n" +
                        "Keywords: {}\ntw_linkImg: {}\n Card: {}\n og_linkImg: {}\nlinkUrl: {}",
                header.isEmpty() ? "EMPTY" : header,
                footer.isEmpty() ? "EMPTY" : footer,
                title.isEmpty() ? "EMPTY" : footer,
                description.isEmpty() ? "EMPTY" : description,
                keywords.isEmpty() ? "EMPTY" : keywords,
                tw_linkImg.isEmpty() ? "EMPTY" : tw_linkImg,
                card.isEmpty() ? "EMPTY" : card,
                og_linkImg.isEmpty() ? "EMPTY" : og_linkImg,
                linkUrl.isEmpty() ? "EMPTY" : linkUrl
        );

        String page = buildPage(
                header,
                footer,
                title,
                description,
                keywords,
                tw_linkImg,
                card,
                og_linkImg,
                linkUrl
        );

        logger.info("Page build successful");

        return page;
    }


}


