package repository;

import manager.AfishaManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository1.AfishaRepository;

import javax.print.DocFlavor;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AfishaRepositoryTest {
    private AfishaRepository afishaRepository = new AfishaRepository();
    private AfishaManager firstFilm = new AfishaManager(1, 52051, "firstFilms", 500);
    private AfishaManager secondFilm = new AfishaManager(2, 22052, "secondFilm", 550);
    private AfishaManager thirdFilm = new AfishaManager(3, 35048, "thirdFilm", 310);
    private AfishaManager fourthFilm = new AfishaManager(4, 40505, "fourthFilm", 960);
    private AfishaManager fifthFilm = new AfishaManager(5, 55965, "fifthFilm", 506);
    private AfishaManager sixthFilm = new AfishaManager(6, 60145, "sixthFilm", 680);
    private AfishaManager seventhFilm = new AfishaManager(7, 79844, "seventhFilm", 796);
    private AfishaManager eighthFilm = new AfishaManager(8, 45218, "eighthFilm", 578);
    private AfishaManager ninthFilm = new AfishaManager(9, 95419, "ninthFilm", 600);


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
        AfishaManager[] actual = afishaRepository.findAll();
        AfishaManager[] expected = new AfishaManager[] {fifthFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm, eighthFilm, ninthFilm};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void findById() {
        int findId = 6;
        AfishaManager actual = afishaRepository.findById(findId);
        AfishaManager[] expected = new AfishaManager[] {sixthFilm};
        assertEquals (null, actual);
    }

    @Test
    public void removeById() {
        int id = 1;
        afishaRepository.removeById(id);
        AfishaManager[] actual = afishaRepository.findAll();
        AfishaManager[] expected = new AfishaManager[]{secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm, eighthFilm, ninthFilm};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeAll() {
        afishaRepository.removeAll();
        AfishaManager[] actual = afishaRepository.findAll();
        AfishaManager[] expected = new AfishaManager[0];
        assertArrayEquals(actual, expected);
    }
}
