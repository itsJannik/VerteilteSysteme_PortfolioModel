
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
public class Benutzer implements Serializable{
    
    public Benutzer () {}
    
    @Id
    private String benutzername = "";
    
    @Column(nullable=false, length=256)
    private String passwortHash = "";
    
    @Column(nullable=false, length=40)
    private String vorname = "";
    
    @Column(nullable=false, length=40)
    private String nachname = "";
    
    @Column(nullable=false, length=40)
    private String strasse = "";
    
    @Column(nullable=false, precision=5)
    private int hausnummer = 0;
    
    @Column(nullable=false, length=40)
    private String postleitzahl = "";
    
    @Column(nullable=false, length=40)
    private String ort = "";
    
    @Column(nullable=false, length=40)
    private String land = "";
    
    @Column(nullable=false, length=40)
    private String email = "";
    
    @Column(nullable=false, length=20)
    private int telefonnummer = 0;
    
    @OneToMany
    List<Anzeige> anzeigenVeroeffentlichen = new ArrayList<>(); // VERÖFFENTLICHEN
    
    @ManyToMany
    List<Anzeige> anzeigenMerken = new ArrayList<>();           // MERKEN
    
    @OneToMany
    List<Nachricht> nachrichten = new ArrayList<>(); //sendet/empfängt, evtl 2 arraylists
    
    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswortHash() {
        return passwortHash;
    }

    public void setPasswortHash(String passwortHash) {
        this.passwortHash = passwortHash;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHasunummer() {
        return hausnummer;
    }

    public void setHasunummer(int hasunummer) {
        this.hausnummer = hasunummer;
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

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
