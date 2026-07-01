public class jogo {

    private String nome;
    private int idade;
    private String tipo;

    public jogo(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }
    public void atacar(){
        String atacar;

        switch (tipo.toLowerCase()) {
            case "mago":
                atacar = "magia";
                break;
            case "guerreiro":
                atacar = "espada";
                break;
            case " monge":
                atacar = "artes marciais";
                break;
            case "ninja ":
                atacar = "shuriken";
                break;
            default:
                atacar = "ataque desconhecido";
        }
        System.out.println("Usou " + tipo + "e atacou usando " +atacar);
    }
}

