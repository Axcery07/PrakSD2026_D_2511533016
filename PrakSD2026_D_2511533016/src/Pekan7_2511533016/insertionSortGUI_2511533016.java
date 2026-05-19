package Pekan7_2511533016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

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
import javax.swing.border.EmptyBorder;

public class insertionSortGUI_2511533016 extends JFrame {
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
	public insertionSortGUI_2511533016() {
		 setTitle("Insertion Sort Langkah per Langkah");
	        setSize(750, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());

	        // Panel input
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
	    private void setArrayFromInput_3016() {
	        String text = inputField_3016.getText().trim();
	        if (text.isEmpty()) return;
	        String[] parts = text.split(",");
	        array_3016 = new int[parts.length];
	        try {
	            for (int k = 0; k < parts.length; k++) {
	                array_3016[k] = Integer.parseInt(parts[k].trim());
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                    + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        i_3016 = 1;
	        stepCount_3016 = 1;
	        sorting_3016 = true;
	        stepButton_3016.setEnabled(true);
	        stepArea_3016.setText("");
	        panelArray_3016.removeAll();
	        labelArray_3016 = new JLabel[array_3016.length];
	        for (int k = 0; k < array_3016.length; k++) {
	            labelArray_3016[k] = new JLabel(String.valueOf(array_3016[k]));
	            labelArray_3016[k].setFont(new Font("Arial", Font.BOLD, 24));
	            labelArray_3016[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            labelArray_3016[k].setPreferredSize(new Dimension(50, 50));
	            labelArray_3016[k].setHorizontalAlignment(SwingConstants.CENTER);
	            panelArray_3016.add(labelArray_3016[k]);
	        }
	        panelArray_3016.revalidate();
	        panelArray_3016.repaint();
	    }
	    private void performStep_3016() {
	        if (i_3016 < array_3016.length && sorting_3016) {
	            int key = array_3016[i_3016];
	            j_3016 = i_3016 - 1;

	            StringBuilder stepLog = new StringBuilder();
	            stepLog.append("Langkah ").append(stepCount_3016).
	            append(": Memasukkan ").append(key).append("\n");

	            while (j_3016 >= 0 && array_3016[j_3016] > key) {
	                array_3016[j_3016 + 1] = array_3016[j_3016];
	                j_3016--;
	            }
	            array_3016[j_3016 + 1] = key;

	            updateLabels_3016();
	            stepLog.append("Hasil: ").append(arrayToString(array_3016)).append("\n\n");
	            stepArea_3016.append(stepLog.toString());

	            i_3016++;
	            stepCount_3016++;

	            if (i_3016 == array_3016.length) { 
	                sorting_3016 = false;
	                stepButton_3016.setEnabled(false);
	                JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	        }
	    }
	            private void updateLabels_3016() {
	                for (int k = 0; k < array_3016.length; k++) {
	                    labelArray_3016[k].setText(String.valueOf(array_3016[k]));
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
	                i_3016 = 1;
	                stepCount_3016 = 1;
	            }

	            private String arrayToString(int[] arr_3012) {
	                StringBuilder sb = new StringBuilder();
	                for (int k = 0; k < arr_3012.length; k++) {
	                    sb.append(arr_3012[k]);
	                    if (k < arr_3012.length - 1) sb.append(", ");
	                }
	                return sb.toString();
	            }

	            public static void main(String[] args) {
	                SwingUtilities.invokeLater(() -> {
	                    insertionSortGUI_2511533016 gui__3016 = new insertionSortGUI_2511533016();
	                    gui__3016.setVisible(true);
	                });
	            }
	        }