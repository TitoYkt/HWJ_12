import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {

    Film film = new Film();
    @Test
    public void emptyPosterTest() {


        String[] expected = {};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void onePosterTest() {

        film.addFilm("film1");

        String[] expected = {"film1"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void severalPosterTest() {

        film.addFilm("film1");
        film.addFilm("film2");
        film.addFilm("film3");
        film.addFilm("film4");
        film.addFilm("film5");
        film.addFilm("film6");
        film.addFilm("film7");
        film.addFilm("film8");
        film.addFilm("film9");
        film.addFilm("film10");
        film.addFilm("film11");
        film.addFilm("film12");


        String[] expected = {
                "film1",
                "film2",
                "film3",
                "film4",
                "film5",
                "film6",
                "film7",
                "film8",
                "film9",
                "film10",
                "film11",
                "film12"
        };
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void defaultFindLastPosterTest() {

        film.addFilm("film2");
        film.addFilm("film3");
        film.addFilm("film4");
        film.addFilm("film5");
        film.addFilm("film6");
        film.addFilm("film7");
        film.addFilm("film8");
        film.addFilm("film9");
        film.addFilm("film10");
        film.addFilm("film11");
        film.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
                "film5",
                "film4",
                "film3"

        };
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterEqualThanLimit() {
        Film film = new Film(6);


        film.addFilm("film7");
        film.addFilm("film8");
        film.addFilm("film9");
        film.addFilm("film10");
        film.addFilm("film11");
        film.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7"


        };
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterLessThanLimit() {
        Film film = new Film(7);


        film.addFilm("film7");
        film.addFilm("film8");
        film.addFilm("film9");
        film.addFilm("film10");
        film.addFilm("film11");
        film.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7"


        };
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastPosterMoreThanLimit() {
        Film film = new Film(5);


        film.addFilm("film7");
        film.addFilm("film8");
        film.addFilm("film9");
        film.addFilm("film10");
        film.addFilm("film11");
        film.addFilm("film12");


        String[] expected = {
                "film12",
                "film11",
                "film10",
                "film9",
                "film8"


        };
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}