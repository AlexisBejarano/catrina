package mx.itson.catrina;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;//
import javax.swing.table.DefaultTableModel;
import mx.itson.DB.Cliente;
import mx.itson.DB.Dato;
import mx.itson.DB.Movimiento;

/**@author Alexis Bejarano*/
public class main extends javax.swing.JFrame {
    
    
      //Definir Variables en memoria.
    public int salario;
    public int vueltas = 1;
    public String SubTotal;
    public double datoSubTotal;
    public double datoAnterior;
    public double sumaDepositos;
    public double sumaRetiros;
    
    public main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        btnSeleccione = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LblSaldoInicial = new javax.swing.JLabel();
        lblDepositos = new javax.swing.JLabel();
        lblRetiros = new javax.swing.JLabel();
        lblSaldoFinalResumen = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblComentarios = new javax.swing.JTable();
        fichero = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jtfSalarioInicial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSaldoFinal = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ESTADO DE CUENTA");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblRFC.setText("RFC");

        lblDomicilio.setText("Domicilio");

        lblCiudad.setText("Ciudad");

        lblCp.setText("CP");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Cuenta");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Clabe");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Moneda");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("CUENTA CONTABLE");

        lblCuenta.setText("Digito Cuenta");

        lblClabe.setText("Digito Clabe");

        lblMoneda.setText("Digito Moneda");

        btnSeleccione.setText("Seleccione");
        btnSeleccione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccioneActionPerformed(evt);
            }
        });

        jLabel14.setText("Seleccione el archivo a cargar");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("RESUMEN DEL PERIODO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Saldo inicial (anterior)");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("Depósitos");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("Retiros");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Saldo final");

        LblSaldoInicial.setText("Digito Saldo inicial");

        lblDepositos.setText("Digito Depositos");

        lblRetiros.setText("Digito Retiros");

        lblSaldoFinalResumen.setText("Digito Final");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("DETALLE DE MOVIMIENTOS");

        tblComentarios.setAutoCreateRowSorter(true);
        tblComentarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FECHA", "DESCRIPCIÓN", "DEPÓSITO", "RETIRO", "SUBTOTAL"
            }
        ));
        jScrollPane2.setViewportView(tblComentarios);

        fichero.setText("Nombre del fichero");
        fichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ficheroActionPerformed(evt);
            }
        });

        jButton2.setText("Capturar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtfSalarioInicial.setText("$$$$");

        jLabel2.setText("Ingrese saldo inicial");

        jLabel3.setText("Saldo final de periodo:");

        lblSaldoFinal.setText("Saldo final DIGITO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCiudad)
                                    .addComponent(lblDomicilio)
                                    .addComponent(lblRFC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(54, 54, 54)
                                        .addComponent(lblClabe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(38, 38, 38)
                                        .addComponent(lblMoneda))
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(43, 43, 43)
                                        .addComponent(lblCuenta))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCp)
                                    .addComponent(jLabel15)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSaldoFinalResumen)
                                            .addComponent(lblRetiros)
                                            .addComponent(lblDepositos)
                                            .addComponent(LblSaldoInicial)))
                                    .addComponent(jLabel24))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfSalarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(fichero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccione)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSaldoFinal)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfSalarioInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeleccione))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRFC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDomicilio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCiudad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblCuenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblClabe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(lblMoneda))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCp)
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(LblSaldoInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblDepositos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblRetiros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblSaldoFinalResumen))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSaldoFinal))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccioneActionPerformed
        // BOTON--------------------------------
        try{
        //Crea el objeto JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        // ????
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        //Abre la ventana
        if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION);
            //Pasar la ruta a una variable
            File archivo = fileChooser.getSelectedFile();
           
            //------------------------------------
            //Muestra el nombre del fichero en el TextField
              this.fichero.setText(archivo.getAbsolutePath());
            //------------------------------------
            
            
              //para convertir file a .toPath y toma el archivo.
              byte archivoBytes [] = Files.readAllBytes(archivo.toPath());
            
            String contenido = new String(archivoBytes, StandardCharsets.UTF_8);        
            Dato dato = new Dato().deserializar(contenido);
            
            DefaultTableModel modelo = (DefaultTableModel) tblComentarios.getModel();
            modelo.setRowCount(0);
            
            //Para que aparesca solo 2 digitos para el dia, 2 para el mas y 4 para el año ("dd/MM/yyyy")
            //MMM significa que pondremos el mes con palabras junio, julio...
            DateFormat formato = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");
            
            //Se imprime el contenido en los Label
            lblCuenta.setText(dato.getCuenta());
            lblClabe.setText(dato.getClabe());
            lblMoneda.setText(dato.getMoneda());
            lblNombre.setText(dato.getCliente().getNombre());
            lblRFC.setText(dato.getCliente().getRfc());
            lblDomicilio.setText(dato.getCliente().getDomicilio());
            lblCiudad.setText(dato.getCliente().getCiudad());
            lblCp.setText(dato.getCliente().getCp());

            //Imprimir datos en tabla.
            for(Movimiento c : dato.getMovimientos()){
                //hacer el llamado y pasarlo a un String.
                String tipoDepositoRetiro = c.getTipo();
                //Convertir el String "Prueba" a INT.
                int numeroTipoDepositoRetiro = Integer.parseInt(tipoDepositoRetiro);
                //Poner espacio en memoria.
                String deposito = "0";
                String retiro = "0";
                
                //Comprobar que tipo es.
                if(numeroTipoDepositoRetiro == 1) {
                    deposito = c.getCantidad();
                }else retiro = c.getCantidad();
                
                //convertir String a Double.
                double depositoDouble = Double.parseDouble(deposito);
                double retiroDouble = Double.parseDouble(retiro);
                
                //Dependiendo si son mas de 1 vuelta hace otra ecuacion.
                if (vueltas == 1){
                    //Suma y resta, lo mete en variable.
                datoSubTotal = salario + depositoDouble - retiroDouble;
                    //Convierte a String.
                SubTotal = String.valueOf(datoSubTotal);
                    //Suma el dato anterior que imprimio en tabla y resta, lo mete en variable.
                }else {datoSubTotal = datoAnterior + depositoDouble - retiroDouble;
                    //Convierte a String.
                    SubTotal = String.valueOf(datoSubTotal);
                }
                
                //imprimirlo en la tabla.
                modelo.addRow(new Object[]{formato.format(c.getFecha()),c.getDescripcion(),deposito,retiro,SubTotal});
                //Suma 1 a las vueltas para cambiar la ecuacion en el muestreo del SubTotal.
                vueltas++;
                //Captura el datoSubTotal y lo guarda en datoAnterior.
                datoAnterior = datoSubTotal;
                
                //Suma de depositos.
                sumaDepositos = sumaDepositos + depositoDouble;
                //Convertir de double a String.
                String TotalDepositos = String.valueOf(sumaDepositos);
                //Imprime Total de depositos.
                lblDepositos.setText(TotalDepositos);
                
                //Suma de Retiros.
                sumaRetiros = sumaRetiros + retiroDouble;
                //Convertir de double a String.
                String TotalRetiros = String.valueOf(sumaRetiros);
                //Imprime Total de depositos.
                lblRetiros.setText(TotalRetiros);
                
                lblSaldoFinal.setText(SubTotal);
                lblSaldoFinalResumen.setText(SubTotal);
                
            }
        }catch(Exception e){
            System.err.print("Ocurrio un error: "+e.getMessage());
        }
            
    }//GEN-LAST:event_btnSeleccioneActionPerformed

    private void ficheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ficheroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ficheroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Pasa el dato ingresado a una variable "salario".
        String datoSalario = jtfSalarioInicial.getText();
        salario = Integer.parseInt(datoSalario);
        
        //Imprime la variable "salario" en el Label "LblSaldoInicial".
        LblSaldoInicial.setText(datoSalario);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblSaldoInicial;
    private javax.swing.JButton btnSeleccione;
    private javax.swing.JTextField fichero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfSalarioInicial;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCp;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDepositos;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblRetiros;
    private javax.swing.JLabel lblSaldoFinal;
    private javax.swing.JLabel lblSaldoFinalResumen;
    private javax.swing.JTable tblComentarios;
    // End of variables declaration//GEN-END:variables

}
