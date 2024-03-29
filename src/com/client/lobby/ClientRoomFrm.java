/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.lobby;

import com.client.Room;
import com.client.User;
import com.client.Client;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luongtx
 */
public class ClientRoomFrm extends javax.swing.JFrame {

    /**
     * Creates new form RoomFrm
     */
    Client client;
    DefaultTableModel mdtbRoom;
//    public static ClientRoomFrm roomFrm;
    public ClientRoomFrm(Client client){
//        client.listenBattleRequest();
        this.client = client;
        initComponents();
        mdtbRoom = (DefaultTableModel) tbRoom.getModel();
        this.addWindowListener(new WindowsClosedListener());
        lbUser.setText(client.getCurrentUser().getUsername());
        //cập nhật danh sách người dùng online và phòng
        updateListUser(client.getOnlineUsers());
        updateTbRoom(client.getRooms());
    }
    private class WindowsClosedListener extends WindowAdapter{
        //Khi người dùng đóng giao diện
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            int option = JOptionPane.showConfirmDialog(rootPane, "Are you sure to exit: ",null, JOptionPane.OK_CANCEL_OPTION);
            if(option==JOptionPane.OK_OPTION){
                client.logout();
            }else{
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstUsers = new java.awt.List();
        btnRefresh = new javax.swing.JButton();
        btnCombat = new javax.swing.JButton();
        btnCreateRoom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbOnline = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        btnJoin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRoom = new javax.swing.JTable();
        btnDeleteRoom = new javax.swing.JButton();
        btnViewLB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRefresh.setBackground(new java.awt.Color(204, 204, 204));
        btnRefresh.setText("Refesh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCombat.setBackground(new java.awt.Color(204, 204, 204));
        btnCombat.setText("Solo");
        btnCombat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatActionPerformed(evt);
            }
        });

        btnCreateRoom.setBackground(new java.awt.Color(204, 204, 204));
        btnCreateRoom.setText("Creat Room");
        btnCreateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRoomActionPerformed(evt);
            }
        });

        jLabel1.setText("Online users:");

        lbUser.setText("jLabel3");

        lbOnline.setText("jLabel3");

        jLabel2.setText("Room list");

        lbLogout.setForeground(new java.awt.Color(255, 0, 0));
        lbLogout.setText("Log out");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });

        btnJoin.setBackground(new java.awt.Color(204, 204, 204));
        btnJoin.setText("Join");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        tbRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Name", "Boss", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRoom);

        btnDeleteRoom.setBackground(new java.awt.Color(204, 204, 204));
        btnDeleteRoom.setText("Delete Room");
        btnDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomActionPerformed(evt);
            }
        });

        btnViewLB.setBackground(new java.awt.Color(204, 204, 204));
        btnViewLB.setText("Leader board");
        btnViewLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbOnline))
                    .addComponent(lstUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCombat, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnViewLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbUser)
                                .addComponent(lbLogout))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(btnDeleteRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lstUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbOnline)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCombat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateRoom)
                            .addComponent(btnJoin))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh)
                            .addComponent(btnDeleteRoom)
                            .addComponent(btnViewLB))))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void updateListUser(ArrayList<User> userList){
        lstUsers.removeAll();
        userList.forEach((u) -> {
            lstUsers.add(u.getUsername());
        });
        lbOnline.setText(Integer.toString(userList.size()));
    }
    public void updateTbRoom(ArrayList<Room> roomList){
        mdtbRoom.setRowCount(0);
        for(Room room: roomList){
            mdtbRoom.addRow(room.toObject());
        }
    }
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        updateListUser(client.getOnlineUsers());
        updateTbRoom(client.getRooms());
    }//GEN-LAST:event_btnRefreshActionPerformed
    public int showConfirmDialog(Object msg, String title){
        return JOptionPane.showConfirmDialog(rootPane, msg, title, JOptionPane.OK_CANCEL_OPTION);
    }
    private void btnCombatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatActionPerformed
        // TODO add your handling code here:\
        int opponentID = lstUsers.getSelectedIndex();
        if(opponentID==-1) {
            JOptionPane.showMessageDialog(rootPane, "select an opponent!");
            return;
        }
        client.requestSolo(opponentID);
    }//GEN-LAST:event_btnCombatActionPerformed
    // dang xuat
    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        // TODO add your handling code here:
        client.logout();
        new ClientLoginFrm(client).setVisible(true);
        dispose();
    }//GEN-LAST:event_lbLogoutMouseClicked
//tao phong
    private void btnCreateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRoomActionPerformed
        JTextField txtRoomName = new JTextField();
        JTextField txtRoomSize = new JTextField();
        Object[] message = { "Room name: ", txtRoomName, "Room size: ", txtRoomSize};
        int option = JOptionPane.showConfirmDialog(rootPane, message, "Create new room", JOptionPane.OK_CANCEL_OPTION);
        if(option==JOptionPane.OK_OPTION){
            if(txtRoomName.getText().equals("") || txtRoomSize.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Enter room name and size!");
                return;
            }else if(txtRoomName.getText().contains(" ")){
                JOptionPane.showMessageDialog(rootPane, "Room must not contain space");
                return;
            }
            try{
               Room room = new Room(txtRoomName.getText(), client.getCurrentUser(),Integer.parseInt(txtRoomSize.getText()));
               client.createRoom(room);
               updateTbRoom(Client.roomList);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Enter room size as integer");
            }
        }
    }//GEN-LAST:event_btnCreateRoomActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
        int roomID = tbRoom.getSelectedRow();
        if(roomID==-1) {
            JOptionPane.showMessageDialog(null, "Please select a room");
            return;
        }
//        System.out.println(roomName);
        client.requestJoinRoom(roomID);
    }//GEN-LAST:event_btnJoinActionPerformed
    
    private void btnDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomActionPerformed
        // TODO add your handling code here:
        int roomID = tbRoom.getSelectedRow();
        if(roomID==-1) {
            JOptionPane.showMessageDialog(rootPane, "Please select a room");
            return;
        }
        client.deleteRoom(roomID);
        updateTbRoom(Client.roomList);
    }//GEN-LAST:event_btnDeleteRoomActionPerformed

    private void tbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRoomMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            System.out.println("double click");
            int roomID = tbRoom.getSelectedRow();
            System.out.println(client.getRooms().get(roomID).getRoomName());
            Room room = client.getRooms().get(roomID);
            System.out.println(room.getBoss().getUsername());
            new RoomInfoFrm(room).setVisible(true);
        }
    }//GEN-LAST:event_tbRoomMouseClicked

    private void btnViewLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLBActionPerformed
        // TODO add your handling code here:
        UserInforFrm inforFrm = new UserInforFrm(client.getLeaderBoard());
        inforFrm.setVisible(true);
    }//GEN-LAST:event_btnViewLBActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombat;
    private javax.swing.JButton btnCreateRoom;
    private javax.swing.JButton btnDeleteRoom;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbOnline;
    private javax.swing.JLabel lbUser;
    public static java.awt.List lstUsers;
    private javax.swing.JTable tbRoom;
    // End of variables declaration//GEN-END:variables
}
