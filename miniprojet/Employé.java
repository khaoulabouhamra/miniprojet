package miniprojet;



import java.util.ArrayList;
import java.util.List;
public class Employé {
    String Matricule;
    String Nom;
    String Prenom;
    int Age;
    int Salaire;
    
    public Employé(String Matricule, String Nom, String Prenom, int Age, int Salaire) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Salaire = Salaire;
    }
 
    public String getNom() {
        return this.Nom;
    }
    public String getPrenom() {
        return this.Prenom;
    }
    public String getMatricule() {
        return this.Matricule;
    }
    public int getAge() {
        return this.Age;
    }
    public int getSalaire() {
        return this.Salaire;
    }
   
    public void setMatricule(String mat) {
        this.Matricule=mat;
    }
    public void setNom(String nom) {
        this.Nom=nom;
    }
    public void setPrenom(String prenom) {
        this.Prenom=prenom;
    }
    public void setAge(int age) {
        this.Age = age;
    }
    public void setSalaire(int sal) {
        this.Salaire =sal;
    }


    static List<Employé> tab = new ArrayList<>();
    //exercice 1 ajout d un emp
    public Employé NouveauEmp(String mat, String nom, String prenom, int age, int sal) {
        Employé emp = new Employé(mat,nom,prenom,age,sal);
        tab.add(emp);
        return emp;
    }
    //exercice 2 modification d un emp
    public void Modifier(String mat, String nom, String prenom, int age, int sal) {
        this.setMatricule(mat);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setSalaire(sal);
        Employé e = new Employé(mat,nom,prenom,age,sal);
        tab.add(e);
    }
    //exercice 3 suppression d un emp
    public void Supprimer(Employé e) {
        tab.remove(e);
    }




    // exercice 4 affichage de tous les employés
    Employé L [] = new Employé[50];
    static List<Employé> tab2= new ArrayList<>();

    public void AfficherTt() {
        for(int i=0;i< tab2.size();i++) {
            Affciher(String.valueOf(tab2.get(i)));
        }
    }

    private void Affciher(String valueOf) {
    }
    //exercie 5 les employes dont leur salaire moins > 10 000
    public int Totalemp() {
        int nbr=0;
        for(int i=0; i<L.length;i++) {
            if(L[i].Salaire > 10000) {
                nbr=+1;
            }
        }return nbr;
    }
   
    public Employé EmpAgeP() {
        Employé e = null;
        for(int i=0; i<L.length; i++) {
            if(L[i].Age <= L[i++].Age) {
                e = L[i++];
            }
        }return e;
    }
   
    public Employé EmpAgeM() {
        Employé e = null;
        for(int i=0; i<L.length;i++) {
            if(L[i].Age <= L[i++].Age) {
                e=L[i];
            }
        }return e;
    }
    
    public void Quitter(){
        System.out.println("bye");
    }



}