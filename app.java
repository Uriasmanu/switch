/*Eliberto deseja fazer um menu de seleção de um programa utilizando o comando de seleção múltipla. O 
menu consiste nas opções de:
1. Cadastrar usuário
2. Alterar dados
3. Excluir Usuário*/

@impot javax.swing.JOptionPane;

public class switchCase {
    public static void main (String[] args) {
        int opcaos;

        JOptionPane.showMessageDialog("Escolha uma opção : ");
        opcaos = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar usuário /n
        2. Alterar dados /n
        3. Excluir Usuário");
        
        Switch(opcaos){
            case 1:
                JOptionPane.showMessageDialog("Você clicou na opão 1. Cadastrar usuário");
            break;

            case 2:
                JOptionPane.showMessageDialog("Você clicou na opão 2. Alterar dados");
            break;

            case 3:
                JOptionPane.showMessageDialog("Você clicou na opão 3. Excluir Usuário");
            break;

            default:
                JOptionPane.showMessageDialog("Opção invalida");
            break;
        }
    }
}