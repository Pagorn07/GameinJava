import com.esliceu.sort.Sort;

/**
 * Clase para hacer pruebas de caja negra
 * @author pablo
 */

public class Ordena {
    public static void main(String[] args) {
        Sort s = new Sort();
        int[] array = {2,8,4,3,12,25};

        //SelectionSort recibe una array de int y devuelve una array de int
        array = s.SelectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //Se puede ver que esta funcion ordena de mayor a menor una array
    }

}
