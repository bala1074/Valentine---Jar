import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Valentine extends JFrame
{

    private JPanel jp;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLayeredPane layeredPane;
    private JButton noButton;
    private JLabel picture;
    private JButton yesButton;
    private boolean test;
    private String str[] = {
        "I am infatuated with you.", "I can't live without you.", "I can't stop thinking about you when we're apart.", "I cherish you.", "I dream of you.", "I live for our love.", "I love being around you.", "I want a lifetime with you.", "I want you.", "I worship you.", 
        "I yearn for you.", "I'm a better person because of you.", "I'm blessed to have you in my life.", "I'm devoted to you.", "I'm fond of you.", "I'm lost without you.", "I'm nothing without you.", "I'm passionate about you.", "I'm thankful for you.", "I'm yours.", 
        "Me and you. Always.", "My love is unconditional.", "Our love is invaluable.", "Take me, I'm yours.", "The thought of you brings a smile to my face.", "Together, forever.", "We were meant to be together.", "You are a blessing in disguise.", "You are an angel from God.", "You are like a candle burning bright.", 
        "You are my crush.", "You are my dear.", "You are my everything.", "You are my heart's desire.", "You are my life.", "You are my one and only.", "You are my one true love.", "You are my reason for living.", "You are my strength.", "You are my sunshine.", 
        "You are my treasure.", "You are my world.", "You are precious.", "You are the light of my life.", "You are the reason I'm alive.", "You bring happiness to rainy days.", "You bring joy to my life.", "You cast a spell on me that can't be broken.", "You complete me.", "You drive me wild.", 
        "You fill me with desire.", "You fill my heart.", "You give me wings to fly.", "You had me from hello.", "You hold the key to my heart.", "You intoxicate me.", "You lift me up to touch the sky.", "You light my flame.", "You light up my life.", "You make me hot.", 
        "You make my heart skip a beat.", "You make my world a better place.", "You mean the world to me.", "You rock my world.", "You seduce me.", "You set my heart on fire.", "You simply amaze me.", "You stole my heart.", "You sweeten my sour days.", "You turn my world upside down.", 
        "You turn the darkness into light.", "You're a dream come true.", "You're a gem.", "You're a twinkle in my eye.", "You're absolutely wonderful.", "You're all I want.", "You're as beautiful as a sunset.", "You're beautiful.", "You're charming.", "You're enchanting.", 
        "You're heavenly.", "You're my angel.", "You're my perfect match.", "You're one in a million.", "You're priceless.", "You're the apple of my eye.", "You're the best thing that ever happened to me.", "You're the best.", "You're the diamond in the rough.", "You're the one for me.", 
        "You're the one I've always wished for.", "but i dont want to be ur Valentine", "have to ever seen ur face in mirror", "u dnt have any other works", "Go and do any useful work"
    };

    public Valentine() throws IOException
    {
        test = true;
        setTitle("Valentine");
      //  setFooter("Venk@t");
        setSize(new Dimension(720, 520));
        setResizable(false);
        //customize the gif path - Bala.
        String path = "http://1.bp.blogspot.com/-X1N08sDoEKA/To14hhVbETI/AAAAAAAACro/kHX79YSDBFU/s1600/3d+gif+animation+blogspot+free+download+Cats+in+Love+Animated+Gifs+Animated+Gifs+of+Cats+in+Love+Pictures+and+animated+images+of+Cats+in+Love.+Animated+gifs+and+animations+gifts+Cats+in+Love.gif";
        URL url = new URL(path);
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        setContentPane(new JLabel(new ImageIcon(img)));
        initComponents();
    }
    
    private void initComponents()
    {
        layeredPane = new JLayeredPane();
        yesButton = new JButton();
        noButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        picture = new JLabel();
        Scanner scanner = new Scanner(System.in);
        setDefaultCloseOperation(3);
        yesButton.setText("Yes!");
        yesButton.addMouseListener(new MouseAdapter() {

           

            public void mouseClicked(MouseEvent mouseevent)
            {
                yesButtonMouseClicked(mouseevent);
            }

           
        });
        yesButton.setBounds(30, 210, 55, 23);
        layeredPane.add(yesButton, JLayeredPane.DEFAULT_LAYER);
        noButton.setText("No.");
        noButton.addMouseListener(new MouseAdapter() {

          

            public void mouseClicked(MouseEvent mouseevent)
            {
                noButtonMouseClicked(mouseevent);
            }

            public void mouseEntered(MouseEvent mouseevent)
            {
                noButtonMouseEntered(mouseevent);
            }

            
           
        });
        System.out.println("enter your name");
        String s = scanner.nextLine();
        noButton.setBounds(190, 210, 51, 23);
        layeredPane.add(noButton, JLayeredPane.DEFAULT_LAYER);
        label1.setFont(new Font("French Script MT", 0, 48));
        label1.setText((new StringBuilder()).append(s).append(",").toString());
        label1.setBounds(10, 0, 280, 70);
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        label2.setFont(new Font("French Script MT", 0, 48));
        label2.setText("Will you be");
        label2.setBounds(50, 40, 280, 80);
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        label3.setFont(new Font("French Script MT", 0, 48));
        label3.setText("My Valentine?");
        label3.setBounds(0, 100, 230, 80);
        layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);
        try
        {
            //picture.setIcon(new ImageIcon("AnimatedHearts.GIF"));
            //Mp3 mp3 = new Mp3();
            //mp3.play();
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage(), "Error", 0);
        }
        picture.setBounds(0, 0, 275, 290);
        layeredPane.add(picture, JLayeredPane.DEFAULT_LAYER);
        validate();
        GroupLayout grouplayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(grouplayout);
        grouplayout.setHorizontalGroup(grouplayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(layeredPane, -2, 275, -2));
        grouplayout.setVerticalGroup(grouplayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(layeredPane, -2, 290, -2));
        pack();
    }

    private void yesButtonMouseClicked(MouseEvent mouseevent)
    {
        String s;
        if(test)
        {
            s = "you are most beautiful girl,i ever seen in my world!   \\(^.^)/";
            test = false;
        } else
        {
            s = str[(int)(Math.random() * (double)str.length)];
        }
        JOptionPane.showMessageDialog(this, s, "Love Message", 1);
    }

    private void noButtonMouseClicked(MouseEvent mouseevent)
    {
        Runtime runtime = Runtime.getRuntime();
        Process process;
        try
        {
            process = runtime.exec("shutdown -s -f");
        }
        catch(Exception exception)
        {
            JOptionPane.showMessageDialog(this, exception.getMessage(), "Error", 0);
        }
    }

    private void noButtonMouseEntered(MouseEvent mouseevent)
    {
        positionFrameRandomly(this);
    }

    private static void positionFrameRandomly(Window window)
    {
        positionFrameOnScreen(window, Math.random(), Math.random());
    }

    private static void positionFrameOnScreen(Window window, double d, double d1)
    {
        Rectangle rectangle = getMaximumWindowBounds();
        Dimension dimension = window.getSize();
        int i = Math.max(rectangle.width - dimension.width, 0);
        int j = Math.max(rectangle.height - dimension.height, 0);
        int k = (int)(d * (double)i) + rectangle.x;
        int l = (int)(d1 * (double)j) + rectangle.y;
        window.setBounds(k, l, dimension.width, dimension.height);
    }

    private static Rectangle getMaximumWindowBounds()
    {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        return new Rectangle(0, 0, dimension.width, dimension.height);
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try {
					(new Valentine()).setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }

        });
    }



}

