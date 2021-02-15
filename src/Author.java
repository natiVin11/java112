public class Author extends Person {
    private String writing_language;
    private String writing_genre;

    public Author(String name, String last_name, String writing_language, String writing_genre) {
        super(name, last_name);
        this.writing_language = writing_language;
        this.writing_genre = writing_genre;
    }

    public String getWriting_language() {
        return writing_language;
    }

    public void setWriting_language(String writing_language) {
        this.writing_language = writing_language;
    }

    public String getWriting_genre() {

        return writing_genre;
    }

    public void setWriting_genre(String writing_genre)
    {
        this.writing_genre = writing_genre;
    }
}
