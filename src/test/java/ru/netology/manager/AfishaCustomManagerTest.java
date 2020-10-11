package ru.netology.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Film;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class AfishaCustomManagerTest {
    @Mock
    private AfishaRepository afishaRepository;
    @InjectMocks
    private AfishaManager afishaManager = new AfishaManager(afishaRepository, 5);
    private Film firstFilm = new Film(1, 52051, "firstFilms", 500);
    private Film secondFilm = new Film(2, 22052, "secondFilm", 550);
    private Film thirdFilm = new Film(3, 35048, "thirdFilm", 310);
    private Film fourthFilm = new Film(4, 40505, "fourthFilm", 960);
    private Film fifthFilm = new Film(5, 55965, "fifthFilm", 506);
    private Film sixthFilm = new Film(6, 60145, "sixthFilm", 680);

    @Test
    public void shouldShowFilms() {
        Film[] returned = new Film[]{firstFilm, secondFilm, thirdFilm, fourthFilm};
        doReturn(returned).when(afishaRepository).findAll();

        Film[] actual = afishaManager.getAll();
        Film[] expected = new Film[]{fourthFilm, thirdFilm, secondFilm, firstFilm};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldShowFilms2() {
        Film[] returned = new Film[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm};
        doReturn(returned).when(afishaRepository).findAll();

        Film[] actual = afishaManager.getAll();
        Film[] expected = new Film[]{fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilms3() {
        Film[] returned = new Film[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm};
        doReturn(returned).when(afishaRepository).findAll();

        Film[] actual = afishaManager.getAll();
        Film[] expected = new Film[]{sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm};

        assertArrayEquals(actual, expected);
    }

}
