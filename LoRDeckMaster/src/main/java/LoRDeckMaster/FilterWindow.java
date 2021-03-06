/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoRDeckMaster;

/**
 *
 * @author hoski
 */
public class FilterWindow extends javax.swing.JFrame {

    private DeckEditorWindow deckEditorWindow;
    
    /**
     * Creates new form FilterWindow
     */
    public FilterWindow(DeckEditorWindow deckEditorWindow, Deck currentDeck) {
        initComponents();
        this.deckEditorWindow = deckEditorWindow;
        deckEditorWindow.setEnabled(false);
        
        String region1 = currentDeck.getRegion1();
        String region2 = currentDeck.getRegion2();
        if ("".equals(region1) && "".equals(region2))
            return;
        
        // Set check boxes selected and enabled depending on regions in current deck.
        boolean hasTwoRegions = !("".equals(region1) || "".equals(region2));
        jcbBandleCity.setSelected("BC".equals(region1) || "BC".equals(region2));
        jcbBandleCity.setEnabled(!("BC".equals(region1) || "BC".equals(region2) || hasTwoRegions));
        jcbBilgewater.setSelected("BW".equals(region1) || "BW".equals(region2));
        jcbBilgewater.setEnabled(!("BW".equals(region1) || "BW".equals(region2) || hasTwoRegions));
        jcbDemacia.setSelected("DE".equals(region1) || "DE".equals(region2));
        jcbDemacia.setEnabled(!("DE".equals(region1) || "DE".equals(region2) || hasTwoRegions));
        jcbFreljord.setSelected("FR".equals(region1) || "FR".equals(region2));
        jcbFreljord.setEnabled(!("FR".equals(region1) || "FR".equals(region2) || hasTwoRegions));
        jcbIonia.setSelected("IO".equals(region1) || "IO".equals(region2));
        jcbIonia.setEnabled(!("IO".equals(region1) || "IO".equals(region2) || hasTwoRegions));
        jcbNoxus.setSelected("NX".equals(region1) || "NX".equals(region2));
        jcbNoxus.setEnabled(!("NX".equals(region1) || "NX".equals(region2) || hasTwoRegions));
        jcbPiltoverZaun.setSelected("PZ".equals(region1) || "PZ".equals(region2));
        jcbPiltoverZaun.setEnabled(!("PZ".equals(region1) || "PZ".equals(region2) || hasTwoRegions));
        jcbShadowIsles.setSelected("SI".equals(region1) || "SI".equals(region2));
        jcbShadowIsles.setEnabled(!("SI".equals(region1) || "SI".equals(region2) || hasTwoRegions));
        jcbShurima.setSelected("SH".equals(region1) || "SH".equals(region2));
        jcbShurima.setEnabled(!("SH".equals(region1) || "SH".equals(region2) || hasTwoRegions));
        jcbTargon.setSelected("MT".equals(region1) || "MT".equals(region2));
        jcbTargon.setEnabled(!("MT".equals(region1) || "MT".equals(region2) || hasTwoRegions));
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
        lblRegions = new javax.swing.JLabel();
        jcbBandleCity = new javax.swing.JCheckBox();
        jcbBilgewater = new javax.swing.JCheckBox();
        jcbDemacia = new javax.swing.JCheckBox();
        jcbFreljord = new javax.swing.JCheckBox();
        jcbIonia = new javax.swing.JCheckBox();
        jcbNoxus = new javax.swing.JCheckBox();
        jcbPiltoverZaun = new javax.swing.JCheckBox();
        jcbShadowIsles = new javax.swing.JCheckBox();
        jcbShurima = new javax.swing.JCheckBox();
        jcbTargon = new javax.swing.JCheckBox();
        lblCardType = new javax.swing.JLabel();
        jcbUnit = new javax.swing.JCheckBox();
        jcbSpell = new javax.swing.JCheckBox();
        jcbLandmark = new javax.swing.JCheckBox();
        lblRarity = new javax.swing.JLabel();
        jcbCommon = new javax.swing.JCheckBox();
        jcbRare = new javax.swing.JCheckBox();
        jcbEpic = new javax.swing.JCheckBox();
        jcbChampion = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnFilter = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filter Cards");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblRegions.setText("REGIONS");

        jcbBandleCity.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbBandleCity.setSelected(true);
        jcbBandleCity.setText("Bandle City");
        jcbBandleCity.setFocusable(false);

        jcbBilgewater.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbBilgewater.setSelected(true);
        jcbBilgewater.setText("Bilgewater");
        jcbBilgewater.setFocusable(false);

        jcbDemacia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbDemacia.setSelected(true);
        jcbDemacia.setText("Demacia");
        jcbDemacia.setFocusable(false);

        jcbFreljord.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbFreljord.setSelected(true);
        jcbFreljord.setText("Freljord");
        jcbFreljord.setFocusable(false);

        jcbIonia.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbIonia.setSelected(true);
        jcbIonia.setText("Ionia");
        jcbIonia.setFocusable(false);

        jcbNoxus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbNoxus.setSelected(true);
        jcbNoxus.setText("Noxus");
        jcbNoxus.setFocusable(false);

        jcbPiltoverZaun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbPiltoverZaun.setSelected(true);
        jcbPiltoverZaun.setText("Piltover & Zaun");
        jcbPiltoverZaun.setFocusable(false);

        jcbShadowIsles.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbShadowIsles.setSelected(true);
        jcbShadowIsles.setText("Shadow Isles");
        jcbShadowIsles.setFocusable(false);

        jcbShurima.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbShurima.setSelected(true);
        jcbShurima.setText("Shurima");
        jcbShurima.setFocusable(false);

        jcbTargon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbTargon.setSelected(true);
        jcbTargon.setText("Targon");
        jcbTargon.setFocusable(false);

        lblCardType.setText("CARD TYPE");

        jcbUnit.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbUnit.setSelected(true);
        jcbUnit.setText("Unit");
        jcbUnit.setFocusable(false);

        jcbSpell.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbSpell.setSelected(true);
        jcbSpell.setText("Spell");
        jcbSpell.setFocusable(false);

        jcbLandmark.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbLandmark.setSelected(true);
        jcbLandmark.setText("Landmark");
        jcbLandmark.setFocusable(false);

        lblRarity.setText("RARITY");

        jcbCommon.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbCommon.setSelected(true);
        jcbCommon.setText("Common");
        jcbCommon.setContentAreaFilled(false);
        jcbCommon.setFocusable(false);

        jcbRare.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbRare.setSelected(true);
        jcbRare.setText("Rare");
        jcbRare.setContentAreaFilled(false);
        jcbRare.setFocusable(false);

        jcbEpic.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbEpic.setSelected(true);
        jcbEpic.setText("Epic");
        jcbEpic.setContentAreaFilled(false);
        jcbEpic.setFocusable(false);

        jcbChampion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jcbChampion.setSelected(true);
        jcbChampion.setText("Champion");
        jcbChampion.setContentAreaFilled(false);
        jcbChampion.setFocusable(false);

        btnFilter.setText("Filter");
        btnFilter.setContentAreaFilled(false);
        btnFilter.setFocusable(false);
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRegions)
                                    .addComponent(jcbBandleCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbBilgewater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbDemacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbFreljord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbNoxus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbIonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbPiltoverZaun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbShadowIsles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbShurima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbTargon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblRarity)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbCommon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEpic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbChampion))
                            .addComponent(lblCardType)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbUnit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSpell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbLandmark)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBandleCity)
                    .addComponent(jcbDemacia)
                    .addComponent(jcbIonia)
                    .addComponent(jcbPiltoverZaun)
                    .addComponent(jcbShurima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBilgewater)
                    .addComponent(jcbFreljord)
                    .addComponent(jcbNoxus)
                    .addComponent(jcbShadowIsles)
                    .addComponent(jcbTargon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCardType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbUnit)
                    .addComponent(jcbSpell)
                    .addComponent(jcbLandmark))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRarity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCommon)
                    .addComponent(jcbRare)
                    .addComponent(jcbEpic)
                    .addComponent(jcbChampion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilter)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        boolean inclBC = jcbBandleCity.isSelected();
        boolean inclBW = jcbBilgewater.isSelected();
        boolean inclDE = jcbDemacia.isSelected();
        boolean inclFR = jcbFreljord.isSelected();
        boolean inclIO = jcbIonia.isSelected();
        boolean inclNX = jcbNoxus.isSelected();
        boolean inclPZ = jcbPiltoverZaun.isSelected();
        boolean inclSI = jcbShadowIsles.isSelected();
        boolean inclSH = jcbShurima.isSelected();
        boolean inclMT = jcbTargon.isSelected();
        
        boolean inclUnits = jcbUnit.isSelected();
        boolean inclSpells = jcbSpell.isSelected();
        boolean inclLandmarks = jcbLandmark.isSelected();
        
        boolean inclCommons = jcbCommon.isSelected();
        boolean inclRares = jcbRare.isSelected();
        boolean inclEpics = jcbEpic.isSelected();
        boolean inclChampions = jcbChampion.isSelected();
        
        deckEditorWindow.filterCards(inclBC, inclBW, inclDE, inclFR, inclIO, inclNX, inclPZ, inclSI, inclSH, inclMT, 
                                     inclUnits, inclSpells, inclLandmarks, 
                                     inclCommons, inclRares, inclEpics, inclChampions);
        deckEditorWindow.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        deckEditorWindow.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox jcbBandleCity;
    private javax.swing.JCheckBox jcbBilgewater;
    private javax.swing.JCheckBox jcbChampion;
    private javax.swing.JCheckBox jcbCommon;
    private javax.swing.JCheckBox jcbDemacia;
    private javax.swing.JCheckBox jcbEpic;
    private javax.swing.JCheckBox jcbFreljord;
    private javax.swing.JCheckBox jcbIonia;
    private javax.swing.JCheckBox jcbLandmark;
    private javax.swing.JCheckBox jcbNoxus;
    private javax.swing.JCheckBox jcbPiltoverZaun;
    private javax.swing.JCheckBox jcbRare;
    private javax.swing.JCheckBox jcbShadowIsles;
    private javax.swing.JCheckBox jcbShurima;
    private javax.swing.JCheckBox jcbSpell;
    private javax.swing.JCheckBox jcbTargon;
    private javax.swing.JCheckBox jcbUnit;
    private javax.swing.JLabel lblCardType;
    private javax.swing.JLabel lblRarity;
    private javax.swing.JLabel lblRegions;
    // End of variables declaration//GEN-END:variables
}
