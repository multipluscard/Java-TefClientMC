package View;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.FloatByReference;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.io.FileNotFoundException;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;  
import static javax.print.attribute.Size2DSyntax.MM;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.UIManager.LookAndFeelInfo;


public class formPrincipal extends javax.swing.JFrame {

    public formPrincipal() {
        initComponents();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();     
        txbData.setText(dateFormat.format(date));
        
        //Instanciando um caminho para pegar a Dll e carregar// 
        String myLibraryPath = "../ExeDLLJavaComTela";
        System.setProperty("java.library.path", myLibraryPath);
        System.loadLibrary("TefClientmc");
    }
    
    private String sCNPJClient = "";
    private String sCNPJParceiro = "";
    String sTelefone = "";
    String sControle = "";
    String sTexto = "";
    String sData = "";
    
    double dValor = 0;
    int iCupom = 0;
    int iParcelas = 0;
    int iQtdeItens = 0;
    
    String sItens = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelAtributos = new javax.swing.JPanel();
        lbValor = new javax.swing.JLabel();
        txbValor = new javax.swing.JTextField();
        lbParcela = new javax.swing.JLabel();
        txbParcela = new javax.swing.JTextField();
        lbCnpjCliente = new javax.swing.JLabel();
        txbCnpjCliente = new javax.swing.JTextField();
        lbTexto = new javax.swing.JLabel();
        txbTexto = new javax.swing.JTextField();
        lbCupom = new javax.swing.JLabel();
        lbControle = new javax.swing.JLabel();
        lbCnpjParceiro = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        txbCupom = new javax.swing.JTextField();
        txbControle = new javax.swing.JTextField();
        txbCnpjParceiro = new javax.swing.JTextField();
        txbData = new javax.swing.JTextField();
        txbTelefone = new javax.swing.JTextField();
        TabTipo = new javax.swing.JTabbedPane();
        TabCreditoDebito = new javax.swing.JTabbedPane();
        PanelCredito = new javax.swing.JPanel();
        btnCreditoAVista = new javax.swing.JButton();
        btnCreditoParcelaAdm = new javax.swing.JButton();
        btnCreditoParcelaLoja = new javax.swing.JButton();
        btnCancelarDebitoCredito = new javax.swing.JButton();
        PanelDebito = new javax.swing.JPanel();
        btnVendeDebito = new javax.swing.JButton();
        btnVendeDebitoAVista = new javax.swing.JButton();
        btnCancelarDebito = new javax.swing.JButton();
        TabPix = new javax.swing.JTabbedPane();
        PanelPix = new javax.swing.JPanel();
        btnEnviaPix = new javax.swing.JButton();
        btnCancelarPix = new javax.swing.JButton();
        TabLinkPago = new javax.swing.JTabbedPane();
        PanelLinkPago = new javax.swing.JPanel();
        btnEnviaLinkPago = new javax.swing.JButton();
        btnListaLinkPago = new javax.swing.JButton();
        btnManutencaoLinkPago = new javax.swing.JButton();
        lbCnpjCliente1 = new javax.swing.JLabel();
        txbQtdeItens = new javax.swing.JTextField();
        lbTexto1 = new javax.swing.JLabel();
        txbItens = new javax.swing.JTextField();
        TabClient = new javax.swing.JTabbedPane();
        PanelClient = new javax.swing.JPanel();
        btnAdm = new javax.swing.JButton();
        btnReimpressao = new javax.swing.JButton();
        btnAtv = new javax.swing.JButton();
        btnReimpressaoDireta = new javax.swing.JButton();
        btnSolicitarCPF = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        TabParceleMais = new javax.swing.JTabbedPane();
        PanelParceleMais = new javax.swing.JPanel();
        btnParceleMais = new javax.swing.JButton();

        setTitle("Exemplo TefClientMC - Java");
        setMinimumSize(new java.awt.Dimension(482, 553));

