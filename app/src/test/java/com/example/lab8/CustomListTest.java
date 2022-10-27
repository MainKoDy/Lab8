package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }


    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Pyongyang", "Soueul");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    void testHasCityException() {
        list = MockCityList();
        City city = new City("Pyongyang", "Soueul");
        assertFalse(list.hasCity(city));
    }

//    @Test
//    void testDelete() {
//        list = mockCityList();
//        City city = new City("Pyongyang", "Soueul");
//        list.add(city);
//        list.delete(city);
//        assertEquals(1, cityList.countCities());
//    }
//
//    @Test
//    void testDeleteException() {
//        CityList cityList = mockCityList();
//        City city = new City("Pyongyang", "Soueul");
//        assertThrows( IllegalArgumentException.class, () -> {
//            cityList.delete(city); });
//    }

}
