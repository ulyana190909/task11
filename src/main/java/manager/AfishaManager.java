package manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import repository1.AfishaRepository;

@AllArgsConstructor
@Data
public class AfishaManager {
    private int id;
    private int filmId;
    private String filmName;
    private int filmPrice;

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    private AfishaManager[] films = new AfishaManager[0];

    private int afishaLenght = 10;

    public AfishaManager() {
        this.afishaLenght = afishaLenght;
    }

    public AfishaManager(int i, int i1, String tenthFilm, int i2) {
    }

    //добавить фильм
    public void addFilm(AfishaManager film) {
        int length = films.length + 1;
        AfishaManager[] add = new AfishaManager[length];
        for (int i = 0; i < films.length; i++) {
            add[i] = films[i];
        }
        System.arraycopy(films, 0, add, 0, films.length);
        int lastFilm = add.length - 1;
        add[lastFilm] = film;
        films = add;
    }

    //выдаем 10 фильмов в обратном порядке

    public AfishaManager[] getFilm() {
        int lastFilm = Math.min(films.length, afishaLenght);

        AfishaManager[] result = new AfishaManager[lastFilm];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
