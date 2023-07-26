package Objects;

public class Executor {

    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();

        c1.abrirConta();
        c1.depositar();
        c1.sacar();
        c1.pagarMensal();
        c1.fecharConta();
        c1.imprimirDados();

        c2.abrirConta();
        c2.depositar();
        c2.sacar();
        c2.pagarMensal();
        c2.fecharConta();
        c2.imprimirDados();
    }
}