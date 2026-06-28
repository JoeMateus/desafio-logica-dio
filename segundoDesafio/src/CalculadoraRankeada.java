public class CalculadoraRankeada {
        public static void main(String[]args) {
            int vitorias = 70;
            int derrotas = 35;

            int saldo = calcularSaldo(vitorias, derrotas);
            String nivel = calcularNivel(vitorias);

        }
        public static int calcularSaldo(int vitorias, int derrotas) {
            return vitorias - derrotas;
        }
        public static String calcularNivel(int vitorias) {

            if (vitorias <= 10) {
                return "Ferro";
            } else if (vitorias <= 20) {
                return "Bronze";
            } else if (vitorias <= 50) {
                return "Prata";
            } else if (vitorias <= 80) {
                return "ouro";
            } else if (vitorias <= 90) {
                return "diamante";
            } else if (vitorias <= 100) {
                return "Lendario";
            } else {
                return "imortal";


            }

        }
}
