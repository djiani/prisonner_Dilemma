/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonnerdilemma3;

//import com.sun.jndi.toolkit.ctx.Continuation;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import com.sun.security.auth.module.JndiLoginModule;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.renderer.xy.SamplingXYLineRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.tabbedui.VerticalLayout;


/**
 *
 * @author djiani
 */
public class NewApplication extends javax.swing.JFrame {

    /**
     * Creates new form NewApplication
     */private static int Ncoop1,Ndef1,Ncoop2,Ndef2,Ncoop3,Ndef3;
    
   private String play1,play2,play3;//machine or human
   private String actionPlay1,actionPlay2,actionPlay3; //cooperate or defect
    private int total1,total2,total3, g1,g2,g3;//overallscore and gain
    private int round=1;//number of round
    private int maxRound;
    int timeRate;
    private String pstrategie1,pstrategie2,pstrategie3; //strategie for each player
    //private Thread t;
    private boolean terminate=true;
    private String hist=""; //history of the game
    private boolean stop=false; //control for reset button
    private ArrayList<String> hist1,hist2,hist3; //record history for each player
    //private PrisonnerDilemma3 pd3;
    private  NumberAxis domainAxis,domainAxis1,domainAxis2;
    private ValueAxis valueAxis,valueAxis1,valueAxis2;
    private  XYBarRenderer renderer;
    private  SamplingXYLineRenderer renderer1,renderer2;
    private  XYSeries series1,series11,series12;
    private XYSeries series2,series21,series22;
    private XYSeries series3,series31,series32;
    private XYSeries series4;  
    private XYSeriesCollection intervalDataset,intervalDataset1,intervalDataset2;
    
