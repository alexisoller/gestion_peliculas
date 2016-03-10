package gespelisxml_alexis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

/*
 toogle button al modificar que guarde automatico(llamando al boton de guardar) o necesario darle al boton de guardar

 */
public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
        jtidentificador.setEnabled(false);
        jttitulo.setEnabled(false);
        jtduracion.setEnabled(false);
        jcgenero.setEnabled(false);
        jtasinopsis.setEnabled(false);
        jbanterior.setEnabled(false);
        jbprimero.setEnabled(false);
        jbsiguiente.setEnabled(false);
        jbultimo.setEnabled(false);
        jbborrar.setEnabled(false);
        jtbnuevo.setEnabled(false);
        jbguardar.setEnabled(false);
        jtbmodificar.setEnabled(false);
        jridentificador.setEnabled(false);
        jrtitulo.setEnabled(false);
        jrgenero.setEnabled(false);
        jrduracion.setEnabled(false);
        jbfiltrar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcabrirarchivo = new javax.swing.JFileChooser();
        grupofiltrar = new javax.swing.ButtonGroup();
        jbtitulo = new javax.swing.JLabel();
        jlidentificador = new javax.swing.JLabel();
        jtidentificador = new javax.swing.JTextField();
        jltitulo = new javax.swing.JLabel();
        jttitulo = new javax.swing.JTextField();
        lbduracion = new javax.swing.JLabel();
        jtduracion = new javax.swing.JTextField();
        jlgenero = new javax.swing.JLabel();
        jcgenero = new javax.swing.JComboBox();
        jlsinopsis = new javax.swing.JLabel();
        jbprimero = new javax.swing.JButton();
        jbanterior = new javax.swing.JButton();
        jbsiguiente = new javax.swing.JButton();
        jbultimo = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtasinopsis = new javax.swing.JTextArea();
        jbguardar = new javax.swing.JButton();
        jbabrir = new javax.swing.JButton();
        jtbmodificar = new javax.swing.JToggleButton();
        lbfichero = new javax.swing.JLabel();
        jlfichero = new javax.swing.JLabel();
        jbfiltrar = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jridentificador = new javax.swing.JRadioButton();
        jrduracion = new javax.swing.JRadioButton();
        jrgenero = new javax.swing.JRadioButton();
        jrtitulo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtbnuevo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtitulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jbtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtitulo.setText("GESTION DE PELICULAS - XML");

        jlidentificador.setText("Identificador");

        jltitulo.setText("Título");

        lbduracion.setText("Duración");

        jlgenero.setText("Género");

        jcgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cine de animación", "Cine arte‎", "Cine de autor", "Cine científico y de divulgación científica‎", "Comedia‎", "Documentales‎", "Drama‎", "Drama romántico", "Cine experimental", "Cine fantástico‎", "Film noir‎", "Cine gore‎", "Cine de misterio‎", "Cine mudo‎", "Musicales‎", "Vídeos musicales‎", "Películas de clase B‎", "Cine social‎", "Péplum‎", "Suspense‎", "Cine de terror", "Vampiros en cine y televisión‎", "Ciencia ficcion", " " }));

        jlsinopsis.setText("Sinopsis");

        jbprimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gespelisxml_alexis/imagenes/primero.png"))); // NOI18N
        jbprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprimeroActionPerformed(evt);
            }
        });

        jbanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gespelisxml_alexis/imagenes/atras.png"))); // NOI18N
        jbanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbanteriorActionPerformed(evt);
            }
        });

        jbsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gespelisxml_alexis/imagenes/siguiente.png"))); // NOI18N
        jbsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsiguienteActionPerformed(evt);
            }
        });

        jbultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gespelisxml_alexis/imagenes/ultimo.png"))); // NOI18N
        jbultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbultimoActionPerformed(evt);
            }
        });

        jbborrar.setText("Borrar");
        jbborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbborrarActionPerformed(evt);
            }
        });

        jtasinopsis.setColumns(20);
        jtasinopsis.setLineWrap(true);
        jtasinopsis.setRows(5);
        jtasinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtasinopsis);

        jbguardar.setText("Guardar");
        jbguardar.setFocusable(false);
        jbguardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbguardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbabrir.setText("Abrir");
        jbabrir.setFocusable(false);
        jbabrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbabrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbabrirActionPerformed(evt);
            }
        });

        jtbmodificar.setText("Modificar");
        jtbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbmodificarActionPerformed(evt);
            }
        });

        jlfichero.setText("Fichero :");

        jbfiltrar.setText("Modo filtro");
        jbfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfiltrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        grupofiltrar.add(jridentificador);
        jridentificador.setText("Identificador");
        jridentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jridentificadorActionPerformed(evt);
            }
        });

        grupofiltrar.add(jrduracion);
        jrduracion.setText("Duración");
        jrduracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrduracionActionPerformed(evt);
            }
        });

        grupofiltrar.add(jrgenero);
        jrgenero.setText("Género");
        jrgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrgeneroActionPerformed(evt);
            }
        });

        grupofiltrar.add(jrtitulo);
        jrtitulo.setText("Título");
        jrtitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrtituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Filtros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrgenero)
                    .addComponent(jridentificador)
                    .addComponent(jrtitulo)
                    .addComponent(jrduracion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jridentificador)
                .addGap(6, 6, 6)
                .addComponent(jrtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrduracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrgenero)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jtbnuevo.setText("Nuevo");
        jtbnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlfichero)
                        .addGap(6, 6, 6)
                        .addComponent(lbfichero, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlsinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbborrar)
                                .addGap(18, 18, 18)
                                .addComponent(jtbnuevo)
                                .addGap(17, 17, 17)
                                .addComponent(jbguardar)
                                .addGap(19, 19, 19)
                                .addComponent(jtbmodificar)
                                .addGap(15, 15, 15)
                                .addComponent(jbfiltrar)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jbabrir)
                .addGap(3, 3, 3)
                .addComponent(jbtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlfichero)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbfichero, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jlidentificador)
                        .addGap(24, 24, 24)
                        .addComponent(jltitulo)
                        .addGap(24, 24, 24)
                        .addComponent(lbduracion)
                        .addGap(25, 25, 25)
                        .addComponent(jlgenero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtidentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtduracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jcgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlsinopsis)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtbnuevo)
                        .addComponent(jbborrar))
                    .addComponent(jbguardar)
                    .addComponent(jtbmodificar)
                    .addComponent(jbfiltrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbprimero)
                    .addComponent(jbanterior)
                    .addComponent(jbsiguiente)
                    .addComponent(jbultimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbabrirActionPerformed

        int resp;

        resp = jfcabrirarchivo.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            f = jfcabrirarchivo.getSelectedFile();

            SAXBuilder constructor = new SAXBuilder();
            try {
                doc = constructor.build(f);
            } catch (JDOMException ex) {
                Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            raiz = doc.getRootElement();
            hijos = raiz.getChildren("peli");
            if (hijos.size() != 0) {
                i = 0;
                Element nodo = hijos.get(i);
                film.leer(nodo);
                this.mostrar();
                jtidentificador.setEnabled(false);
                jttitulo.setEnabled(false);
                jtduracion.setEnabled(false);
                jcgenero.setEnabled(false);
                jtasinopsis.setEnabled(false);
                jbanterior.setEnabled(true);
                jbprimero.setEnabled(true);
                jbsiguiente.setEnabled(true);
                jbultimo.setEnabled(true);
                jbborrar.setEnabled(true);
                jtbnuevo.setEnabled(true);
                jbguardar.setEnabled(false);
                jtbmodificar.setEnabled(true);
                jbfiltrar.setEnabled(true);
                jdomBuilder = new SAXBuilder();
                try {
                    jdomDocument = jdomBuilder.build(f);
                } catch (JDOMException ex) {
                    Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                xFactory = XPathFactory.instance();

            } else {
                jtbnuevo.setEnabled(true);
            }
            lbfichero.setText(String.valueOf(f.getAbsolutePath()));
        }
    }//GEN-LAST:event_jbabrirActionPerformed

    private void jbprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprimeroActionPerformed
        if (jbfiltrar.isSelected()) {
            ii = 0;
            mostrarfiltrados(ii);

        } else {
            i = 0;
            Element nodo = hijos.get(i);
            film.leer(nodo);
            this.mostrar();

        }
    }//GEN-LAST:event_jbprimeroActionPerformed

    private void jbanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbanteriorActionPerformed
        if (jbfiltrar.isSelected()) {
            if (ii > 0) {
                ii -= 1;
                mostrarfiltrados(ii);
            }
        } else {
            if (i > 0) {
                i = i - 1;
                Element nodo = hijos.get(i);
                film.leer(nodo);
                this.mostrar();
            }
        }
    }//GEN-LAST:event_jbanteriorActionPerformed

    private void jbsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsiguienteActionPerformed
        if (jbfiltrar.isSelected()) {

            if (ii < (links.size() - 1)) {
                ii += 1;
            }
            mostrarfiltrados(ii);

        } else {

            if (i < (hijos.size() - 1)) {
                i = i + 1;
                Element nodo = hijos.get(i);
                film.leer(nodo);
                this.mostrar();
            }
        }
    }//GEN-LAST:event_jbsiguienteActionPerformed

    private void jbultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbultimoActionPerformed
        if (jbfiltrar.isSelected()) {
            ii = links.size() - 1;
            mostrarfiltrados(ii);

        } else {

            i = hijos.size() - 1;
            Element nodo = hijos.get(i);
            film.leer(nodo);
            this.mostrar();
        }

    }//GEN-LAST:event_jbultimoActionPerformed

    private void jbborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbborrarActionPerformed
        hijos.remove(i);
        XMLOutputter xmlsalida = new XMLOutputter();
        xmlsalida.setFormat(Format.getPrettyFormat());
        try {
            xmlsalida.output(doc, new FileWriter(f));
        } catch (IOException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (i == 0) {
            if (hijos.size() >= 1) {
                Element nodo = hijos.get(i);
                film.leer(nodo);
                this.mostrar();
            } else {
                jtidentificador.setText("");
                jttitulo.setText("");
                jtduracion.setText("");
                jcgenero.setSelectedItem("");
                jtasinopsis.setText("");
            }
        } else {
            Element nodo = hijos.get(i - 1);
            film.leer(nodo);
            this.mostrar();
            i = i - 1;
        }
    }//GEN-LAST:event_jbborrarActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed

        try {
            XMLOutputter xmlsalida = new XMLOutputter();
            xmlsalida.setFormat(Format.getPrettyFormat());
            xmlsalida.output(doc, new FileWriter(f));
            jtidentificador.setEnabled(false);
            jttitulo.setEnabled(false);
            jtduracion.setEnabled(false);
            jcgenero.setEnabled(false);
            jtasinopsis.setEnabled(false);
            jbanterior.setEnabled(true);
            jbprimero.setEnabled(true);
            jbsiguiente.setEnabled(true);
            jbultimo.setEnabled(true);
            jbborrar.setEnabled(true);
            jtbnuevo.setEnabled(true);
            jtbmodificar.setEnabled(true);
            jbguardar.setEnabled(false);
            jbfiltrar.setEnabled(true);
            JOptionPane.showMessageDialog(this, "EL REGISTRO SE HA GUARDADO CORRECTAMENTE", "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/gespelisxml_alexis/imagenes/ok.png"));
        } catch (IOException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbguardarActionPerformed

    private void jtbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbmodificarActionPerformed
        if (jtbmodificar.isSelected()) {
            jtidentificador.setEnabled(true);
            jttitulo.setEnabled(true);
            jtduracion.setEnabled(true);
            jcgenero.setEnabled(true);
            jtasinopsis.setEnabled(true);
            jbanterior.setEnabled(false);
            jbprimero.setEnabled(false);
            jbsiguiente.setEnabled(false);
            jbultimo.setEnabled(false);
            jbborrar.setEnabled(false);
            jtbnuevo.setEnabled(false);
            jbguardar.setEnabled(false);
            jtbmodificar.setEnabled(true);
            jbfiltrar.setEnabled(false);
        } else {
            if (!jtidentificador.getText().equals("") && !jttitulo.getText().equals("") && !jtduracion.getText().equals("") && !jtasinopsis.getText().equals("")) {
                Element nodo = hijos.get(i);
                nodo.getAttribute("id").setValue(jtidentificador.getText());
                nodo.getChild("titulo").setText(jttitulo.getText());
                nodo.getChild("duracion").setText(jtduracion.getText());
                nodo.getChild("genero").setText(String.valueOf(jcgenero.getSelectedItem()));
                nodo.getChild("sinopsis").setText(jtasinopsis.getText());
                jbguardar.setEnabled(true);
                jtbmodificar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "LOS DATOS SON INCORRECTOS", "", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/gespelisxml_alexis/imagenes/nook.png"));
            }

        }
    }//GEN-LAST:event_jtbmodificarActionPerformed

    private void jbfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfiltrarActionPerformed
        if (jbfiltrar.isSelected()) {
            jridentificador.setEnabled(true);
            jrtitulo.setEnabled(true);
            jrgenero.setEnabled(true);
            jrduracion.setEnabled(true);
            jtidentificador.setEnabled(false);
            jttitulo.setEnabled(false);
            jtduracion.setEnabled(false);
            jcgenero.setEnabled(false);
            jtasinopsis.setEnabled(false);
            jbanterior.setEnabled(false);
            jbprimero.setEnabled(false);
            jbsiguiente.setEnabled(false);
            jbultimo.setEnabled(false);
            jbborrar.setEnabled(false);
            jtbnuevo.setEnabled(false);
            jbguardar.setEnabled(false);
            jtbmodificar.setEnabled(false);

        } else {
            jtidentificador.setEnabled(false);
            jttitulo.setEnabled(false);
            jtduracion.setEnabled(false);
            jcgenero.setEnabled(false);
            jtasinopsis.setEnabled(false);
            jbanterior.setEnabled(true);
            jbprimero.setEnabled(true);
            jbsiguiente.setEnabled(true);
            jbultimo.setEnabled(true);
            jbborrar.setEnabled(true);
            jtbnuevo.setEnabled(true);
            jbguardar.setEnabled(false);
            jtbmodificar.setEnabled(true);
            jbfiltrar.setEnabled(true);
            jridentificador.setEnabled(false);
            jrtitulo.setEnabled(false);
            jrgenero.setEnabled(false);
            jrduracion.setEnabled(false);
            jridentificador.setSelected(false);
            jrtitulo.setSelected(false);
            jrgenero.setSelected(false);
            jrduracion.setSelected(false);
            i = 0;
            Element nodo = hijos.get(i);
            film.leer(nodo);
            this.mostrar();

        }
    }//GEN-LAST:event_jbfiltrarActionPerformed

    private void jrtituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrtituloActionPerformed

        ruta = "//peli[titulo='" + jttitulo.getText() + "']/.";
        XPathExpression<Element> expr = xFactory.compile(ruta, Filters.element());
        links = expr.evaluate(jdomDocument);
        ii = 0;
        mostrarfiltrados(ii);
        jbanterior.setEnabled(true);
        jbprimero.setEnabled(true);
        jbsiguiente.setEnabled(true);
        jbultimo.setEnabled(true);

    }//GEN-LAST:event_jrtituloActionPerformed

    private void jridentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jridentificadorActionPerformed
        ruta = "//peli[@id='" + jtidentificador.getText() + "']";
        XPathExpression<Element> expr = xFactory.compile(ruta, Filters.element());
        links = expr.evaluate(jdomDocument);
        ii = 0;
        mostrarfiltrados(ii);
        jbanterior.setEnabled(true);
        jbprimero.setEnabled(true);
        jbsiguiente.setEnabled(true);
        jbultimo.setEnabled(true);


    }//GEN-LAST:event_jridentificadorActionPerformed

    private void jrduracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrduracionActionPerformed
        ruta = "//peli[duracion='" + jtduracion.getText() + "']/.";
        XPathExpression<Element> expr = xFactory.compile(ruta, Filters.element());
        links = expr.evaluate(jdomDocument);
        ii = 0;
        mostrarfiltrados(ii);
        jbanterior.setEnabled(true);
        jbprimero.setEnabled(true);
        jbsiguiente.setEnabled(true);
        jbultimo.setEnabled(true);
    }//GEN-LAST:event_jrduracionActionPerformed

    private void jrgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrgeneroActionPerformed
        ruta = "//peli[genero='" + jcgenero.getSelectedItem() + "']/.";
        XPathExpression<Element> expr = xFactory.compile(ruta, Filters.element());
        links = expr.evaluate(jdomDocument);
        ii = 0;
        mostrarfiltrados(ii);
        jbanterior.setEnabled(true);
        jbprimero.setEnabled(true);
        jbsiguiente.setEnabled(true);
        jbultimo.setEnabled(true);
    }//GEN-LAST:event_jrgeneroActionPerformed

    private void jtbnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnuevoActionPerformed
        if (jtbnuevo.isSelected()) {
            jtidentificador.setText("");
            jttitulo.setText("");
            jtduracion.setText("");
            jcgenero.setSelectedIndex(0);
            jtasinopsis.setText("");
            jtidentificador.setEnabled(true);
            jttitulo.setEnabled(true);
            jtduracion.setEnabled(true);
            jcgenero.setEnabled(true);
            jtasinopsis.setEnabled(true);
            jbanterior.setEnabled(false);
            jbprimero.setEnabled(false);
            jbsiguiente.setEnabled(false);
            jbultimo.setEnabled(false);
            jbborrar.setEnabled(false);
            jtbnuevo.setEnabled(true);
            jbguardar.setEnabled(false);
            jtbmodificar.setEnabled(false);
            jbfiltrar.setEnabled(false);
        } else {
            if (!jtidentificador.getText().equals("") && !jttitulo.getText().equals("") && !jtduracion.getText().equals("") && !jtasinopsis.getText().equals("")) {
                Element peli = new Element("peli");
                peli.setAttribute(new Attribute("id", jtidentificador.getText()));
                peli.addContent(new Element("titulo").setText(jttitulo.getText()));
                peli.addContent(new Element("duracion").setText(jtduracion.getText()));
                peli.addContent(new Element("genero").setText(String.valueOf(jcgenero.getSelectedItem())));
                peli.addContent(new Element("sinopsis").setText(jtasinopsis.getText()));
                raiz.addContent(peli);
                jbguardar.setEnabled(true);
                jtbnuevo.setEnabled(false);
                i = hijos.size() - 1;
            }
        }
    }//GEN-LAST:event_jtbnuevoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    public void mostrar() {

        jtidentificador.setText(String.valueOf(film.getIdentificador()));
        jttitulo.setText(film.getTitulo());
        jtduracion.setText(String.valueOf(film.getDuracion()));
        jcgenero.setSelectedItem(film.getGenero());
        jtasinopsis.setText(film.getSinopsis());
    }

    public void mostrarfiltrados(int ii) {

        jtidentificador.setText(links.get(ii).getAttributeValue("id"));
        jttitulo.setText(links.get(ii).getChildTextTrim("titulo"));
        jtduracion.setText(links.get(ii).getChildTextTrim("duracion"));
        jcgenero.setSelectedItem(links.get(ii).getChildTextTrim("genero"));
        jtasinopsis.setText(links.get(ii).getChildTextTrim("sinopsis"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupofiltrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbabrir;
    private javax.swing.JButton jbanterior;
    private javax.swing.JButton jbborrar;
    private javax.swing.JToggleButton jbfiltrar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbprimero;
    private javax.swing.JButton jbsiguiente;
    private javax.swing.JLabel jbtitulo;
    private javax.swing.JButton jbultimo;
    private javax.swing.JComboBox jcgenero;
    private javax.swing.JFileChooser jfcabrirarchivo;
    private javax.swing.JLabel jlfichero;
    private javax.swing.JLabel jlgenero;
    private javax.swing.JLabel jlidentificador;
    private javax.swing.JLabel jlsinopsis;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JRadioButton jrduracion;
    private javax.swing.JRadioButton jrgenero;
    private javax.swing.JRadioButton jridentificador;
    private javax.swing.JRadioButton jrtitulo;
    private javax.swing.JTextArea jtasinopsis;
    private javax.swing.JToggleButton jtbmodificar;
    private javax.swing.JToggleButton jtbnuevo;
    private javax.swing.JTextField jtduracion;
    private javax.swing.JTextField jtidentificador;
    private javax.swing.JTextField jttitulo;
    private javax.swing.JLabel lbduracion;
    private javax.swing.JLabel lbfichero;
    // End of variables declaration//GEN-END:variables
File f = null;
    int i = 1, ii = 0;
    pelicula film = new pelicula();
    List<Element> hijos = null;
    Document doc = null;
    Element peliculas = new Element("peliculas");
    Element raiz = null;
    List<Element> links = null;
    SAXBuilder jdomBuilder = null;
    Document jdomDocument = null;
    XPathFactory xFactory = null;
    String ruta = null;
}