        PanelPrincipal.setMaximumSize(new java.awt.Dimension(482, 553));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(482, 553));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(482, 553));

        PanelAtributos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelAtributos.setAlignmentX(8.0F);
        PanelAtributos.setAlignmentY(6.0F);
        PanelAtributos.setMaximumSize(new java.awt.Dimension(452, 176));
        PanelAtributos.setMinimumSize(new java.awt.Dimension(452, 176));
        PanelAtributos.setName("panelParametros"); // NOI18N
        PanelAtributos.setPreferredSize(new java.awt.Dimension(452, 176));
        PanelAtributos.setRequestFocusEnabled(false);

        lbValor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbValor.setText("VALOR");
        lbValor.setName("lbValor"); // NOI18N

        txbValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbValor.setName("txbValor"); // NOI18N
        txbValor.setPreferredSize(new java.awt.Dimension(100, 20));

        lbParcela.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbParcela.setText("PARCELA");
        lbParcela.setName("lbParcela"); // NOI18N

        txbParcela.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbParcela.setName("txbParcela"); // NOI18N
        txbParcela.setPreferredSize(new java.awt.Dimension(100, 20));

        lbCnpjCliente.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbCnpjCliente.setText("CNPJ");
        lbCnpjCliente.setName("lbCnpj"); // NOI18N

        txbCnpjCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbCnpjCliente.setName("txbCnpj"); // NOI18N

        lbTexto.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbTexto.setText("TEXTO");
        lbTexto.setName("lbTexto"); // NOI18N

        txbTexto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbTexto.setName("txbTexto"); // NOI18N
        txbTexto.setPreferredSize(new java.awt.Dimension(71, 20));

        lbCupom.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbCupom.setText("CUPOM");
        lbCupom.setName("lbCupom"); // NOI18N

        lbControle.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbControle.setText("CONTROLE");
        lbControle.setName("lbControle"); // NOI18N

        lbCnpjParceiro.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbCnpjParceiro.setText("CNPJ PARCEIRO");
        lbCnpjParceiro.setName("lbCnpjParceiro"); // NOI18N

        lbData.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbData.setText("DATA");
        lbData.setToolTipText("");
        lbData.setName("lbData"); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbTelefone.setText("TELEFONE");
        lbTelefone.setName("lbTelefone"); // NOI18N

        txbCupom.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbCupom.setName("txbCupom"); // NOI18N
        txbCupom.setPreferredSize(new java.awt.Dimension(100, 20));

        txbControle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbControle.setName("txbControle"); // NOI18N
        txbControle.setPreferredSize(new java.awt.Dimension(100, 20));

        txbCnpjParceiro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbCnpjParceiro.setName("txbCnpjParceiro"); // NOI18N
        txbCnpjParceiro.setPreferredSize(new java.awt.Dimension(100, 20));

        txbData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbData.setName("txbData"); // NOI18N
        txbData.setPreferredSize(new java.awt.Dimension(100, 20));

        txbTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbTelefone.setName("txbTelefone"); // NOI18N
        txbTelefone.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbParcela)
                            .addComponent(lbValor)
                            .addComponent(lbCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbValor, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txbParcela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txbCnpjCliente))
                        .addGap(34, 34, 34)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txbControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txbCnpjParceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txbCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbCnpjParceiro)
                            .addComponent(lbControle)
                            .addComponent(lbCupom))
                        .addGap(34, 34, 34)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbData)
                                .addComponent(lbTelefone)
                                .addComponent(txbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txbData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbTexto)
                    .addComponent(txbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelAtributosLayout.setVerticalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValor)
                            .addComponent(lbData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txbValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCnpjCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addComponent(lbCupom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCnpjParceiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txbCnpjParceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lbValor.getAccessibleContext().setAccessibleName("labelValor");
        txbValor.getAccessibleContext().setAccessibleName("txbValor");
        txbValor.getAccessibleContext().setAccessibleParent(txbValor);

        TabTipo.setToolTipText(" ");
        TabTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TabCreditoDebito.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        TabCreditoDebito.setPreferredSize(new java.awt.Dimension(470, 300));

        btnCreditoAVista.setText("CREDITO A VISTA");
        btnCreditoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEventoCreditoAVista(evt);
            }
        });

        btnCreditoParcelaAdm.setText("CREDITO PARCELAMENTO ADM");
        btnCreditoParcelaAdm.setActionCommand("");
        btnCreditoParcelaAdm.setMaximumSize(new java.awt.Dimension(121, 23));
        btnCreditoParcelaAdm.setMinimumSize(new java.awt.Dimension(121, 23));
        btnCreditoParcelaAdm.setPreferredSize(new java.awt.Dimension(121, 23));
        btnCreditoParcelaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEventoCreditoParcelamentoADM(evt);
            }
        });

        btnCreditoParcelaLoja.setText("CREDITO PARCELAMENTO LOJA");
        btnCreditoParcelaLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEventoCreditoParcelaLoja(evt);
            }
        });

        btnCancelarDebitoCredito.setBackground(java.awt.Color.pink);
        btnCancelarDebitoCredito.setText("CANCELAR");
        btnCancelarDebitoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDebitoCreditoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCreditoLayout = new javax.swing.GroupLayout(PanelCredito);
        PanelCredito.setLayout(PanelCreditoLayout);
        PanelCreditoLayout.setHorizontalGroup(
            PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreditoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarDebitoCredito)
                    .addGroup(PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCreditoParcelaAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreditoParcelaLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreditoAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        PanelCreditoLayout.setVerticalGroup(
            PanelCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCreditoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCreditoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditoParcelaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreditoParcelaLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarDebitoCredito)
                .addGap(21, 21, 21))
        );

        btnCreditoAVista.getAccessibleContext().setAccessibleName("");

        TabCreditoDebito.addTab("CREDITO", PanelCredito);

        btnVendeDebito.setText("VENDE DEBITO");
        btnVendeDebito.setMaximumSize(new java.awt.Dimension(121, 23));
        btnVendeDebito.setMinimumSize(new java.awt.Dimension(121, 23));
        btnVendeDebito.setPreferredSize(new java.awt.Dimension(121, 23));
        btnVendeDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendeDebitoActionPerformed(evt);
            }
        });

        btnVendeDebitoAVista.setText("VENDE DEBITO A VISTA");
        btnVendeDebitoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendeDebitoAVistaActionPerformed(evt);
            }
        });

        btnCancelarDebito.setBackground(java.awt.Color.pink);
        btnCancelarDebito.setText("CANCELAR");
        btnCancelarDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDebitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDebitoLayout = new javax.swing.GroupLayout(PanelDebito);
        PanelDebito.setLayout(PanelDebitoLayout);
        PanelDebitoLayout.setHorizontalGroup(
            PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDebitoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarDebito)
                    .addGroup(PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnVendeDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVendeDebitoAVista, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        PanelDebitoLayout.setVerticalGroup(
            PanelDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDebitoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnVendeDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVendeDebitoAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnCancelarDebito)
                .addGap(21, 21, 21))
        );

        TabCreditoDebito.addTab("DEBITO", PanelDebito);

        TabTipo.addTab("CARTÃO\n", TabCreditoDebito);
        TabCreditoDebito.getAccessibleContext().setAccessibleName("");

        TabPix.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N

        btnEnviaPix.setText("ENVIA");
        btnEnviaPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaPixActionPerformed(evt);
            }
        });

        btnCancelarPix.setBackground(java.awt.Color.pink);
        btnCancelarPix.setText("CANCELAR");
        btnCancelarPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPixLayout = new javax.swing.GroupLayout(PanelPix);
        PanelPix.setLayout(PanelPixLayout);
        PanelPixLayout.setHorizontalGroup(
            PanelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPixLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarPix)
                    .addComponent(btnEnviaPix, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        PanelPixLayout.setVerticalGroup(
            PanelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPixLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEnviaPix, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnCancelarPix)
                .addGap(21, 21, 21))
        );

        TabPix.addTab("PIX", PanelPix);

        TabTipo.addTab("QRMULTIPLUS", TabPix);
        TabPix.getAccessibleContext().setAccessibleName("");

        TabLinkPago.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N

        btnEnviaLinkPago.setText("ENVIAR");
        btnEnviaLinkPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaLinkPagoActionPerformed(evt);
            }
        });

        btnListaLinkPago.setText("LISTAR LINKS");
        btnListaLinkPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaLinkPagoActionPerformed(evt);
            }
        });

        btnManutencaoLinkPago.setText("MANUTENÇÃO");
        btnManutencaoLinkPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManutencaoLinkPagoActionPerformed(evt);
            }
        });

        lbCnpjCliente1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbCnpjCliente1.setText("QTDE ITENS");
        lbCnpjCliente1.setName("lbCnpj"); // NOI18N

        txbQtdeItens.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbQtdeItens.setText("0");
        txbQtdeItens.setName("txbCnpj"); // NOI18N

        lbTexto1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lbTexto1.setText("ITENS");
        lbTexto1.setName("lbTexto"); // NOI18N

        txbItens.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txbItens.setName("txbTexto"); // NOI18N
        txbItens.setPreferredSize(new java.awt.Dimension(71, 20));

        javax.swing.GroupLayout PanelLinkPagoLayout = new javax.swing.GroupLayout(PanelLinkPago);
        PanelLinkPago.setLayout(PanelLinkPagoLayout);
        PanelLinkPagoLayout.setHorizontalGroup(
            PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLinkPagoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLinkPagoLayout.createSequentialGroup()
                        .addComponent(btnEnviaLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnManutencaoLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLinkPagoLayout.createSequentialGroup()
                        .addGroup(PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbItens, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListaLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txbQtdeItens, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCnpjCliente1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                            .addComponent(lbTexto1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLinkPagoLayout.setVerticalGroup(
            PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLinkPagoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelLinkPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviaLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManutencaoLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaLinkPago, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCnpjCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txbQtdeItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        TabLinkPago.addTab("LINKPAGO", PanelLinkPago);

        TabTipo.addTab("LINKPAGO", TabLinkPago);

        TabClient.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N

        btnAdm.setText("ADM");
        btnAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmActionPerformed(evt);
            }
        });

        btnReimpressao.setText("REIMPRESSAO");
        btnReimpressao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimpressaoActionPerformed(evt);
            }
        });

        btnAtv.setText("ATV");
        btnAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtvActionPerformed(evt);
            }
        });

        btnReimpressaoDireta.setText("REIMPRESSAO DIRETA");
        btnReimpressaoDireta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReimpressaoDiretaActionPerformed(evt);
            }
        });

        btnSolicitarCPF.setText("SOLICITAR CPF");
        btnSolicitarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarCPFActionPerformed(evt);
            }
        });

        btnRelatorio.setText("RELATORIO");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientLayout = new javax.swing.GroupLayout(PanelClient);
        PanelClient.setLayout(PanelClientLayout);
        PanelClientLayout.setHorizontalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSolicitarCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(btnAtv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReimpressao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReimpressaoDireta, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        PanelClientLayout.setVerticalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReimpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtv, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnReimpressaoDireta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSolicitarCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        TabClient.addTab("CLIENT", PanelClient);

        TabTipo.addTab("CLIENT", TabClient);
        TabClient.getAccessibleContext().setAccessibleName("CLIENT");

        TabParceleMais.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N

        btnParceleMais.setText("PARCELE MAIS");
        btnParceleMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParceleMaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelParceleMaisLayout = new javax.swing.GroupLayout(PanelParceleMais);
        PanelParceleMais.setLayout(PanelParceleMaisLayout);
        PanelParceleMaisLayout.setHorizontalGroup(
            PanelParceleMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParceleMaisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnParceleMais, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        PanelParceleMaisLayout.setVerticalGroup(
            PanelParceleMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelParceleMaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnParceleMais, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        TabParceleMais.addTab("PARCELE MAIS", PanelParceleMais);

        TabTipo.addTab("PARCELE MAIS", TabParceleMais);
        TabParceleMais.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TabTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelAtributos.getAccessibleContext().setAccessibleName("");
        TabTipo.getAccessibleContext().setAccessibleName("");
        TabTipo.getAccessibleContext().setAccessibleParent(TabTipo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        PanelPrincipal.getAccessibleContext().setAccessibleName("");
        PanelPrincipal.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    public interface DLLInterface extends Library
    {
        DLLInterface INSTANCE = (DLLInterface) Native.loadLibrary("TefClientmc", DLLInterface.class);
        
        String Confirmar(String sCNPJCliente, String sCNPJParceiro, int iNumeroCupom);
        String Cancelar(String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, String sControle, int iLeitor);
        String Desfazimento(String sCNPJCliente, String sCNPJParceiro, int iNumeroCupom);
        String VendeCreditoVista(String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, int iLeitor);        
        String VendeCreditoParcLoja(String sCNPJCliente, String sCNPJParceiro, int iParcelas, double dValor, int iNumeroCupom, int iLeitor);
        String VendeCreditoParcAdm(String sCNPJCliente, String sCNPJParceiro, int iParcelas, double dValor, int iNumeroCupom, int iLeitor);
        String VendeDebito(String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, int iLeitor);
        String VendeDebitoAVista(String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, int iLeitor);
        String VendeCarteiraDigitalPix (String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, int iLeitor);
        String LinkPagamento(String sCNPJCliente, String sCNPJParceiro,int iParcelas, double dValor, int iNumeroCupom, int iQtdeItens, String sItens, String sTelefone, String sTexto ,int iLeitor);
        String ListarLinkPagamentoPago(String sCNPJCliente, String sCNPJParceiro, double dValor, int iNumeroCupom, int iLeitor);
        String ManutencaoLinkPagamento(String sCNPJCliente, String sCNPJParceiro, int iLeitor);
        String Adm(String sCNPJCliente, String sCNPJParceiro, double dValor, int iCupom, int iLeitor);
        String Atv(String sCNPJCliente, String sCNPJParceiro, int iNumeroCupom, int iLeitor);
        String Relatorio(String sCNPJCliente, String sCNPJParceiro, int iNumeroCupom, int iLeitor);
        String SolicitarCPF(String sCNPJCliente, String sCNPJParceiro, int iNumeroCupom);
        String Reimpressao(String sCNPJCliente, String sCNPJParceiro, double dValor, int iCupom, int iLeitor);
        String ReimpressaoDireto(String sCNPJCliente, String sCNPJParceiro, String sControle, String sData, int iCupom, int iLeitor);
        String ParceleMais(String sCNPJCliente, String sCNPJParceiro, double dValor, int iCupom, int iLeitor);

        int IniciaFuncaoMCInterativo(int iComando, String sCnpjCliente, int iParcela, String sCupom, String sValor,
                String sNsu, String sData, String sNumeroPDV, String sCodigoLoja, int sTipoComunicacao, String sParametro);
    }
    private void ButtonEventoCreditoAVista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEventoCreditoAVista
        Transacionar(enTipo.CREDITO_A_VISTA);        
    }//GEN-LAST:event_ButtonEventoCreditoAVista

    private void ButtonEventoCreditoParcelamentoADM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEventoCreditoParcelamentoADM
        Transacionar(enTipo.CREDITO_PARC_ADM);
    }//GEN-LAST:event_ButtonEventoCreditoParcelamentoADM

    private void ButtonEventoCreditoParcelaLoja(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEventoCreditoParcelaLoja
       Transacionar(enTipo.CREDITO_PARC_LOJA);
    }//GEN-LAST:event_ButtonEventoCreditoParcelaLoja

    private void btnVendeDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendeDebitoActionPerformed
       Transacionar(enTipo.DEBITO);
    }//GEN-LAST:event_btnVendeDebitoActionPerformed

    private void btnVendeDebitoAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendeDebitoAVistaActionPerformed
        Transacionar(enTipo.DEBITO_A_VISTA);
    }//GEN-LAST:event_btnVendeDebitoAVistaActionPerformed

    private void btnEnviaLinkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaLinkPagoActionPerformed
       Transacionar(enTipo.LINK_PAGO);
    }//GEN-LAST:event_btnEnviaLinkPagoActionPerformed

    private void btnListaLinkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaLinkPagoActionPerformed
        Transacionar(enTipo.LISTAR_LINK_PAGO);
    }//GEN-LAST:event_btnListaLinkPagoActionPerformed

    private void btnCancelarDebitoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDebitoCreditoActionPerformed
        Transacionar(enTipo.CANCELAR);
    }//GEN-LAST:event_btnCancelarDebitoCreditoActionPerformed

    private void btnCancelarDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDebitoActionPerformed
        Transacionar(enTipo.CANCELAR);
    }//GEN-LAST:event_btnCancelarDebitoActionPerformed

    private void btnEnviaPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaPixActionPerformed
        Transacionar(enTipo.VENDE_CARTEIRA_DIGITAL_PIX);
    }//GEN-LAST:event_btnEnviaPixActionPerformed

    private void btnCancelarPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPixActionPerformed
        Transacionar(enTipo.CANCELAR);
    }//GEN-LAST:event_btnCancelarPixActionPerformed

    private void btnAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmActionPerformed
       Transacionar(enTipo.ADM);
    }//GEN-LAST:event_btnAdmActionPerformed

    private void btnAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtvActionPerformed
        Transacionar(enTipo.ATV);
    }//GEN-LAST:event_btnAtvActionPerformed

    private void btnSolicitarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarCPFActionPerformed
        Transacionar(enTipo.SOLICITAR_CPF);
    }//GEN-LAST:event_btnSolicitarCPFActionPerformed

    private void btnReimpressaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimpressaoActionPerformed
        Transacionar(enTipo.REIMPRESSAO);
    }//GEN-LAST:event_btnReimpressaoActionPerformed

    private void btnReimpressaoDiretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReimpressaoDiretaActionPerformed
        Transacionar(enTipo.REIMPRESSAO_DIRETA);
    }//GEN-LAST:event_btnReimpressaoDiretaActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
         Transacionar(enTipo.RELATORIO);
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnParceleMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParceleMaisActionPerformed
         Transacionar(enTipo.PARCELE_MAIS);
    }//GEN-LAST:event_btnParceleMaisActionPerformed

    private void btnManutencaoLinkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManutencaoLinkPagoActionPerformed
        Transacionar(enTipo.MANUTENCAO_LINK_PAGO);
    }//GEN-LAST:event_btnManutencaoLinkPagoActionPerformed
    
    public void Transacionar (enTipo eTipo)
    {                     
        String sRetorno = "";
        String[] vLinhas;
        String[] vTipos;
        
        String sRetornoTransacao = "";
        String sMensagemTransacao = "";
        String sComprovanteTransacao = "";

        sCNPJClient = txbCnpjCliente.getText();
        sCNPJParceiro = txbCnpjParceiro.getText();
        sControle = txbControle.getText();
        sTexto = txbTexto.getText();
        sTelefone = txbTelefone.getText();
        sData = txbData.getText();
        
        sItens = txbQtdeItens.getText();
        
        if(txbValor.getText().isEmpty()|| txbCupom.getText().isEmpty() || txbParcela.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
            return;
        }
                
        dValor = Double.parseDouble(txbValor.getText().replace(',', '.'));
        iCupom = Integer.parseInt(txbCupom.getText());
        iParcelas = Integer.parseInt(txbParcela.getText());
        
        iQtdeItens = Integer.parseInt(txbQtdeItens.getText());
               
        switch(eTipo.toString())
        {
            case "CREDITO_A_VISTA":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeCreditoVista(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break;
            case "CREDITO_PARC_LOJA":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || iParcelas == 0 ||dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeCreditoParcLoja(sCNPJClient, sCNPJParceiro, iParcelas, dValor, iCupom, 0);
                break;
            case "CREDITO_PARC_ADM":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeCreditoVista(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break;   
            case "DEBITO":
                 if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeDebito(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break; 
            case "DEBITO_A_VISTA":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeDebitoAVista(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break; 
            case "VENDE_CARTEIRA_DIGITAL_PIX":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty() || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.VendeCarteiraDigitalPix(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break; 
            case "LINK_PAGO":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| sTelefone.isEmpty() || sTexto.isEmpty() || iParcelas == 0 || dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.LinkPagamento(sCNPJClient, sCNPJParceiro, iParcelas, dValor, iCupom, iQtdeItens, sItens, sTelefone, sTexto, 0);
                break; 
            case "LISTAR_LINK_PAGO":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()||dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.ListarLinkPagamentoPago(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break;
            case "MANUTENCAO_LINK_PAGO":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()||dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.ManutencaoLinkPagamento(sCNPJClient, sCNPJParceiro, 0);
                break;
            case "ADM":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()||dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.Adm(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break;
            case "ATV":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.Atv(sCNPJClient, sCNPJParceiro, iCupom, 0);
                break;
            case "SOLICITAR_CPF":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.SolicitarCPF(sCNPJClient, sCNPJParceiro, iCupom);
                break;
            case "REIMPRESSAO":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()||dValor == 0|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.Reimpressao(sCNPJClient, sCNPJParceiro, dValor, iCupom, 0);
                break;
            case "REIMPRESSAO_DIRETA":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| dValor == 0|| iCupom == 0 || sControle.isEmpty() || sData.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.ReimpressaoDireto(sCNPJClient, sCNPJParceiro, sControle, sData, iCupom, 0);
                break; 
            case "RELATORIO":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.Relatorio(sCNPJClient, sCNPJParceiro,iCupom, 0);
                break;
            case "PARCELE_MAIS":
                if(sCNPJClient.isEmpty()|| sCNPJParceiro.isEmpty()|| iCupom == 0)
                {
                    JOptionPane.showMessageDialog(null, "Verifique os campos","WARNING",WARNING_MESSAGE);            
                    return;
                }
                sRetorno = DLLInterface.INSTANCE.Relatorio(sCNPJClient, sCNPJParceiro,iCupom, 0);
                break; 
            case "CANCELAR":
                sControle = javax.swing.JOptionPane.showInputDialog("Informe o CONTROLE TEF");
                if(sControle.equals(""))
                    return;                
                sRetorno = DLLInterface.INSTANCE.Cancelar(sCNPJClient, sCNPJParceiro, dValor, iCupom, sControle, 0);
                break;
        }
        // LINK_PAGO,
        //LISTAR_LINK_PAGO
        if(sRetorno.equals(""))
            return;
         JOptionPane.showMessageDialog(null, sRetorno);
        
        sRetorno = sRetorno.replace(System.lineSeparator(), "¬");
        vLinhas = sRetorno.split("¬");
        for(String sLinha : vLinhas)
        {
            vTipos = sLinha.split(";");
            if(vTipos[0].equals("S"))
            {
                sRetornoTransacao = vTipos[1];
                sMensagemTransacao = vTipos[2];
                
                if(sRetornoTransacao.equals("0"))
                {
                    JOptionPane.showMessageDialog(null, sRetornoTransacao);
                    return;
                }
            }
            else if(vTipos[0].equals("I"))
            {
                sComprovanteTransacao = sComprovanteTransacao + vTipos[1] + System.lineSeparator();
            }
        }
        
        JOptionPane.showMessageDialog(null, (sMensagemTransacao + System.lineSeparator() + sComprovanteTransacao));
        sRetorno = DLLInterface.INSTANCE.Confirmar(sCNPJClient, sCNPJParceiro, iCupom);
    }
   
    
    
    public static void main (String[] args)
    {
        try {
            
            formPrincipal field = new formPrincipal();
            field.setVisible(true);
            field.setLocationRelativeTo(null);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public enum enTipo 
    {
        CREDITO,
        CREDITO_A_VISTA,
        CREDITO_PARC_LOJA,
        CREDITO_PARC_ADM,
        DEBITO,
        DEBITO_A_VISTA,
        CONFIRMAR,
        ADM,
        ATV,
        RELATORIO,
        SOLICITAR_CPF,
        REIMPRESSAO,
        REIMPRESSAO_DIRETA,
        CANCELAR,
        VENDE_CARTEIRA_DIGITAL_PIX,
        LINK_PAGO,
        LISTAR_LINK_PAGO,
        PARCELE_MAIS,
        MANUTENCAO_LINK_PAGO
    } 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JPanel PanelClient;
    private javax.swing.JPanel PanelCredito;
    private javax.swing.JPanel PanelDebito;
    private javax.swing.JPanel PanelLinkPago;
    private javax.swing.JPanel PanelParceleMais;
    private javax.swing.JPanel PanelPix;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JTabbedPane TabClient;
    private javax.swing.JTabbedPane TabCreditoDebito;
    private javax.swing.JTabbedPane TabLinkPago;
    private javax.swing.JTabbedPane TabParceleMais;
    private javax.swing.JTabbedPane TabPix;
    private javax.swing.JTabbedPane TabTipo;
    private javax.swing.JButton btnAdm;
    private javax.swing.JButton btnAtv;
    private javax.swing.JButton btnCancelarDebito;
    private javax.swing.JButton btnCancelarDebitoCredito;
    private javax.swing.JButton btnCancelarPix;
    private javax.swing.JButton btnCreditoAVista;
    private javax.swing.JButton btnCreditoParcelaAdm;
    private javax.swing.JButton btnCreditoParcelaLoja;
    private javax.swing.JButton btnEnviaLinkPago;
    private javax.swing.JButton btnEnviaPix;
    private javax.swing.JButton btnListaLinkPago;
    private javax.swing.JButton btnManutencaoLinkPago;
    private javax.swing.JButton btnParceleMais;
    private javax.swing.JButton btnReimpressao;
    private javax.swing.JButton btnReimpressaoDireta;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSolicitarCPF;
    private javax.swing.JButton btnVendeDebito;
    private javax.swing.JButton btnVendeDebitoAVista;
    private javax.swing.JLabel lbCnpjCliente;
    private javax.swing.JLabel lbCnpjCliente1;
    private javax.swing.JLabel lbCnpjParceiro;
    private javax.swing.JLabel lbControle;
    private javax.swing.JLabel lbCupom;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbParcela;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField txbCnpjCliente;
    private javax.swing.JTextField txbCnpjParceiro;
    private javax.swing.JTextField txbControle;
    private javax.swing.JTextField txbCupom;
    private javax.swing.JTextField txbData;
    private javax.swing.JTextField txbItens;
    private javax.swing.JTextField txbParcela;
    private javax.swing.JTextField txbQtdeItens;
    private javax.swing.JTextField txbTelefone;
    private javax.swing.JTextField txbTexto;
    private javax.swing.JTextField txbValor;
    // End of variables declaration//GEN-END:variables
}
