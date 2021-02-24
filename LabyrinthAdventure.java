import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LabyrinthAdventure
{
  public LabyrinthAdventure()
  {
    new MainWindow();
  }
    public class MainWindow extends JFrame
    {
      public int loc;
      JPanel panel5;
      JLabel sT;
      public MainWindow()
      {
        loc = 1;
      panel5 = new JPanel();
      sT = new JLabel("<html>You find yourself in a dark cave. <P>The only path you see is to the South.");
      setTitle("Labyrinth Adventure");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1000, 1000);
      setLayout(new BorderLayout());
      panel5.add(sT);
      panel5.setPreferredSize(new Dimension(400, 180));
      add(new NorthButton(), BorderLayout.NORTH);
      add(new EastButton(), BorderLayout.EAST);
      add(new SouthButton(), BorderLayout.SOUTH);
      add(new WestButton(), BorderLayout.WEST);
      add(panel5, BorderLayout.CENTER);
      pack();
      setVisible(true);
      }
      public void updateST()
      { 
        if (loc == 1)
          sT.setText("<html>You find yourself in a dark cave. <P><P>The only path you see is to the South.");
        if (loc == 2)
          sT.setText("<html>A small ray of light shines down from a <P>small hole high above you. <P>Your spirits are lifted, for the moment. <P><P>There are two ways to go from here: <P>to the East, and to the South.");
        if (loc == 3)
          sT.setText("<html>You see a small, glinting object off in the East. <P> Perhaps it is treasure. <P>Perhaps it is Death. <P><P>There are three ways to go from here: <P>to the East, to the South, and to the West.");
        if (loc == 4)
          sT.setText("<html>The small, glinting object is nothing more than a <P>coin made of solid unobtanium...you know, <P>that expensive stuff from Avatar. <P>Too bad I don't know how to code a 'Pick that shit up' button.<P><P>The only path you see is to the West.");
        if (loc == 5)
          sT.setText("<html>What's that?  <P>A sign on the wall says 'Turn back now, <P>the spirits of this deep place do not allow intruders.' <P><P>There are three ways to go from here: <P>to the North, to the East, and to the South.");
        if (loc == 6)
          sT.setText("<html>You smell something terrible from far off in the...<P>...no wait.  That's just you.  <P>You should get out of here quick, that stench <P>could turn deadly given a few more minutes.  <P>But seriously, you hear a low rumbling growl through the <P>wall to the south-east.<P><P>There are two ways to go from here: <P>to the North, and to the West.");
        if (loc == 7)
          sT.setText("<html>Your legs itch...<P>You scratch your legs...<P>Aww yeah that's the spot!  <P>And just in the moment of bliss you nearly <P>draw blood scratching because a roar from the <P>south-west startles you so hard!  <P><P>There are two ways to go from here: <P>to the North, and to the East.");
        if (loc == 8)
          sT.setText("<html>IT'S A MOTHERFUCKING SPIDER HOLY SHIno wait.  <P>it's a speck of dirt.  <P>Nothing to see here, folks.  <P><P>There are two ways to go from here: <P>to the South, and to the West.");
        if (loc == 9)
          sT.setText("<html>Another three-way fork?  <P>The decisions overwhelm you.  <P>You will black out in 5...4...3...2...1...<P><P>Just kidding, I don't know the code for timers yet, <P>and I don't care to learn it!<P><P>There are three ways to go from here: <P>to the North, to the East, and to the South.");
        if (loc == 10)
          sT.setText("<html>Seriously, what's that sound to the north-east?  <P>It couldn't be an unreachable reference<P>that only exists in the text, could it?  <P>Naw that would mean the programmer was lazy.  <P>And awesome. <P><P>There are two ways to go from here: <P>to the South, and to the West.");
        if (loc == 11)
          sT.setText("<html>A dead end... I fucking hate dead ends. <P>Then why include 4 of them?  <P>That's actually 5, including the first area.  <P>Shut the hell up, smart ass.  I'll rape your mother. <P>Hey don't forget to tell the guy–<P>I said shut up.  There's some bullshit to the north-west. <P>Everybody happy now?<P><P>The only path you see is to the South.");
        if (loc == 12)
          sT.setText("<html>The wall in front of you, to the South, reads: <P>'I bet if you run into me reaaaallll hard, you'll <P>outsmart the programmer and beat the game!'<P><P>The only path you see is to the North.");
        if (loc == 13)
          sT.setText("<html>Congratulations, it's a dead end!<P>You did it!<P><P>The only path you see is to the North.");
        if (loc == 14)
          sT.setText("<html>The air doesn't smell so foul here...<P>...you must be getting closer to the exit! <P>Or closer to an extremely well adapted predator.<P><P>There are two ways to go from here: <P>to the North, and to the East.");
        if (loc == 15)
          sT.setText("<html>Hey did you know JFK could speak 350 random words <P>in a single minute?  <P>Boom.<P>A random word random fact.<P><P>There are two ways to go from here: <P>to the North, and to the East.");
        if (loc == 16)
          sT.setText("<html>Your feet ache and your body is tired<P>You've come so far.<P>No you haven't you just clicked a few buttons.<P>You probably made a bunch of wrong turns, too.<P>You don't deserve what's coming next >:o <P><P>There are two ways to go: <P>back to the West, which is clearly the better decision, <P>and to the East.  But I wouldn't go there.");
        if (loc == 17)
        {JOptionPane.showMessageDialog(sT, "You Win! I just lost 5 dollars on a bet...");
            System.exit(0);
        }}
      public class NorthButton extends JButton implements ActionListener
      {
        public NorthButton()
        {
          setText("North");
          addActionListener(this);
        }
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
          northClick();
        }
      }
      public class EastButton extends JButton implements ActionListener
      {
        public EastButton()
        {
            setText("East");
          addActionListener(this);
        }
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
          eastClick();
        }
      }
      public class SouthButton extends JButton implements ActionListener
      {
       public SouthButton()
        {
          setText("South");
          addActionListener(this);
        }
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
          southClick();
        }
      } 
      public class WestButton extends JButton implements ActionListener
      {
        public WestButton()
        {
          setText("West");
          addActionListener(this);
        }
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
          westClick();
        }
      }
      public void northClick()
      {
        if (loc == 5 || loc == 6 || loc == 7 || loc == 9 || loc == 12 || loc == 13 || loc == 14 || loc == 15)
          loc -= 4;
        updateST();
      }
      public void eastClick()
      {
        if (loc == 2 || loc == 3 || loc == 5 || loc == 7 || loc == 9 || loc == 14 || loc == 15 || loc == 16)
          loc++;
        updateST();
      }
      public void southClick()
      {
        if (loc == 1 || loc == 2 || loc == 3 || loc == 5 || loc == 8 || loc == 9 || loc == 10 || loc == 11)
        {loc += 4;
        updateST();
        }
        else if (loc == 12)
        {
            loc = 1;
            backToStart();
        }
        
      }
      public void westClick()
      {
        if (loc == 3 || loc== 4 || loc == 6 || loc == 8 || loc == 10 || loc == 15 || loc == 16)
          loc --;
        updateST();
      }
      public void backToStart()
      {
          JOptionPane.showMessageDialog(sT, "<html>Well looky where that got ya.  Here's a lil' setback <P>to teach you your lesson!  Fucker! HAHA!");
          updateST();
      }
      }
    public static void main(String[] args)
    {
      new LabyrinthAdventure();
    }
}