package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int amountPoster = 10;
    public PosterManager(int amountPoster) {
        this.amountPoster = amountPoster;
    }

    public PosterManager() {
    }
    public void add(PosterItem item) {
        int lenght = items.length + 1;
        PosterItem[] tmp = new PosterItem[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {return items;}

    public PosterItem[] getLastAdd() {
//        int resultLength = 10;
//
//        if (items.length < 10) {
//            resultLength = items.length;
//        }

        PosterItem[] result = new PosterItem[amountPoster];
        for (int i = 0; i < amountPoster; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

   }