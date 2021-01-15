import java.util.Scanner;


public class TicTacToe
{
    private   char position[] = new char[10];
    private   char joueur;
    private int compteur;



    public static void main(String args[])
    {
        String ch;
        TicTacToe gameObj = new TicTacToe();
        do {
            gameObj.BoardInitialization();
            gameObj.jeu();
            System.out.println("Voulez-vous jouez de nouveau (oui)? ");
            Scanner in = new Scanner(System.in);
            ch = in.nextLine();
            System.out.println("valeur de ch  " + ch);
        } while (ch.equals("oui"));


    }
    public  void BoardInitialization()
    {

        char positionDef[] = { '0','1', '2', '3', '4', '5', '6', '7', '8', '9' };
        int i;
        compteur = 0;
        joueur = 'X';
        for (i = 1; i < 10; i++) position[i] = positionDef[i];
        tableauActuel();


    }
    public  String tableauActuel()
    {
        System.out.println("\n");
        System.out.println("\n\n\t\t" + position[1] + "   | " + position[2] + "  | " + position[3]);
        System.out.println(" \t\t    |    |   ");
        System.out.println(" \t\t ___|____|___ ");
        System.out.println("\n\n\t\t" + position[4] + "   | " + position[5] + "  | " + position[6]);
        System.out.println(" \t\t    |    |   ");
        System.out.println(" \t\t ___|____|___ ");
        System.out.println("\n\n\t\t" + position[7] + "   | " + position[8] + "  | " + position[9]);
        System.out.println(" \t\t    |    |   ");
        System.out.println(" \t\t    |    |   ");
        System.out.println("\n\n");
        return "currentBoard";
    }

    public  void jeu()
    {
        int emplacement;
        char vide = ' ';

        System.out.println("Le joueur 1 est 'X' et le joueur 2 est 'O' ");

        do {
            boolean posPrise = true;

            if (joueur == 'X')
            {

                System.out.print("Tour de joueur 1: ");

                while (posPrise) {

                    Scanner in = new Scanner(System.in);

                    emplacement = in.nextInt();
                    posPrise = verifPositionJoueur(emplacement);
                    if (posPrise == false)
                        position[emplacement] = verifJoueur();
                }


                tableauActuel();              // Montrer le jeu
                changementJoueur();
            }
            else {


                System.out.println("---------Tour de l'ordinateur-------------");


                while (posPrise) {



                    emplacement = (int)(10.0 * Math.random());
                    posPrise = verifPositionJoueur(emplacement);
                    if (posPrise == false)
                        position[emplacement] = verifJoueur();
                    tableauActuel();              // Afficher

                    changementJoueur();
                }










            }

        } while (verifGagnant() == vide);

    }

    public  char verifGagnant()
    {
        char Vainqueur = ' ';

        // Verif si X gagne
        if (position[1] == 'X' && position[2] == 'X' && position[3] == 'X') Vainqueur = 'X';
        if (position[4] == 'X' && position[5] == 'X' && position[6] == 'X') Vainqueur = 'X';
        if (position[7] == 'X' && position[8] == 'X' && position[9] == 'X') Vainqueur = 'X';
        if (position[1] == 'X' && position[4] == 'X' && position[7] == 'X') Vainqueur = 'X';
        if (position[2] == 'X' && position[5] == 'X' && position[8] == 'X') Vainqueur = 'X';
        if (position[3] == 'X' && position[6] == 'X' && position[9] == 'X') Vainqueur = 'X';
        if (position[1] == 'X' && position[5] == 'X' && position[9] == 'X') Vainqueur = 'X';
        if (position[3] == 'X' && position[5] == 'X' && position[7] == 'X') Vainqueur = 'X';
        if (Vainqueur == 'X')
        {
            System.out.println("-----------Vous avez gagner.--------------");
            return Vainqueur;
        }

        // Verif si O gagne
        if (position[1] == 'O' && position[2] == 'O' && position[3] == 'O') Vainqueur = 'O';
        if (position[4] == 'O' && position[5] == 'O' && position[6] == 'O') Vainqueur = 'O';
        if (position[7] == 'O' && position[8] == 'O' && position[9] == 'O') Vainqueur = 'O';
        if (position[1] == 'O' && position[4] == 'O' && position[7] == 'O') Vainqueur = 'O';
        if (position[2] == 'O' && position[5] == 'O' && position[8] == 'O') Vainqueur = 'O';
        if (position[3] == 'O' && position[6] == 'O' && position[9] == 'O') Vainqueur = 'O';
        if (position[1] == 'O' && position[5] == 'O' && position[9] == 'O') Vainqueur = 'O';
        if (position[3] == 'O' && position[5] == 'O' && position[7] == 'O') Vainqueur = 'O';
        if (Vainqueur == 'O')
        {
            System.out.println("----------Ordinateur gagne.--------");
            return Vainqueur;
        }

        // check for Tie
        for (int i = 1; i < 10; i++)
        {
            if (position[i] == 'X' || position[i] == 'O')
            {
                if (i == 9)
                {
                    char egalite = 'E';
                    System.out.println(" La partie est nul ");
                    return egalite;
                }
                continue;
            }
            else
                break;

        }

        return Vainqueur;
    }

    public  boolean verifPositionJoueur(int emplacement)
    {


        if (position[emplacement] == 'X' || position[emplacement] == 'O')
        {
            System.out.println("L'emplacement est deja choisi veuiller en selectionner un autre");
            return true;
        }
        else {
            return false;
        }

        //  counter++;
        //    return false;
    }



    public  void changementJoueur()
    {
        if (joueur == 'X'){
            joueur = 'O';
        }
        else if (joueur == 'O')
            joueur = 'X';

    }

    public String Titre()
    {
        return "Tic Tac Toe";
    }

    public  char verifJoueur()
    {
        return joueur;
    }

}

/*
Execution

		1   | 2  | 3
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



Le joueur 1 est 'X' et l'ordinateur est 'O'
Tour de joueur 1: 1




		X   | 2  | 3
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



---------Tour de l'ordinateur-------------




		X   | O  | 3
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



Tour de joueur 1: 3




		X   | O  | X
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



---------Tour de l'ordinateur-------------
L'emplacement est deja choisi veuiller en selectionner un autre




		X   | O  | X
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



L'emplacement est deja choisi veuiller en selectionner un autre




		X   | O  | X
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



L'emplacement est deja choisi veuiller en selectionner un autre




		X   | O  | X
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |







		X   | O  | X
 		    |    |
 		 ___|____|___


		4   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



---------Tour de l'ordinateur-------------




		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | 9
 		    |    |
 		    |    |



Tour de joueur 1: 9




		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | X
 		    |    |
 		    |    |



---------Tour de l'ordinateur-------------
L'emplacement est deja choisi veuiller en selectionner un autre




		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | X
 		    |    |
 		    |    |



L'emplacement est deja choisi veuiller en selectionner un autre




		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | 5  | 6
 		    |    |
 		 ___|____|___


		7   | 8  | X
 		    |    |
 		    |    |







		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | 5  | O
 		    |    |
 		 ___|____|___


		7   | 8  | X
 		    |    |
 		    |    |



Your Turn Enter Position:: 5




		X   | O  | X
 		    |    |
 		 ___|____|___


		O   | X  | O
 		    |    |
 		 ___|____|___


		7   | 8  | X
 		    |    |
 		    |    |



-----------Vous avez gagner.--------------
Voulez-vous jouez de nouveau (oui)?

 */