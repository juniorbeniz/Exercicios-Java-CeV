package Objects;

import java.util.Scanner;

public class ContaBanco {

    Scanner input = new Scanner(System.in);
    private static Integer ultNumConta = 0;

    public Integer numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private Boolean status;

    public ContaBanco() {
        numConta = ++ultNumConta;
        setStatus(false);
        setSaldo(0.00d);
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        setStatus(true);
        System.out.println("Digite seu nome: ");
        setDono(input.nextLine());
        System.out.println("Digite o tipo da conta: (CC para Conta Corrente e CP para Conta Poupança)");
        setTipo(input.nextLine());
        if (getTipo().equalsIgnoreCase("CC")) {
            setSaldo(50.00d);
        } else if (getTipo().equalsIgnoreCase("CP")) {
            setSaldo(150.00d);
        }
    }

    public void fecharConta() {
        if ((getSaldo() != 0)) {
            System.out.println("Não é possível fechar sua conta. Você tem saldo ou possui débito com o banco. Regularize sua situação.");
        } else setStatus(false);
    }

    public void depositar() {
        if (getStatus() == true) {
            System.out.println("Quanto você deseja depositar");
            Double depos = input.nextDouble();
            setSaldo(getSaldo() + depos);
        }
        System.out.println("Seu novo saldo é: " + getSaldo());
    }

    public void sacar() {
        double sacar =0;
        if (getStatus() == false || getSaldo() <= 0) {
            System.out.println("Você não tem saldo ou sua conta está fechada.");
        } else {
            System.out.println("Digite quanto você quer sacar:");
            sacar = input.nextDouble();
        }

        if (sacar > getSaldo()) {
            System.out.println("Você não tem saldo suficiente. \n" + "Seu saldo atual é: " + getSaldo());
        } else setSaldo(getSaldo() - sacar);

    }

    public void pagarMensal() {
        if (getTipo().equalsIgnoreCase("CC")){
            setSaldo(getSaldo() - 12);
        } else if (getTipo().equalsIgnoreCase("CP")){
            setSaldo(getSaldo() - 20);
        }
    }

    public void imprimirDados(){
        System.out.println();
        System.out.println("Esta conta pertence a: " + getDono());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Esta conta está ativa: " + getStatus());
        System.out.println("Saldo: " + getSaldo());
        System.out.println();
    }


}
