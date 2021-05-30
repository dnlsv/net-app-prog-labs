/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.sobject.paper;

/**
 *
 * @author denis
 */
public class Album extends PaperStationery{
    private String sFormat;
    private static int scNum=0;
    private int scId;
    public Album()
    {
        super();
        sFormat=new String();
        generateName();
        scNum=1+scNum;
        scId=scNum;
    }
    
    public void setFormat()
    {
        sFormat="A4";
    }
    
    @Override
    protected void generateName()
    {
        sName="Альбом";
    }
    
     @Override
    public String toString()
    {
        String str=new String();
        str=super.toString()+"_формат_страниц:"+sFormat;
        return str;
    }
     
    @Override
     public boolean equals(Object obj)
     {
         if(obj==null)
             return false;
         if(this==obj)
             return true;
         if(obj instanceof Album)
         {
             Album temp=(Album)obj;
             return this.sFormat.equals(temp.sFormat) &&
                     this.sCost==temp.sCost &&
                     this.sModel.equals(temp.sModel) &&
                     this.sName.equals(temp.sName) &&
                     this.numberOfPages==temp.numberOfPages &&
                     this.sPrice==temp.sPrice &&
                     this.pagePattern.equals(temp.pagePattern) &&
                     this.scId==this.scId;
         }
         else return false;
                  
     }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (this.sFormat != null ? this.sFormat.hashCode() : 0);
        hash = 31 * hash + this.scId;
        return hash;
    }

}
