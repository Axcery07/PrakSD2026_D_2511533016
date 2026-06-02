package Pekan8_2511533016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511533016 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3016;
    private JLabel[] labelArray_3016;
    private JButton stepButton_3016, resetButton_3016, setButton_3016;
    private JTextField inputField_3016;
    private JPanel panelArray_3016;
    private JTextArea stepArea_3016;

    
    private Queue<int[]> mergeQueue_3016 = new LinkedList<>();
    private boolean isMerging_3016 = false;
    private boolean copying_3016 = false;
    private int left_3016, mid_3016, right_3016;
    private int[] temp_3016;
    private int i_3016, j_3016, k_3016;
    private int stepCount_3016 = 1;

    public MergeSortGUI_2511533016() {
        setTitle("Merge Sort Langkah per Langkah"); 
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

     
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField_3016 = new JTextField(30);
        setButton_3016 = new JButton("Set Array");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField_3016);
        inputPanel.add(setButton_3016);

        panelArray_3016 = new JPanel();
        panelArray_3016.setLayout(new FlowLayout());

        JPanel controlPanel = new JPanel();
        stepButton_3016 = new JButton("Langkah Selanjutnya");
        resetButton_3016 = new JButton("Reset");
        stepButton_3016.setEnabled(false);
        controlPanel.add(stepButton_3016);
        controlPanel.add(resetButton_3016);

        stepArea_3016 = new JTextArea(8, 60);
        stepArea_3016.setEditable(false);
        stepArea_3016.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_3016);

        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_3016, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        setButton_3016.addActionListener(e -> setArrayFromInput_3016());
        stepButton_3016.addActionListener(e -> performStep_3016());
        resetButton_3016.addActionListener(e -> reset_3016());
    }

    private void generateMergeSteps_3016(int l_3016, int r_3016) {
        if (l_3016 < r_3016) {
            int m_3016 = (l_3016 + r_3016) / 2;
            generateMergeSteps_3016(l_3016, m_3016);
            generateMergeSteps_3016(m_3016 + 1, r_3016);
            mergeQueue_3016.add(new int[]{l_3016, m_3016, r_3016});
        }
    }

    private void setArrayFromInput_3016() {
        String text = inputField_3016.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_3016 = new int[parts.length];
        try {
            for (int i_3016 = 0; i_3016 < parts.length; i_3016++) {
                array_3016[i_3016] = Integer.parseInt(parts[i_3016].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya Angka dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        labelArray_3016 = new JLabel[array_3016.length];
        panelArray_3016.removeAll();
        for (int i_3016 = 0; i_3016 < array_3016.length; i_3016++) {
            labelArray_3016[i_3016] = new JLabel(String.valueOf(array_3016[i_3016]));
            labelArray_3016[i_3016].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3016[i_3016].setOpaque(true);
            labelArray_3016[i_3016].setBackground(Color.WHITE);
            labelArray_3016[i_3016].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3016[i_3016].setPreferredSize(new Dimension(50, 50));
            labelArray_3016[i_3016].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3016.add(labelArray_3016[i_3016]);
        }

        mergeQueue_3016.clear();
        generateMergeSteps_3016(0, array_3016.length - 1);
        stepButton_3016.setEnabled(true);
        stepArea_3016.setText("");
        stepCount_3016 = 1;
        isMerging_3016 = false;
        panelArray_3016.revalidate();
        panelArray_3016.repaint();
    }

    private void performStep_3016() {
        resetHighlights_3016();

        if (!isMerging_3016 && !mergeQueue_3016.isEmpty()) {
            int[] range = mergeQueue_3016.poll();
            left_3016 = range[0];
            mid_3016 = range[1];
            right_3016 = range[2];
            temp_3016 = new int[right_3016 - left_3016 + 1];
            i_3016 = left_3016;
            j_3016 = mid_3016 + 1;
            k_3016 = 0;
            copying_3016 = false;
            isMerging_3016 = true;
            stepArea_3016.append("Langkah " + stepCount_3016++ + ": Mulai merge dari " + left_3016 + " ke " + right_3016 + "\n");
            return;
        }

        if (isMerging_3016 && !copying_3016) {
            if (i_3016 <= mid_3016 && j_3016 <= right_3016) {
                labelArray_3016[i_3016].setBackground(Color.CYAN);
                labelArray_3016[j_3016].setBackground(Color.CYAN);
                if (array_3016[i_3016] <= array_3016[j_3016]) {
                    temp_3016[k_3016++] = array_3016[i_3016++];
                } else {
                    temp_3016[k_3016++] = array_3016[j_3016++];
                }
                stepArea_3016.append("Langkah " + stepCount_3016++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_3016 <= mid_3016) { 
                temp_3016[k_3016++] = array_3016[i_3016++];
                stepArea_3016.append("Langkah " + stepCount_3016++ + ": Salin sisa kiri\n");
                return;
            } else if (j_3016 <= right_3016) {
                temp_3016[k_3016++] = array_3016[j_3016++];
                stepArea_3016.append("Langkah " + stepCount_3016++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_3016 = true; 
                k_3016 = 0;
                return;
            }
        }

        if (copying_3016 && k_3016 < temp_3016.length) {
            array_3016[left_3016 + k_3016] = temp_3016[k_3016];
            labelArray_3016[left_3016 + k_3016].setText(String.valueOf(temp_3016[k_3016])); 
            labelArray_3016[left_3016 + k_3016].setBackground(Color.GREEN); 
            k_3016++;
            stepArea_3016.append("Langkah " + stepCount_3016++ + ": Tempelkan ke array utama\n"); 
            return;
        }

        if (copying_3016 && k_3016 == temp_3016.length) {
            isMerging_3016 = false;
            copying_3016 = false;
        }

        if (mergeQueue_3016.isEmpty() && !isMerging_3016) {
            stepArea_3016.append("Selesai.\n");
            stepButton_3016.setEnabled(false); 
            JOptionPane.showMessageDialog(this, "Merge Sort Selesai"); // ← Diperbaiki
        }
    }

    private void resetHighlights_3016() { // ← Diperbaiki: Hightlights jadi Highlights
        if (labelArray_3016 == null) return;
        for (JLabel label : labelArray_3016) { // ← Diperbaiki: JLabel_3016 jadi JLabel
            if (label.getBackground() != Color.GREEN) {
                label.setBackground(Color.WHITE);
            }
        }
    }

    private void reset_3016() {
        inputField_3016.setText("");
        panelArray_3016.removeAll();
        panelArray_3016.revalidate();
        panelArray_3016.repaint();
        stepArea_3016.setText("");
        stepButton_3016.setEnabled(false);
        if (mergeQueue_3016 != null) {
            mergeQueue_3016.clear();
        }
        isMerging_3016 = false;
        copying_3016 = false;
        stepCount_3016 = 1;
        array_3016 = null;
        labelArray_3016 = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511533016 gui_3016 = new MergeSortGUI_2511533016();
            gui_3016.setVisible(true);
        });
    }
}