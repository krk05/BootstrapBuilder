//Employee
package pl.put.poznan.builder.logic;


/**
 * This is just an example to show that the logic should be outside the REST service.
 */


public class BootstrapBuilder {

    private final Boolean header;
    private final String position;
    private final Boolean footer;
    private final String title;
    private final String type;
    private final String description;

    public BootstrapBuilder(Boolean header, String position, Boolean footer, String title, String type, String description){

        this.header = header;
        this.position = position;
        this.footer = footer;
        this.title = title;
        this.type = type;
        this.description = description;

    }

    public String transform(){
        /* of course, normally it would do something based on the transforms */
        if(type.equals("Twitter")) return description+"\n";
        else return type;
    }
}
