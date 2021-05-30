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
public class Notebook extends PaperStationery{
    private boolean sFields;
    private static int sNum=0;
    private int sId;
    public Notebook()
    {
        super();
        sFields=false;
        generateName();
        sNum=sNum+1;
        sId=sNum;
    }
    public void setFields()
    {
        sFields=true;
    }
    @Override
    protected void generateName()
    {
        sName="Тетрадь";
    }
    
    @Override
    public String toString()
    {
        String str=new String();
        String str1="есть", str2="нет";
        if(sFields==true)
            str=super.toString()+"_Поля:"+str1;
        else
            str=super.toString()+"_Поля:"+str2;
        return str;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Notebook)
        {
            Notebook temp=(Notebook)obj;
            return this.sFields==temp.sFields &&
                    this.sCost==temp.sCost &&
                    this.sModel.equals(temp.sModel) &&
                    this.sName.equals(temp.sName) &&
                    this.numberOfPages==temp.numberOfPages &&
                    this.sPrice==temp.sPrice &&
                    this.pagePattern.equals(temp.pagePattern) &&
                    this.sId==temp.sId;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.sFields ? 1 : 0);
        hash = 83 * hash + this.sId;
        return hash;
    }

}
