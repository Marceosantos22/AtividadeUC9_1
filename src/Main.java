
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setSize(300, 200);
        janela.setTitle("Tela de Venda");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JLabel descricao1 = new JLabel();
        descricao1.setText("Digite o valor: ");
        janela.add(descricao1);

        JTextField valor = new JTextField(8);
        janela.add(valor);

        JButton calcular = new JButton();
        calcular.setText("Calcular");
        janela.add(calcular);

        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorVenda = Double.parseDouble(valor.getText());
                double total = 0;
                if (valorVenda > 500) {
                    double desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe % desconto: "));
                    total = valorVenda - (valorVenda * (desconto / 100));
                } else {
                    total = valorVenda;
                }
                JOptionPane.showMessageDialog(null, "Valor total: R$ " + String.format("%.2f", total));
            }
        });

        janela.setVisible(true);
    }
}