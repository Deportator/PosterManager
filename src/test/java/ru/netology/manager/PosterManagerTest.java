package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    private PosterItem first = new PosterItem(1, "Bladshot");
    private PosterItem second = new PosterItem(2, "Ahead");
    private PosterItem third = new PosterItem(3, "HotelBelgrad");
    private PosterItem fourth = new PosterItem(4, "Gentlemen");
    private PosterItem fifth = new PosterItem(5, "InvisibleMan");
    private PosterItem sixth = new PosterItem(6, "Trolls");
    private PosterItem seventh = new PosterItem(7, "NumberOne");
    private PosterItem eighth = new PosterItem(8, "NumberTwo");
    private PosterItem ninth = new PosterItem(9, "NumberThree");
    private PosterItem tenth = new PosterItem(10, "NumberFour");

//    PosterItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
//  PosterItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

//    @Test
//    void shouldShowLessLimit() {
//        PosterManager manager = new PosterManager(5);
//        manager.getLastAdd(first);
//        manager.getLastAdd(second);
//        manager.getLastAdd(third);
//        manager.getLastAdd(fourth);
//        manager.getLastAdd(fifth);
//        PosterItem[] actual = manager.getLastAdd();
//        assertArrayEquals(expected, actual);
//
//    }

//    @Test
//    void mustShowTenPoster() {
//        PosterManager manager = new PosterManager(10);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        PosterItem[] actual = manager.getLastAdd();
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    void mustShowTen() {
//        PosterManager manager = new PosterManager(10);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        PosterItem[] actual = manager.getLastAdd();
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    void mustShowValid() {
//        PosterManager manager = new PosterManager(5);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        PosterItem itemAdd = new PosterItem(11, "NumberFive");
//        manager.add(itemAdd);
//        PosterItem[] actual = manager.getLastAdd();
//        PosterItem[] expected = {new PosterItem(11, "NumberFive"), tenth, ninth, eighth, seventh};
//        assertArrayEquals(expected, actual);
//
//    }

//    @Test
//    void mustShowEquallyLimit() {
//        PosterManager manager = new PosterManager(10);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        PosterItem[] actual = manager.getLastAdd();
//        assertArrayEquals(expected, actual);
//
//    }
//
//    @Test
//    void mustShowLessLimit() {
//        PosterManager manager = new PosterManager(10);
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//
//        PosterItem[] actual = manager.getLastAdd();
//        assertArrayEquals(expected, actual);
//
//    }

    @Test
    void mustShowAddPoster() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        PosterItem[] actual = manager.findAll();
        PosterItem[] expected = new PosterItem[]{first, second, third, fourth, fifth};
        assertArrayEquals(expected, actual);

    }

    @Test
    void mustShowLessLimit() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        manager.getLastAdd();

        PosterItem[] actual = manager.findAll();
        PosterItem[] expected = new PosterItem[]{fifth, fourth, third, second, first};
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



        manager.getLastAdd();

        PosterItem[] actual = manager.findAll();
        PosterItem[] expected = new PosterItem[]{seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void mustShowOverLimit() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);


        manager.getLastAdd();

        PosterItem[] actual = manager.findAll();
        PosterItem[] expected = new PosterItem[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }


}
