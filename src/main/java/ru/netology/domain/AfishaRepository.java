package ru.netology.domain;

import ru.netology.Films;

public class AfishaRepository {
    private AfishaManager.Films[] films = new AfishaManager.Films[];

    // возвращает массив всех хранящихся в массиве объектов
    private AfishaManager.Films findAll() {
    }


// добавляет объект в массив
    private void save(AfishaManager.Films film) {
        int length = films.length + 1;

        AfishaManager.Films[] savefilms = new AfishaManager.Films[length];
        for (int i = 0; i < films.length; i++) {
            savefilms[i] = films[i];
        }
        System.arraycopy(films, 0, savefilms, 0, films.length);
        int addFilm = films.length - 1;
        savefilms[addFilm] = film;
        films = savefilms;
    }

    //возвращает объект по идентификатору (либо null, если такого объекта нет)
    private AfishaManager.Films findById() {
        int
        return
    }

    // удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    private void removeById(int id) {
        int length = films.length - 1;
        AfishaManager.Films[] deleteId = new AfishaManager.Films[length];
        int index = 0;
        for (AfishaManager.Films film : films) {
            if (film.getId() != id) {
                deleteId[index] = film;
                index++;
            }
        }
        films = deleteId;
    }

    //полностью вычищает репозиторий
    private void removeAll(){
        AfishaManager.Films[] removeFilms = new AfishaManager.Films[];

    }

    }


}
