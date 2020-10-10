package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfishaRepositoryTest {
    private AfishaRepository afishaRepository = new AfishaRepository();

    private Film firstFilm = new Film(1, 52051, "firstFilms", 500);
    private Film secondFilm = new Film(2, 22052, "secondFilm", 550);
    private Film thirdFilm = new Film(3, 35048, "thirdFilm", 310);
    private Film fourthFilm = new Film(4, 40505, "fourthFilm", 960);
    private Film fifthFilm = new Film(5, 55965, "fifthFilm", 506);
    private Film sixthFilm = new Film(6, 60145, "sixthFilm", 680);
    private Film seventhFilm = new Film(7, 79844, "seventhFilm", 796);
    private Film eighthFilm = new Film(8, 45218, "eighthFilm", 578);
    private Film ninthFilm = new Film(9, 95419, "ninthFilm", 600);


    @BeforeEach
    public void setUp() {
        afishaRepository.save(firstFilm);
        afishaRepository.save(secondFilm);
        afishaRepository.save(thirdFilm);
        afishaRepository.save(fourthFilm);
        afishaRepository.save(fifthFilm);
        afishaRepository.save(sixthFilm);
        afishaRepository.save(seventhFilm);
        afishaRepository.save(eighthFilm);
        afishaRepository.save(ninthFilm);
    }

    @Test
    public void findAll() {
        afishaRepository.removeAll();
        Film[] actual = afishaRepository.findAll();
        Film[] expected = new Film[0];
        assertArrayEquals(actual, expected);
    }
    @Test
    public void findById() {
        int findId = 6;
        Film actual = afishaRepository.findById(findId);
        Film expected = sixthFilm;
        assertEquals(expected, actual);
    }

    @Test
    public void findById2() {
        int findId = 16;
        Film actual = afishaRepository.findById(findId);
        assertEquals(null, actual);
    }

    @Test
    public void removeById() {
        int id = 1;
        afishaRepository.removeById(id);
        Film[] actual = afishaRepository.findAll();
        Film[] expected = new Film[]{secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm, eighthFilm, ninthFilm};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeAll() {
        afishaRepository.removeAll();
        Film[] actual = afishaRepository.findAll();
        Film[] expected = new Film[0];
        assertArrayEquals(actual, expected);
    }
}

