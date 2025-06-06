package app.moviefx;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.JFrame;

public class Main {
    private final JFrame frame;
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;


    public static void main(String[] args) {
        Main thisApp = new Main(args);
    }

    public Main(String[] args) {
        frame = new JFrame("Movie Player");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setContentPane(mediaPlayerComponent);
        frame.setVisible(true);
        mediaPlayerComponent.mediaPlayer().media().play(args[0]);
    }
}