    public NewApplication() {
        initComponents();
        //default identification of player
        cooperate1.setEnabled(false);
        defect1.setEnabled(false);
        cooperate2.setEnabled(false);
        defect2.setEnabled(false);
        cooperate3.setEnabled(false);
        defect3.setEnabled(false);
        valider.setEnabled(false);
        start.setEnabled(true);
        contin.setEnabled(false);
        player1.setEnabled(false);
        player2.setEnabled(false);
        player3.setEnabled(false);
        pause.setVisible(false);
        graph.setVisible(false);
        graph2.setVisible(false);
        play1=(String)player1.getSelectedItem();
        play2=(String)player2.getSelectedItem();
        play3=(String)player3.getSelectedItem();
        pstrategie1=(String)strategie1.getSelectedItem();
        pstrategie2=(String)strategie2.getSelectedItem();
        pstrategie3=(String)strategie3.getSelectedItem();
        //declaration of players histories
        hist1=new ArrayList<>(); hist2=new ArrayList<>(); hist3=new ArrayList<>();
        //pd3=new PrisonnerDilemma3();
       //create a dataset for bar char
        //clustered bar chart
        domainAxis=new NumberAxis("Round");
        domainAxis.setAutoRangeIncludesZero(false);
        domainAxis.setAutoRange(true);
        
        valueAxis=new NumberAxis("PayOff");
        
         renderer = new ClusteredXYBarRenderer();
        renderer.setShadowVisible(true);
        
         intervalDataset=new XYSeriesCollection();
	 series1=new XYSeries("player1");
         series2=new XYSeries("player2");
         series3=new XYSeries("player3");
         series4=new XYSeries("");
         
         //scatter line chart: overall gain
         domainAxis1=new NumberAxis("round"); //Axis-X
        domainAxis1.setAutoRangeIncludesZero(false);
        domainAxis1.setAutoRange(true);
        
        valueAxis1=new NumberAxis("gain"); //Axis-Y
        
         renderer1 = new SamplingXYLineRenderer();
        
         intervalDataset1=new XYSeriesCollection();
	 series11=new XYSeries("player1");
         series21=new XYSeries("player2");
         series31=new XYSeries("player3");
         //series4=new XYSeries("");
         
         
         //for simulator
          domainAxis2=new NumberAxis("round"); //Axis-X
        domainAxis2.setAutoRangeIncludesZero(false);
        domainAxis2.setAutoRange(true);
        
        valueAxis2=new NumberAxis("gain"); //Axis-Y
        
        
         renderer2 = new SamplingXYLineRenderer();
        
         intervalDataset2=new XYSeriesCollection();
	 series12=new XYSeries("player1");
         series22=new XYSeries("player2");
         series32=new XYSeries("player3");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelPlayer1 = new javax.swing.JPanel();
        player1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        score1 = new javax.swing.JTextField();
        cooperate1 = new javax.swing.JButton();
        defect1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        gain1 = new javax.swing.JLabel();
        panelPlayer2 = new javax.swing.JPanel();
        player2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        score2 = new javax.swing.JTextField();
        defect2 = new javax.swing.JButton();
        cooperate2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        gain2 = new javax.swing.JLabel();
        panelPlayer3 = new javax.swing.JPanel();
        player3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        score3 = new javax.swing.JTextField();
        cooperate3 = new javax.swing.JButton();
        defect3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        gain3 = new javax.swing.JLabel();
        valider = new javax.swing.JButton();
        start = new javax.swing.JButton();
        contin = new javax.swing.JButton();
        graph = new javax.swing.JButton();
        panelSimulation = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jRadioButton200 = new javax.swing.JRadioButton();
        jRadioButton500 = new javax.swing.JRadioButton();
        jRadioButton1000 = new javax.swing.JRadioButton();
        jRadioButton5000 = new javax.swing.JRadioButton();
        pause = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        strategie1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        strategie2 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        strategie3 = new javax.swing.JComboBox();
        runSimulation = new javax.swing.JButton();
        graph2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        history = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        coop1 = new javax.swing.JLabel();
        def1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        coop2 = new javax.swing.JLabel();
        def2 = new javax.swing.JLabel();
        coop3 = new javax.swing.JLabel();
        def3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newgame = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        opstrategie = new javax.swing.JMenuItem();
        payoff = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Iterated Prisoner Delimma: 3 Players");
        setPreferredSize(new java.awt.Dimension(900, 810));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.setAutoscrolls(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(729, 705));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));

        panelPlayer1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        panelPlayer1.setPreferredSize(new java.awt.Dimension(166, 100));

        player1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Player", "Machine1", "Player1" }));
        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("score");

        score1.setEditable(false);
        score1.setBackground(new java.awt.Color(255, 255, 255));
        score1.setText("0");
        score1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score1ActionPerformed(evt);
            }
        });

        cooperate1.setText("cooperate");
        cooperate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cooperate1ActionPerformed(evt);
            }
        });

        defect1.setText("Defect");
        defect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defect1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("GAIN:");

        gain1.setText("0 points");

        javax.swing.GroupLayout panelPlayer1Layout = new javax.swing.GroupLayout(panelPlayer1);
        panelPlayer1.setLayout(panelPlayer1Layout);
        panelPlayer1Layout.setHorizontalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer1Layout.createSequentialGroup()
                .addGroup(panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlayer1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cooperate1)
                        .addGap(20, 20, 20)
                        .addComponent(defect1))
                    .addGroup(panelPlayer1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlayer1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlayer1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gain1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelPlayer1Layout.setVerticalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer1Layout.createSequentialGroup()
                .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cooperate1)
                    .addComponent(defect1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(gain1)))
        );

        score1.getAccessibleContext().setAccessibleName("score1");
        cooperate1.getAccessibleContext().setAccessibleName("cooperate1");
        defect1.getAccessibleContext().setAccessibleName("defect1");
        gain1.getAccessibleContext().setAccessibleName("gain1");

        panelPlayer2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        player2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Player", "Machine2", "Player2" }));
        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("score");

        score2.setEditable(false);
        score2.setBackground(new java.awt.Color(255, 255, 255));
        score2.setText("0");
        score2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score2ActionPerformed(evt);
            }
        });

        defect2.setText("Defect");
        defect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defect2ActionPerformed(evt);
            }
        });

        cooperate2.setText("cooperate");
        cooperate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cooperate2ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("GAIN:");

        gain2.setText("0 points");

        javax.swing.GroupLayout panelPlayer2Layout = new javax.swing.GroupLayout(panelPlayer2);
        panelPlayer2.setLayout(panelPlayer2Layout);
        panelPlayer2Layout.setHorizontalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer2Layout.createSequentialGroup()
                .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlayer2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cooperate2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(defect2))
                    .addGroup(panelPlayer2Layout.createSequentialGroup()
                        .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPlayer2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gain2))
                            .addGroup(panelPlayer2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPlayer2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPlayer2Layout.setVerticalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer2Layout.createSequentialGroup()
                .addComponent(player2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(score2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cooperate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defect2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gain2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        score2.getAccessibleContext().setAccessibleName("score2");
        defect2.getAccessibleContext().setAccessibleName("defect2");
        cooperate2.getAccessibleContext().setAccessibleName("cooperate2");
        gain2.getAccessibleContext().setAccessibleName("gain2");

        panelPlayer3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        player3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        player3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Player", "Machine3", "Player3" }));
        player3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("score");

        score3.setEditable(false);
        score3.setBackground(new java.awt.Color(255, 255, 255));
        score3.setText("0");
        score3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score3ActionPerformed(evt);
            }
        });

        cooperate3.setText("Cooperate");
        cooperate3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cooperate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cooperate3ActionPerformed(evt);
            }
        });

        defect3.setText("Defect");
        defect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defect3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("GAIN:");

        gain3.setText("0 points");

        javax.swing.GroupLayout panelPlayer3Layout = new javax.swing.GroupLayout(panelPlayer3);
        panelPlayer3.setLayout(panelPlayer3Layout);
        panelPlayer3Layout.setHorizontalGroup(
            panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer3Layout.createSequentialGroup()
                .addGroup(panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPlayer3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cooperate3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(defect3))
                    .addGroup(panelPlayer3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlayer3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPlayer3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gain3)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelPlayer3Layout.setVerticalGroup(
            panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer3Layout.createSequentialGroup()
                .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cooperate3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defect3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPlayer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gain3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)))
        );

        score3.getAccessibleContext().setAccessibleName("score3");
        cooperate3.getAccessibleContext().setAccessibleName("cooperate3");
        defect3.getAccessibleContext().setAccessibleName("defect3");
        gain3.getAccessibleContext().setAccessibleName("gain3");

        valider.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        valider.setText("Validate");
        valider.setActionCommand("Valider");
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        contin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        contin.setText("Continue");
        contin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continActionPerformed(evt);
            }
        });

        graph.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        graph.setText("Graph");
        graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(panelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(valider, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(contin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(graph, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelPlayer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(panelPlayer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(panelPlayer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider)
                    .addComponent(start)
                    .addComponent(contin)
                    .addComponent(graph)))
        );

        panelPlayer1.getAccessibleContext().setAccessibleName("panelPlayer1");
        panelPlayer2.getAccessibleContext().setAccessibleName("panelPlayer2");
        panelPlayer3.getAccessibleContext().setAccessibleName("planelPlayer3");
        start.getAccessibleContext().setAccessibleName("reset");

        panelSimulation.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Time Rate(sec/round)");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("0.005");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("0.05");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("0.5");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("1");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("1.5");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("2");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of Rounds");

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("10");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton50);
        jRadioButton50.setText("50");
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton100);
        jRadioButton100.setText("100");
        jRadioButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton100ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton200);
        jRadioButton200.setText("200");
        jRadioButton200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton200ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton500);
        jRadioButton500.setText("500");
        jRadioButton500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton500ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton1000);
        jRadioButton1000.setText("1000");
        jRadioButton1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1000ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton5000);
        jRadioButton5000.setText("50000");
        jRadioButton5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5000ActionPerformed(evt);
            }
        });

        pause.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        pause.setText("STOP");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        jLabel6.setText("Strategy Player1");

        strategie1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Strategie", "offensive", "softy", "spasty", "democratic", "eyeforeye", "eyefor2eye", "Teyeforeye", "Seyeforeye", "higherOrSp", " " }));
        strategie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strategie1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Strategy Player2");

        strategie2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a strategie", "offensive", "softy", "spasty", "democratic", "eyeforeye", "eyefor2eye", "Teyeforeye", "Seyeforeye", "higherOrSp" }));
        strategie2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strategie2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Strategy Player3");

        strategie3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a strategie", "offensive", "softy", "spasty", "democratic", "eyeforeye", "eyefor2eye", "Teyeforeye", "Seyeforeye", "higherOrSp" }));
        strategie3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strategie3ActionPerformed(evt);
            }
        });

        runSimulation.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        runSimulation.setText("Run Simulation");
        runSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSimulationActionPerformed(evt);
            }
        });

        graph2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        graph2.setText("Graph");
        graph2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graph2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSimulationLayout = new javax.swing.GroupLayout(panelSimulation);
        panelSimulation.setLayout(panelSimulationLayout);
        panelSimulationLayout.setHorizontalGroup(
            panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSimulationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSimulationLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4)
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelSimulationLayout.createSequentialGroup()
                        .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulationLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton10)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton100)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton200)
                                .addGap(9, 9, 9)
                                .addComponent(jRadioButton500)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1000))
                            .addGroup(panelSimulationLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelSimulationLayout.createSequentialGroup()
                                        .addComponent(strategie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7))
                                    .addGroup(panelSimulationLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(runSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strategie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(graph2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSimulationLayout.createSequentialGroup()
                        .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSimulationLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5000)
                                    .addComponent(jRadioButton6)))
                            .addGroup(panelSimulationLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99))
                    .addGroup(panelSimulationLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(strategie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelSimulationLayout.setVerticalGroup(
            panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSimulationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton100)
                    .addComponent(jRadioButton200)
                    .addComponent(jRadioButton500)
                    .addComponent(jRadioButton1000)
                    .addComponent(jRadioButton5000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(strategie1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(strategie2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(strategie3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSimulationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(runSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(graph2))
                    .addGroup(panelSimulationLayout.createSequentialGroup()
                        .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(4, 4, 4))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("GAME HISTORY");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("SIMULATION");

        history.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        history.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(history);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Number Of Cooperation");
        jLabel12.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Number Of Defection");

        jLabel16.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("PLAYER 1");
        jLabel16.setPreferredSize(new java.awt.Dimension(81, 15));

        coop1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coop1.setText("0");
        coop1.setAlignmentX(0.5F);
        coop1.setMaximumSize(new java.awt.Dimension(20, 14));
        coop1.setPreferredSize(new java.awt.Dimension(15, 14));

        def1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        def1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        def1.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setText("PLAYER 2");

        coop2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coop2.setText("0");

        def2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        def2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        def2.setText("0");

        coop3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        coop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coop3.setText("0");

        def3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        def3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        def3.setText("0");

        jLabel22.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("PLAYER 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coop1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(def1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coop2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(def2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coop3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(def3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coop2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coop3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(def1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(def2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(def3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("GAME STATISTIC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelSimulation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(panelSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("gamePanal");
        panelSimulation.getAccessibleContext().setAccessibleName("panelSimul");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        newgame.setText("new game");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        fileMenu.add(newgame);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        contentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentsMenuItem);

        opstrategie.setText("strategies description");
        opstrategie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opstrategieActionPerformed(evt);
            }
        });
        helpMenu.add(opstrategie);

        payoff.setText("PayOff Description");
        payoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payoffActionPerformed(evt);
            }
        });
        helpMenu.add(payoff);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
//        // TODO add your handling code here:
        play1=(String)player1.getSelectedItem();
        player1.setEnabled(false);
    }//GEN-LAST:event_player1ActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
        play2=(String)player2.getSelectedItem();
        player2.setEnabled(false);
        
    }//GEN-LAST:event_player2ActionPerformed

    private void player3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3ActionPerformed
        // TODO add your handling code here:
        play3=(String)player3.getSelectedItem();
        player3.setEnabled(false);
    }//GEN-LAST:event_player3ActionPerformed

    private void cooperate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cooperate1ActionPerformed
        // TODO add your handling code here:
         //player is a humain being
            actionPlay1=cooperate1.getText();
            cooperate1.setEnabled(false);
            defect1.setEnabled(false);
            if(play2.equalsIgnoreCase("Select Player")){
                JOptionPane.showMessageDialog(this,"Please select player 2.","ERROR",JOptionPane.ERROR_MESSAGE);
                cooperate2.setEnabled(true);
                defect2.setEnabled(true);
            }else
            if(play2.equalsIgnoreCase("machine2")){
                //call strategies function here for machine2
               // actionPlay2="cooperate"; //just to try
                cooperate2.setEnabled(false);
                defect2.setEnabled(false);
                if(play3.equalsIgnoreCase("Select Player")){
                    JOptionPane.showMessageDialog(this,"Please select player 3. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
                    cooperate3.setEnabled(true);
                    defect3.setEnabled(true);
                }else
                    if(play3.equalsIgnoreCase("machine3")){
                        //call stragies function here for machine3
                       // actionPlay3="defect"; //just for test
                        cooperate3.setEnabled(false);
                        defect3.setEnabled(false);
                        valider.setEnabled(true);
                    }
                    else{ //player 3 is a human and player 2 is machine
                         cooperate3.setEnabled(true);
                         defect3.setEnabled(true); 
                    }
            }else{//player 2 is a humain being
                 cooperate2.setEnabled(true);
                 defect2.setEnabled(true);
                  
                }
        
    }//GEN-LAST:event_cooperate1ActionPerformed

    private void defect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defect2ActionPerformed
        // TODO add your handling code here:
        actionPlay2=defect2.getText();
        cooperate2.setEnabled(false);
        defect2.setEnabled(false);
         if(play3.equalsIgnoreCase("select player")){
           JOptionPane.showMessageDialog(this,"Please select player 3. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
                cooperate3.setEnabled(true);
                defect3.setEnabled(true); 
        }else
        if(play3.equalsIgnoreCase("machine3")){
            cooperate3.setEnabled(false);
            defect3.setEnabled(false);
            valider.setEnabled(true);
        }else{
            cooperate3.setEnabled(true);
            defect3.setEnabled(true);
        }
       
    }//GEN-LAST:event_defect2ActionPerformed

    private void score3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_score3ActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
        stop=true;
        start.setEnabled(true);
        graph2.setVisible(true);
        pause.setVisible(false);
        
    }//GEN-LAST:event_pauseActionPerformed

    private void jRadioButton500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton500ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton500.getText());
    }//GEN-LAST:event_jRadioButton500ActionPerformed

    private void jRadioButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton100ActionPerformed
        // TODO add your handling code here:
         maxRound=Integer.parseInt(jRadioButton100.getText());
    }//GEN-LAST:event_jRadioButton100ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        // timeRate=Float.parseFloat(jRadioButton2.getText());
        timeRate=50;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       // timeRate=Float.parseFloat(jRadioButton1.getText());
        timeRate=5;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void strategie3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strategie3ActionPerformed
        // TODO add your handling code here:
        pstrategie3=(String)strategie3.getSelectedItem();
    }//GEN-LAST:event_strategie3ActionPerformed

    private void strategie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strategie2ActionPerformed
        // TODO add your handling code here:
       pstrategie2=(String)strategie2.getSelectedItem();
    }//GEN-LAST:event_strategie2ActionPerformed

    private void jRadioButton5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5000ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton5000.getText());
    }//GEN-LAST:event_jRadioButton5000ActionPerformed

    private void cooperate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cooperate3ActionPerformed
        // TODO add your handling code here:
        actionPlay3=cooperate3.getText();
        cooperate3.setEnabled(false);
        defect3.setEnabled(false);
        valider.setEnabled(true);
        
      
    }//GEN-LAST:event_cooperate3ActionPerformed

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerActionPerformed
        // TODO add your handling code here:
        if(play2.equalsIgnoreCase("Select Player")||play3.equalsIgnoreCase("Select Player")){
           JOptionPane.showMessageDialog(this,"Please select all player. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
           if(play2.equalsIgnoreCase("Select Player")){
             player2.setEnabled(true);  
           }
           if(play3.equalsIgnoreCase("Select Player")){
             player3.setEnabled(true);  
           }
        
        }else{//all player was selected
        total1=Integer.parseInt(score1.getText());
        total2=Integer.parseInt(score2.getText());
        total3=Integer.parseInt(score3.getText());
        //initiase the gain via function
        if(play2.equalsIgnoreCase("machine2")){
            actionPlay2=spastic(); //check also here wchic strategie is good here
        }
        if(play3.equalsIgnoreCase("machine3")){
            actionPlay3=spastic();//also need a good assumption
        }
        setGain(actionPlay1, actionPlay2, actionPlay3);
        total1+=g1;
        total2+=g2;
        total3+=g3;
        score1.setText(""+total1);
        score2.setText(""+total2);
        score3.setText(""+total3);
        gain1.setText(""+g1+" Points");
        gain2.setText(""+g2+" Points");
        gain3.setText(""+g3+" Points");
        
        contin.setEnabled(true);
        start.setVisible(true);
        valider.setEnabled(false);
        graph.setVisible(true);
        hist+="Round "+round+"\t "+play1+":"+actionPlay1+"\t\t "+play2+": "+actionPlay2+"\t\t "+play3+": "+actionPlay3+"\n";
        history.setText(hist);
        
        //set the button retart
        start.setText("Restart");
        
        //set the dataset value 
        series1.add(round,g1);
        series2.add(round,g2);              
        series3.add(round,g3);
        series4.add(round,0); //to create the space between the chart
        //samplingLineXYRendered
        series11.add(round,total1);
        series21.add(round,total2);
        series31.add(round,total3);
        //update the static history
        if(actionPlay1.equalsIgnoreCase("cooperate")){
            coop1.setText((++Ncoop1)+"");
        }else{
            def1.setText((++Ndef1)+"");
        }
        if(actionPlay2.equalsIgnoreCase("cooperate")){
            coop2.setText((++Ncoop2)+"");
        }else{
            def2.setText((++Ndef2)+"");
        }
        if(actionPlay3.equalsIgnoreCase("cooperate")){
            coop3.setText((++Ncoop3)+"");
        }else{
            def3.setText((++Ndef3)+"");
        }
        //save the players histories
        hist1.add(actionPlay1);
        hist2.add(actionPlay2);
        hist3.add(actionPlay3);
        
      }
   
       
            
       
       
        
    }//GEN-LAST:event_validerActionPerformed

    private void opstrategieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opstrategieActionPerformed
        // TODO add your handling code here:
         Strategies strat=new Strategies(1);
         strat.setAlwaysOnTop(true);
         strat.setVisible(true);
        
    }//GEN-LAST:event_opstrategieActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        NewApplication nap=new NewApplication();
        nap.setLocationRelativeTo(null);
        nap.setVisible(true);
    }//GEN-LAST:event_newgameActionPerformed

    private void defect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defect1ActionPerformed
        // TODO add your handling code here:
   
            actionPlay1=defect1.getText();
            cooperate1.setEnabled(false);
            defect1.setEnabled(false);
            if(play2.equalsIgnoreCase("Select Player")){
                JOptionPane.showMessageDialog(this,"Please select player 2. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
                cooperate2.setEnabled(true);
                defect2.setEnabled(true);
            }else
                if(play2.equalsIgnoreCase("machine2")){
                    //call strategies function here for machine2
                    //actionPlay2="cooperate"; //just to try
                    cooperate2.setEnabled(false);
                    defect2.setEnabled(false);
                    if(play3.equalsIgnoreCase("Select Player")){
                        JOptionPane.showMessageDialog(this,"Please select player 2. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
                        cooperate3.setEnabled(true);
                        defect3.setEnabled(true);
                    }else{    
                        if(play3.equalsIgnoreCase("machine3")){
                            //call stragies function here for machine3
                            //actionPlay3="defect"; //just for test 
                            cooperate3.setEnabled(false);
                            defect3.setEnabled(false);
                            valider.setEnabled(true);
                            //reset.setEnabled(false);
                            //contin.setEnabled(false);
                        }
                        else{ //player3 is humain and player2 is machine
                             cooperate3.setEnabled(true);
                             defect3.setEnabled(true);
                             //reset.setEnabled(false);
                            // contin.setEnabled(false); 
                        }
                    }
                }else //player 2 is humain 
                    {
                     cooperate2.setEnabled(true);
                    defect2.setEnabled(true);
                    //valider.setEnabled(false);   
                    }
        // let consider player is never been a machine. At lease one humain
    }//GEN-LAST:event_defect1ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        
        if(round>1){
           // int res=JOptionPane.showConfirmDialog(this,"Do you really want to start a new game ?", "QUESTION ?", JOptionPane.YES_NO_OPTION);
           // if(res==JOptionPane.YES_OPTION){
                score1.setText("0");score2.setText("0");score3.setText("0");
                round=1;
                gain1.setText("");gain2.setText("");gain3.setText("");
                cooperate1.setEnabled(true); defect1.setEnabled(true);
                player1.setSelectedIndex(2); //set player1 to player1
                player1.setEnabled(false); //player 1 must be a humain being
                player2.setSelectedIndex(0);
                player2.setEnabled(true);
                player3.setSelectedIndex(0);
                player3.setEnabled(true);
                hist=""; history.setText(""); //reset history 
                valider.setEnabled(false);
                start.setEnabled(false);
                contin.setEnabled(false);
                
                //reinitialize previous histories players because a new game has started.
                hist1.clear();
                hist2.clear();
                hist3.clear();
                
                //reinitialize the datacollection
                        intervalDataset=new XYSeriesCollection();
                        //series1=new XYSeries("player1");
                       // series2=new XYSeries("player2");
                       // series3=new XYSeries("player3");
                       // series4=new XYSeries("");
                        series1.clear();
                        series2.clear();
                        series3.clear();
                       
                        intervalDataset1=new XYSeriesCollection();
                       // series11=new XYSeries("player1");
                        //series21=new XYSeries("player2");
                       // series31=new XYSeries("player3");
                        series11.clear();
                        series21.clear();
                        series31.clear();
                        
                        
              //initialize sttactic part: overall number of cooperation and defection
                Ncoop1=0; Ncoop2=0;Ncoop3=0; Ndef1=0;Ndef2=0;Ndef3=0;
                coop1.setText("0");coop2.setText("0");coop3.setText("0");
                def1.setText("0");def2.setText("0");def3.setText("0");
                JOptionPane.showMessageDialog(this,"Select Player2 and player3","",JOptionPane.INFORMATION_MESSAGE);
                //}else{
              //  contin.setEnabled(true);
           // }
        }
        else{
           score1.setText("0");score2.setText("0");score3.setText("0");
            round=1;
            gain1.setText("");gain2.setText("");gain3.setText("");
            cooperate1.setEnabled(true); defect1.setEnabled(true);
            player1.setSelectedIndex(2);
            player1.setEnabled(false); //player 1 must be a humain being
            player2.setSelectedIndex(0);
            player2.setEnabled(true);
            player3.setSelectedIndex(0);
            player3.setEnabled(true);
            hist=""; history.setText(""); //reset history 
            valider.setEnabled(false);
            start.setVisible(false);
            contin.setEnabled(false); 
            hist1.clear();
            hist2.clear();
            hist3.clear();
                //initialize sttactic part: overall number of cooperation and defection
            Ncoop1=0; Ncoop2=0;Ncoop3=0; Ndef1=0;Ndef2=0;Ndef3=0;
            coop1.setText("0");coop2.setText("0");coop3.setText("0");
            def1.setText("0");def2.setText("0");def3.setText("0");
            JOptionPane.showMessageDialog(this,"Select Player2 and player3","",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_startActionPerformed

    private void score1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score1ActionPerformed

    private void score2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score2ActionPerformed

    private void cooperate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cooperate2ActionPerformed
        // TODO add your handling code here:
       
        actionPlay2=cooperate2.getText();
        cooperate2.setEnabled(false);
        defect2.setEnabled(false);
        if(play3.equalsIgnoreCase("select player")){
           JOptionPane.showMessageDialog(this,"Please select player 3. \n Round not count  ","ERROR",JOptionPane.ERROR_MESSAGE);
                cooperate3.setEnabled(true);
                defect3.setEnabled(true); 
        }else
        if(play3.equalsIgnoreCase("machine3")){
            //strategie for player 3 here
           // actionPlay3="defect";
            cooperate3.setEnabled(false);
            defect3.setEnabled(false);
            valider.setEnabled(true);
        }else{
          cooperate3.setEnabled(true);
          defect3.setEnabled(true);  
        }
       
    }//GEN-LAST:event_cooperate2ActionPerformed

    private void defect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defect3ActionPerformed
        // TODO add your handling code here:
        
        actionPlay3=defect3.getText();
        cooperate3.setEnabled(false);
        defect3.setEnabled(false);
        valider.setEnabled(true);
    }//GEN-LAST:event_defect3ActionPerformed

    private void continActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continActionPerformed
        // TODO add your handling code here:
        cooperate1.setEnabled(true);
        defect1.setEnabled(true);
        round++;// increment the numver of round
        valider.setEnabled(false);
        start.setEnabled(false);
        contin.setEnabled(false);
        //set gain to 0
        gain1.setText(""); gain2.setText(""); gain3.setText("");
        
    }//GEN-LAST:event_continActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        //timeRate=Float.parseFloat(jRadioButton5.getText());
        timeRate=1500;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        //timeRate=Float.parseFloat(jRadioButton3.getText());
        timeRate=500;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        //timeRate=Float.parseFloat(jRadioButton6.getText());
        timeRate=2000;
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton50.getText());
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton200ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton200.getText());
    }//GEN-LAST:event_jRadioButton200ActionPerformed

    private void jRadioButton1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1000ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton1000.getText());
    }//GEN-LAST:event_jRadioButton1000ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
        maxRound=Integer.parseInt(jRadioButton10.getText());
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        //timeRate=Float.parseFloat(jRadioButton4.getText());
        timeRate=1000;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void strategie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strategie1ActionPerformed
        // TODO add your handling code here:
        pstrategie1=(String)strategie1.getSelectedItem();
    }//GEN-LAST:event_strategie1ActionPerformed

    private void runSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSimulationActionPerformed
        // TODO add your handling code here:
        stop = false;
       // continuer=true;
        start.setEnabled(false);
       if(timeRate==0){
            JOptionPane.showMessageDialog(this,"Please select a time rate","ERROR",JOptionPane.ERROR_MESSAGE);
        }else
           if(maxRound==0){
               JOptionPane.showMessageDialog(this,"Please select the numbers of rounds ","ERROR",JOptionPane.ERROR_MESSAGE);
           }else
               if(pstrategie1.equalsIgnoreCase("Select a strategie")||pstrategie2.equalsIgnoreCase("Select a strategie")|| pstrategie3.equalsIgnoreCase("Select a strategie")){
                   JOptionPane.showMessageDialog(this,"Please select a strategie for all players","ERROR",JOptionPane.ERROR_MESSAGE);
               }else{//everything is ok do the work here
                   total1=0;total2=0;total3=0; // set total for game 
                   hist=""; //set the history 
                   history.setText("");
                   //set players to machine 1, machine 2and  machine3;and and desativated all of them
                   start.setText("Restart");
                   cooperate3.setEnabled(false);defect3.setEnabled(false);
                   cooperate2.setEnabled(false);defect2.setEnabled(false);
                   cooperate1.setEnabled(false);defect1.setEnabled(false);
                   valider.setEnabled(false);contin.setEnabled(false);
                   player1.setSelectedIndex(1);
                   player2.setSelectedIndex(1);
                   player3.setSelectedIndex(1);
                   player1.setEnabled(false);
                   player2.setEnabled(false);//check if should i enable to true after all
                   player3.setEnabled(false);
                   pause.setVisible(true);
                   //set statistic: count the total number of Cooperation and defection for each players
                   Ncoop1=0;Ncoop2=0;Ncoop3=0;
                   Ndef1=0;Ndef2=0;Ndef3=0;
                   coop1.setText("0");coop2.setText("0");coop3.setText("0");
                   def1.setText("0");def2.setText("0");def3.setText("0");
                   //initialize histories players because for a smulator
                   hist1.clear(); hist2.clear(); hist3.clear();
                   
                   //clear the series
                 intervalDataset2=new XYSeriesCollection();
                   series12.clear();
                   series22.clear();
                   series32.clear();
                  //series21=new XYSeries("player1");
                 // series21=new XYSeries("player2");
                 // series31=new XYSeries("player3");
                   
            // Create a new Thread to do the counting
            Thread t = new Thread(){
              
                @Override
               public void run() {  // override the run() for the running behaviors
                 int row=0;   
                  for (int i = 0; i < maxRound; ++i) {
                     if (stop){
                        break;
                     }
                     setRun(i,row);
                     // Suspend this thread via sleep() and yield control to other threads.
                     // Also provide the necessary delay.
                     try {
                        sleep(timeRate);  // milliseconds
                     } catch (InterruptedException ex) {}
                  }
                 }
            };
              t.start();
            
          }
                   player1.setSelectedIndex(0);
                   player2.setSelectedIndex(0);
                   player3.setSelectedIndex(0);
                   runSimulation.setEnabled(false);
                   start.setEnabled(true);
                   graph2.setVisible(true);
                   
    }//GEN-LAST:event_runSimulationActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
       
       // JOptionPane.showMessageDialog(this,autor,"Info Autor",JOptionPane.OK_OPTION);
         Strategies str=new Strategies(3);
        str.setAlwaysOnTop(true);
        str.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsMenuItemActionPerformed
        // TODO add your handling code here:
        Strategies st=new Strategies(2);
        st.setAlwaysOnTop(true);
        st.setVisible(true);
    }//GEN-LAST:event_contentsMenuItemActionPerformed

    private void graphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphActionPerformed
             // TODO add your handling code here:
        contin.setEnabled(false);
        valider.setEnabled(false);
       graph.setVisible(false);
      
      
        intervalDataset.addSeries(series1);
        intervalDataset.addSeries(series2);
        intervalDataset.addSeries(series3);
        intervalDataset.addSeries(series4);
        
        intervalDataset1.addSeries(series11);
        intervalDataset1.addSeries(series21);
        intervalDataset1.addSeries(series31);
        
       // intervalDataset.addSeries(series4);
        
        XYPlot plot = new XYPlot(intervalDataset, domainAxis, valueAxis, renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setNoDataMessage("=== No Datapoints Detected ====");
        
        XYPlot plot1 = new XYPlot(intervalDataset1, domainAxis1, valueAxis1, renderer1);
       // plot1.setOrientation(PlotOrientation.VERTICAL);
        plot1.setNoDataMessage("=== No Datapoints Detected ====");

        JFreeChart chart = new JFreeChart("payOff distribution Graph", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        ChartPanel chartpanel = new ChartPanel(chart);
        chartpanel.setDomainZoomable(true);
        chartpanel.setRangeZoomable(false);
        
        JFreeChart chart1 = new JFreeChart("Gain distribution Graph", JFreeChart.DEFAULT_TITLE_FONT, plot1, true);
        ChartPanel chartpanel1 = new ChartPanel(chart1);
        chartpanel1.setDomainZoomable(true);
        chartpanel1.setRangeZoomable(false);
        
        JFrame frame = new JFrame();
        JPanel p=new JPanel(new VerticalLayout());
        p.add(new JScrollPane(chartpanel));
        p.add(new JScrollPane(chartpanel1));
        frame.setContentPane(p);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        //close the spreadsheet
        
        start.setText("Restart");
        start.setEnabled(true);
       // graph.setEnabled(false);
    }//GEN-LAST:event_graphActionPerformed

    private void graph2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graph2ActionPerformed
        // TODO add your handling code here:
        graph2.setVisible(false);
        pause.setVisible(false);
        runSimulation.setEnabled(true);
        
        intervalDataset2.addSeries(series12);
        intervalDataset2.addSeries(series22);
        intervalDataset2.addSeries(series32);
        
         XYPlot plot2 = new XYPlot(intervalDataset2, domainAxis2, valueAxis2, renderer2);
       // plot1.setOrientation(PlotOrientation.VERTICAL);
        plot2.setNoDataMessage("=== No Datapoints Detected ====");
        
        JFreeChart chart2 = new JFreeChart("payOff distribution Graph", JFreeChart.DEFAULT_TITLE_FONT, plot2, true);
        ChartPanel chartpanel2 = new ChartPanel(chart2);
        chartpanel2.setDomainZoomable(true);
        chartpanel2.setRangeZoomable(false);
        
         JFrame frame2 = new JFrame();
        //JPanel p=new JPanel();
       // p.add(new JScrollPane(chartpanel));
       frame2.add(new JScrollPane(chartpanel2));
       // frame2.setContentPane(p);
        frame2.pack();
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
    }//GEN-LAST:event_graph2ActionPerformed

    private void payoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payoffActionPerformed
        // TODO add your handling code here:
         Strategies str=new Strategies(4);
        str.setAlwaysOnTop(true);
        str.setVisible(true);
    }//GEN-LAST:event_payoffActionPerformed

    
 public void setGain(String s1,String s2,String s3){
    if(s1.equalsIgnoreCase("cooperate")){
        if(s2.equalsIgnoreCase("cooperate")){
            if(s3.equalsIgnoreCase("cooperate")){
                g1=6; g2=6;g3=6; //c c c
            }else{
                g1=3; g2=3;g3=10; //c c nc
            }
        }else{//s2==nc
            if(s3.equalsIgnoreCase("cooperate")){
                g1=3; g2=10;g3=3; //c nc c
            }else{
                g1=0; g2=6;g3=6; //c nc nc
            }
        }
    }else{//s1==>NC
        if(s2.equalsIgnoreCase("cooperate")){ 
            if(s3.equalsIgnoreCase("cooperate")){ //nc c c 
                g1=10; g2=3;g3=3; 
            }else{
                g1=6; g2=0;g3=6; //nc c nc
            }
        }else{//s2==>NC
            if(s3.equalsIgnoreCase("cooperate")){
                g1=6; g2=6;g3=0; //NC NC C
            }else{
                g1=1; g2=1;g3=1; //NC NC NC
            }
        }
    }
    
}

