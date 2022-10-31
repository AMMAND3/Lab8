package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list = new CustomList(null, new ArrayList<>());

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("dubai", "dxb"));
        Assert.assertEquals(list.getCount(), listSize + 1);
    }


}
