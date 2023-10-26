import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto         Construtor
        Turista mochileiro = new Turista();
        // Definir formato do objeto
        mochileiro.setNome("Lindsay Lohan");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista("Maria");
        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);

        // Criar um novo objeto
        Turista outroTurista = new Turista();
        String nome = JOptionPane.showInputDialog("Entre com seu nome:");
        outroTurista.setNome(nome);
        JOptionPane.showMessageDialog(null, "O nome digitado foi "+
                    outroTurista.getNome());

        // Criar a captura do CPF deste objeto
        String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
        outroTurista.setCpf(cpf);

        if(Validacao.validaCPF(cpf)) {
            System.out.println("CPF VALIDADO!!!");
            JOptionPane.showMessageDialog(null, outroTurista.getCpf()
                    + " validado!");
        }

        else{
            System.out.println("ERRO CPF NÃO VALIDADO!!!");
            JOptionPane.showMessageDialog(null, outroTurista.getCpf()
                    + " não validado!");
        }
    }
}