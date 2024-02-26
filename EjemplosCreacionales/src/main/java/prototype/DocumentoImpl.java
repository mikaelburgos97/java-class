/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 */
interface Documento {
    Documento clonar();
    void setContenido(String contenido);
    void imprimirContenido();
}

class DocumentoImpl implements Documento {
    private String contenido;

    public DocumentoImpl() {
        this.contenido = "";
    }

    public DocumentoImpl(DocumentoImpl documento) {
        this.contenido = documento.contenido;
    }

    @Override
    public Documento clonar() {
        return new DocumentoImpl(this);
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void imprimirContenido() {
        System.out.println(contenido);
    }
}
