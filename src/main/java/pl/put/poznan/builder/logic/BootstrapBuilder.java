package pl.put.poznan.builder.logic;

public class BootstrapBuilder {

    private Page builder;
    public BootstrapBuilder(Page builder){

        this.builder= builder;
    }

    public static String run(Page builder)
    {
        return builder.addSection();
    }
}




