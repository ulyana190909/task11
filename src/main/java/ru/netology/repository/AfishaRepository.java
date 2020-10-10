package ru.netology.repository;

import ru.netology.domain.Film;
import ru.netology.manager.AfishaManager;

public class AfishaRepository {
    private Film[] films = new Film[0];

    // возвращает массив всех хранящихся в массиве объектов
    public Film[] findAll() {
        return films;
    }

    // добавляет объект в массив
    public void save(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    //возвращает объект по идентификатору (либо null, если такого объекта нет)
    public Film findById(int id) {
        for (Film film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    // удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    public void removeById(int id) {
        int length = films.length - 1;
        Film[] deleteId = new Film[length];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                deleteId[index] = film;
                index++;
            }
        }
        films = deleteId;
    }

    //полностью вычищает репозиторий
    public void removeAll() {
        Film[] removeFilms = new Film[0];
        films = removeFilms;
    }
}
