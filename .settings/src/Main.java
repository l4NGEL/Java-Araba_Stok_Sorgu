import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Taşıt Seçimi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        Stok stok = new Stok();

        String[] tasitCesitleri = {"Araba","Motorsiklet", "Kamyon", "Bisiklet"};
        JComboBox<String> tasitCesidiComboBox = new JComboBox<>(tasitCesitleri);

        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 100, 1);
        JSpinner adetSpinner = new JSpinner(spinnerModel);

        JButton ekleButton = new JButton("Ekle");
        JButton cikarButton = new JButton("Çıkar");

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menü");
        JMenuItem stokKontrolMenuItem = new JMenuItem("Stok Kontrol");

        menu.add(stokKontrolMenuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        JFrame stokKontrolFrame = new JFrame("Stok Kontrol");
        stokKontrolFrame.setSize(300, 200);
        stokKontrolFrame.setLayout(new BorderLayout());
        JTextArea stokBilgisiTextArea = new JTextArea();
        stokBilgisiTextArea.setEditable(false);
        stokKontrolFrame.add(new JScrollPane(stokBilgisiTextArea), BorderLayout.CENTER);

        ActionListener stokGuncelle = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stokBilgisiTextArea.setText("");
                for (String tasitCesidi : tasitCesitleri) {
                    stokBilgisiTextArea.append(tasitCesidi + ": " + stok.getStok(tasitCesidi) + "\n");
                }
            }
        };

        stokKontrolMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stokGuncelle.actionPerformed(null);
                stokKontrolFrame.setVisible(true);
            }
        });

        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tasitCesidi = (String) tasitCesidiComboBox.getSelectedItem();
                int adet = (int) adetSpinner.getValue();
                stok.ekleStok(tasitCesidi, adet);
                stokGuncelle.actionPerformed(null);
            }
        });

        cikarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tasitCesidi = (String) tasitCesidiComboBox.getSelectedItem();
                int adet = (int) adetSpinner.getValue();
                if (stok.cikarStok(tasitCesidi, adet)) {
                    stokGuncelle.actionPerformed(null);
                } else {
                    JOptionPane.showMessageDialog(frame, "Yeterli stok yok!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Taşıt Çeşidi:"));
        panel1.add(tasitCesidiComboBox);

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Adet:"));
        panel2.add(adetSpinner);

        JPanel panel3 = new JPanel();
        panel3.add(ekleButton);
        panel3.add(cikarButton);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        stokGuncelle.actionPerformed(null);

        frame.setVisible(true);
    }
}
