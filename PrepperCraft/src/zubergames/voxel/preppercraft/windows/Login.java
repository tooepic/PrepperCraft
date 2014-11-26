package zubergames.voxel.preppercraft.windows;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Login extends KeyAdapter {

    public boolean isRunning;
    public boolean resizable = false;

    JFrame frame = new JFrame();

    public String TITLE;
    public int WIDTH;
    public int HEIGHT;

    public Login(String t, int w, int h) {
        this.TITLE = t;
        this.WIDTH = w;
        this.HEIGHT = h;
    }

    public boolean isCloseRequested() {
        return false;
    }

    JPanel loginPanel = new JPanel();

    public void makeWindow() {
        frame.setTitle(TITLE);
        frame.setSize(WIDTH, HEIGHT);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(resizable);
        frame.setLocationRelativeTo(null);
        frame.add(loginPanel);

        runFrame();
    }

    public void runFrame() {
        frame.setVisible(true);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key) {
                while (true) {
                    if (key.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        System.exit(0);
                    }
                }
            }
        });
    }
}