public void setRun(int count,int r){ //to be check again and again
                      //play1="Machine 1"; play2="Machine 2"; play3="Machine 3";
                      count=count+1; // iteration plus 1 just to avoid 0 
                      actionPlay1=this.selectStrategies(pstrategie1, count, 1); //String actionPlayer1=getAction(pstrategie1, player1, History1,Hostory2,Histoey3)
                      actionPlay2=this.selectStrategies(pstrategie2, count, 2); //this funtion should return an action' player: cooperate or defect
                      actionPlay3=this.selectStrategies(pstrategie3, count, 3); //
                      setGain(actionPlay1,actionPlay2, actionPlay3); //set the gain for each player
                      total1 +=g1; total2+=g2;total3+=g3; //computate the total for each player
                      gain1.setText(g1+" Points");gain2.setText(g2+" Points");gain3.setText(g3+" Points");
                      score1.setText(total1+"");score2.setText(total2+"");score3.setText(total3+"");
                      hist+="Round "+(count)+"\t Machine 1 ::"+actionPlay1+"\t\t Machine 2 ::"+actionPlay2+"\t\t Machine 3 ::"+actionPlay3+"\n";
                      history.setText(hist); //set the history
                    //set the series data
                      series12.add(count, total1);
                      series22.add(count, total2);
                      series32.add(count, total3);
                       //update the static history
        if(actionPlay1.equalsIgnoreCase("cooperate")){
            coop1.setText((++Ncoop1)+"");
        }else{
            def1.setText((++Ndef1)+"");
        }
        if(actionPlay2.equalsIgnoreCase("cooperate")){
            coop2.setText((++Ncoop2)+"");
        }else{
            def2.setText((++Ndef2)+"");
        }
        if(actionPlay3.equalsIgnoreCase("cooperate")){
            coop3.setText((++Ncoop3)+"");
        }else{
            def3.setText((++Ndef3)+"");
        }
        //updating the players histories
        hist1.add(actionPlay1);
        hist2.add(actionPlay2);
        hist3.add(actionPlay3);
}


