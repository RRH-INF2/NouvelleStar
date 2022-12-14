
import java.util.Random;

public class NouvelleStar {

   /**
    * Programme principal
    * @param args arguments de la ligne de commande
    */
   public static void main(String[] args) {
      final int ARGS_LENGTH = args.length;
      if (ARGS_LENGTH == 0) {
         System.out.println("Attention ! Aucun candidat sélectionné blabla!");
      } else {
         // Affichage des candidats
         System.out.println("Candidats:");
         for (int i = 0; i < ARGS_LENGTH; ++i) {
            System.out.println("#" + (i + 1) + " " + args[i]);
         }
         // Votes
         final int NB_VOTES = 150;
         System.out.println("\n" + NB_VOTES + " votes:");
         int[] votes = new int[ARGS_LENGTH];
         Random r = new Random();
         for (int i = 0; i < NB_VOTES; ++i) {
            System.out.print('.');
            votes[r.nextInt(ARGS_LENGTH)]++; // nbre entre 0 et ARGS_LENGTH - 1
         }
         // Affichage des résultats
         System.out.println("\n\nRésultats:");
         long pourcentage;
         final double COEFF = 100. / NB_VOTES;
         for (int i = 0; i < ARGS_LENGTH; ++i) {
            pourcentage = Math.round(COEFF * votes[i]);
            System.out.println(pourcentage + "% " + args[i]);
         }
      }
   }
}
