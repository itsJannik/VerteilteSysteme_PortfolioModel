
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jlorenz
 */
@Entity
public class Foto implements Serializable{
    public Foto () {}
    
    @Id
    @GeneratedValue
    private long id = 0;
    
    @Column(nullable=true)
    private String bezeichnung = "";
    
    @Column(nullable=false)
    private String bilddaten = "";

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBilddaten() {
        return bilddaten;
    }

    public void setBilddaten(String bilddaten) {
        this.bilddaten = bilddaten;
    }
    
    
}
