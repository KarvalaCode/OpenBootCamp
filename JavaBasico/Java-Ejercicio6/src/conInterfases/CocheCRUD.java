package conInterfases;

import java.util.List;

    /*
    * Se delacran métodos, pero no se implementan
    * Como un contrato, dice que hay que hacer (save, finall and delete) pero no lo hace.
    *
     */

public interface CocheCRUD {

    void save(Coche  coche);

    void findAll();

    void delete(Coche coche);




}
