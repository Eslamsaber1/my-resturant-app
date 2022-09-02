
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;



public class resturant_window extends javax.swing.JFrame {
    int chicken_number,meat_number,pizza_number,water_number,soda_number,redbull_number;
     float chicken_price,meat_price,pizza_price,water_price,soda_price,redbull_price;
      final float chicken_cost=15,meat_cost=20,pizza_cost=25,water_cost=5,soda_cost=10,redbull_cost=15;
       double total,tax,total_summation;
       int customercounter;
       PrintWriter output;
     
    public resturant_window() {
        initComponents();
        setLayout(null);
        setBounds(350,350,1117,635);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jpanel = new javax.swing.JPanel();
        chickenlable = new javax.swing.JLabel();
        chickencounter = new javax.swing.JSpinner();
        meatlable = new javax.swing.JLabel();
        chickenspicy = new javax.swing.JCheckBox();
        meatspicy = new javax.swing.JCheckBox();
        meatcounter = new javax.swing.JSpinner();
        chickencold = new javax.swing.JCheckBox();
        meatcold = new javax.swing.JCheckBox();
        totallable = new javax.swing.JLabel();
        pizzalable = new javax.swing.JLabel();
        pizzaspicy = new javax.swing.JCheckBox();
        pizzacounter = new javax.swing.JSpinner();
        pizzanormal = new javax.swing.JCheckBox();
        chickenpricelable = new javax.swing.JLabel();
        meatpricelable = new javax.swing.JLabel();
        pizzapricelable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        waterlable = new javax.swing.JLabel();
        watercounter = new javax.swing.JSpinner();
        sodalable = new javax.swing.JLabel();
        sodacounter = new javax.swing.JSpinner();
        waterpricelable = new javax.swing.JLabel();
        sodapricelable = new javax.swing.JLabel();
        redbulllable = new javax.swing.JLabel();
        redbullcounter = new javax.swing.JSpinner();
        redbullpricelable = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totaklable = new javax.swing.JLabel();
        taxlable = new javax.swing.JLabel();
        totalcostlable = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        calculatbill = new javax.swing.JButton();
        savebill = new javax.swing.JButton();
        newbill = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        customercounterlable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Restaurant management system");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 513, 59);

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Food\n", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        chickenlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chickenlable.setText("Shawarma Chicken");

        chickencounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        chickencounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickencounterStateChanged(evt);
            }
        });

        meatlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        meatlable.setText("Shawerma Meat");

        chickenspicy.setBackground(new java.awt.Color(255, 255, 255));
        chickenspicy.setText("spicy");
        chickenspicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenspicyActionPerformed(evt);
            }
        });

        meatspicy.setBackground(new java.awt.Color(255, 255, 255));
        meatspicy.setText("spicy");
        meatspicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatspicyActionPerformed(evt);
            }
        });

        meatcounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        meatcounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meatcounterStateChanged(evt);
            }
        });

        chickencold.setBackground(new java.awt.Color(255, 255, 255));
        chickencold.setText("Cold starters");
        chickencold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickencoldActionPerformed(evt);
            }
        });

        meatcold.setBackground(new java.awt.Color(255, 255, 255));
        meatcold.setText("Cold starters");
        meatcold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meatcoldActionPerformed(evt);
            }
        });

        totallable.setText("$ 0.0");

        pizzalable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pizzalable.setText("pizza");

        pizzaspicy.setBackground(new java.awt.Color(255, 255, 255));
        pizzaspicy.setText("spicy");
        pizzaspicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaspicyActionPerformed(evt);
            }
        });

        pizzacounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        pizzacounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pizzacounterStateChanged(evt);
            }
        });

        pizzanormal.setBackground(new java.awt.Color(255, 255, 255));
        pizzanormal.setText("normal");
        pizzanormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzanormalActionPerformed(evt);
            }
        });

        chickenpricelable.setText("$ 0.0");

        meatpricelable.setText("$ 0.0");

        pizzapricelable.setText("$ 0.0");

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(chickenlable)
                                .addGap(37, 37, 37)
                                .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(chickenspicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(meatlable, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(meatspicy)))
                        .addGap(303, 303, 303)
                        .addComponent(totallable, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addComponent(pizzalable, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(pizzacounter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pizzaspicy)
                        .addGap(30, 30, 30)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addComponent(pizzanormal)
                                .addGap(50, 50, 50)
                                .addComponent(pizzapricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpanelLayout.createSequentialGroup()
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chickencold, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meatcold))
                                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(meatpricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JpanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(chickenpricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chickenlable)
                        .addComponent(chickencounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JpanelLayout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chickenspicy)
                                .addComponent(chickencold, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(totallable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chickenpricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meatcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meatlable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meatspicy, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meatcold, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meatpricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pizzalable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pizzacounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pizzaspicy)
                            .addComponent(pizzanormal)
                            .addComponent(pizzapricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        getContentPane().add(Jpanel);
        Jpanel.setBounds(63, 146, 610, 190);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "drinks", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        waterlable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        waterlable.setText("water");

        watercounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        watercounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                watercounterStateChanged(evt);
            }
        });

        sodalable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sodalable.setText("soda");

        sodacounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        sodacounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sodacounterStateChanged(evt);
            }
        });

        waterpricelable.setText("$ 0.0");

        sodapricelable.setText("$ 0.0");

        redbulllable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        redbulllable.setText("Red Bull");

        redbullcounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        redbullcounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redbullcounterStateChanged(evt);
            }
        });

        redbullpricelable.setText("$ 0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterlable)
                    .addComponent(sodalable, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redbulllable, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redbullcounter, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(watercounter)
                    .addComponent(sodacounter))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sodapricelable, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(waterpricelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redbullpricelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waterlable)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(watercounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(waterpricelable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sodalable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sodacounter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sodapricelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redbullpricelable, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(redbullcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redbulllable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 370, 429, 204);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        totaklable.setBackground(new java.awt.Color(102, 102, 102));
        totaklable.setText("Total:                         $ 0.0");

        taxlable.setText("Tax:                            $ 0.0");

        totalcostlable.setText("total cost:                    $ 0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totaklable, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taxlable, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalcostlable, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totaklable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(taxlable, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(totalcostlable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(723, 150, 320, 187);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        calculatbill.setBackground(new java.awt.Color(255, 255, 255));
        calculatbill.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        calculatbill.setText("Account");
        calculatbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatbillActionPerformed(evt);
            }
        });

        savebill.setBackground(new java.awt.Color(255, 255, 255));
        savebill.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        savebill.setText("Save the bill");
        savebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebillActionPerformed(evt);
            }
        });

        newbill.setBackground(new java.awt.Color(255, 255, 255));
        newbill.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        newbill.setText("new bill");
        newbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbillActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton4.setText("print bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newbill, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(savebill, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(calculatbill, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(calculatbill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newbill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savebill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(620, 370, 470, 201);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(1020, 0, 80, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Welcome to our restaurant");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 70, 434, 52);

        customercounterlable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        customercounterlable.setText("bill number:0");
        getContentPane().add(customercounterlable);
        customercounterlable.setBounds(160, 110, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Food-Still-Life-Vegetables-Bread_1280x1280.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chickenspicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenspicyActionPerformed
      if(chickenspicy.isSelected())
      {
      chicken_price+=chicken_number;
      }
      else {
      chicken_price=chicken_price-chicken_number;
      }
       chickenpricelable.setText(chicken_price +"$");
    }//GEN-LAST:event_chickenspicyActionPerformed

    private void chickencounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickencounterStateChanged

         chicken_number =  (int) chickencounter.getValue();
         chicken_price= chicken_cost * chicken_number;
         chickenpricelable.setText(chicken_price +"$");
    }//GEN-LAST:event_chickencounterStateChanged

    private void meatcounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meatcounterStateChanged
        meat_number =  (int) meatcounter.getValue();
         meat_price= meat_cost * meat_number;
         meatpricelable.setText(meat_price +"$");
    }//GEN-LAST:event_meatcounterStateChanged

    private void pizzacounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pizzacounterStateChanged
         pizza_number =  (int) pizzacounter.getValue();
         pizza_price= pizza_cost * pizza_number;
         pizzapricelable.setText(pizza_price +"$");
    }//GEN-LAST:event_pizzacounterStateChanged

    private void watercounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_watercounterStateChanged
       water_number =  (int) watercounter.getValue();
         water_price= water_cost * water_number;
         waterpricelable.setText(water_price +"$");
    }//GEN-LAST:event_watercounterStateChanged

    private void sodacounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sodacounterStateChanged
       soda_number =  (int) sodacounter.getValue();
         soda_price= soda_cost * soda_number;
         sodapricelable.setText(soda_price +"$");
    }//GEN-LAST:event_sodacounterStateChanged

    private void redbullcounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redbullcounterStateChanged
        redbull_number =  (int) redbullcounter.getValue();
         redbull_price= redbull_cost * redbull_number;
         redbullpricelable.setText(redbull_price +"$");
    }//GEN-LAST:event_redbullcounterStateChanged

    private void chickencoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickencoldActionPerformed
        if(chickencold.isSelected())
      {
      chicken_price+=chicken_number;
      }
      else {
      chicken_price=chicken_price-chicken_number;
      }
       chickenpricelable.setText(chicken_price +"$");
    }//GEN-LAST:event_chickencoldActionPerformed

    private void meatspicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatspicyActionPerformed
       if(meatspicy.isSelected())
       {
       meat_price+=meat_number;
       }
       else{
           meat_price+=meat_number;
       }
       meatpricelable.setText(meat_price+"$");
    }//GEN-LAST:event_meatspicyActionPerformed

    private void meatcoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meatcoldActionPerformed
      if(meatcold.isSelected())
       {
       meat_price+=meat_number;
       }
       else{
           meat_price+=meat_number;
       }
       meatpricelable.setText(meat_price+"$");
    }//GEN-LAST:event_meatcoldActionPerformed

    private void pizzaspicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaspicyActionPerformed
        if(pizzaspicy.isSelected())
        {
            pizza_price+=pizza_number;
        }
        else{
            pizza_price-=pizza_number;
        }
        pizzapricelable.setText(pizza_price+"$");
    }//GEN-LAST:event_pizzaspicyActionPerformed

    private void pizzanormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzanormalActionPerformed
      if(pizzanormal.isSelected())
      {
          pizza_price+=pizza_number;
      }
      else{
          pizza_price-=pizza_number;
      }
      pizzapricelable.setText(pizza_price+"$");
    }//GEN-LAST:event_pizzanormalActionPerformed

    private void calculatbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatbillActionPerformed
       total_summation= chicken_price+meat_price+pizza_price+water_price+soda_price+redbull_price;
       totaklable.setText("total:"+"       "+total_summation+"$");
       
       tax=total_summation*0.05;
       taxlable.setText("tax:"+"       "+tax+"$");
       
       total=total_summation+tax;
       totalcostlable.setText("total cost:"+"       "+total+"$");
    }//GEN-LAST:event_calculatbillActionPerformed

    private void savebillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebillActionPerformed
        try {
            
            output=new PrintWriter("billno."+customercounter+".txt");
            output.println("number of bill"+customercounter);
            output.println("**************************");
            if(chicken_number!=0){
                System.out.println(chicken_number+"  "+"chicken shawrma");
            }
            if(chickenspicy.isSelected())
            {
                
            }
          output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(resturant_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
              
     
    }//GEN-LAST:event_savebillActionPerformed

    private void newbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbillActionPerformed
       if(total!=0)
       {
           chickencounter.setValue(0);
           meatcounter.setValue(0);
           pizzacounter.setValue(0);
           watercounter.setValue(0);
           sodacounter.setValue(0);
           redbullcounter.setValue(0);
           chickenspicy.setSelected(false);
           chickencold.setSelected(false);
           meatspicy.setSelected(false);
           meatcold.setSelected(false);
           pizzaspicy.setSelected(false);
           pizzanormal.setSelected(false);
           totaklable.setText("total: 0.0 $ ");
           taxlable.setText("tax: 0.0 $ ");
           totalcostlable.setText("totalcost: 0.0 $");
           total=0;
           tax=0;
           total_summation=0;
           customercounter++;
           customercounterlable.setText("bill number:0"+customercounter);
       }
    }//GEN-LAST:event_newbillActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed
  
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resturant_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton calculatbill;
    private javax.swing.JCheckBox chickencold;
    private javax.swing.JSpinner chickencounter;
    private javax.swing.JLabel chickenlable;
    private javax.swing.JLabel chickenpricelable;
    private javax.swing.JCheckBox chickenspicy;
    private javax.swing.JLabel customercounterlable;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox meatcold;
    private javax.swing.JSpinner meatcounter;
    private javax.swing.JLabel meatlable;
    private javax.swing.JLabel meatpricelable;
    private javax.swing.JCheckBox meatspicy;
    private javax.swing.JButton newbill;
    private javax.swing.JSpinner pizzacounter;
    private javax.swing.JLabel pizzalable;
    private javax.swing.JCheckBox pizzanormal;
    private javax.swing.JLabel pizzapricelable;
    private javax.swing.JCheckBox pizzaspicy;
    private javax.swing.JSpinner redbullcounter;
    private javax.swing.JLabel redbulllable;
    private javax.swing.JLabel redbullpricelable;
    private javax.swing.JButton savebill;
    private javax.swing.JSpinner sodacounter;
    private javax.swing.JLabel sodalable;
    private javax.swing.JLabel sodapricelable;
    private javax.swing.JLabel taxlable;
    private javax.swing.JLabel totaklable;
    private javax.swing.JLabel totalcostlable;
    private javax.swing.JLabel totallable;
    private javax.swing.JSpinner watercounter;
    private javax.swing.JLabel waterlable;
    private javax.swing.JLabel waterpricelable;
    // End of variables declaration//GEN-END:variables
}