public String selectStrategies(String strategies, int round, int players ){
      switch(strategies){
          case"offensive": return("defect");
          case"softy": return("cooperate");
          case"spasty": return spastic();
          case"eye-for-eye": return eyeForeye(round, players);
          case"democratic": return Democratic(round, players);  
          case "eyefor2eye":return eyefor2eye(round,players);
          case "higherOrSp" : return higherorderspastic(round, players);
          case "Teyeforeye": return througheyeforeye(round , players);
          case "Seyeforeye": return softeyeforeye(round, players);
          //case"eyeForeye":return(eyeForeye(null, null, null, play))
          default:return "defect";
      }
      
      
  }
 
 public String offensive(){
    return("defect"); 
}
 public String softy(){
     return("cooperate");
 }
 
 public String  spastic()
     {
           
         Random rand= new Random();
          int value=rand.nextInt(2);
         // int radnum= value%2;
          
        String  Strategy;
        switch(value){
        case 0:
             Strategy="defect";
            break;
        case 1:
            Strategy="cooperate";
            break;
        default:
            throw new IllegalArgumentException("Invalid Strategy: ");
            
    }       
   return Strategy;
     
     }

public String eyeForeye(int r, int p){  //r =round, p=players
    if(r==1) {
        return "cooperate";
    }
    else{
        switch(p){
            case 1: if(hist2.get(hist2.size()-1).equals(hist3.get(hist3.size()-1))){
                         return hist2.get(hist2.size()-1);
                     }else{
                         return "defect"; 
                    }
            case 2: if(hist1.get(hist1.size()-1).equals(hist3.get(hist3.size()-1))){
                         return hist1.get(hist1.size()-1);
                     }else{
                         return "defect";
                    }
            case 3: if(hist1.get(hist1.size()-1).equals(hist2.get(hist2.size()-1))){
                         return hist2.get(hist2.size()-1);
                     }else{
                         return "defect"; 
                    }
            default: return "defect"; //
            
        }
        
    }
}
public String Democratic(int r, int p){  //player number p,round r
     if(r==1) {
        return "cooperate"; //by default but sure
    }
    else{
         int totalcoop, totaldef;
         switch(p){
             case 1:
                  totalcoop=Ncoop2+Ncoop3;
                  totaldef=Ndef2+Ndef3;
                 break;
             case 2:
                 totalcoop=Ncoop1+Ncoop3;
                 totaldef=Ndef1+Ndef3;
                 break;
             case 3:
                 totalcoop=Ncoop2+Ncoop1;
                 totaldef=Ndef2+Ndef1;
                 break;
             default: 
                 totalcoop=0;
                  totaldef=0;
         }
         if(totaldef < totalcoop){
             return "defect";
         }else{
             return "cooperate";
         }  
    }
    
}

