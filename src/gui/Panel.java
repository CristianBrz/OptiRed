package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.DefaultMapController;

public class Panel {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi Mapa con JMapViewer 2.10");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);
        
        
        //con marker se puede marcar una parte del mapa, util para cuando marque el usuario
        MapMarkerDot marcador=new MapMarkerDot(40.4167, -3.7033);
        JPanel miPanel = new JPanel();
        miPanel.setLayout(new BorderLayout());

        //aca se crea el mapa, y se configura el controlador para desplazarse por el mapa
        JMapViewer mapa = new JMapViewer();
        DefaultMapController controlador= new DefaultMapController(mapa);
        controlador.isDoubleClickZoomEnabled();
        controlador.setMovementMouseButton(MouseEvent.BUTTON1);
        
        mapa.setDisplayPosition(new Coordinate(40.4167, -3.7033), 10);
        miPanel.add(mapa, BorderLayout.CENTER);
        mapa.addMapMarker(marcador);
        ventana.add(miPanel);
        ventana.setVisible(true);
    }
}


