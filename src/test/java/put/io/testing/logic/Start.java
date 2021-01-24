package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class Start {

    private String result;
    private Page tester;
    private String start;

    @BeforeEach
    public void setUp(){
        this.start =  "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n\n"  +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script> \n\n";
    }

    @Test
    public void testEmptyStart(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.Start(this.result);
        assertEquals(this.start, this.tester.addSection());
    }

    @Test
    public void testNotEmptyStart(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.Start(this.result);
        assertEquals(this.result + this.start, this.tester.addSection());
    }
}
