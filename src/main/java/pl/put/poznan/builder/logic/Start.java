package pl.put.poznan.builder.logic;

public class Start implements Page {
    String code;

    public Start(String code)
    {
        this.code = code;
    }

    @Override
    public String addSection(){
        return code +   "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n\n"  +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script> \n\n";
    }
}
