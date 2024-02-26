/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculadoraprog.ejemplos;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 */
public class Ejemplos {

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println("");
        
        System.out.println("----- Viendo el contenido de cada objeto---------------");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
