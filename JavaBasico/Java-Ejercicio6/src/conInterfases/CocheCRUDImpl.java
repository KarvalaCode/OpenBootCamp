package conInterfases;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

      //Métodos
       // save

   @Override
    public void save(Coche coche) {
       System.out.println("save"+ coche);
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete"+ coche);
    }
}
