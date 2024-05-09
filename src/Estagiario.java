public class Estagiario extends Funcionario implements Trabalhavel {
    
    private int horasTrabalho;
    private String supervisor;

    public Estagiario(String nome, int matricula, int horasTrabalho, String supervisor) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
        this.supervisor = supervisor;
    }

    @Override
    public float calcularSalario() {
        
        return horasTrabalho * 10;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String trabalhar() {
        
        return "Estagiário " + getNome() + " está aprendendo e contribuindo.";
    
    }

    @Override
    public String relatarProgresso() {

        return "Estagiário " + getNome() + " está relatando seu progresso ao supervisor " + supervisor + ".";
    
    }
}
