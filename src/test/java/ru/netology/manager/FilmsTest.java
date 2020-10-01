package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Films;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsTest {
    private ManagerFilms manager = new ManagerFilms();
    private Films firstFilm = new Films(1, 52051, "firstFilms", 500, 1);
    private Films secondFilm = new Films(2, 22052, "secondFilm", 550, 2);
    private Films thirdFilm = new Films(3, 35048, "thirdFilm", 310, 3);
    private Films fourthFilm = new Films(4, 40505, "fourthFilm", 960, 4);
    private Films fifthFilm = new Films(5, 55965, "fifthFilm", 506, 5);
    private Films sixthFilm = new Films(6, 60145, "sixthFilm", 680, 6);
    private Films seventhFilm = new Films(7, 79844, "seventhFilm", 796, 7);
    private Films eighthFilm = new Films(8, 45218, "eighthFilm", 578, 8);
    private Films ninthFilm = new Films(9, 95419, "ninthFilm", 600, 9);
    private Films tenthFilm = new Films(10, 01010, "tenthFilm", 650, 10);
    private Films eleventhFilm = new Films(11, 64111, "eleventhFilm", 960, 11);


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
        manager.addFilm(tenthFilm);
        manager.addFilm(eleventhFilm);
    }

    //тест на добавление фильма
    @Test
    public void shoudAddFilm() {
        int add = 1;
        manager.addFilm(add);

        Films[] actual = manager.addFilm();
        Films[] expected = new Films[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilms() {
        manager.getFilm();
        Films[] actual = manager.getFilm();
        Films[] expected = new Films[]{};
        assertArrayEquals(expected, actual);
    }

}

