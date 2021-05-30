/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.backpack;
import stationery.sobject.*;
import java.util.*;

/**
 *
 * @author denis
 */
public class Backpack implements PriceInterface{
    private List<SObject> stationeryColl;
    private int cost;
    private int price;
    private static int backpackNum=0;
    
    public Backpack()
    {
        stationeryColl = new ArrayList<SObject> ();
        backpackNum=backpackNum+1;
    }
    
    public void addStationery(SObject obj)
    {
        stationeryColl.add(obj);
    }
    
    public void printBackpack()
    {
        int i=1;
        Iterator it=stationeryColl.iterator();
        System.out.println("=================================================");
        while(it.hasNext())
        {
            System.out.println(i+")"+(it.next()).toString());
            i=i+1;
        }
        System.out.println();
        System.out.println("Себестоимость заказа:"+cost+" Цена заказа:"+price);
        System.out.println("=================================================");
    }
    
    
    @Override
    protected void finalize()
    {
        try {
            super.finalize();
        } catch (Throwable ex) {
          System.err.println("Ошибка при удалении объекта");  
        }
        backpackNum=backpackNum-1;
    }

    @Override
    public int countPrice() {
        int tempPrice=0, tempCost=0;
        Iterator it=stationeryColl.iterator();
        SObject obj;
        while(it.hasNext())
        {
           obj=(SObject)it.next();
           tempCost=tempCost+obj.getCost();
           tempPrice=tempPrice+obj.getPrice();
        }
        cost=tempCost;
        price=tempPrice;
        return tempPrice;
    }

}
