public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nCADASTRO DE FUNCIONÁRIOS");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Buscar Funcionário");
        System.out.println("5) Remover Funcionário");
        System.out.println("6) Listar Funcionários");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op) {

        int matricula;
        int horasTrabalho;
        String nome;
        String[] tecDoms;
        String supervisor;
        float bonusAnual;
        int equipe;

        switch (op) {
            case 1:

                System.out.println("\nNovo Gerente:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Bonus anual: ");
                bonusAnual = Console.lerFloat();

                System.out.print("Pessoas na equipe: ");
                equipe = Console.lerInt();

                Gerente g = new Gerente(nome, matricula, bonusAnual, equipe);

                System.out.print("Salário: ");
                System.out.println(g.calcularSalario());

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso!");
                System.out.println(g.trabalhar());
                System.out.println(g.relatarProgresso());

                break;

            case 2:

                System.out.println("\nNovo Desenvolvedor:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Tecnologias que domina: ");
                tecDoms = Console.lerStringArray();

                Desenvolvedor d = new Desenvolvedor(nome, matricula, tecDoms);

                System.out.print("Salário: ");
                System.out.println(d.calcularSalario());

                Cadastro.cadastrar(d);

                System.out.println("\nDesenvolvedor cadastrado com sucesso!");
                System.out.println(d.trabalhar());
                System.out.println(d.relatarProgresso());

                break;

            case 3:

                System.out.println("\nNovo Estagiario:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Horas de trabalho: ");
                horasTrabalho = Console.lerInt();

                System.out.print("Supervisor: ");
                supervisor = Console.lerString();

                Estagiario e = new Estagiario(nome, matricula, horasTrabalho, supervisor);

                System.out.print("Salário: ");
                System.out.println(e.calcularSalario());

                Cadastro.cadastrar(e);

                System.out.println("\nDesenvolvedor cadastrado com sucesso!");
                System.out.println(e.trabalhar());
                System.out.println(e.relatarProgresso());

                break;

            case 4:

                System.out.println("\nBuscar Funcionário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;

                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado");

                break;

            case 5:

                System.out.println("\nRemover Funcionário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                Cadastro.remover(matricula);

                break;

            case 6:

                System.out.println("\nTodos os Funcionários Cadastrados:");

                if (Cadastro.getListaFuncionarios().size() == 0) {

                    System.out.println("\nNão há fucionários cadastrados...");
                    return;

                }

                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());
                }
                break;

            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
