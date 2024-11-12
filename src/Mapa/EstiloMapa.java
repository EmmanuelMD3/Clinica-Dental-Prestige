
package Mapa;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import javax.swing.event.MouseInputListener;
import java.util.HashSet;
import java.util.Set;
import org.jxmapviewer.viewer.DefaultWaypoint;

/**
 *
 * @author User
 */
public class EstiloMapa extends JXMapViewer {

    private final GeoPosition posicionInicial;

    public EstiloMapa() {

        posicionInicial = new GeoPosition(19.27361770943458, -99.6585139260226);
        setTileFactory(new DefaultTileFactory(new OSMTileFactoryInfo()));
        setAddressLocation(posicionInicial);
        setZoom(5);
        agregarInteractividad();
        agregarMarcador(posicionInicial);
    }

    private void agregarInteractividad() {
        MouseInputListener mouseListener = new PanMouseInputListener(this);
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
        addMouseWheelListener(new ZoomMouseWheelListenerCursor(this));
        addMouseListener(new CenterMapListener(this));
    }

    private void agregarMarcador(GeoPosition posicion) {
        Set<Waypoint> waypoints = new HashSet<>();
        waypoints.add(new DefaultWaypoint(posicion));
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
        waypointPainter.setWaypoints(waypoints);
        CompoundPainter<JXMapViewer> painter = new CompoundPainter<>();
        painter.setPainters(waypointPainter);
        setOverlayPainter(painter);
        
    }

}

