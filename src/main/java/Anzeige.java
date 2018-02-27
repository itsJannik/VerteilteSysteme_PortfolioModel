
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
public class Anzeige implements Serializable{
    
    public Anzeige(){}
    
    @Id
    @GeneratedValue
    private long id = 0;
    
    @Column(nullable=false, length=40)
    private Art art = Art.UNBEKANNT;
    
    @Column(nullable=false, length=40)
    private String titel = "";
    
    @Column(nullable=false)
    @Lob
    private String beschreibung = "";
    
    @Column(nullable=false)
    private Date erstellungsDatum = new Date();
    
    @Column(nullable=false)
    private Date onlineBis = new Date();
    
    @Column(nullable=true, precision=8, scale=2)
    private int preisvorstellung = 0;
    
    @Column(nullable=false)
    private ArtDesPreises artDesPreises = ArtDesPreises.UNBEKANNT;
    
    @Column(nullable=false, length=40)
    private String postleitzahl = "";
    
    @Column(nullable=false, length=40)
    private String ort = "";
    
    @ManyToMany
    List<Kategorie> kategorien = new ArrayList<>();
    
    @OneToMany
    List<Foto> fotos = new ArrayList<>();
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getErstellungsDatum() {
        return erstellungsDatum;
    }

    public void setErstellungsDatum(Date erstellungsDatum) {
        this.erstellungsDatum = erstellungsDatum;
    }

    public Date getOnlineBis() {
        return onlineBis;
    }

    public void setOnlineBis(Date onlineBis) {
        this.onlineBis = onlineBis;
    }

    public int getPreisvorstellung() {
        return preisvorstellung;
    }

    public void setPreisvorstellung(int preisvorstellung) {
        this.preisvorstellung = preisvorstellung;
    }

    public ArtDesPreises getArtDesPreises() {
        return artDesPreises;
    }

    public void setArtDesPreises(ArtDesPreises artDesPreises) {
        this.artDesPreises = artDesPreises;
    }

    public String getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    
}
