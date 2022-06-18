package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {


    private PosterItem first = new PosterItem(1, 1, "Bladshot");
    private PosterItem second = new PosterItem(2, 2, "Ahead");
    private PosterItem third = new PosterItem(3, 3, "HotelBelgrad");
    private PosterItem fourth = new PosterItem(4, 4, "Gentlemen");
    private PosterItem fifth = new PosterItem(5, 5, "InvisibleMan");
    private PosterItem sixth = new PosterItem(6, 6, "Trolls");
    private PosterItem seventh = new PosterItem(7, 7, "NumberOne");
    private PosterItem eighth = new PosterItem(8, 8, "NumberTwo");
    private PosterItem ninth = new PosterItem(9, 9, "NumberThree");
    private PosterItem tenth = new PosterItem(10, 10, "NumberFour");


    @Test
    void mustShowLessLimit() {
        PosterManager manager = new PosterManager(4);
        manager.add(first);
        manager.add(second);
        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);

        manager.getLastAdd();

        PosterItem[] actual = manager.getLastAdd();
        PosterItem[] expected = {third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowEquallyLimit() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.getLastAdd();

        PosterItem[] actual = manager.getLastAdd();
        PosterItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowOverLimit() {
        PosterManager manager = new PosterManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

         manager.getLastAdd();

        PosterItem[] actual = manager.getLastAdd();
        PosterItem[] expected = {
                sixth,
                fifth,
                fourth,
                third,
                second};
        assertArrayEquals(expected, actual);
    }
}
