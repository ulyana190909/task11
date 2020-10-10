package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmTest {
    private ManagerFilm manager = new ManagerFilm();
    private Film firstFilm = new Film(1, 52051, "firstFilms", 500);
    private Film secondFilm = new Film(2, 22052, "secondFilm", 550);
    private Film thirdFilm = new Film(3, 35048, "thirdFilm", 310);
    private Film fourthFilm = new Film(4, 40505, "fourthFilm", 960);
    private Film fifthFilm = new Film(5, 55965, "fifthFilm", 506);
    private Film sixthFilm = new Film(6, 60145, "sixthFilm", 680);
    private Film seventhFilm = new Film(7, 79844, "seventhFilm", 796);
    private Film eighthFilm = new Film(8, 45218, "eighthFilm", 578);
    private Film ninthFilm = new Film(9, 95419, "ninthFilm", 600);
    private Film tenthFilm = new Film(10, 52548, "tenthFilm", 150);
    private Film eleventhFilm = new Film(11, 25958, "eleventhFilm", 680);


    @BeforeEach
    public void setUp() {
        manager.addFilm(firstFilm);
        manager.addFilm(secondFilm);
        manager.addFilm(thirdFilm);
        manager.addFilm(fourthFilm);
        manager.addFilm(fifthFilm);
        manager.addFilm(sixthFilm);
        manager.addFilm(seventhFilm);
        manager.addFilm(eighthFilm);
        manager.addFilm(ninthFilm);
    }

    @Test
    public void addFilmTest() {
        manager.addFilm(tenthFilm);
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{tenthFilm, ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmTest2() {
        manager.addFilm(tenthFilm);
        manager.addFilm(eleventhFilm);
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{eleventhFilm, tenthFilm, ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void showFilmTest() {
        Film[] actual = manager.getFilm();
        Film[] expected = new Film[]{ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(expected, actual);
    }
}
