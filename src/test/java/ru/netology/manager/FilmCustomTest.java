package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmCustomTest {
    private ManagerFilms manager = new ManagerFilms(5);
    private Film firstFilm = new Film(1, 52051, "firstFilms", 500);
    private Film secondFilm = new Film(2, 22052, "secondFilm", 550);
    private Film thirdFilm = new Film(3, 35048, "thirdFilm", 310);
    private Film fourthFilm = new Film(4, 40505, "fourthFilm", 960);
    private Film fifthFilm = new Film(5, 55965, "fifthFilm", 506);
    private Film sixthFilm = new Film(6, 60145, "sixthFilm", 680);

    @BeforeEach
    public void setUp() {
        manager.addFilm(firstFilm);
        manager.addFilm(secondFilm);
        manager.addFilm(thirdFilm);
        manager.addFilm(fourthFilm);
    }

    @Test
    public void addFilmTest() {
        manager.addFilm(fifthFilm);
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmTest2() {
        manager.addFilm(fifthFilm);
        manager.addFilm(sixthFilm);
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilmTest() {
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }
}

