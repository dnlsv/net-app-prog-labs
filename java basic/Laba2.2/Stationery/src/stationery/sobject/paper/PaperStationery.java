/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.sobject.paper;
import stationery.sobject.SObject;

/**
 *
 * @author denis
 */
public class PaperStationery extends SObject{
    protected int numberOfPages;
    protected String pagePattern;
    
    public PaperStationery()
    {
        super();
        numberOfPages=0;
        pagePattern=new String();
        generateName();
    }
    
    public void setNumberOfPages(int number)
    {
        numberOfPages=number;
    }
    public void setPagePattern(String pattern)
    {
        pagePattern=pattern;
    }

    @Override
    protected void generateName() {
        sName="Unknown_Paper_Stationery";
    }
    
    @Override
   public String toString()
   {
       String str;
       str=super.toString()+"_Количетво_страниц:"+numberOfPages+"_Узор_страниц:"+pagePattern;
       return str;
   }

}
