package contas;

public class CrairConta {
    public static void main(String[] args) {
        Conta primeiraConta =  new Conta();
         primeiraConta.saldo = 200;
         System.out.println("O saldo da sua conta é: " + primeiraConta.saldo + "R$");

         primeiraConta.saldo += 100;
         System.out.println("O saldo da sua conta AGORA È: " + primeiraConta.saldo + "R$");

         Conta segundaConta = new Conta();
         segundaConta.saldo = 50;
         System.out.println("O saldo da sua SEGUNDA CONTA: " + segundaConta.saldo + "R$");
    }
}
