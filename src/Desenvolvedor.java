public class Desenvolvedor extends Funcionario implements Trabalhavel {
    
    private String[] tecsDoms;

    public Desenvolvedor(String nome, int matricula, String[] tecsDoms) {
        super(nome, matricula);
        this.tecsDoms = tecsDoms;
    }

    public String[] getTecsDoms() {
        return tecsDoms;
    }

    public void setTecsDoms(String[] tecsDoms) {
        this.tecsDoms = tecsDoms;
    }

    @Override
    public float calcularSalario() {

        return 5000 + (tecsDoms.length * 100);
    }

    @Override
    public String trabalhar() {

        return "Desenvolvedor " + getNome() + " está codificando.";
    
    }

    @Override
    public String relatarProgresso() {
        
        return "Desenvolvedor " + getNome() + " está relatando o progresso do projeto.";
    
    }
    
}

