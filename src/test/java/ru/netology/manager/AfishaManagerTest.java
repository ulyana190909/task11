package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Film;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTest {
    @Mock
    private AfishaRepository afishaRepository;
    @InjectMocks
    private AfishaManager afishaManager;
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
        afishaManager.add(firstFilm);
        afishaManager.add(secondFilm);
        afishaManager.add(thirdFilm);
        afishaManager.add(fourthFilm);
        afishaManager.add(fifthFilm);
        afishaManager.add(sixthFilm);
        afishaManager.add(seventhFilm);
        afishaManager.add(eighthFilm);
        afishaManager.add(ninthFilm);
    }

    @Test
    public void getFilmTest() {
        Film[] returned = new Film[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm, eighthFilm, ninthFilm};
        doReturn(returned).when(afishaRepository).findAll();

        Film[] actual = afishaManager.getAll();
        Film[] expected = new Film[]{ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};

        assertArrayEquals(expected, actual);
    }
}

