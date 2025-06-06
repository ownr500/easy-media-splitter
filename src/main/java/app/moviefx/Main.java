package app.moviefx;
import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
//    private final Main thisApp;
    private final JFrame frame;
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;


    public static void main(String[] args) {
        Main thisApp = new Main();
    }

    public Main() {
        frame = new JFrame("Movie Player");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setContentPane(mediaPlayerComponent);
        frame.setVisible(true);
    }
}