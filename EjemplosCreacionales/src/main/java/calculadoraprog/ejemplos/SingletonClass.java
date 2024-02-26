/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraprog.ejemplos;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 */
public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
            return instance;
        } else {
            System.out.println("La instancia ya ha sido creada");
                return null;
        }

    }
}


