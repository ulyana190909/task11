package repository1;

import manager.AfishaManager;

public class AfishaRepository {
    private AfishaManager[] repository = new AfishaManager[0];


    // возвращает массив всех хранящихся в массиве объектов
    public AfishaManager[] findAll() {
        return repository;
    }

    // добавляет объект в массив
    public void save(AfishaManager film) {
        int length = repository.length + 1;
        AfishaManager[] add = new AfishaManager[length];
        for (int i = 0; i < repository.length; i++) {
            add[i] = repository[i];
        }
        System.arraycopy(repository, 0, add, 0, repository.length);
        int lastFilm = add.length - 1;
        add[lastFilm] = film;
        repository = add;
    }

    //возвращает объект по идентификатору (либо null, если такого объекта нет)
    public AfishaManager findById(int id) {
        for (AfishaManager film : repository) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }

    // удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
    public void removeById(int id) {
        int length = repository.length - 1;
        AfishaManager[] deleteId = new AfishaManager[length];
        int index = 0;
        for (AfishaManager film : repository) {
            if (film.getId() != id) {
                deleteId[index] = film;
                index++;
            }
        }
        repository = deleteId;
    }

    //полностью вычищает репозиторий
    public void removeAll() {
        AfishaManager[] removeFilms = new AfishaManager[0];
        repository = removeFilms;
    }
}


