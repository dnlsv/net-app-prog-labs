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
public class Pen extends WritingStationery{
    private int lineLenght;
    private static int cNum=0;
    private int cId;
    public Pen()
    {
        super();
        lineLenght=0;
        generateName();
        cNum=cNum+1;
        cId=cNum;
    }
    
    public void setLineLenght(int lenght)
    {
        lineLenght=lenght;
    }
    
    @Override
    protected void generateName()
    {
        sName="Ручка";
    }
    @Override
    public String toString()
    {
        String str=new String();
        str=super.toString()+"_длина_непрерывной_линни:"+lineLenght+"км";
        return str;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Pen )
        {
            Pen temp=(Pen)obj;
            return this.cId==temp.cId && this.sCost==temp.sCost &&
                    this.sMaterial.equals(temp.sMaterial) &&
                    this.sModel.equals(temp.sModel) &&
                    this.sName.equals(temp.sName) &&
                    this.sPrice==temp.sPrice &&
                    this.lineLenght==temp.lineLenght;
          
        }
        else 
            return false;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.lineLenght;
        hash = 47 * hash + this.cId;
        return hash;
    }

}
