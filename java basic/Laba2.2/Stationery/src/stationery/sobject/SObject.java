/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.sobject;

/**
 *
 * @author denis
 */
public abstract class SObject implements PriceInterface{
    protected String sName;
    protected String sModel;
    protected int sCost;
    protected int sPrice;
    
    public SObject()
    {
        sName=new String();
        sModel=new String();
        sCost=0;
        sPrice=0;
    }
    public void setModel(String model)
    {
        sModel=model;
    }
    protected void setPrice()
    {
        sPrice=countPrice();
    }
    public void setPrice(int price)
    {
        sPrice=price;
    }
    public void setCost(int cost)
    {
        sCost=cost;
        setPrice();
    }
    public int getPrice()
    {
        return sPrice;
    }
    public int getCost()
    {
        return sCost;
    }
    @Override
      public int countPrice()
      {
          int price;
          price=(int) ((sCost*1.2)*1.2);
          return price;
      }
    
    abstract protected void generateName();
    
    @Override
    public String toString()
    {
        String str=new String();
        str=sName+"_"+sModel+"_себестоимость:"+sCost+"у.е._Цена:"+sPrice+"у.е.";
        return str;
    } 
}
