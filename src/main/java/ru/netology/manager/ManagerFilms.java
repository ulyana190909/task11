package ru.netology.manager;

import ru.netology.domain.Film;
import ru.netology.domain.Film;

public class ManagerFilms {
    private Film[] films = new Film[0];

    private int afishaLenght = 10;

    public ManagerFilms(int afishaLenght) {
        this.afishaLenght = afishaLenght;
    }

    public ManagerFilms() {
    }


    //добавить фильм

    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] add = new Film[length];
        for (int i = 0; i < films.length; i++) {
            add[i] = films[i];
        }
        System.arraycopy(films, 0, add, 0, films.length);
        int lastFilm = add.length - 1;
        add[lastFilm] = film;
        films = add;
    }

    //выдать добавленные фильмы в обратном порядке

    public Film[] getFilm() {
        int lastFilm = Math.min(films.length, afishaLenght);

        Film[] result = new Film[lastFilm];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
