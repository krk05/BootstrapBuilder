package pl.put.poznan.builder.logic;

public class BootstrapBuilder {

    private Page builder;
    public BootstrapBuilder(Page builder){

        this.builder= builder;
    }

    public static String run(Page builder)
    {
        String codeText = "";
        codeText = codeText + builder.start();
        codeText = codeText + builder.simpleMeta();
        codeText = codeText + builder.twitterMeta();
        codeText = codeText + builder.ogMeta();
        codeText = codeText + builder.header();
        codeText = codeText + builder.fixed();
        codeText = codeText + builder.middle();
        codeText = codeText + builder.paragraph();
        codeText = codeText + builder.footer();
        codeText = codeText + builder.end();
        return codeText;
    }
}




