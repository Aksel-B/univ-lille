import java.util.Random;

// Classe principale pour la structure irrégulière
class Irregular {
    private final int[][] structure;

    /**
     * Constructeur créant une structure irrégulière.
     * @param lineSize tableau contenant la taille de chaque ligne
     */
    public Irregular(int[] lineSize) {
        if (lineSize == null || lineSize.length == 0) {
            throw new IllegalArgumentException("Le tableau de tailles ne peut pas être null ou vide");
        }
        
        structure = new int[lineSize.length][];
        for (int i = 0; i < lineSize.length; i++) {
            structure[i] = new int[lineSize[i]];
        }
    }

    /**
     * Remplit la structure avec des valeurs aléatoires entre 0 et 9.
     */
    public void randomFilling() {
        Random rand = new Random();
        for (int[] structure1 : structure) {
            for (int j = 0; j < structure1.length; j++) {
                structure1[j] = rand.nextInt(10);
            }
        }
    }

    /**
     * Génère une représentation textuelle de la structure.
     * @return String représentant la structure
     */
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : structure) {
            for (int j = 0; j < row.length; j++) {
                sb.append(row[j]);
                if (j < row.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Vérifie si un élément est présent dans toutes les lignes.
     * @param element élément à rechercher
     * @return true si l'élément est présent dans chaque ligne, false sinon
     */
    public boolean isCommon(int element) {
        for (int[] row : structure) {
            boolean foundInRow = false;
            for (int value : row) {
                if (value == element) {
                    foundInRow = true;
                    break;
                }
            }
            if (!foundInRow) {
                return false;
            }
        }
        return true;
    }

    /**
     * Vérifie s'il existe au moins un élément commun à toutes les lignes.
     * @return true si un élément commun existe, false sinon
     */
    public boolean existCommon() {
        // Pour chaque valeur possible (0-9)
        for (int val = 0; val < 10; val++) {
            boolean isCommonValue = true;
            // Vérifier si cette valeur est dans chaque ligne
            for (int[] row : structure) {
                boolean foundInRow = false;
                for (int element : row) {
                    if (element == val) {
                        foundInRow = true;
                        break;
                    }
                }
                if (!foundInRow) {
                    isCommonValue = false;
                    break;
                }
            }
            if (isCommonValue) {
                return true;
            }
        }
        return false;
    }
}