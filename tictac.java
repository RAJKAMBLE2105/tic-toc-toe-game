import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class tictac implements ActionListener {
    Random random = new Random();
    JFrame frame= new JFrame();
    JPanel title_panel= new JPanel();
    JPanel btn_pannel = new JPanel();
    JLabel textfied = new JLabel();
    JButton [] btn= new JButton[9];
    boolean player1_turn;
    tictac(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);


        textfied.setBackground(new Color(25,25,25));
        textfied.setForeground(new Color(25,255,0));
        textfied.setFont(new Font("Ink Free",Font.BOLD,75));
        textfied.setHorizontalAlignment(JLabel.CENTER);
        textfied.setText("Tic tac toe");
        textfied.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        btn_pannel.setLayout(new GridLayout(3,3));
        btn_pannel.setBackground(new Color(150,150,150));
        frame.add(btn_pannel);

        for (int i =0;i<9;i++)
        {
            btn[i]=new JButton();
            btn_pannel.add(btn[i]);
            btn[i].setFont(new Font("MV Boli",Font.BOLD,120));
            btn[i].setFocusable(false);
            btn[i].addActionListener(this);

        }
        title_panel.add(textfied);
        frame.add(title_panel,BorderLayout.NORTH);

fristterm();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0;i<9;i++)
        {
            if (e.getSource()==btn[i])
            {
                if(player1_turn){
                    if(btn[i].getText()==""){
                        btn[i].setForeground(new Color(255,0,0));
                        btn[i].setText("X");
                        player1_turn=false;
                        textfied.setText("O turn");
                        check();
                    }
                }
                else {
                    if(btn[i].getText()==""){
                        btn[i].setForeground(new Color(0,0,255));
                        btn[i].setText(")");
                        player1_turn=true;
                        textfied.setText("X turn");
                        check();
                    }

                }
            }
        }

    }
    public void fristterm(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(random.nextInt(2)==0)
        {
            player1_turn=true;
            textfied.setText("X turn ");
        }
        else {

            player1_turn=false;
            textfied.setText("O turn ");
        }

    }
    public void check(){

        if(
                         (btn[0].getText()=="X")&&
                        (btn[1].getText()=="X")&&
                        (btn[2].getText()=="X"))
        {
         xwins(0,1,2);
        }

        if(
                (btn[3].getText()=="X")&&
                        (btn[4].getText()=="X")&&
                        (btn[5].getText()=="X"))
        {
            xwins(3,4,5);
        }
        if(
                (btn[6].getText()=="X")&&
                        (btn[7].getText()=="X")&&
                        (btn[8].getText()=="X"))
        {
            xwins(6,7,8);
        }

        if(
                (btn[0].getText()=="X")&&
                        (btn[3].getText()=="X")&&
                        (btn[6].getText()=="X"))
        {
            xwins(0,3,6);
        }
        if(
                (btn[1].getText()=="X")&&
                        (btn[4].getText()=="X")&&
                        (btn[7].getText()=="X"))
        {
            xwins(1,4,7);
        }

        if(
                (btn[2].getText()=="X")&&
                        (btn[5].getText()=="X")&&
                        (btn[8].getText()=="X"))
        {
            xwins(2,5,8);
        }

        if(
                (btn[0].getText()=="X")&&
                        (btn[4].getText()=="X")&&
                        (btn[8].getText()=="X"))
        {
            xwins(0,4,8);
        }
        if(
                (btn[2].getText()=="X")&&
                        (btn[4].getText()=="X")&&
                        (btn[6].getText()=="X"))
        {
            xwins(2,4,6);
        }












        if(
                (btn[0].getText()=="O")&&
                        (btn[1].getText()=="O")&&
                        (btn[2].getText()=="O"))
        {
            owins(0,1,2);
        }

        if(
                (btn[3].getText()=="O")&&
                        (btn[4].getText()=="O")&&
                        (btn[5].getText()=="O"))
        {
            owins(3,4,5);
        }
        if(
                (btn[6].getText()=="O")&&
                        (btn[7].getText()=="O")&&
                        (btn[8].getText()=="O"))
        {
            owins(6,7,8);
        }

        if(
                (btn[0].getText()=="O")&&
                        (btn[3].getText()=="O")&&
                        (btn[6].getText()=="O"))
        {
            owins(0,3,6);
        }
        if(
                (btn[1].getText()=="O")&&
                        (btn[4].getText()=="O")&&
                        (btn[7].getText()=="O"))
        {
            owins(1,4,7);
        }

        if(
                (btn[2].getText()=="O")&&
                        (btn[5].getText()=="O")&&
                        (btn[8].getText()=="O"))
        {
            owins(2,5,8);
        }

        if(
                (btn[0].getText()=="O")&&
                        (btn[4].getText()=="O")&&
                        (btn[8].getText()=="O"))
        {
            owins(0,4,8);
        }
        if(
                (btn[2].getText()=="O")&&
                        (btn[4].getText()=="O")&&
                        (btn[6].getText()=="O"))
        {
            owins(2,4,6);
        }
    }
    public void xwins(int a, int b,int c){
        btn[a].setBackground(Color.GREEN);
        btn[b].setBackground(Color.GREEN);
        btn[c].setBackground(Color.GREEN);
        for (int i =0;i<9;i++){
            btn[i].setEnabled(false);
        }
        textfied.setText("X wins");
    }
    public void owins(int a, int b,int c){
        btn[a].setBackground(Color.GREEN);
        btn[b].setBackground(Color.GREEN);
        btn[c].setBackground(Color.GREEN);
        for (int i =0;i<9;i++){
            btn[i].setEnabled(false);
        }
        textfied.setText("O wins");

    }
}
class Main {
    public static void main(String[] args) {
        tictac t=new tictac();
        System.out.println("Hello world!");
    }
}