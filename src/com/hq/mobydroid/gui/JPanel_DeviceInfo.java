/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hq.mobydroid.gui;

import com.hq.jadb.engine.JadbException;
import com.hq.jadb.manager.JadbDeviceBatteryStatus;
import com.hq.jadb.manager.JadbDeviceProperties;
import com.hq.materialdesign.MaterialIcons;
import com.hq.mobydroid.Log;
import com.hq.mobydroid.MobyDroid;
import com.hq.mobydroid.device.MobydroidDevice;
import java.io.IOException;
import java.util.logging.Level;

/**
 *
 * @author Bilux (i.bilux@gmail.com)
 */
public class JPanel_DeviceInfo extends javax.swing.JPanel {

    // ************************ My variable ************************
    // *************************************************************
    /**
     * Creates new form JPanel_ManageApps
     *
     */
    public JPanel_DeviceInfo() {
        // initialize components
        initComponents();
    }

    /**
     * Update device information
     */
    public void updateInfo() {
        // clear text
        jLabel_AndroidVersionStr.setText("");
        jLabel_BatteryPercent.setText("0 %");
        jLabel_BoardStr.setText("");
        jLabel_BuildDateStr.setText("");
        jLabel_DeviceStr.setText("");
        jLabel_ManufacturerStr.setText("");
        jLabel_ModelStr.setText("");
        jLabel_SdkStr.setText("");
        jLabel_SerialStr.setText("");

        // get device
        MobydroidDevice mDevice = MobyDroid.getDevice();
        if (mDevice == null) {
            return;
        }

        // get Device Battery Status
        try {
            JadbDeviceBatteryStatus jadbDeviceBatteryStatus = new JadbDeviceBatteryStatus(mDevice);
            jLabel_BatteryPercent.setText(jadbDeviceBatteryStatus.getBatteryLevel() + " %");
        } catch (IOException | JadbException ex) {
            Log.log(Level.SEVERE, "DeviceBatteryStatus", ex);
        }

        // get Device Properties
        try {
            JadbDeviceProperties jadbDeviceProperties = new JadbDeviceProperties(mDevice);
            jLabel_AndroidVersionStr.setText(jadbDeviceProperties.getBuildVersionRelease());
            jLabel_BoardStr.setText(jadbDeviceProperties.getProductBoard());
            jLabel_BuildDateStr.setText(jadbDeviceProperties.getBuildVersionDateUTC());
            jLabel_DeviceStr.setText(jadbDeviceProperties.getProductDevice());
            jLabel_ManufacturerStr.setText(jadbDeviceProperties.getProductManufacturer());
            jLabel_ModelStr.setText(jadbDeviceProperties.getProductModel());
            jLabel_SdkStr.setText(jadbDeviceProperties.getBuildVersionSDK());
            jLabel_SerialStr.setText(jadbDeviceProperties.getBootSerialNo() == null ? mDevice.getSerial() : jadbDeviceProperties.getBootSerialNo());
        } catch (IOException | JadbException ex) {
            Log.log(Level.SEVERE, "DeviceProperties", ex);
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

        jLabel_Serial = new javax.swing.JLabel();
        jLabel_SerialStr = new javax.swing.JLabel();
        jLabel_Model = new javax.swing.JLabel();
        jLabel_ModelStr = new javax.swing.JLabel();
        jLabel_Device = new javax.swing.JLabel();
        jLabel_DeviceStr = new javax.swing.JLabel();
        jLabel_Manufacturer = new javax.swing.JLabel();
        jLabel_ManufacturerStr = new javax.swing.JLabel();
        jLabel_Board = new javax.swing.JLabel();
        jLabel_BoardStr = new javax.swing.JLabel();
        jLabel_AndroidVersion = new javax.swing.JLabel();
        jLabel_AndroidVersionStr = new javax.swing.JLabel();
        jLabel_Sdk = new javax.swing.JLabel();
        jLabel_SdkStr = new javax.swing.JLabel();
        jLabel_BuildDate = new javax.swing.JLabel();
        jLabel_BuildDateStr = new javax.swing.JLabel();
        jLabel_BatteryIcon = new javax.swing.JLabel();
        jLabel_BatteryPercent = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Screen Capture : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 11))); // NOI18N

        jLabel_Serial.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Serial.setText("• Serial :");

        jLabel_SerialStr.setText("Device");

        jLabel_Model.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Model.setText("• Model :");

        jLabel_ModelStr.setText("Device");

        jLabel_Device.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Device.setText("• Device :");

        jLabel_DeviceStr.setText("Device");

        jLabel_Manufacturer.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Manufacturer.setText("• Manufacturer :");

        jLabel_ManufacturerStr.setText("Device");

        jLabel_Board.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Board.setText("• Board :");

        jLabel_BoardStr.setText("Device");

        jLabel_AndroidVersion.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_AndroidVersion.setText("• OS version :");

        jLabel_AndroidVersionStr.setText("Device");

        jLabel_Sdk.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_Sdk.setText("• SDK :");

        jLabel_SdkStr.setText("Device");

        jLabel_BuildDate.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_BuildDate.setText("• Build date :");

        jLabel_BuildDateStr.setText("Device");

        jLabel_BatteryIcon.setFont(MaterialIcons.ICON_FONT.deriveFont(76f));
        jLabel_BatteryIcon.setForeground(new java.awt.Color(97, 97, 97));
        jLabel_BatteryIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BatteryIcon.setText(String.valueOf(MaterialIcons.BATTERY_FULL));

        jLabel_BatteryPercent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BatteryPercent.setText("0 %");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Sdk, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SdkStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_BuildDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BuildDateStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Board, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BoardStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_AndroidVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_AndroidVersionStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ModelStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Serial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_SerialStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Manufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Device, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_DeviceStr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_ManufacturerStr, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_BatteryIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_BatteryPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel_AndroidVersion, jLabel_Board, jLabel_BuildDate, jLabel_Device, jLabel_Manufacturer, jLabel_Model, jLabel_Sdk, jLabel_Serial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Serial)
                            .addComponent(jLabel_SerialStr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ModelStr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Device)
                            .addComponent(jLabel_DeviceStr)))
                    .addComponent(jLabel_BatteryIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Manufacturer)
                    .addComponent(jLabel_ManufacturerStr)
                    .addComponent(jLabel_BatteryPercent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Board)
                    .addComponent(jLabel_BoardStr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_AndroidVersion)
                    .addComponent(jLabel_AndroidVersionStr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Sdk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_SdkStr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_BuildDateStr)
                    .addComponent(jLabel_BuildDate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel_AndroidVersion, jLabel_AndroidVersionStr, jLabel_BatteryPercent, jLabel_Board, jLabel_BoardStr, jLabel_BuildDate, jLabel_BuildDateStr, jLabel_Device, jLabel_DeviceStr, jLabel_Manufacturer, jLabel_ManufacturerStr, jLabel_Model, jLabel_ModelStr, jLabel_Sdk, jLabel_SdkStr, jLabel_Serial, jLabel_SerialStr});

    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_AndroidVersion;
    private javax.swing.JLabel jLabel_AndroidVersionStr;
    private javax.swing.JLabel jLabel_BatteryIcon;
    private javax.swing.JLabel jLabel_BatteryPercent;
    private javax.swing.JLabel jLabel_Board;
    private javax.swing.JLabel jLabel_BoardStr;
    private javax.swing.JLabel jLabel_BuildDate;
    private javax.swing.JLabel jLabel_BuildDateStr;
    private javax.swing.JLabel jLabel_Device;
    private javax.swing.JLabel jLabel_DeviceStr;
    private javax.swing.JLabel jLabel_Manufacturer;
    private javax.swing.JLabel jLabel_ManufacturerStr;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_ModelStr;
    private javax.swing.JLabel jLabel_Sdk;
    private javax.swing.JLabel jLabel_SdkStr;
    private javax.swing.JLabel jLabel_Serial;
    private javax.swing.JLabel jLabel_SerialStr;
    // End of variables declaration//GEN-END:variables
}
