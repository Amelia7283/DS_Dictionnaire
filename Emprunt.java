/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hmb.hmbibliotheque;

/**
 *
 * @author arens
 */
public class Emprunt {
    private String titre;
    private String date;
    
    //Constructeur
    public Emprunt(String titre, String date){
        this.titre=titre;
        this.date=date;
    }
    
    //Getter/Setter
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }
    
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
   
    @Override
    public String toString(){
        return "Titre:"+titre+"\nDate:"+date+"\n";
    }
}
