package pl.put.poznan.builder.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.builder.logic.BootstrapBuilder;


@RestController
@RequestMapping("/bootstrap")
public class BootstrapBuilderController {

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
        BootstrapBuilder transformer = new BootstrapBuilder(header,position,footer,title,type,description);
        return transformer.transform();
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(
                      @RequestBody Boolean header,
                      @RequestBody String position,
                      @RequestBody Boolean footer,
                      @RequestBody String title,
                      @RequestBody String type,
                      @RequestBody String description
                       ) {

        // log the parameters
        logger.debug(position);
        logger.debug(title);
        logger.debug(type);
        logger.debug(description);

        // perform the transformation, you should run your logic here, below is just a silly example
        BootstrapBuilder transformer = new BootstrapBuilder(header,position,footer,title,type,description);
        return transformer.transform();
    }



}


