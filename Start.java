import javax.swing.JFrame;

public class Start{

    public static void main(String[] args){

        Game game = new Game();

        JFrame 2048 = new JFrame("Project1 - 2048");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(game);
        window.pack(); //centers the game in the window
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        game.start();
    }
}