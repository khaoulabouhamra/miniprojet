

import java.util.Scanner;

import miniprojet.Employé;


public class Main {
    public static void main(String[] args) {
        Employé premier = new Employé ("76", "chouaib", "benis", 29, 20000);
        Scanner choix = new Scanner(System.in);
        int s;
        do {
            System.out.println("donner votre choix : " +
                    "\n1-  Ajouter le nouveau employe" +
                    "\n2-  Modifier l employe" +
                    "\n3-  Supprimer l employe" +
                    "\n4-  Afficher l employé" +
                    "\n5-  Afficher tous les employes" +
                    "\n6-  Calculer le nombre des employes ayant un salaire qui dépasse 10000" +
                    "\n7-  Afficher l employe le plus âgé(e)" +
                    "\n8-  Afficher l employe le moins âgé(e)" +
                    "\n9-  Quitter");
            System.out.println("donner votre choix en saisissant un nombre de 1 à 9 :");
            s = choix.nextInt();
            switch (s) {
                case 1:Scanner n=new Scanner(System.in);
                    String matric, nom, pren;
                    int age,sal;
                    System.out.println("Entrez votre matricule");
                    matric=n.nextLine();
                    System.out.println("Entrez votre nom");
                    nom=n.nextLine();
                    System.out.println("Entrez votre prenom");
                    pren=n.nextLine();
                    System.out.println("Entrez votre age");
                    age=n.nextInt();
                    System.out.println("Entrez votre salaire");
                    sal=n.nextInt();
                    premier.NouveauEmp(matric,nom,pren,age,sal);
                    break;
                case 2:
                    Scanner modi=new Scanner(System.in);
                    String modMatri, modNom, modPre;
                    int modAge,modSal;
                    System.out.println("Entrez votre matricule");
                    modMatri=modi.nextLine();
                    System.out.println("Entrez votre nom");
                    modNom=modi.nextLine();
                    System.out.println("Entrez votre prenom");
                    modPre=modi.nextLine();
                    System.out.println("Entrez votre age");
                    modAge=modi.nextInt();
                    System.out.println("Entrez votre salaire");
                    modSal=modi.nextInt();
                    premier.Modifier(modMatri, modNom, modPre, modAge, modSal);
                    break;
                case 3:
                    premier.Supprimer(premier);
                    break;
                case 4:
                    break;
                case 5:
                    premier.AfficherTt();
                    break;
                case 6:
                    System.out.println(premier.Totalemp());
                    break;
                case 7:
                    premier.EmpAgeP();
                    break;
                case 8:
                    premier.EmpAgeM();
                    break;
                case 9:
                    premier.Quitter();
            }
        }while (s<9);

    }

}
