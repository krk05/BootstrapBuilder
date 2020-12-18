package pl.put.poznan.builder.logic;

public interface Page {
    String start();

    String simpleMeta();

    String twitterMeta();

    String ogMeta();

    String middle();

    String header();

    String fixed();

    String paragraph();

    String footer();

    String end();

}
