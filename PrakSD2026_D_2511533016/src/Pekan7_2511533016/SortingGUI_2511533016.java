package Pekan7_2511533016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class SortingGUI_2511533016 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JTextField txtNama_3016, txtNim_3016, txtProdi_3016;
    private JButton addButton_3016, stepButton_3016, resetButton_3016;
    private JComboBox<String> comboSorting_3016;
    private JPanel panelArray_3016;
    private JTextArea areaLangkah_3016;
    private JLabel[] labelArray_3016;

    private ArrayList<Mahasiswa_2511533016> listMhs_3016;
    private ArrayList<Mahasiswa_2511533016> dataSorting_3016;

    private int i_3016;
    private boolean sortingSelesai_3016;

    public SortingGUI_2511533016() {
        setTitle("Visualisasi Sorting Mahasiswa_2511533016");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listMhs_3016 = new ArrayList<>();

        // Panel Input
        JPanel panelInput_3016 = new JPanel(new GridLayout(5, 2, 5, 5));
        panelInput_3016.setBorder(
                BorderFactory.createTitledBorder("Input Data"));

        panelInput_3016.add(new JLabel("Nama Mahasiswa"));
        txtNama_3016 = new JTextField();
        panelInput_3016.add(txtNama_3016);

        panelInput_3016.add(new JLabel("NIM"));
        txtNim_3016 = new JTextField();
        panelInput_3016.add(txtNim_3016);

        panelInput_3016.add(new JLabel("Program Studi"));
        txtProdi_3016 = new JTextField();
        panelInput_3016.add(txtProdi_3016);

        panelInput_3016.add(new JLabel("Pilih Sorting"));
        comboSorting_3016 = new JComboBox<>();
        comboSorting_3016.addItem("Insertion Sort");
        comboSorting_3016.addItem("Selection Sort");
        comboSorting_3016.addItem("Bubble Sort");
        panelInput_3016.add(comboSorting_3016);

        addButton_3016 = new JButton("Tambah Data");
        panelInput_3016.add(addButton_3016);

        // Panel Visual Array
        panelArray_3016 = new JPanel();
        panelArray_3016.setLayout(new FlowLayout());
        panelArray_3016.setBorder(
                BorderFactory.createTitledBorder("Visualisasi Data"));

        // Panel Control
        JPanel panelControl_3016 = new JPanel();
        stepButton_3016 = new JButton("Langkah Selanjutnya");
        resetButton_3016 = new JButton("Reset");
        panelControl_3016.add(stepButton_3016);
        panelControl_3016.add(resetButton_3016);

        // Text Area
        areaLangkah_3016 = new JTextArea();
        areaLangkah_3016.setEditable(false);
        areaLangkah_3016.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scroll_3016 = new JScrollPane(areaLangkah_3016);
        scroll_3016.setPreferredSize(new Dimension(350, 500));

        // Add Component
        add(panelInput_3016, BorderLayout.NORTH);
        add(panelArray_3016, BorderLayout.CENTER);
        add(panelControl_3016, BorderLayout.SOUTH);
        add(scroll_3016, BorderLayout.EAST);

        // Button Event
        addButton_3016.addActionListener(e -> tambahData_3016());
        stepButton_3016.addActionListener(e -> prosesSorting_3016());
        resetButton_3016.addActionListener(e -> reset_3016());
        stepButton_3016.setEnabled(false);
    }

    // Method Tambah Data
    private void tambahData_3016() {
        String nama_3016 = txtNama_3016.getText().trim();
        String nim_3016 = txtNim_3016.getText().trim();
        String prodi_3016 = txtProdi_3016.getText().trim();

        if (nama_3016.isEmpty() || nim_3016.isEmpty() || prodi_3016.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data belum lengkap!");
            return;
        }

        Mahasiswa_2511533016 mhs_3016 = new Mahasiswa_2511533016(nama_3016, nim_3016, prodi_3016);
        listMhs_3016.add(mhs_3016);
        tampilkanVisual_3016(listMhs_3016);

        txtNama_3016.setText("");
        txtNim_3016.setText("");
        txtProdi_3016.setText("");
        stepButton_3016.setEnabled(true);

        i_3016 = 1;
        sortingSelesai_3016 = false;
        areaLangkah_3016.setText("");
    }

    // Visual Tabel Array
    private void tampilkanVisual_3016(ArrayList<Mahasiswa_2511533016> data_3016) {
        panelArray_3016.removeAll();
        labelArray_3016 = new JLabel[data_3016.size()];

        for (int k_3016 = 0; k_3016 < data_3016.size(); k_3016++) {
            labelArray_3016[k_3016] = new JLabel(data_3016.get(k_3016).getNama_3016());
            labelArray_3016[k_3016].setFont(new Font("Arial", Font.BOLD, 16));
            labelArray_3016[k_3016].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3016[k_3016].setPreferredSize(new Dimension(120, 50));
            labelArray_3016[k_3016].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3016.add(labelArray_3016[k_3016]);
        }
        panelArray_3016.revalidate();
        panelArray_3016.repaint();
    }

    // Proses Sorting Step
    private void prosesSorting_3016() {
        if (listMhs_3016.size() <= 1) {
            JOptionPane.showMessageDialog(this, "Data minimal 2!");
            return;
        }

        if (dataSorting_3016 == null || i_3016 == 1) {
            dataSorting_3016 = new ArrayList<>();
            for (Mahasiswa_2511533016 m : listMhs_3016) {
                dataSorting_3016.add(new Mahasiswa_2511533016(
                        m.getNama_3016(), m.getNim_3016(), m.getProdi_3016()));
            }
        }

        String pilihan_3016 = comboSorting_3016.getSelectedItem().toString();
        if (pilihan_3016.equals("Insertion Sort")) {
            insertionStep_3016();
        } else if (pilihan_3016.equals("Selection Sort")) {
            selectionStep_3016();
        } else {
            bubbleStep_3016();
        }

        tampilkanVisual_3016(dataSorting_3016);
    }

    // Insertion Sort Step
    private void insertionStep_3016() {
        if (i_3016 < dataSorting_3016.size()) {
            Mahasiswa_2511533016 key_3016 = dataSorting_3016.get(i_3016);
            int j_3016 = i_3016 - 1;

            while (j_3016 >= 0 && dataSorting_3016.get(
                    j_3016).getNama_3016().compareToIgnoreCase(
                            key_3016.getNama_3016()) > 0) {
                dataSorting_3016.set(j_3016 + 1, dataSorting_3016.get(j_3016));
                j_3016--;
            }

            dataSorting_3016.set(j_3016 + 1, key_3016);
            areaLangkah_3016.append(
                    "Langkah " + i_3016 + " : " + tampilNama_3016(
                            dataSorting_3016) + "\n");
            i_3016++;
        } else {
            selesai_3016();
        }
    }

    // Selection Sort Step
    private void selectionStep_3016() {
        if (i_3016 < dataSorting_3016.size()) {
            int min_3016 = i_3016 - 1;
            for (int j_3016 = i_3016; j_3016 < dataSorting_3016.size(); j_3016++) {
                if (dataSorting_3016.get(j_3016).getNama_3016().
                        compareToIgnoreCase(dataSorting_3016.get(min_3016).
                                getNama_3016()) < 0) {
                    min_3016 = j_3016;
                }
            }
            Mahasiswa_2511533016 temp_3016 = dataSorting_3016.get(i_3016 - 1);
            dataSorting_3016.set(i_3016 - 1, dataSorting_3016.get(min_3016));
            dataSorting_3016.set(min_3016, temp_3016);

            areaLangkah_3016.append("Pass " + i_3016 + " : "
                    + tampilNama_3016(dataSorting_3016) + "\n");

            i_3016++;
        } else {
            selesai_3016();
        }
    }

    // Bubble Sort Step
    private void bubbleStep_3016() {
        if (i_3016 < dataSorting_3016.size()) {
            for (int j_3016 = 0; j_3016 < dataSorting_3016.size() - i_3016; j_3016++) {
                if (dataSorting_3016.get(j_3016).getNama_3016().compareToIgnoreCase(
                        dataSorting_3016.get(j_3016 + 1).getNama_3016()) > 0) {
                    Mahasiswa_2511533016 temp_3016 = dataSorting_3016.get(j_3016);
                    dataSorting_3016.set(j_3016, dataSorting_3016.get(j_3016 + 1));
                    dataSorting_3016.set(j_3016 + 1, temp_3016);
                }
            }
            areaLangkah_3016.append("Pass " + i_3016 + " : " + tampilNama_3016(
                    dataSorting_3016) + "\n");

            i_3016++;
        } else {
            selesai_3016();
        }
    }

    // String Array
    private String tampilNama_3016(ArrayList<Mahasiswa_2511533016> data_3016) {
        String hasil_3016 = "[";

        for (int i_3016 = 0; i_3016 < data_3016.size(); i_3016++) {
            hasil_3016 += data_3016.get(i_3016).getNama_3016();
            if (i_3016 != data_3016.size() - 1) {
                hasil_3016 += ", ";
            }
        }
        hasil_3016 += "]";
        return hasil_3016;
    }

    // Sorting Selesai
    private void selesai_3016() {
        if (!sortingSelesai_3016) {
            sortingSelesai_3016 = true;
            stepButton_3016.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    // Reset
    private void reset_3016() {
        listMhs_3016.clear();
        dataSorting_3016 = null;
        panelArray_3016.removeAll();
        panelArray_3016.revalidate();
        panelArray_3016.repaint();

        areaLangkah_3016.setText("");
        txtNama_3016.setText("");
        txtNim_3016.setText("");
        txtProdi_3016.setText("");

        stepButton_3016.setEnabled(false);
        i_3016 = 1;
        sortingSelesai_3016 = false;
    }

    // Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SortingGUI_2511533016().setVisible(true);
        });
    }
}