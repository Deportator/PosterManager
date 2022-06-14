package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int defaultAmountPoster = 10;
    public PosterManager(int defaultAmountPoster) {
        this.defaultAmountPoster = defaultAmountPoster;
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
//
    public PosterItem[] getLastAdd() {
        int resultLength = 7;

        if (items.length < 7) {
            resultLength = items.length;
        }
//        PosterItem[] items = new PosterItem[]{};

        PosterItem[] result = new PosterItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

//    public PosterItem[] getLastAdd() {
//        int resultLength = items.length;
//        if (items.length < defaultAmountPoster) {
//            defaultAmountPoster = resultLength;
//        }
//        PosterItem[] result = new PosterItem[][defaultAmountPoster];
//        for (int i = 0; i < defaultAmountPoster; i++) {
//            int index = resultLength - i - 1;
//            result [i] = items[index];
//
//        }
//        return result;

}