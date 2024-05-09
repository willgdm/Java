import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula) {

        for (Funcionario temp : listaFuncionarios) {

            if (temp.getMatricula() == matricula) {

                return temp;
            }

        }

        return null;

    }

    public static Funcionario remover(int matricula) {
        Funcionario funcionario = null;
        for (Funcionario temp : listaFuncionarios) {
            if (temp.getMatricula() == matricula) {
                funcionario = temp;
                break;
            }
        }
    
        if (funcionario != null) {
            listaFuncionarios.remove(funcionario);
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário com a matrícula especificada não encontrado.");
        }
        return funcionario;
    }
    

    

}