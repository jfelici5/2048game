import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener, Runnable{

    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static int WIDTH = 400;
    public static int HEIGHT = 630;
    private Thread game;
    private boolean running;
    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    private boolean set;


    public Game(){
        setFocusable(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        addKeyListener(this);
    }

    private void update(){

    }

    private void render(){
        Graphics2D graphics = (Graphics2D) image.getGraphics();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    

}
