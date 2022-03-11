import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    City Edmonton = new City("Edmonton","AB");
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NS"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void hasCityTest(){
        assertEquals(true,list.hasCity(new City("Edmonton","AB")));
    }

    @Test
    public void deleteCityTest(){
        list.deleteCity(Edmonton);
        int ListSize=list.getCount();
        assertEquals(0,ListSize);
    }
    @Test
    public void countCityTest(){
         int num = list.countCities(list);
         assertEquals(1,num);
    }

}
