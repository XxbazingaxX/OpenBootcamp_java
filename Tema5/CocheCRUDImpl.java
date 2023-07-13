package Tema5;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void findAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }

    String save= "Guardado de coche";
    String findAll= "Buscando todos los coches";
    String delete= "Borrar todos los coches";

    @Override
    public String toString() {
        return "CocheCRUDImpl [save=" + save + ", findAll=" + findAll + ", delete=" + delete + "]";
    }
}