public String eyefor2eye(int r, int p){
    if(r<3){
        return "cooperate";
    }else{
        switch(p){
       case 1:
            if(hist2.get(hist2.size()-1).equals("defect")&& hist2.get(hist2.size()-2).equals("defect")){
                return "defect";
            }else if(hist3.get(hist3.size()-1).equals("defect")&& hist3.get(hist3.size()-2).equals("defect")){
                    return "defect";
            }else{
                return "cooperate";
            }
       case 2:
           if(hist1.get(hist1.size()-1).equals("defect")&& hist1.get(hist1.size()-2).equals("defect")){
                return "defect";
            }else if(hist3.get(hist3.size()-1).equals("defect")&& hist3.get(hist3.size()-2).equals("defect")){
                    return "defect";
            }else{
                return "cooperate";
            }
       case 3:
           if(hist2.get(hist2.size()-1).equals("defect")&& hist3.get(hist3.size()-2).equals("defect")){
                return "defect";
            }else if(hist1.get(hist1.size()-1).equals("defect")&& hist1.get(hist1.size()-2).equals("defect")){
                    return "defect";
            }else{
                return "cooperate";
            }
       default: return "cooperate";
         }
      }
    
}
public String througheyeforeye(int r, int p){
    if(r==1){
        return "cooperate";
    }else{
        switch(p){
            case 1:  if(hist2.get(hist2.size()-1).equals("defect")|| hist3.get(hist3.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            case 2: if(hist1.get(hist1.size()-1).equals("defect")|| hist3.get(hist3.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            case 3: if(hist2.get(hist2.size()-1).equals("defect")|| hist1.get(hist1.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            default: return "cooperate";
        }
    }
}
public String softeyeforeye(int r, int p){
    if(r==1){
        return "cooperate";
    }else{
        switch(p){
            case 1:  if(hist2.get(hist2.size()-1).equals("defect")&& hist3.get(hist3.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            case 2: if(hist1.get(hist1.size()-1).equals("defect")&& hist3.get(hist3.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            case 3: if(hist2.get(hist2.size()-1).equals("defect")&& hist1.get(hist1.size()-1).equals("defect")){
                 return "defect";
               }else{
                return "cooperate";
                }
            default: return "cooperate";
        }
    }
}

public String higherorderspastic(int r, int p){
    int size=8;
    int n= r%size;
    switch(n){
        case 0: return offensive();
        case 1: return softy();
        case 2: return spastic();
        case 3: return eyeForeye(r, p);
        case 4: return Democratic(r, p); 
        case 5: return eyefor2eye(r, p);
        case 6: return througheyeforeye(r, p);
        case 7: return softeyeforeye(r, p);
        default: return "cooporate";
    }
} 
    /**
     * case 1: if(hist2.get(hist2.size()-1).equals(hist3.get(hist3.size()-1))){
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
              NewApplication napp=  new NewApplication();
              napp.setLocationRelativeTo(null);
              napp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              napp.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JButton contin;
    private javax.swing.JLabel coop1;
    private javax.swing.JLabel coop2;
    private javax.swing.JLabel coop3;
    private javax.swing.JButton cooperate1;
    private javax.swing.JButton cooperate2;
    private javax.swing.JButton cooperate3;
    private javax.swing.JLabel def1;
    private javax.swing.JLabel def2;
    private javax.swing.JLabel def3;
    private javax.swing.JButton defect1;
    private javax.swing.JButton defect2;
    private javax.swing.JButton defect3;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel gain1;
    private javax.swing.JLabel gain2;
    private javax.swing.JLabel gain3;
    private javax.swing.JButton graph;
    private javax.swing.JButton graph2;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JTextPane history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton1000;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton200;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton500;
    private javax.swing.JRadioButton jRadioButton5000;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newgame;
    private javax.swing.JMenuItem opstrategie;
    private javax.swing.JPanel panelPlayer1;
    private javax.swing.JPanel panelPlayer2;
    private javax.swing.JPanel panelPlayer3;
    private javax.swing.JPanel panelSimulation;
    private javax.swing.JButton pause;
    private javax.swing.JMenuItem payoff;
    private javax.swing.JComboBox player1;
    private javax.swing.JComboBox player2;
    private javax.swing.JComboBox player3;
    private javax.swing.JButton runSimulation;
    private javax.swing.JTextField score1;
    private javax.swing.JTextField score2;
    private javax.swing.JTextField score3;
    private javax.swing.JButton start;
    private javax.swing.JComboBox strategie1;
    private javax.swing.JComboBox strategie2;
    private javax.swing.JComboBox strategie3;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables
}
