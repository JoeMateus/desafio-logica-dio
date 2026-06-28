//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vitorias = 70;
        int derrotas = 35;

        int saldo = calcularSaldo(vitorias, derrotas);
        String nivel = calcularNivel(vitorias);

    }
    public static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }
