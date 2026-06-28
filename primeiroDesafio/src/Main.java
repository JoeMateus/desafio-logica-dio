//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       System.out.println("Hello World");
        System.out.println("Escolha um persornagem:");
        String[] nome = {"Supermen", "Batman", "Flash", "SuperGirl"};
        System.out.println(nome[3]);
        int xp = 7000;
        String nivel;

        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp <= 2000) {
            nivel = "Bronze";
        } else if (xp <= 5000) {
            nivel = "Prata";
        } else if (xp <= 7000) {
            nivel = "Ouro";
        } else if (xp <= 8000) {
            nivel = "Platina";
        } else if (xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }
        System.out.println("O herói " + (nome[3]) +  "está no nível " + nivel);


}

    }
