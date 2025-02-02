
// Classe de test
class UseIrregular {
    public static void main(String[] args) {
        // Test 1 : Création et affichage
        System.out.println("Test 1: Création et affichage d'une structure irrégulière");
        int[] sizes = {3, 1, 2, 3};
        Irregular irr = new Irregular(sizes);
        irr.randomFilling();
        System.out.println("Structure générée :");
        System.out.println(irr.display());

        // Test 2 : Vérification de la présence d'éléments
        System.out.println("\nTest 2: Recherche d'éléments communs");
        for (int i = 0; i < 10; i++) {
            if (irr.isCommon(i)) {
                System.out.println("Le nombre " + i + " est présent dans toutes les lignes");
            }
        }

        // Test 3 : Vérification de l'existence d'un élément commun
        System.out.println("\nTest 3: Existence d'un élément commun");
        if (irr.existCommon()) {
            System.out.println("Il existe au moins un élément commun à toutes les lignes");
        } else {
            System.out.println("Il n'existe pas d'élément commun à toutes les lignes");
        }
    }
}