package Pekan9_2511533016;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PetaKampus_2511533016 extends JFrame {

    // ===== 10 NODE, 15 EDGE =====
    private final String[] nodes_3016 = {
        "Gerbang",   // 0
        "Rektorat",  // 1
        "Perpus",    // 2
        "FTI",       // 3
        "FKIP",      // 4
        "Lab Komp",  // 5
        "Lab AI",    // 6
        "Masjid",    // 7
        "Kantin",    // 8
        "PKM"        // 9
    };

    // 15 edge
    private final int[][] edges_3016 = {
        {0, 1}, // Gerbang   - Rektorat
        {0, 8}, // Gerbang   - Kantin
        {1, 2}, // Rektorat  - Perpus
        {1, 4}, // Rektorat  - FKIP
        {1, 9}, // Rektorat  - PKM
        {2, 3}, // Perpus    - FTI
        {2, 9}, // Perpus    - PKM
        {3, 5}, // FTI       - Lab Komp
        {3, 6}, // FTI       - Lab AI
        {4, 7}, // FKIP      - Masjid
        {4, 9}, // FKIP      - PKM
        {5, 6}, // Lab Komp  - Lab AI
        {6, 7}, // Lab AI    - Masjid
        {7, 9}, // Masjid    - PKM
        {8, 9}, // Kantin    - PKM
    };

    private JComboBox<String> cbStart_3016, cbGoal_3016;
    private JTextArea taGraph_3016, taResult_3016;

    public PetaKampus_2511533016() {
        setTitle("Peta Kampus - BFS & DFS | 2511533016");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(4, 4));

        buildTop_3016();
        buildGraph_3016();
        buildResult_3016();

        setSize(750, 520);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buildTop_3016() {
        JPanel north_3016 = new JPanel(new BorderLayout());

        JLabel title_3016 = new JLabel("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS", SwingConstants.CENTER);
        title_3016.setFont(new Font("Dialog", Font.BOLD, 15));
        title_3016.setForeground(Color.WHITE);
        title_3016.setOpaque(true);
        title_3016.setBackground(new Color(50, 80, 130));
        title_3016.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JPanel ctrl_3016 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 6));
        ctrl_3016.setBackground(new Color(230, 230, 230));

        cbStart_3016 = new JComboBox<>(nodes_3016);
        cbStart_3016.setSelectedIndex(0);
        cbGoal_3016  = new JComboBox<>(nodes_3016);
        cbGoal_3016.setSelectedIndex(6);

        JButton btnBFS_3016   = buatTombol_3016("[ BFS ]",   new Color(60, 160, 60));
        JButton btnDFS_3016   = buatTombol_3016("[ DFS ]",   new Color(200, 130, 0));
        JButton btnReset_3016 = buatTombol_3016("[ RESET ]", new Color(190, 40, 40));

        btnBFS_3016.addActionListener(e -> {
            resetGraph_2511533016();
            BFS_2511533016(cbStart_3016.getSelectedIndex(), cbGoal_3016.getSelectedIndex());
        });
        btnDFS_3016.addActionListener(e -> {
            resetGraph_2511533016();
            DFS_2511533016(cbStart_3016.getSelectedIndex(), cbGoal_3016.getSelectedIndex());
        });
        btnReset_3016.addActionListener(e -> resetGraph_2511533016());

        ctrl_3016.add(new JLabel("Lokasi Awal   :"));
        ctrl_3016.add(cbStart_3016);
        ctrl_3016.add(new JLabel("Lokasi Tujuan :"));
        ctrl_3016.add(cbGoal_3016);
        ctrl_3016.add(btnBFS_3016);
        ctrl_3016.add(btnDFS_3016);
        ctrl_3016.add(btnReset_3016);

        north_3016.add(title_3016, BorderLayout.NORTH);
        north_3016.add(ctrl_3016, BorderLayout.SOUTH);
        add(north_3016, BorderLayout.NORTH);
    }

    private JButton buatTombol_3016(String teks_3016, Color warna_3016) {
        JButton btn_3016 = new JButton(teks_3016);
        btn_3016.setBackground(warna_3016);
        btn_3016.setForeground(Color.WHITE);
        btn_3016.setFont(new Font("Dialog", Font.BOLD, 13));
        btn_3016.setFocusPainted(false);
        return btn_3016;
    }

    private void buildGraph_3016() {
        taGraph_3016 = new JTextArea();
        taGraph_3016.setFont(new Font("Monospaced", Font.PLAIN, 13));
        taGraph_3016.setEditable(false);
        taGraph_3016.setBackground(Color.WHITE);
        taGraph_3016.setText(displayGraph_2511533016());

        JScrollPane sp_3016 = new JScrollPane(taGraph_3016);
        sp_3016.setBorder(BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.GRAY),
            "VISUALISASI GRAPH", TitledBorder.LEFT, TitledBorder.TOP,
            new Font("Dialog", Font.BOLD, 12)));
        sp_3016.setPreferredSize(new Dimension(750, 240));
        add(sp_3016, BorderLayout.CENTER);
    }

    private void buildResult_3016() {
        taResult_3016 = new JTextArea(6, 70);
        taResult_3016.setFont(new Font("Monospaced", Font.BOLD, 13));
        taResult_3016.setEditable(false);
        taResult_3016.setBackground(Color.WHITE);
        taResult_3016.setText(
            "Hasil Pencarian :\n" +
            "Jalur :\n" +
            "Node Dikunjungi :\n" +
            "Jumlah Node Dikunjungi : 0"
        );
        JScrollPane sp_3016 = new JScrollPane(taResult_3016);
        sp_3016.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        add(sp_3016, BorderLayout.SOUTH);
    }

    // ===== displayGraph =====
    public String displayGraph_2511533016() {
        return
            "\n" +
            "   Gerbang --------- Rektorat -------- Perpus ------- FTI\n" +
            "      |             /        \\             \\          /   \\\n" +
            "   Kantin        FKIP        PKM ----------+      Lab Komp Lab AI\n" +
            "      |            |        / |                              |\n" +
            "      +--------> PKM     Kantin                           Masjid\n" +
            "                   |                                        |\n" +
            "                 Masjid <---------------------------------PKM\n" +
            "\n" +
            "   Total Node: 10  |  Total Edge: 15\n" +
            "   Peta: Jalur Antar Lokasi di Kampus\n";
    }

    // ===== BFS =====
    public List<Integer> BFS_2511533016(int start_3016, int goal_3016) {
        boolean[] visited_3016  = new boolean[nodes_3016.length];
        int[]     parent_3016   = new int[nodes_3016.length];
        List<Integer> order_3016 = new ArrayList<>();
        Arrays.fill(parent_3016, -1);

        Queue<Integer> queue_3016 = new LinkedList<>();
        queue_3016.add(start_3016);
        visited_3016[start_3016] = true;

        while (!queue_3016.isEmpty()) {
            int curr_3016 = queue_3016.poll();
            order_3016.add(curr_3016);
            if (curr_3016 == goal_3016) break;
            for (int[] e_3016 : edges_3016) {
                int nb_3016 = tetangga_3016(e_3016, curr_3016, visited_3016);
                if (nb_3016 != -1) {
                    visited_3016[nb_3016] = true;
                    parent_3016[nb_3016]  = curr_3016;
                    queue_3016.add(nb_3016);
                }
            }
        }
        displayPath_2511533016(start_3016, goal_3016, parent_3016, order_3016, "BFS");
        return bangunJalur_3016(goal_3016, parent_3016);
    }

    // ===== DFS =====
    public List<Integer> DFS_2511533016(int start_3016, int goal_3016) {
        boolean[] visited_3016  = new boolean[nodes_3016.length];
        int[]     parent_3016   = new int[nodes_3016.length];
        List<Integer> order_3016 = new ArrayList<>();
        Arrays.fill(parent_3016, -1);

        Stack<Integer> stack_3016 = new Stack<>();
        stack_3016.push(start_3016);

        while (!stack_3016.isEmpty()) {
            int curr_3016 = stack_3016.pop();
            if (visited_3016[curr_3016]) continue;
            visited_3016[curr_3016] = true;
            order_3016.add(curr_3016);
            if (curr_3016 == goal_3016) break;
            for (int[] e_3016 : edges_3016) {
                int nb_3016 = tetangga_3016(e_3016, curr_3016, visited_3016);
                if (nb_3016 != -1) {
                    parent_3016[nb_3016] = curr_3016;
                    stack_3016.push(nb_3016);
                }
            }
        }
        displayPath_2511533016(start_3016, goal_3016, parent_3016, order_3016, "DFS");
        return bangunJalur_3016(goal_3016, parent_3016);
    }

    private int tetangga_3016(int[] edge_3016, int curr_3016, boolean[] visited_3016) {
        if (edge_3016[0] == curr_3016 && !visited_3016[edge_3016[1]]) return edge_3016[1];
        if (edge_3016[1] == curr_3016 && !visited_3016[edge_3016[0]]) return edge_3016[0];
        return -1;
    }

    private List<Integer> bangunJalur_3016(int goal_3016, int[] parent_3016) {
        List<Integer> path_3016 = new ArrayList<>();
        for (int at_3016 = goal_3016; at_3016 != -1; at_3016 = parent_3016[at_3016])
            path_3016.add(0, at_3016);
        return path_3016;
    }

    // ===== displayPath =====
    public void displayPath_2511533016(int start_3016, int goal_3016, int[] parent_3016,
                                       List<Integer> order_3016, String algo_3016) {
        List<Integer> path_3016 = bangunJalur_3016(goal_3016, parent_3016);
        boolean found_3016 = !path_3016.isEmpty() && path_3016.get(0) == start_3016;

        StringBuilder sb_3016 = new StringBuilder();
        sb_3016.append("Hasil Pencarian : ").append(algo_3016).append("\n");

        sb_3016.append("Jalur           : ");
        if (found_3016) {
            for (int i_3016 = 0; i_3016 < path_3016.size(); i_3016++) {
                sb_3016.append(nodes_3016[path_3016.get(i_3016)]);
                if (i_3016 < path_3016.size() - 1) sb_3016.append(" -> ");
            }
        } else {
            sb_3016.append("Tidak ditemukan");
        }

        sb_3016.append("\nNode Dikunjungi : ");
        for (int i_3016 = 0; i_3016 < order_3016.size(); i_3016++) {
            sb_3016.append(nodes_3016[order_3016.get(i_3016)]);
            if (i_3016 < order_3016.size() - 1) sb_3016.append(", ");
        }

        sb_3016.append("\nJumlah Node Dikunjungi : ").append(order_3016.size());
        taResult_3016.setText(sb_3016.toString());
    }

    // ===== resetGraph =====
    public void resetGraph_2511533016() {
        taGraph_3016.setText(displayGraph_2511533016());
        taResult_3016.setText(
            "Hasil Pencarian :\n" +
            "Jalur :\n" +
            "Node Dikunjungi :\n" +
            "Jumlah Node Dikunjungi : 0"
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PetaKampus_2511533016::new);
    }
}