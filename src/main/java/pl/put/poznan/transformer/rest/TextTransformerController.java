//LoadDatabase.java + EmployeeController + EmployeeNotFoundAdvice
package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.TextTransformer;

import java.util.Arrays;


@RestController
@RequestMapping("/bootstrap")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

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
        TextTransformer transformer = new TextTransformer(header,position,footer,title,type,description);
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
        TextTransformer transformer = new TextTransformer(header,position,footer,title,type,description);
        return transformer.transform();
    }



}


