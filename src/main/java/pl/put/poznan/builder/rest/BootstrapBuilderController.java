package pl.put.poznan.builder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.builder.logic.*;


@RestController
@RequestMapping("/bootstrap")
public class BootstrapBuilderController {


    public static String main(String header, Boolean footer,String title,String twitter_title,String og_title,String description,String twitter_description,String og_description,String keywords,String tw_linkObrazek,String card,String og_linkObrazek,String linkUrl){
        String w = "";
        w += new BootstrapBuilder(new Poczatek()).wywolanie(new Poczatek());
        w += new BootstrapBuilder(new Metatagi(title, description, keywords)).wywolanie(new Metatagi(title, description, keywords));
        w += new BootstrapBuilder(new MetaTwitter(twitter_title, twitter_description, tw_linkObrazek, card)).wywolanie(new MetaTwitter(twitter_title, twitter_description, tw_linkObrazek, card));
        w += new BootstrapBuilder(new MetaOg(og_title, og_description, og_linkObrazek, linkUrl)).wywolanie(new MetaOg(og_title, og_description, og_linkObrazek, linkUrl));
        w += new BootstrapBuilder(new Srodek()).wywolanie(new Srodek());
        w += new BootstrapBuilder(new Nagłowek()).wywolanie(new Nagłowek());
        w += new BootstrapBuilder(new RuchomyNaglowek()).wywolanie(new RuchomyNaglowek());
        w += new BootstrapBuilder(new Obiekt()).wywolanie(new Obiekt());
        w += new BootstrapBuilder(new Koncowka()).wywolanie(new Koncowka());

        return w;
    }
    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(
            @RequestParam(value="header", defaultValue="fixed") String header, //fixed or static
            @RequestParam(value="footer", defaultValue="false") Boolean footer,

            @RequestParam(value="title", defaultValue="title") String title,
            @RequestParam(value="twitter_title", defaultValue="title") String twitter_title,
            @RequestParam(value="og_title", defaultValue="title") String og_title,

            @RequestParam(value="description", defaultValue="description") String description,
            @RequestParam(value="twitter_description", defaultValue="description") String twitter_description,
            @RequestParam(value="og_description", defaultValue="description") String og_description,

            @RequestParam(value="keywords", defaultValue="keywords") String keywords,
            @RequestParam(value="tw_linkObrazek", defaultValue="linkObrazek") String tw_linkObrazek,
            @RequestParam(value="card", defaultValue="card") String card,
            @RequestParam(value="og_linkObrazek", defaultValue="og_linkObrazek") String og_linkObrazek,
            @RequestParam(value="linkUrl", defaultValue="linkUrl") String linkUrl
    ){

        // log the parameters

        logger.debug(title);
        logger.debug(description);

        return main(header,footer,title,twitter_title,og_title,description,twitter_description,og_description,keywords,tw_linkObrazek,card,og_linkObrazek,linkUrl);
    }


}


