
package stationery;
import stationery.sobject.writing.Pen;
import stationery.sobject.writing.Pencil;
import stationery.sobject.paper.Notebook;
import stationery.sobject.paper.Album;
import stationery.backpack.Backpack;


public class MainClass {
    public static void main(String[] args) {
        Backpack backpack=new Backpack();
        Pen pen=new Pen();
        Pencil pencil=new Pencil();
        Notebook notebook=new Notebook();
        Album album=new Album();
        notebook.setModel("Роскошная");
        notebook.setCost(1);
        notebook.setNumberOfPages(48);
        notebook.setPagePattern("В_клетку");
        notebook.setFields();
        
        pen.setCost(5);
        pen.setMaterial("Пластик");
        pen.setLineLenght(10);
        pen.setModel("Перо_страуса");
        
        pencil.setCost(2);
        pencil.setColour("Зеленый");
        pencil.setMaterial("Дерево");
        pencil.setModel("Грифон");
        
        album.setCost(4);
        album.setModel("Гидра");
        album.setNumberOfPages(100);
        album.setPagePattern("Чистые_листы");
        
        backpack.addStationery(notebook);
        backpack.addStationery(pen);
        backpack.addStationery(pencil);
        backpack.addStationery(album);
        
        backpack.printBackpack();
        backpack.countPrice();
        backpack.printBackpack();
        
    }
   
}
