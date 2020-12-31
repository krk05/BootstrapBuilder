package pl.put.poznan.builder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.builder.logic.*;
import pl.put.poznan.builder.logic.Object;

@RestController
@RequestMapping("/bootstrap")
public class BootstrapBuilderController {

    public static String main(String header, Boolean footer,String title,String description,String keywords,String tw_linkImg,String card,String og_linkImg,String linkUrl){ String codeText= "";
       codeText = new BootstrapBuilder(new Start(codeText)).run(new Start(codeText));


        if(!(title.equals("")) || !(description.equals("")) || !(keywords.equals(""))){

           codeText = new BootstrapBuilder(new Metatags(title, description, keywords, codeText)).run(new Metatags(title, description, keywords, codeText));
        }

        if(!(title.equals("")) || !(description.equals("")) || !(card.equals("")) || !(tw_linkImg.equals(""))) {
           codeText = new BootstrapBuilder(new MetaTwitter(title, description, tw_linkImg, card, codeText)).run(new MetaTwitter(title, description, tw_linkImg, card, codeText));
        }

        if(!(title.equals("")) || !(description.equals("")) || !(linkUrl.equals("")) || !(og_linkImg.equals(""))) {
           codeText = new BootstrapBuilder(new MetaOg(title, description, og_linkImg, linkUrl, codeText)).run(new MetaOg(title, description, og_linkImg, linkUrl, codeText));
        }
       codeText = new BootstrapBuilder(new Middle(codeText)).run(new Middle(codeText));

        if(header.equals("static")){
           codeText = new BootstrapBuilder(new Header(codeText)).run(new Header(codeText));
        }

        if(header.equals("fixed")){
           codeText = new BootstrapBuilder(new Header(codeText)).run(new Header(codeText));
           codeText = new BootstrapBuilder(new FixedHeader(codeText)).run(new FixedHeader(codeText));
        }
       codeText = new BootstrapBuilder(new Object(codeText)).run(new Object(codeText));
        if(footer) {
           codeText = new BootstrapBuilder(new Footer(codeText)).run(new Footer(codeText));
        }
       codeText = new BootstrapBuilder(new End(codeText)).run(new End(codeText));

        return codeText;
    }
    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(
            @RequestParam(value="header", defaultValue="") String header, //fixed or static or null
            @RequestParam(value="footer", defaultValue="false") Boolean footer,

            @RequestParam(value="title", defaultValue="") String title,

            @RequestParam(value="description", defaultValue="") String description,

            @RequestParam(value="keywords", defaultValue="") String keywords,
            @RequestParam(value="tw_linkImg", defaultValue="") String tw_linkImg,
            @RequestParam(value="card", defaultValue="") String card,
            @RequestParam(value="og_linkImg", defaultValue="") String og_linkImg,
            @RequestParam(value="linkUrl", defaultValue="") String linkUrl

    ){

        // log the parameters

        logger.debug(title);
        logger.debug(description);

        return main(header,footer,title,description,keywords,tw_linkImg,card,og_linkImg,linkUrl);
    }


}


