package ru.netology.manager;

import ru.netology.domain.PosterItem;

import static java.lang.System.arraycopy;

public class PosterManager {

    private int amountPoster;

    private PosterItem[] items = new PosterItem[0]; //Создание пустого массива

    public PosterManager(int limit) {

        this.amountPoster = limit;
    }

    public PosterManager() {
        amountPoster = 10;
        }

    public void add(PosterItem item) {
        int lenght = items.length + 1;
        PosterItem[] tmp = new PosterItem[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
            }
//        arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }


        public PosterItem[] getLastAdd() {
            int resultLanght;
            if (this.amountPoster < findAll().length) {
                resultLanght = amountPoster;
            } else {
                resultLanght = findAll().length;
            }
            PosterItem[] result = new PosterItem[resultLanght];

            for (int i = 0; i < result.length; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
