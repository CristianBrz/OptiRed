package gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.Coordinate;

public class Panel {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi Mapa con JMapViewer 2.10");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 600);

        JPanel miPanel = new JPanel();
        miPanel.setLayout(new BorderLayout());

        JMapViewer mapa = new JMapViewer();
        
        mapa.setDisplayPosition(new Coordinate(40.4167, -3.7033), 10);

        miPanel.add(mapa, BorderLayout.CENTER);

        ventana.add(miPanel);
        ventana.setVisible(true);
    }
}


