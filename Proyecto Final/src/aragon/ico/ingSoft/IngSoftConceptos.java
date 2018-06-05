/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.ico.ingSoft;

import aragon.ico.contacto.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Animacion.Animacion;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Muffin
 */
public class IngSoftConceptos extends javax.swing.JFrame {

    Timer timerControl;
    TimerTask controlmenu;
    
    /**
     * Creates new form ContactoMarco
     */
    public IngSoftConceptos() {
        initComponents();
        
        // La ventana se centrará en medio de la pantalla
        this.setLocationRelativeTo(null);
        
        // Los menus desplegables iniciaran ocultos
        jPDesplegableDAScrum.setVisible(false);
        jPDesplegableContacto.setVisible(false);
        
        // Logo de ICO
        ImageIcon iconoICO = new ImageIcon(System.getProperty("user.dir") + "/src/aragon/ico/imagenes/inicio/ICO.png");
        Icon logoICO = new ImageIcon(iconoICO.getImage().getScaledInstance(jLLogoICO.getWidth(), jLLogoICO.getHeight(), Image.SCALE_AREA_AVERAGING));
        jLLogoICO.setIcon(logoICO);
        
        // Iniciar el Timer
        controlDesplegable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPBarraMenu = new javax.swing.JPanel();
        jLLogoICO = new javax.swing.JLabel();
        jBIng_Soft = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jBDA_Scrum = new javax.swing.JButton();
        jBContacto = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jPDesplegableDAScrum = new javax.swing.JPanel();
        jBDAgil = new javax.swing.JButton();
        jBScrum = new javax.swing.JButton();
        jPDesplegableContacto = new javax.swing.JPanel();
        jBProduct_Owner = new javax.swing.JButton();
        jBScrum_Master = new javax.swing.JButton();
        jBScrum_Team = new javax.swing.JButton();
        jPInformacionIS = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scrum Master");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPBarraMenu.setBackground(new java.awt.Color(245, 245, 245));

        jBIng_Soft.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jBIng_Soft.setForeground(java.awt.Color.gray);
        jBIng_Soft.setText("Ingeniería de Software");
        jBIng_Soft.setBorder(null);
        jBIng_Soft.setBorderPainted(false);
        jBIng_Soft.setContentAreaFilled(false);
        jBIng_Soft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBIng_Soft.setFocusPainted(false);
        jBIng_Soft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBIng_SoftMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBIng_SoftMouseEntered(evt);
            }
        });
        jBIng_Soft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIng_SoftActionPerformed(evt);
            }
        });

        jBInicio.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jBInicio.setForeground(java.awt.Color.gray);
        jBInicio.setText("Inicio");
        jBInicio.setBorder(null);
        jBInicio.setBorderPainted(false);
        jBInicio.setContentAreaFilled(false);
        jBInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBInicio.setFocusPainted(false);
        jBInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBInicioMouseExited(evt);
            }
        });

        jBDA_Scrum.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jBDA_Scrum.setForeground(java.awt.Color.gray);
        jBDA_Scrum.setText("Desarrollo Ágil y Scrum");
        jBDA_Scrum.setBorder(null);
        jBDA_Scrum.setBorderPainted(false);
        jBDA_Scrum.setContentAreaFilled(false);
        jBDA_Scrum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDA_Scrum.setFocusPainted(false);
        jBDA_Scrum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDA_ScrumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDA_ScrumMouseExited(evt);
            }
        });
        jBDA_Scrum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDA_ScrumActionPerformed(evt);
            }
        });

        jBContacto.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jBContacto.setForeground(java.awt.Color.gray);
        jBContacto.setText("Contacto");
        jBContacto.setBorder(null);
        jBContacto.setBorderPainted(false);
        jBContacto.setContentAreaFilled(false);
        jBContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBContacto.setFocusPainted(false);
        jBContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBContactoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBContactoMouseExited(evt);
            }
        });
        jBContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContactoActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jBSalir.setForeground(java.awt.Color.gray);
        jBSalir.setText("Salir");
        jBSalir.setBorder(null);
        jBSalir.setBorderPainted(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.setFocusPainted(false);
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSalirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSalirMouseEntered(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBarraMenuLayout = new javax.swing.GroupLayout(jPBarraMenu);
        jPBarraMenu.setLayout(jPBarraMenuLayout);
        jPBarraMenuLayout.setHorizontalGroup(
            jPBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraMenuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLLogoICO, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBInicio)
                .addGap(30, 30, 30)
                .addComponent(jBIng_Soft)
                .addGap(30, 30, 30)
                .addComponent(jBDA_Scrum)
                .addGap(30, 30, 30)
                .addComponent(jBContacto)
                .addGap(30, 30, 30)
                .addComponent(jBSalir)
                .addGap(50, 50, 50))
        );
        jPBarraMenuLayout.setVerticalGroup(
            jPBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBInicio)
                    .addComponent(jBIng_Soft)
                    .addComponent(jBDA_Scrum)
                    .addComponent(jBContacto)
                    .addComponent(jBSalir)
                    .addComponent(jLLogoICO, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPBarraMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 90));

        jPDesplegableDAScrum.setBackground(new java.awt.Color(245, 245, 245));

        jBDAgil.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jBDAgil.setForeground(java.awt.Color.gray);
        jBDAgil.setText("Desarrollo Ágil");
        jBDAgil.setBorder(null);
        jBDAgil.setBorderPainted(false);
        jBDAgil.setContentAreaFilled(false);
        jBDAgil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBDAgil.setFocusPainted(false);
        jBDAgil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBDAgil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBDAgil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBDAgilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBDAgilMouseExited(evt);
            }
        });

        jBScrum.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jBScrum.setForeground(java.awt.Color.gray);
        jBScrum.setText("Scrum");
        jBScrum.setBorder(null);
        jBScrum.setBorderPainted(false);
        jBScrum.setContentAreaFilled(false);
        jBScrum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBScrum.setFocusPainted(false);
        jBScrum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBScrum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBScrum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBScrumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBScrumMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPDesplegableDAScrumLayout = new javax.swing.GroupLayout(jPDesplegableDAScrum);
        jPDesplegableDAScrum.setLayout(jPDesplegableDAScrumLayout);
        jPDesplegableDAScrumLayout.setHorizontalGroup(
            jPDesplegableDAScrumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDesplegableDAScrumLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPDesplegableDAScrumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBDAgil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBScrum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPDesplegableDAScrumLayout.setVerticalGroup(
            jPDesplegableDAScrumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDesplegableDAScrumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBDAgil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBScrum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPDesplegableDAScrum, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 240, 70));

        jPDesplegableContacto.setBackground(new java.awt.Color(245, 245, 245));

        jBProduct_Owner.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jBProduct_Owner.setForeground(java.awt.Color.gray);
        jBProduct_Owner.setText("Product Owner");
        jBProduct_Owner.setBorder(null);
        jBProduct_Owner.setBorderPainted(false);
        jBProduct_Owner.setContentAreaFilled(false);
        jBProduct_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBProduct_Owner.setFocusPainted(false);
        jBProduct_Owner.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBProduct_Owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBProduct_OwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBProduct_OwnerMouseExited(evt);
            }
        });

        jBScrum_Master.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jBScrum_Master.setForeground(java.awt.Color.gray);
        jBScrum_Master.setText("Scrum Master");
        jBScrum_Master.setBorder(null);
        jBScrum_Master.setBorderPainted(false);
        jBScrum_Master.setContentAreaFilled(false);
        jBScrum_Master.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBScrum_Master.setFocusPainted(false);
        jBScrum_Master.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBScrum_Master.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBScrum_MasterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBScrum_MasterMouseExited(evt);
            }
        });

        jBScrum_Team.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jBScrum_Team.setForeground(java.awt.Color.gray);
        jBScrum_Team.setText("Scrum Team");
        jBScrum_Team.setBorder(null);
        jBScrum_Team.setBorderPainted(false);
        jBScrum_Team.setContentAreaFilled(false);
        jBScrum_Team.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBScrum_Team.setFocusPainted(false);
        jBScrum_Team.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBScrum_Team.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBScrum_TeamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBScrum_TeamMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPDesplegableContactoLayout = new javax.swing.GroupLayout(jPDesplegableContacto);
        jPDesplegableContacto.setLayout(jPDesplegableContactoLayout);
        jPDesplegableContactoLayout.setHorizontalGroup(
            jPDesplegableContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDesplegableContactoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDesplegableContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBProduct_Owner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBScrum_Master, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBScrum_Team, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPDesplegableContactoLayout.setVerticalGroup(
            jPDesplegableContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDesplegableContactoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jBProduct_Owner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBScrum_Master)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBScrum_Team)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPDesplegableContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 160, 90));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <b> Ingeniería de Software </b></html>");

        jPanel2.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("<html>\n<font size=+2>\n    <font color=#1186C6>\n    <h3>¿Qué es la ingenieria de software?</h3>\n    </font>\n    <p>\n      <ul>\n        <li type=\"square\">La ingeniería de software es el establecimiento y uso de principios robustos de la ingeniería a fin de obtener <br> económicamente software que sea fiable y que funcione eficientemente sobre máquinas reales.\n        </li>\n        <li type=\"square\">Es la aplicación de enfoque sistemático, disciplinado y cuantificable hacia el desarrollo, <br> operación y mantenimiento del software</li>\n        <li type=\"square\">Disciplina que establece el uso de principios de ingeniería robustos, orientados a obtener software económico, <br> que sea confiable y funcione de manera eficiente.</li>\n      </ul>\n    </p>\n\n\n    <h3>Ciclo de vida</h3>\n\n    <br> Método formal para producir algún resultado. Los métodos de la ingeniería del software indican \"cómo\" construir técnicamente el software. <br>\n     Dependen de un conjunto de principios básicos que gobiernan cada área de la tecnología e incluyen de modelado y otras técnicas descriptivas.\n    <ol>\n      <li>Análisis y definición de requerimientos.</li>\n      <li>Diseño del sistema</li>\n      <li>Codificación del sistema (Desarrollo)</li>\n      <li>Pruebas unitarias</li>\n      <li>Pruebas de integración</li>\n      <li>Pruebas del sistema</li>\n      <li>Implementación del sistema</li>\n      <li>Mantenimiento</li>\n      <li>Fin del ciclo de vida (post-mortem)</li>\n    </ol>\n\n    <h3>  Analisis y definicion de requerimientos.</h3>\n    <dfn>Entender el problema y capturar los requerimientos funcionales, entidades y actividades.</dfn>\n    <ul>\n      <li>Busca delimitar los alcances del sistema.</li>\n      <li>Realizada por el analista de sistemas.</li>\n      <li>Punto de partida para determinar el costo del proyecto.</li>\n    </ul>\n\n    <h3>Diseño del sistema</h3>\n    <dfn>Es el proceso <b>creativo</b> de transformacion de un problema a una solución.</dfn>\n    <ul>\n      <li>Determina las tecnologias</li>\n      <li>El diseñador divide el sistema en paquetes (subsistemas)</li>\n      <li>Define la estructura del producto</li>\n    </ul>\n\n\n\n    <h3>Codificacion del sistema</h3>\n    <dfn>En base en el diseño se lleva la programación del sistema.</dfn>\n    <ul>\n      <li>Proceso ejecutado por el programador y de manera individual.</li>\n      <li>Criterio de entrada: Diseño.</li>\n      <li>Criterio de salida: Código ejecutable.</li>\n    </ul>\n\n\n\n    <h3>Pruebas unitarias</h3>\n    <dfn>Se examina el código y se compara con las especificaciones y el diseño.</dfn>\n    <ul>\n      <li>Se llevan a cabo casos de prueba.</li>\n      <li>Un programa es correcto si implementa las funciones y los datos correctamente como está indicado en el diseño.</li>\n    </ul>\n\n\n\n      <h3>Pruebas de integracion</h3>\n      <dfn>Se realizan mediante la incorporación de los módulos.</dfn>\n      <ul>\n        <li>Las pruebas de integración sirven también para determinar qué tan eficiente es el diseño.</li>\n      </ul>\n\n\n\n    <h3>Pruebas del sistema</h3>\n    <dfn>Se verifica que cumpla con las funciones propuestas al inicio.</dfn>\n    <ul>\n      <li>Involucra a veces al cliente para determinar que la solución que se le ofreció es la que se le va a entregar.</li>\n    </ul>\n\n\n\n    <h3>Implementación del sistema</h3>\n    <ul>\n      <li>Instalación</li>\n      <li>Capacitación</li>\n      <li>Plan de implantación</li>\n  </ul>\n\n    <h3>Mantenimiento</h3>\n    <ul>\n      <li>Mantenimiento correctivo</li>\n      <li>Mantenimiento adaptativo</li>\n      <li>Mantenimiento perfectivo</li>\n    </ul>\n\n\n\n    <h3>Post-mortem</h3>\n    <dfn>Cierre del proyecto</dfn>\n    <ul>\n      <li>Se analiza la madurez en el proceso de desarrollo de software.</li>\n      <li>Se establecen áreas de oportunidad.</li>\n      <li>Lecciones aprendidas.</li>\n      <li>Mejora Continua</li>\n    </ul>\n\n\n    <h3>Herramientas para el desarrollo de software</h3>\n    <dfn>Instrumento o sistema automatizado para realizar de manera más exacta, eficiente y productiva una tarea.</dfn> <br>\n    <dd>Se establece un sistema de soporte para el desarrollo del software llamado ingeniería de <br> software asistido por computadora (<b>CASE</b>).</dd>\n    <ul>\n      <li>Lenguajes de programación</li>\n      <li>Paradigmas de programación</li>\n      <li>IDE's</li>\n      <li>SGBD</li>\n      <li>Herramientas de modelado</li>\n      <li>Herramientas de gestion de proyectos</li>\n      <li>Sistemas de control de versiones</li>\n      <li>Sistemas de control de cambios</li>\n      <li>API's para pruebas unitarias</li>\n      <li>Sistemas de integracion</li>\n      <li>Cloud computing</li>\n      <li>Software de ofimática</li>\n      <li>Software de prototipo y maquetado</li>\n      <li>CASE: Computer Aided Software Egnineering</li>\n      <li>Etc...</li>\n    </ul>\n\n\n    <h3>Proceso de desarrollo de software como instrumento rector en la construcción de software de calidad.</h3>\n    <ul>\n      <li>El procedimiento es una receta para lograr el cometido.</li>\n      <li>Establece las actividades principales</li>\n      <li>Cada actividad tiene criterios de entrada y salida</li>\n      <li>Utiliza recursos y está sujeto a una serie de restricciones</li>\n    </ul>\n\n    <h3>Proceso de ingeniería software</h3>\n    <dfn>Es la definición de un conjunto de actividades que permiten transformar los requisitos de  <br>un cliente/usuario en un sistema software.</dfn>\n    <ul>\n      Ejemplos:\n      <li>PSP, Personal Software Proccess.</li>\n      <li>TSP, Team Software Proccess.</li>\n      <li>Rational Unified Proccess</li>\n    </ul>\n\n\n\n    <h3>Centrado en la calidad</h3>\n    <dfn>Cualquier enfoque de ingeniería debe descansar sobre un empeño de organización de calidad.</dfn>\n    <ul>\n      <li>La gestión total de calidad y las filosofías similares fomentan una cultura continua de <br> mejoras de procesos.</li>\n      <li>Esta cultura la que conduce últimamente al desarrollo de enfoques cada vez más robustos para <br> la ingeniería de software.</li>\n      Abarca un conjunto de tres elementos claves:\n      <ul>\n        <li>Fases</li>\n        <li>Herramientas</li>\n        <li>Procesos</li>\n      </ul>\n      <li>Desarrolla estos tres elementos para asegurar la calidad del software</li>\n    </ul>\n    </font>\n</html>\n");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setAutoscrolls(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jScrollPane2.setViewportView(jLabel2);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPInformacionISLayout = new javax.swing.GroupLayout(jPInformacionIS);
        jPInformacionIS.setLayout(jPInformacionISLayout);
        jPInformacionISLayout.setHorizontalGroup(
            jPInformacionISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInformacionISLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
            .addComponent(jLabel1)
            .addComponent(jScrollPane2)
        );
        jPInformacionISLayout.setVerticalGroup(
            jPInformacionISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPInformacionISLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPInformacionIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1190, 610));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIng_SoftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBIng_SoftMouseEntered
        jBIng_Soft.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jBIng_SoftMouseEntered

    private void jBIng_SoftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBIng_SoftMouseExited
        jBIng_Soft.setForeground(Color.GRAY);
    }//GEN-LAST:event_jBIng_SoftMouseExited

    private void jBInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInicioMouseEntered
        jBInicio.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jBInicioMouseEntered

    private void jBInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInicioMouseExited
        jBInicio.setForeground(Color.GRAY);
    }//GEN-LAST:event_jBInicioMouseExited

    private void jBIng_SoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIng_SoftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIng_SoftActionPerformed

    private void jBDA_ScrumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDA_ScrumMouseEntered
        jBDA_Scrum.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jBDA_ScrumMouseEntered

    private void jBDA_ScrumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDA_ScrumMouseExited
        jBDA_Scrum.setForeground(Color.GRAY);
    }//GEN-LAST:event_jBDA_ScrumMouseExited

    private void jBDA_ScrumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDA_ScrumActionPerformed
        int posicion = jPDesplegableDAScrum.getY();
        if (posicion < 90) {
            if (jPDesplegableContacto.isVisible()) {
                jPDesplegableContacto.setVisible(false);
            }
            jPDesplegableDAScrum.setVisible(true);
            Animacion.bajar(20, 90, 1, jPDesplegableDAScrum);
        }
        else{
            Animacion.subir(90, 20, 1, jPDesplegableDAScrum);
            jPDesplegableDAScrum.setVisible(false);
        }
    }//GEN-LAST:event_jBDA_ScrumActionPerformed

    private void jBContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBContactoMouseEntered
        jBContacto.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jBContactoMouseEntered

    private void jBContactoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBContactoMouseExited
        jBContacto.setForeground(Color.GRAY);
    }//GEN-LAST:event_jBContactoMouseExited

    private void jBContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContactoActionPerformed
        int posicion = jPDesplegableContacto.getY();
        if (posicion < 90) {
            if (jPDesplegableDAScrum.isVisible()) {
                jPDesplegableDAScrum.setVisible(false);
            }
            jPDesplegableContacto.setVisible(true);
            Animacion.bajar(0, 90, 1, jPDesplegableContacto);
        }
        else{
            Animacion.subir(90, 0, 1, jPDesplegableContacto);
            jPDesplegableContacto.setVisible(false);
        }
    }//GEN-LAST:event_jBContactoActionPerformed

    private void jBSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseEntered
        jBSalir.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_jBSalirMouseEntered

    private void jBSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseExited
        jBSalir.setForeground(Color.GRAY);
    }//GEN-LAST:event_jBSalirMouseExited

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBDAgilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDAgilMouseEntered
        if (jPDesplegableDAScrum.isVisible()) {
            jBDAgil.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_jBDAgilMouseEntered

    private void jBDAgilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDAgilMouseExited
        if (jPDesplegableDAScrum.isVisible()) {
            jBDAgil.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jBDAgilMouseExited

    private void jBScrumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrumMouseEntered
        if (jPDesplegableDAScrum.isVisible()) {
            jBScrum.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_jBScrumMouseEntered

    private void jBScrumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrumMouseExited
        if (jPDesplegableDAScrum.isVisible()) {
            jBScrum.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jBScrumMouseExited

    private void jBProduct_OwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProduct_OwnerMouseEntered
        if (jPDesplegableContacto.isVisible()) {
            jBProduct_Owner.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_jBProduct_OwnerMouseEntered

    private void jBProduct_OwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBProduct_OwnerMouseExited
        if (jPDesplegableContacto.isVisible()) {
            jBProduct_Owner.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jBProduct_OwnerMouseExited

    private void jBScrum_MasterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrum_MasterMouseEntered
        if (jPDesplegableContacto.isVisible()) {
            jBScrum_Master.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_jBScrum_MasterMouseEntered

    private void jBScrum_MasterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrum_MasterMouseExited
        if (jPDesplegableContacto.isVisible()) {
            jBScrum_Master.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jBScrum_MasterMouseExited

    private void jBScrum_TeamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrum_TeamMouseEntered
        if (jPDesplegableContacto.isVisible()) {
            jBScrum_Team.setForeground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_jBScrum_TeamMouseEntered

    private void jBScrum_TeamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBScrum_TeamMouseExited
        if (jPDesplegableContacto.isVisible()) {
            jBScrum_Team.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jBScrum_TeamMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngSoftConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngSoftConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngSoftConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngSoftConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngSoftConceptos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContacto;
    private javax.swing.JButton jBDA_Scrum;
    private javax.swing.JButton jBDAgil;
    private javax.swing.JButton jBIng_Soft;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBProduct_Owner;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBScrum;
    private javax.swing.JButton jBScrum_Master;
    private javax.swing.JButton jBScrum_Team;
    private javax.swing.JLabel jLLogoICO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBarraMenu;
    private javax.swing.JPanel jPDesplegableContacto;
    private javax.swing.JPanel jPDesplegableDAScrum;
    private javax.swing.JPanel jPInformacionIS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void controlDesplegable(){
        int lapso = 1000;
        
        controlmenu = new TimerTask() {
            @Override
            public void run() {
                if (jPDesplegableDAScrum.isVisible() && jPDesplegableDAScrum.getY() < 90) {
                    jPDesplegableDAScrum.setVisible(false);
                }
                
                if (jPDesplegableContacto.isVisible() && jPDesplegableContacto.getY() < 90) {
                    jPDesplegableContacto.setVisible(false);
                }
            }
        };
        
        timerControl = new Timer();
        timerControl.scheduleAtFixedRate(controlmenu, lapso, 1000);
    }
}
