package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0, empates = 0, derrotas = 0;

    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarEmpate(){
        empates++;
    }
    public void registrarDerrota(){
        derrotas++;
    }
    public Integer getPontos(){
        Integer totalPontos = (vitorias*3) + empates;
        return totalPontos;
    }
    public Integer getTotalPartidas(){
        Integer totalPartidas = vitorias+empates+derrotas;
        return totalPartidas;
    }
    public Integer getAproveitamento(){
        Integer totalpartidas = getTotalPartidas();

        Integer aproveitamento = vitorias*100/totalpartidas;
        return aproveitamento;
    }

        public void compararAproveitamento(Time adversario){
        Integer aproveitamento = getAproveitamento();
        Integer adversarioAproveitamento = adversario.getAproveitamento();

        if (aproveitamento > adversarioAproveitamento){
            System.out.println("O time "+nome+" tem um aproveitamento maior que o time "+adversario.nome+".");
        } else {
            System.out.println("O time "+adversario.nome+" tem um aproveitamento maior que o time "+nome+".");
        }
    }

    public void exibirInformacoes(){
        System.out.println(
                "Time: "+nome+
                "\nVitórias: "+vitorias+
                "\nEmpates: "+empates+
                "\nDerrotas: "+derrotas+
                "\n\n"+
                "\nPontos: "+getPontos()+
                "\nTotal de Partidas: "+getTotalPartidas()+
                "\nAproveitamento: "+getAproveitamento()+"%");
    }
}
