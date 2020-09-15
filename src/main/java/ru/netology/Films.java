package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Films {
    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;
    private int count;
    private int longFilms = 10;


    public Films() {
    }

    public Films(int id, int filmId, String filmName, int filmPrice, int count, int longFilms) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmPrice = filmPrice;
        this.count = count;
        this.longFilms = longFilms;
    }

    private Films[] choice = new Films[0];


//добавить фильм

    public void addFilm(Films film) {
        int length = choice.length + 1;
        Films[] tmp = new Films[length];
        for (int i = 0; i < choice.length; i++) {
            tmp[i] = choice[i];
        }
        System.arraycopy(choice, 0, tmp, 0, choice.length);
        int addFilm = tmp.length - 1;
        tmp[addFilm] = film;
        choice = tmp;
    }

    //выдаем 10 фильмов в обратном порядке

    public Films[] getFilm() {
        Films[] result = new Films[choice.length];
        for (int i = 0; i < choice.length; i++) {
            int index = choice.length - i - 1;
            result[i] = choice[index];
        }
        if (longFilms >= result) {
            result = longFilms;
        }
        return result;
    }
}
