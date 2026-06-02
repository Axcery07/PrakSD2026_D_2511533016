package Pekan8_2511533016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511533016 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3016;
    private JLabel[] labelArray_3016;
    private JButton stepButton_3016, resetButton_3016, setButton_3016;
    private JTextField inputField_3016;
    private JPanel panelArray_3016;
    private JTextArea stepArea_3016;
    private int i_3016 = 1, j_3016;
    private boolean sorting_3016 = false;
    private int stepCount_3016 = 1;

    /**
     * Create the frame.
     */
    public BubbleSortGUI_2511533016() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_3016 = new JPanel(new FlowLayout());
        inputField_3016 = new JTextField(30);
        setButton_3016 = new JButton("Set Array");
        inputPanel_3016.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_3016.add(inputField_3016);
        inputPanel_3016.add(setButton_3016);

        // Panel array visual
        panelArray_3016 = new JPanel();
        panelArray_3016.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_3016 = new JPanel();
        stepButton_3016 = new JButton("Langkah Selanjutnya");
        resetButton_3016 = new JButton("Reset");
        stepButton_3016.setEnabled(false);
        controlPanel_3016.add(stepButton_3016);
        controlPanel_3016.add(resetButton_3016);

        // Area teks untuk log langkah-langkah
        stepArea_3016 = new JTextArea(8, 60);
        stepArea_3016.setEditable(false);
        stepArea_3016.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_3016 = new JScrollPane(stepArea_3016);

        // Tambahkan panel ke frame
        add(inputPanel_3016, BorderLayout.NORTH);
        add(panelArray_3016, BorderLayout.CENTER);
        add(controlPanel_3016, BorderLayout.SOUTH);
        add(scrollPane_3016, BorderLayout.EAST);

        // Event Set Array
        setButton_3016.addActionListener(e -> setArrayFromInput_3016());

        // Event Langkah Selanjutnya
        stepButton_3016.addActionListener(e -> performStep_3016());

        // Event reset
        resetButton_3016.addActionListener(e -> reset_3016());
    }

    private void setArrayFromInput_3016() {
        String text_3016 = inputField_3016.getText().trim();

        if (text_3016.isEmpty())
            return;

        String[] parts_3016 = text_3016.split(",");
        array_3016 = new int[parts_3016.length];

        try {
            for (int k_3016 = 0; k_3016 < parts_3016.length; k_3016++) {
                array_3016[k_3016] =
                        Integer.parseInt(parts_3016[k_3016].trim());
            }
        } catch (NumberFormatException e_3016) {
            JOptionPane.showMessageDialog(this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_3016 = 0;
        j_3016 = 0;
        stepCount_3016 = 1;
        sorting_3016 = true;
        stepButton_3016.setEnabled(true);
        stepArea_3016.setText("");
        panelArray_3016.removeAll();
        labelArray_3016 = new JLabel[array_3016.length];

        for (int k_3016 = 0; k_3016 < array_3016.length; k_3016++) {
            labelArray_3016[k_3016] =
                    new JLabel(String.valueOf(array_3016[k_3016]));
            labelArray_3016[k_3016].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3016[k_3016].setOpaque(true);
            labelArray_3016[k_3016].setBackground(Color.WHITE);
            labelArray_3016[k_3016].setBorder(
                    BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3016[k_3016].setPreferredSize(
                    new Dimension(50, 50));

            labelArray_3016[k_3016].setHorizontalAlignment(
                    SwingConstants.CENTER);
            panelArray_3016.add(labelArray_3016[k_3016]);
        }
        panelArray_3016.revalidate();
        panelArray_3016.repaint();
    }

    private void performStep_3016() {
        if (!sorting_3016 || i_3016 >= array_3016.length - 1) {
            sorting_3016 = false;
            stepButton_3016.setEnabled(false);

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        resetHighlights_3016();
        StringBuilder stepLog_3016 = new StringBuilder();
        labelArray_3016[j_3016].setBackground(Color.CYAN);
        labelArray_3016[j_3016 + 1].setBackground(Color.CYAN);

        if (array_3016[j_3016] > array_3016[j_3016 + 1]) {

            // Swap
            int temp_3016 = array_3016[j_3016];

            array_3016[j_3016] = array_3016[j_3016 + 1];
            array_3016[j_3016 + 1] = temp_3016;

            labelArray_3016[j_3016].setBackground(Color.RED);
            labelArray_3016[j_3016 + 1].setBackground(Color.RED);

            stepLog_3016.append("Langkah ").append(stepCount_3016).append(": Menukar elemen ke-").append(j_3016).append(" (")
                    					   .append(array_3016[j_3016 + 1]).append(") dengan ke-").append(j_3016 + 1).append(" (")
                    					   .append(array_3016[j_3016]) .append(")\n");

        } else {
            stepLog_3016.append("Langkah ").append(stepCount_3016) .append(": Tidak ada pertukaran antara ke-")
                    .append(j_3016).append(" dan ke-").append(j_3016 + 1).append("\n");
        }

        stepLog_3016.append("Hasil: ")
        			.append(arrayToString_3016(array_3016))
                	.append("\n\n");

        stepArea_3016.append(stepLog_3016.toString());
        updateLabels_3016();
        j_3016++;
        if (j_3016 >= array_3016.length - i_3016 - 1) {
            j_3016 = 0;
            i_3016++;
        }
        stepCount_3016++;
        if (i_3016 >= array_3016.length - 1) {
            sorting_3016 = false;
            stepButton_3016.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_3016() {
        for (int k_3016 = 0; k_3016 < array_3016.length; k_3016++) {
            labelArray_3016[k_3016]
                    .setText(String.valueOf(array_3016[k_3016]));
        }
    }

    private void resetHighlights_3016() {
        for (JLabel label_3016 : labelArray_3016) {
            label_3016.setBackground(Color.WHITE);
        }
    }

    private void reset_3016() {
        inputField_3016.setText("");

        panelArray_3016.removeAll();
        panelArray_3016.revalidate();
        panelArray_3016.repaint();
        stepArea_3016.setText("");
        stepButton_3016.setEnabled(false);
        sorting_3016 = false;
        i_3016 = 0;
        j_3016 = 0;
        stepCount_3016 = 1;
    }

    private String arrayToString_3016(int[] arr_3016) {
        StringBuilder sb_3016 = new StringBuilder();

        for (int k_3016 = 0; k_3016 < arr_3016.length; k_3016++) {
            sb_3016.append(arr_3016[k_3016]);

            if (k_3016 < arr_3016.length - 1)
                sb_3016.append(", ");
        }
        return sb_3016.toString();
    }

    public static void main(String[] args_3016) {
        SwingUtilities.invokeLater(() -> {
            BubbleSortGUI_2511533016 gui_3016 =
                    new BubbleSortGUI_2511533016();

            gui_3016.setVisible(true);
        });
    }
}