/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hmb.hmbibliotheque;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author arens
 */
public class HMBibliotheque {
    //HashMap 
    static HashMap <String, ArrayList<Emprunt>> lecteursEmprunt = new HashMap<>();
    public static void main(String[] args) {
        //Liste d’emprunts
        ArrayList<Emprunt> lesEmprunts1 = new ArrayList<>();
        lesEmprunts1.add(new Emprunt("Harry Potter","01/09/2023"));
        lesEmprunts1.add(new Emprunt("Le Petit Prince","05/09/2023"));
        
        ArrayList<Emprunt> lesEmprunts2 = new ArrayList<>();
        lesEmprunts2.add(new Emprunt("1984","03/09/2023"));
        lesEmprunts2.add(new Emprunt("Les Misérable","07/09/2023"));
        
        ArrayList<Emprunt> lesEmprunts3 = new ArrayList<>();
        lesEmprunts3.add(new Emprunt("Le Seigneur des Anneaux","02/09/2023"));
        
        lecteursEmprunt.put("Alice", lesEmprunts1);
        lecteursEmprunt.put("Bob", lesEmprunts2);
        lecteursEmprunt.put("Charlie", lesEmprunts3);  
    }
    //Méthode afficher emprunt
    public static void empruntsLecteur(String nom){
        if (lecteursEmprunt.containsKey(nom)){
            System.out.println("Nom"+nom);
            for (Emprunt e: lecteursEmprunt.get(nom))
                System.out.println("-"+e);
        }
        else {
            System.out.println("Ce lecteur n'existe pas");
        }
    }
    
    //Méthode pour ajouter un emprunt à un lecteur existant
    public static void ajouterEmprunt(String nomLecteur, Emprunt emp){
        if (lecteursEmprunt.containsKey(nomLecteur)){
            lecteursEmprunt.get(nomLecteur).add(emp);
            System.out.println("L'emprunt a bien était ajouter.");
        }
        else {
            System.out.println("Erreur!");
        }
    }
}
