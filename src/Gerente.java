public class Gerente extends Funcionario implements Trabalhavel {
    
    private float bonusAnual;
    private int equipe;

    public Gerente(String nome, int matricula, float bonusAnual, int equipe) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    @Override
    public float calcularSalario() {
        
        return 10000 + bonusAnual;
    }

    @Override
    public String trabalhar() {
        
        return "Gerente " + getNome() + " está supervisionando sua equipe.";
    }

    @Override
    public String relatarProgresso() {

        return "Gerente " + getNome() + " está relatando o progresso da equipe.";
    
    }
}

