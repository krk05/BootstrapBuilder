package pl.put.poznan.builder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.builder.logic.*;


@RestController
@RequestMapping("/bootstrap")
public class BootstrapBuilderController {


    public static String main(){

        String w = "";
        w += new BootstrapBuilder(new Poczatek()).wywolanie(new Poczatek());
        w += new BootstrapBuilder(new Metatagi("tytul", "opis", "keywords")).wywolanie(new Metatagi("tytul", "opis", "keywords"));
        w += new BootstrapBuilder(new MetaTwitter("tytul", "opis", "linkObrazek", "card")).wywolanie(new MetaTwitter("tytul", "opis", "linkObrazek", "card"));
        w += new BootstrapBuilder(new MetaOg("tytul", "opis", "linkObrazek", "likUrl")).wywolanie(new MetaOg("tytul", "opis", "linkObrazek", "likUrl"));
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
            @RequestParam(value="header", defaultValue="false") Boolean header,
            @RequestParam(value="position", defaultValue="fixed") String position,
            @RequestParam(value="footer", defaultValue="false") Boolean footer,
            @RequestParam(value="title", defaultValue="title") String title,
            @RequestParam(value="type", defaultValue="Twitter") String type,
            @RequestParam(value="description", defaultValue="moja strona") String description) {
        // log the parameters
        logger.debug(position);
        logger.debug(title);
        logger.debug(type);
        logger.debug(description);

        // perform the transformation, you should run your logic here, below is just a silly example
//        BootstrapBuilder transformer = new BootstrapBuilder(header,position,footer,title,type,description);
//        return transformer.transform();
        return main();
    }


}


