
package co.edu.ims.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genero {
    @Id
    private String codigo;

    //constructores
    public Genero() {
    }

    public Genero(String codigo) {
        this.codigo = codigo;
    }
    
    //getter y setter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
