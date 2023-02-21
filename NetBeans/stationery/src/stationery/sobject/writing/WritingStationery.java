/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationery.sobject.writing;
import stationery.sobject.SObject;

/**
 *
 * @author denis
 */
public class WritingStationery extends SObject{
    protected String sMaterial;
    public WritingStationery()
    {
        super();
        sMaterial=new String();
        generateName();
    }
    public void setMaterial(String material)
    {
        sMaterial=material;
    }

    @Override
    protected void generateName() {
        sName="Unknown_Writing_Stationary";
    }
    
    @Override
    public String toString()
    {
        String str=new String();
        str=super.toString()+"_Материал:"+sMaterial;
        return str;
    }
}
