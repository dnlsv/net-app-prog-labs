/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.sobject.writing;

/**
 *
 * @author denis
 */
public class Pencil extends WritingStationery{
    private String sColour;
    private static int tNum=0;
    private int tId;
    public Pencil()
    {
        super();
        sColour=new String();
        generateName();
        tNum=tNum+1;
        tId=tNum;
    }
    
    public void setColour(String colour)
    {
        sColour=colour;
    }
    
    @Override
    protected void generateName()
    {
      sName="Карандаш";  
    }
    
    @Override
    public String toString()
    {
        String str=new String();
        str=super.toString()+"_цвет_карандаша:"+sColour;
        return str;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Pencil)
        {
            Pencil temp=(Pencil)obj;
            return this.sCost==temp.sCost &&
                    this.sColour.equals(temp.sColour) &&
                    this.sMaterial.equals(temp.sMaterial) &&
                    this.sModel.equals(temp.sModel) &&
                    this.sName.equals(temp.sName) &&
                    this.sPrice==temp.sPrice &&
                    this.tId==temp.tId;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.sColour != null ? this.sColour.hashCode() : 0);
        hash = 79 * hash + this.tId;
        return hash;
    }

}
