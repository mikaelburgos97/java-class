/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento documentoPrototipo = new DocumentoImpl();
        documentoPrototipo.setContenido("Contenido del documento prototipo");
        
        documentoPrototipo.imprimirContenido();

        Documento documentoClonado = documentoPrototipo.clonar();
        documentoClonado.imprimirContenido();
    }
    
}
