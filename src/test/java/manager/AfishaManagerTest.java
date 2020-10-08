package manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository1.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)

public class AfishaManagerTest {
    @Mock
    private AfishaRepository afishaRepository;
    @InjectMocks
    private AfishaManager afishaManager;
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
        afishaManager.addFilm(firstFilm);
        afishaManager.addFilm(secondFilm);
        afishaManager.addFilm(thirdFilm);
        afishaManager.addFilm(fourthFilm);
        afishaManager.addFilm(fifthFilm);
        afishaManager.addFilm(sixthFilm);
        afishaManager.addFilm(seventhFilm);
        afishaManager.addFilm(eighthFilm);
        afishaManager.addFilm(ninthFilm);
    }

    @Test
    public void shouldAddAndShowFilm1() {
        AfishaManager[] returned = new AfishaManager[]{firstFilm, secondFilm, thirdFilm, fourthFilm, fifthFilm, sixthFilm, seventhFilm, eighthFilm, ninthFilm};
        doReturn(returned).when(afishaRepository).findAll();

        AfishaManager[] actual = afishaManager.getFilm();
        AfishaManager[] expected = new AfishaManager[]{ninthFilm, eighthFilm, seventhFilm, sixthFilm, fifthFilm, fourthFilm, thirdFilm, secondFilm, firstFilm};

        assertArrayEquals(expected, actual);
    }
}

