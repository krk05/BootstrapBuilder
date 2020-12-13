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
        poczatek a = new poczatek();
        metatagi b = new metatagi("tytul", "opis", "keywords");
        metaTwitter bb = new metaTwitter("tytul", "opis", "linkObrazek", "card");
        metaOg bbb = new metaOg("tytul", "opis", "linkObrazek", "likUrl");
        srodek c = new srodek();
        nagłowek_ d = new nagłowek_();
        ruchomyNaglowek e = new ruchomyNaglowek();
        obiekt f = new obiekt();
        stopka_ g = new stopka_();
        koncowka h = new koncowka();


        BootstrapBuilder directora=new BootstrapBuilder(a);
        BootstrapBuilder directorb=new BootstrapBuilder(b);
        BootstrapBuilder directorbb=new BootstrapBuilder(bb);
        BootstrapBuilder directorbbb=new BootstrapBuilder(bbb);
        BootstrapBuilder directorc=new BootstrapBuilder(c);
        BootstrapBuilder directord=new BootstrapBuilder(d);
        BootstrapBuilder directore=new BootstrapBuilder(e);
        BootstrapBuilder directorf=new BootstrapBuilder(f);
        BootstrapBuilder directorg=new BootstrapBuilder(g);
        BootstrapBuilder directorh=new BootstrapBuilder(h);

        w += directora.wywolanie(a);
        w += directorb.wywolanie(b);
        w += directorbb.wywolanie(bb);
        w += directorbbb.wywolanie(bbb);
        w += directorc.wywolanie(c);
        w += directord.wywolanie(d);
        w += directore.wywolanie(e);
        w += directorf.wywolanie(f);
        w += directorg.wywolanie(g);
        w += directorh.wywolanie(h);

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


