package gui;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.DefaultMapController;

public class PanelMapa extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMapViewer mapa;

	public PanelMapa() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 719);

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());

		setContentPane(contentPane);

		inicializarMapa();

		setResizable(false);
		setTitle("Mapa");
		setLocationRelativeTo(null);
	}

	private void inicializarMapa() {
		mapa = new JMapViewer();
		DefaultMapController controlador = new DefaultMapController(mapa);
		controlador.setMovementMouseButton(MouseEvent.BUTTON1);
		Coordinate madrid = new Coordinate(40.4167, -3.7033);
		mapa.setDisplayPosition(madrid, 10);
		MapMarkerDot marcador = new MapMarkerDot(madrid);
		mapa.addMapMarker(marcador);
		contentPane.add(mapa, BorderLayout.CENTER);
	}
}