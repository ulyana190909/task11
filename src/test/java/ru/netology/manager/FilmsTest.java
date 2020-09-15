package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Films;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsTest {
        private Films manager = new Films();
        private Films firstFilm = new Films (1, 1 ,"firstFilms", 1 , 1, 10);
        private Films secondFilm = new Films(2, 2, "secondFilm", 2, 2, 10);
        private Films thirdFilm = new Films(3, 3, "thirdFilm", 3, 3, 10);


        @BeforeEach
        public void setUp() {
            manager.addFilm(firstFilm);
            manager.addFilm(secondFilm);
            manager.addFilm(thirdFilm);
        }

        //тест на добавление фильма
        @Test
        public void shoudAddFilm() {
            int add = 1;
            manager.addFilm(add);

            Films[] actual = manager.addFilm();
            Films[] expected = new Films[]{firstFilm, secondFilm, thirdFilm};

            assertArrayEquals(expected, actual);
        }

        @Test
        public void showFilms() {
            manager.getFilm();
            Films[] actual = manager.getFilm();
            Films[] expected = new  Films[]{manager};
            assertArrayEquals(expected, actual);
        }

    }
}
