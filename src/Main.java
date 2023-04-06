import javax.swing.JOptionPane;

public class Main {
  /* 1. Armazene as notas do:
  - Primeiro Bimestre;
  - Segundo Bimestre;
  - Terceiro Bimestre;
  - Quarto Bimestre.
  
  Como resultado, mostre a seguinte informação:
  O Aluno (nome) teve como média a nota (média) */
  public static void main(String[] args) {
    
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
    String nota1 = JOptionPane.showInputDialog(null, "Digite a nota do 1º bimestre: ");
    double nt1 = Double.parseDouble(nota1);
    String nota2 = JOptionPane.showInputDialog(null, "Digite a nota do 2º bimestre: ");
    double nt2 = Double.parseDouble(nota2);
    String nota3 = JOptionPane.showInputDialog(null, "Digite a nota do 3º bimestre: ");
    double nt3 = Double.parseDouble(nota3);
    String nota4 = JOptionPane.showInputDialog(null, "Digite a nota do 4º bimestre: ");
    double nt4 = Double.parseDouble(nota4);
    double media = (nt1 + nt2 + nt3 + nt4) / 4;
    JOptionPane.showMessageDialog(null, "O aluno " + nome + " teve como média a nota: " + media);
  }
}