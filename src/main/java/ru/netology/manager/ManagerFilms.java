package ru.netology.manager;

import ru.netology.domain.Films;

public class ManagerFilms {
    private Films[] films = new Films[0];

//добавить фильм

    public Films[] addFilm(Films film) {
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;

        return films;
    }

    //выдаем 10 фильмов в обратном порядке

    public Films[] getFilm() {
        int lastFilm = 10;
        Films[] result = new Films[lastFilm];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
