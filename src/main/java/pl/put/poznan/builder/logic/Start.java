package pl.put.poznan.builder.logic;

/**
 * Implements the content of he beginning of HTML document to the HTML page's code
 *
 * @field code stores the code of HTML's page
 */
public class Start implements Page {
    String code;

    /**
     * Class constructor
     *
     * @param code text of the HTML page's code
     */
    public Start(String code) {
        this.code = code;
    }

    /**
     * Adds the start of HTML page's code to the final code
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code + "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n\n"  +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script> \n\n";
    }
}
