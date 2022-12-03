/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasmira
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Quadro extends JFrame {
    
//    private JTextArea texto = new JTextArea();
//    private JLabel nome = new JLabel();
//    
//    public Quadro(){
//        super("Login");
//        this.montaJanela();
//    }
//    private void montaJanela(){
//        this.getContentPane().add(texto);
//        this.getContentPane().add(nome);
//    }
    
    public static void main(String []args){
        
        //Criando Objetos
        Quadro janela = new Quadro();
        JLabel nome = new JLabel("Nome: ");
        JLabel senha = new JLabel("Senha: ");
        JTextField INome = new JTextField();
        JTextField ISenha = new JTextField();
        JButton entrar = new JButton("Entrar");
        JButton sair = new JButton("Sair");

        
        //adicionando Componentes na janela
        janela.setSize(450,230);
        janela.setLayout(null);
        janela.getContentPane().setBackground(new Color(200, 30, 50));
        janela.setVisible(true);
        janela.add(nome);
        janela.add(senha);
        janela.add(INome);
        janela.add(ISenha);
        janela.add(entrar);
        janela.add(sair);
        
        //Adicionando Propriedades ao Nome
        nome.setBounds(50, 25, 50 , 20);
        nome.setForeground(Color.yellow);
        INome.setBounds(100, 25, 150, 20);
        INome.setBackground(Color.green);
        
        
        
        //Adicionando Propriedades a Senha
        senha.setBounds(50, 50, 50, 20);
        senha.setForeground(Color.yellow);
        ISenha.setBounds(100, 50, 150, 20);
        ISenha.setBackground(Color.green);
        //nome.setFont(new Font("Calibr",Font.BOLD, 20));
        
        //Adicionando Propriedades aos Buttons
        entrar.setBounds(50, 100, 75, 20);
        sair.setBounds(150, 100, 75, 20);
        entrar.setBackground(Color.blue);
        sair.setBackground(Color.blue);
        
    }
}
