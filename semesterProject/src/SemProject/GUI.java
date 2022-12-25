package SemProject;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener{
    JFrame f,fm,f1,f2,f3,f4,frame,start,stop,result,reg,rem,fr1,can;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JTextField t1,t2,t3,t4,tc1,tc2;
    JTextArea area,area1;
    ImageIcon logo;
    JButton b,b1,b2,b3,b4,b5,b7,b8,b9,b10,b11,bt,rd,sb,stb,stb1,rdc,shb,hb,save,search,bre,reb,remove;
    JComboBox cb;
    JProgressBar pb,pb2,pb3;
    JPasswordField ps1,ps2,ps3,ps5;
    JLabel lb,c1,c2,c3,c4,c5,c6,c7,c8;
    Timer timer,timer1;
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
    JLabel lv1,lv2,lv3,lv4,lc,lc1,lc2;
    JButton vb,vb1,vb2,vb3,vb4,bl;

    GUI()
    {
        //main Frame
        {
            f = new JFrame("Election System");
            f.setBounds(200, 200, 500, 500);
            f.setResizable(false);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().setBackground(Color.white);
            f.setLayout(null);

            l = new JLabel("ELECTION PORTAL");
            l.setBounds(130, 250, 250, 30);
            l.setForeground(new Color(50, 150, 128));
            l.setFont(new Font("Georgian", Font.BOLD, 22));

            l1 = new JLabel();
            l1.setIcon(new ImageIcon(".//image//au.png"));
            l1.setBounds(110, 10, 250, 220);

            logo = new ImageIcon(".//image//logo.jpg");
            f.setIconImage(logo.getImage());

            pb2 = new JProgressBar();
            pb2.setValue(0);
            pb2.setStringPainted(true);
            pb2.setBounds(90, 300, 300, 35);
            pb2.setForeground(new Color(15,0,220));

            f.add(pb2);
            f.add(l1);
            f.add(l);
            f.setVisible(true);
            for (int i = 0; i <= 100; i++) {
                pb2.setString("Loading . . . " + i);
                pb2.setValue(i);
                try {
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
            f.setVisible(false);
            fm = new JFrame("Election System");
            fm.setBounds(200, 200, 500, 500);
            fm.setResizable(false);
            fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fm.getContentPane().setBackground(new Color(255, 255, 255));
            fm.setLayout(null);

            fm.setIconImage(logo.getImage());

            ImageIcon i = new ImageIcon(".//image//admin.png");
            b = new JButton(i);
            b.setBackground(Color.white);
            b.setBorder(BorderFactory.createEmptyBorder());
            b.setBounds(50, 30, 150, 120);
            b.addActionListener(this);

            JLabel admin = new JLabel("ADMIN");
            admin.setToolTipText("Click on image to enter admin section");
            admin.setBounds(80, 155, 100, 30);
            admin.setFont(new Font("Times New Roman", Font.BOLD, 16));
            admin.setForeground(new Color(0, 0, 0));

            ImageIcon i2 = new ImageIcon(".//image//voter.png");
            b2 = new JButton(i2);
            b2.setBackground(Color.white);
            b2.setBorder(BorderFactory.createEmptyBorder());
            b2.setBounds(290, 30, 150, 120);
            b2.addActionListener(this);

            JLabel voter = new JLabel("VOTER");
            voter.setToolTipText("Click on image to enter voter section");
            voter.setBounds(330, 150, 100, 30);
            voter.setFont(new Font("Times New Roman", Font.BOLD, 16));
            voter.setForeground(new Color(0, 0, 0));

            ImageIcon i3 = new ImageIcon(".//image//candidate.png");
            b1 = new JButton(i3);
            b1.setBackground(Color.white);
            b1.setBorder(BorderFactory.createEmptyBorder());
            b1.setBounds(190, 230, 170, 120);
            b1.addActionListener(this);

            JLabel candidate = new JLabel("CANDIDATE");
            candidate.setToolTipText("Click on image to enter candidate section");
            candidate.setBounds(200, 350, 100, 30);
            candidate.setFont(new Font("Times New Roman", Font.BOLD, 16));
            candidate.setForeground(new Color(0, 0, 0));

            fm.add(admin);
            fm.add(voter);
            fm.add(candidate);
            fm.add(b);
            fm.add(b1);
            fm.add(b2);
            fm.setVisible(true);
        }
        //Admin Frame
        {
            f1 = new JFrame("ADMIN");
            f1.setBounds(200, 200, 500, 200);
            f1.setResizable(false);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f1.getContentPane().setBackground(new Color(148,195,189));
            f1.setLayout(null);
            f1.setVisible(false);

            f1.setIconImage(logo.getImage());

            l2=new JLabel("Please Enter Your Login Credentials");
            l2.setBounds(125,0,400,50);
            l2.setFont(new Font("Times New Roman",Font.PLAIN,15));
            l2.setForeground(Color.black);

            l3=new JLabel("Username");
            l3.setBounds(20,50,100,30);
            l3.setFont(new Font("Georgia",Font.PLAIN,14));
            l3.setForeground(Color.black);

            t1=new JTextField();
            t1.setBounds(130,50,200,27);
            t1.setBorder(new LineBorder(Color.black,1));

            l4=new JLabel("Password");
            l4.setBounds(20,85,100,30);
            l4.setFont(new Font("Georgia",Font.PLAIN,14));
            l4.setForeground(Color.black);

            ps1=new JPasswordField("");
            ps1.setBounds(130,85,200,27);
            ps1.setBorder(new LineBorder(Color.black,1));

            b3=new JButton("BACK");
            b3.setBounds(130,120,99,20);
            b3.setBackground(new Color(101,101,230));
            b3.setForeground(Color.white);
            b3.addActionListener(this);

            b4=new JButton("LOGIN");
            b4.setBounds(232,120,99,20);
            b4.setBackground(new Color(101,101,230));
            b4.setForeground(Color.white);
            b4.addActionListener(this);

            f1.add(l2);
            f1.add(l3);
            f1.add(t1);
            f1.add(l4);
            f1.add(ps1);
            f1.add(b3);
            f1.add(b4);
        }
        //Candidate frame
        {
            f2=new JFrame("CANDIDATE");
            f2.setBounds(200,200,500,230);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f2.getContentPane().setBackground(new Color(148,195,189));
            f2.setResizable(false);
            f2.setLayout(null);
            f2.setVisible(false);

            f2.setIconImage(logo.getImage());

            l3=new JLabel("Please Enter Your Login Credentials");
            l3.setBounds(125,0,400,50);
            l3.setFont(new Font("Times New Roman",Font.PLAIN,15));
            l3.setForeground(Color.black);

            l4=new JLabel("ID");
            l4.setBounds(20,50,100,30);
            l4.setFont(new Font("Georgia",Font.PLAIN,14));
            l4.setForeground(Color.black);

            t2=new JTextField();
            t2.setBounds(130,50,200,27);
            t2.setBorder(new LineBorder(Color.lightGray,3));

            l5=new JLabel("Password");
            l5.setBounds(20,85,100,30);
            l5.setFont(new Font("Georgia",Font.PLAIN,14));
            l5.setForeground(Color.black);

            ps2=new JPasswordField("");
            ps2.setBounds(130,85,200,27);
            ps2.setBorder(new LineBorder(Color.lightGray,3));

            b7=new JButton("BACK");
            b7.setBounds(130,120,99,20);
            b7.setBackground(new Color(101,101,230));
            b7.addActionListener(this);

            b8=new JButton("LOGIN");
            b8.setBounds(232,120,99,20);
            b8.setBackground(new Color(101,101,230));
            b8.addActionListener(this);

            l6=new JLabel("Not Registered! Contact Administration For Registration");
            l6.setBounds(50,150,400,30);
            l6.setFont(new Font("Georgia",Font.PLAIN,14));
            l6.setForeground(Color.black);
            
           f2.add(l3);
           f2.add(l4);
           f2.add(l5);
           f2.add(l6);
           f2.add(t2);
           f2.add(ps2);
           f2.add(b7);
           f2.add(b8);
        }
        //Voter Frame
        {
            f3=new JFrame("VOTER");
            f3.setBounds(200,200,500,200);
            f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f3.getContentPane().setBackground(new Color(148,195,189));
            f3.setResizable(false);
            f3.setLayout(null);
            f3.setVisible(false);

            f3.setIconImage(logo.getImage());

            l7=new JLabel("Please Enter Your Login Credentials");
            l7.setBounds(125,0,400,50);
            l7.setFont(new Font("Times New Roman",Font.PLAIN,15));
            l7.setForeground(Color.black);

            l8=new JLabel("ID");
            l8.setBounds(20,50,100,30);
            l8.setFont(new Font("Georgia",Font.PLAIN,14));
            l8.setForeground(Color.black);

            t3=new JTextField();
            t3.setBounds(130,50,200,27);
            t3.setBorder(new LineBorder(Color.lightGray,3));

            l9=new JLabel("Password");
            l9.setBounds(20,85,100,30);
            l9.setFont(new Font("Georgia",Font.PLAIN,14));
            l9.setForeground(Color.black);

            ps3=new JPasswordField("");
            ps3.setBounds(130,85,200,27);
            ps3.setBorder(new LineBorder(Color.lightGray,3));

            b9=new JButton("BACK");
            b9.setBounds(130,120,99,20);
            b9.setBackground(new Color(101,101,230));
            b9.addActionListener(this);

            b10=new JButton("LOGIN");
            b10.setBounds(232,120,99,20);
            b10.setBackground(new Color(101,101,230));
            b10.addActionListener(this);


            f3.add(l7);
            f3.add(l8);
            f3.add(l9);
            f3.add(t3);
            f3.add(ps3);
            f3.add(b9);
            f3.add(b10);
        }
        //Admin authorities
        {
            f4=new JFrame("ADMIN");
            f4.setBounds(200,200,600,250);
            f4.setResizable(false);
            f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f4.getContentPane().setBackground(new Color(148,195,189));
            f4.setLayout(null);
            f4.setIconImage(logo.getImage());

            String[] select ={"Please select","Start Voting","Stop Voting",
                              "Current Voting Details","Result Declaration",
                              "Register Candidate","Remove Candidate"};

            cb=new JComboBox<>(select);
            cb.setBounds(7,5,570,23);
            cb.setBackground(new Color(101,101,230));
            cb.setFont(new Font("Georgia",Font.PLAIN,14));
            cb.setForeground(Color.white);
            cb.addActionListener(this);
            f4.add(cb);
        }
        //Voter Authorities
        {
            fr1=new JFrame("VOTER");
            fr1.setBounds(200,200,600,250);
            fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr1.setResizable(false);
            fr1.getContentPane().setBackground(Color.white);
            fr1.setVisible(false);
            fr1.setLayout(null);
            fr1.setIconImage(logo.getImage());

            JLabel vt=new JLabel("Cast Your Vote");
            vt.setBounds(220,20,200,30);
            vt.setFont(new Font("Times New Roman",Font.BOLD,24));
            vt.setForeground(new Color(30,50,220));

            lv1=new JLabel("Candidate 1");
            lv1.setBounds(30, 80, 100, 30);
            lv1.setForeground(Color.black);
            lv1.setFont(new Font("Times New Roman", Font.BOLD, 18));

            lv2=new JLabel("Candidate 2");
            lv2.setBounds(170, 80, 100, 30);
            lv2.setForeground(Color.black);
            lv2.setFont(new Font("Times New Roman", Font.BOLD, 18));

            lv3=new JLabel("Candidate 3");
            lv3.setBounds(310, 80, 100, 30);
            lv3.setForeground(Color.black);
            lv3.setFont(new Font("Times New Roman", Font.BOLD, 18));

            lv4=new JLabel("Candidate 4");
            lv4.setBounds(450, 80, 100, 30);
            lv4.setForeground(Color.black);
            lv4.setFont(new Font("Times New Roman", Font.BOLD, 18));

            vb1=new JButton("CAST VOTE");
            vb1.setBounds(28,120,100,20);
            vb1.setBackground(Color.lightGray);
            vb1.addActionListener(this);

            vb2=new JButton("CAST VOTE");
            vb2.setBounds(168,120,100,20);
            vb2.setBackground(Color.lightGray);
            vb2.addActionListener(this);

            vb3=new JButton("CAST VOTE");
            vb3.setBounds(308,120,100,20);
            vb3.setBackground(Color.lightGray);
            vb3.addActionListener(this);

            vb4=new JButton("CAST VOTE");
            vb4.setBounds(448,120,100,20);
            vb4.setBackground(Color.lightGray);
            vb4.addActionListener(this);

            vb=new JButton("BACK");
            vb.setBounds(465,170,80,20);
            vb.setBackground(Color.lightGray);
            vb.addActionListener(this);

            fr1.add(lv1);fr1.add(lv2);fr1.add(lv3);fr1.add(lv4);
            fr1.add(vb1);fr1.add(vb2);fr1.add(vb3);fr1.add(vb4);
            fr1.add(vt);fr1.add(vb);
        }
        //Candidate authorities
        {
            can=new JFrame("Candidate");
            can.setBounds(200,200,600,250);
            can.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            can.setResizable(false);
            can.getContentPane().setBackground(Color.white);
            can.setVisible(false);
            can.setLayout(null);
            can.setIconImage(logo.getImage());

            lc=new JLabel("Current Voting Details");
            lc.setBounds(220,20,200,30);
            lc.setFont(new Font("Times New Roman",Font.BOLD,24));
            lc.setForeground(new Color(30,50,220));

            lc1=new JLabel("Total Current Votes");
            lc1.setBounds(90,70,150,30);
            lc1.setBackground(Color.black);
            lc1.setFont(new Font("Times new Roman",Font.PLAIN,17));

            lc2=new JLabel("Remaining Votes");
            lc2.setBounds(90,110,150,30);
            lc2.setBackground(Color.black);
            lc2.setFont(new Font("Times new Roman",Font.PLAIN,17));

            tc1=new JTextField();
            tc1.setBounds(240,70,150,30);
            tc1.setBackground(Color.white);
            tc1.setBorder(new LineBorder(Color.black,1));
            tc1.setEditable(false);

            tc2=new JTextField();
            tc2.setBounds(240,110,150,30);
            tc2.setBackground(Color.white);
            tc2.setBorder(new LineBorder(Color.black,1));
            tc2.setEditable(false);

            bl=new JButton("BACK");
            bl.setBounds(465,170,80,20);
            bl.setBackground(Color.lightGray);
            bl.addActionListener(this);

            can.add(lc);
            can.add(lc1);
            can.add(lc2);
            can.add(tc1);
            can.add(tc2);
            can.add(bl);
        }
    }
    
    public static void main(String[] args) {
        new newclass();
    }
    int x = 0,y=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            fm.setVisible(false);
            f1.setVisible(true);
        } else if (e.getSource() == b1) {
            fm.setVisible(false);
            f2.setVisible(true);
        } else if (e.getSource() == b2) {
            fm.setVisible(false);
            f3.setVisible(true);
        } else if (e.getSource() == b3) {
            fm.setVisible(true);
            f1.setVisible(false);
        } else if (e.getSource() == b4) {
            f1.setVisible(false);
            f4.setVisible(true);
        } else if (e.getSource() == b5) {
            f2.setVisible(false);
            fm.setVisible(true);
        }  else if (e.getSource() == b7) {
            f2.setVisible(false);
            fm.setVisible(true);
        } else if (e.getSource() == b8) {
            can.setVisible(true);
            f2.setVisible(false);

        } else if (e.getSource() == b9) {
            f3.setVisible(false);
            fm.setVisible(true);
        }
        else if ((e.getSource() == b10)) {
            fr1.setVisible(true);
            f3.setVisible(false);
        }
        else if (e.getSource() == b11) {
            f1.setVisible(true);
            f4.setVisible(false);
        } else if (e.getSource() == cb) {
            Object sel = cb.getSelectedItem();

            assert sel != null;
            if (sel.toString().equals("Start Voting")) {
                start = new JFrame("START VOTING");
                start.setBounds(200, 200, 600, 250);
                start.setResizable(false);
                start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                start.getContentPane().setBackground(new Color(255, 255, 255));
                start.setLayout(null);

                start.setIconImage(logo.getImage());

                sb = new JButton("BACK");
                sb.setBounds(480, 180, 99, 20);
                sb.setBackground(Color.lightGray);
                sb.addActionListener(this);

                ImageIcon i5 = new ImageIcon(".//image//start.jpg");
                stb1 = new JButton(i5);
                stb1.setBounds(250, 10, 115, 115);
                stb1.setBorder(BorderFactory.createEmptyBorder());
                stb1.setBackground(Color.white);
                stb1.setToolTipText("Tap To Start");
                stb1.addActionListener(this);

                pb = new JProgressBar(0, 100);
                pb.setStringPainted(true);
                pb.setBounds(140, 150, 300, 25);
                pb.setForeground(new Color(15, 0, 220));
                pb.setVisible(true);
                f4.setVisible(false);
                start.add(stb1);
                start.add(sb);
                start.add(pb);
                start.setVisible(true);

                timer1 = new Timer(50, evt -> {

                    pb.setString("Please Wait... " + y++);
                    pb.setValue(y);
                    if (y >= 100) {
                        timer1.stop();
                        pb.setString("Voting Stared Successfully");
                    }
                });
            }
            else if (sel.toString().equals("Stop Voting")) {
                stop = new JFrame("STOP VOTING");
                stop.setBounds(200, 200, 600, 250);
                stop.setResizable(false);
                stop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                stop.getContentPane().setBackground(new Color(255, 255, 255));
                stop.setLayout(null);

                stop.setIconImage(logo.getImage());

                ImageIcon i4 = new ImageIcon(".//image//stop.png");
                bt = new JButton(i4);
                bt.setBounds(250, 20, 90, 95);
                bt.setBorder(BorderFactory.createEmptyBorder());
                bt.setBackground(Color.white);
                bt.setToolTipText("Tap To Stop");
                bt.addActionListener(this);


                stb = new JButton("BACK");
                stb.setBounds(480, 180, 99, 20);
                stb.setBackground(Color.lightGray);
                stb.addActionListener(this);

                pb3 = new JProgressBar(0, 100);
                pb3.setStringPainted(true);
                pb3.setBounds(140, 130, 300, 25);
                pb3.setForeground(new Color(15, 0, 220));
                pb3.setVisible(true);
                stop.add(bt);
                stop.add(pb3);
                stop.add(stb);
                stop.setVisible(true);
                timer = new Timer(50, evt -> {

                    pb3.setString("Please Wait... "+ x++);
                    pb3.setValue(x);
                    if (x >= 100) {
                        timer.stop();
                        pb3.setString("Voting Stopped Successfully");
                    }
                });
            }
            else if (sel.toString().equals("Current Voting Details")) {
                frame = new JFrame("VOTING DETAILS");
                frame.setBounds(200, 200, 600, 250);
                frame.setResizable(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setBackground(new Color(148, 195, 189));
                frame.setLayout(null);

                frame.setIconImage(logo.getImage());

                lb = new JLabel("Total Vote Count");
                lb.setBounds(220, 40, 180, 30);
                lb.setForeground(Color.black);
                lb.setFont(new Font("Algerian", Font.ITALIC, 17));

                c1 = new JLabel("Candidate 1");
                c1.setBounds(28, 80, 100, 30);
                c1.setForeground(Color.black);
                c1.setFont(new Font("Times New Roman", Font.BOLD, 18));

                c2 = new JLabel("no of votes");
                c2.setBounds(38, 110, 100, 20);

                c3 = new JLabel("Candidate 2");
                c3.setBounds(168, 80, 100, 30);
                c3.setForeground(Color.black);
                c3.setFont(new Font("Times New Roman", Font.BOLD, 18));

                c4 = new JLabel("no of votes");
                c4.setBounds(178, 110, 100, 20);

                c5 = new JLabel("Candidate 3");
                c5.setBounds(318, 80, 100, 30);
                c5.setForeground(Color.black);
                c5.setFont(new Font("Times New Roman", Font.BOLD, 18));

                c6 = new JLabel("no of votes");
                c6.setBounds(328, 110, 100, 20);

                c7 = new JLabel("Candidate 4");
                c7.setBounds(458, 80, 100, 30);
                c7.setForeground(Color.black);
                c7.setFont(new Font("Times New Roman", Font.BOLD, 18));

                c8 = new JLabel("no of votes");
                c8.setBounds(468, 110, 100, 20);

                rd = new JButton("BACK");
                rd.setBounds(480, 180, 99, 20);
                rd.setBackground(Color.lightGray);
                rd.addActionListener(this);

                frame.add(c1);
                frame.add(c2);
                frame.add(c3);
                frame.add(c4);
                frame.add(c5);
                frame.add(c6);
                frame.add(c7);
                frame.add(c8);
                frame.add(lb);
                frame.add(rd);
                frame.setVisible(true);
                f4.setVisible(false);
            }
            else if (sel.toString().equals("Result Declaration")) {

                result = new JFrame("VOTING DETAILS");
                result.setBounds(200, 200, 600, 250);
                result.setResizable(false);
                result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                result.getContentPane().setBackground(new Color(148, 195, 189));
                result.setLayout(null);

                result.setIconImage(logo.getImage());

                area= new JTextArea("""
                        \tWinner\s
                                "Candidate Name and votes"

                        \tRunner Ups
                                "Candidate1 Name and votes"
                                "Candidate2 Name and votes"
                                "Candidate3 Name and votes\"""");
                area.setBounds(170, 0, 460, 300);
                area.setForeground(Color.black);
                area.setEditable(false);
                area.setBackground(new Color(148, 195, 189));
                area.setFont(new Font("Times New Roman", Font.BOLD, 17));

                rdc = new JButton("BACK");
                rdc.setBounds(480, 180, 99, 20);
                rdc.setBackground(Color.lightGray);
                rdc.addActionListener(this);

                result.add(rdc);
                result.add(area);
                result.setVisible(true);
                f4.setVisible(false);
            }
            else if (sel.toString().equals("Register Candidate")) {
                reg=new JFrame("Candidate Registration");
                reg.setBounds(200, 200, 400, 550);
                reg.setResizable(false);
                reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                reg.getContentPane().setBackground(new Color(255, 255, 255));
                reg.setLayout(null);

                reg.setIconImage(logo.getImage());


                JLabel l1,l2,l3,l4,l5,l6,l7,l8;
                JTextField tf1,tf2,tf3,tf4,tf5,tf6;

                l1=new JLabel("Candidate Information");
                l1.setBounds(100,5,250,25);
                l1.setForeground(new Color(52,0,156));
                l1.setFont(new Font("Georgia",Font.ITALIC,20));

                l2=new JLabel("Name");
                l2.setBounds(15,40,150,25);
                l2.setForeground(new Color(51,103,134));
                l2.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l3=new JLabel("Father Name");
                l3.setBounds(15,70,150,25);
                l3.setForeground(new Color(51,103,134));
                l3.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l4=new JLabel("Phone no");
                l4.setBounds(15,100,150,25);
                l4.setForeground(new Color(51,103,134));
                l4.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l5=new JLabel("Age");
                l5.setBounds(15,130,150,25);
                l5.setForeground(new Color(51,103,134));
                l5.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l6=new JLabel("Qualification");
                l6.setBounds(15,160,150,25);
                l6.setForeground(new Color(51,103,134));
                l6.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l7=new JLabel("Email");
                l7.setBounds(15,190,150,25);
                l7.setForeground(new Color(51,103,134));
                l7.setFont(new Font("Times New Roman",Font.PLAIN,16));

                l8=new JLabel("Password");
                l8.setBounds(15,220,150,25);
                l8.setForeground(new Color(51,103,134));
                l8.setFont(new Font("Times New Roman",Font.PLAIN,16));

                tf1=new JTextField();
                tf1.setBounds(150,40,150,22);
                tf1.setBorder(new LineBorder(Color.black,1));

                tf2=new JTextField();
                tf2.setBounds(150,70,150,22);
                tf2.setBorder(new LineBorder(Color.black,1));

                tf3=new JTextField();
                tf3.setBounds(150,100,150,22);
                tf3.setBorder(new LineBorder(Color.black,1));

                tf4=new JTextField();
                tf4.setBounds(150,130,150,22);
                tf4.setBorder(new LineBorder(Color.black,1));

                tf5=new JTextField();
                tf5.setBounds(150,160,150,22);
                tf5.setBorder(new LineBorder(Color.black,1));

                tf6=new JTextField();
                tf6.setBounds(150,190,150,22);
                tf6.setBorder(new LineBorder(Color.black,1));

                ps5=new JPasswordField();
                ps5.setBounds(150,220,150,22);
                ps5.setBorder(new LineBorder(Color.black,1));

                save=new JButton("SAVE");
                save.setBounds(195,260,100,25);
                save.setBackground(new Color(101,101,230));
                save.addActionListener(this);

                area1=new JTextArea("Candidate Registered Successfully!\n" +
                        "            Your Id is \"id\"");
                area1.setBounds(90,310,300,100);
                area1.setBackground(Color.white);
                area1.setForeground(Color.black);
                area1.setFont(new Font("Times New Roman",Font.PLAIN,16));
                area1.setVisible(false);

                ImageIcon i1=new ImageIcon(".//image//show.jpg");
                shb=new JButton(i1);
                shb.setBounds(310,220,25,20);
                shb.setBorder(BorderFactory.createEmptyBorder());
                shb.addActionListener(this);

                ImageIcon i2=new ImageIcon(".//image//hide.jpg");
                hb=new JButton(i2);
                hb.setBounds(310,220,25,20);
                hb.setBorder(BorderFactory.createEmptyBorder());
                hb.setVisible(false);
                hb.addActionListener(this);

                reb=new JButton("BACK");
                reb.setBounds(265, 470, 100, 20);
                reb.setBackground(Color.lightGray);
                reb.addActionListener(this);

                reg.add(l1);reg.add(l2);reg.add(l3);reg.add(l4);
                reg.add(l5);reg.add(l6);reg.add(l7);reg.add(l8);
                reg.add(tf1);reg.add(tf2);reg.add(tf3);reg.add(tf4);
                reg.add(tf5);reg.add(tf6);reg.add(ps5);reg.add(shb);
                reg.add(hb);reg.add(area1);reg.add(save);reg.add(reb);
                reg.setVisible(true);
                f4.setVisible(false);

            }
            else if (sel.toString().equals("Remove Candidate"))
            {
                rem=new JFrame("Candidate Removal");
                rem.setBounds(200, 200, 400, 500);
                rem.setResizable(false);
                rem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rem.getContentPane().setBackground(new Color(255, 255, 255));
                rem.setLayout(null);

                rem.setIconImage(logo.getImage());

                l12=new JLabel("Candidate ID");
                l12.setBounds(20,32,100,30);
                l12.setFont(new Font("Times New Roman",Font.PLAIN,14));
                l12.setForeground(Color.black);

                t4=new JTextField();
                t4.setBounds(140,35,100,20);
                t4.setBorder(new LineBorder(Color.black,1));

                search=new JButton("SEARCH");
                search.setBounds(260,32,100,25);
                search.setBackground(Color.lightGray);
                search.addActionListener(this);

                lb1=new JLabel("Name");
                lb1.setBounds(20,70,150,30);
                lb1.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb1.setBackground(new Color(25,80,200));
                lb1.setVisible(false);

                lb2=new JLabel("Father Name");
                lb2.setBounds(20,100,150,30);
                lb2.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb2.setBackground(new Color(25,80,200));
                lb2.setVisible(false);

                lb3=new JLabel("Phone Number");
                lb3.setBounds(20,130,150,30);
                lb3.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb3.setBackground(new Color(25,80,200));
                lb3.setVisible(false);

                lb4=new JLabel("Age");
                lb4.setBounds(20,160,150,30);
                lb4.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb4.setBackground(new Color(25,80,200));
                lb4.setVisible(false);

                lb5=new JLabel("Qualification");
                lb5.setBounds(20,190,150,30);
                lb5.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb5.setBackground(new Color(25,80,200));
                lb5.setVisible(false);

                lb6=new JLabel("Email");
                lb6.setBounds(20,220,150,30);
                lb6.setFont(new Font("Times New Roman",Font.PLAIN,16));
                lb6.setBackground(new Color(25,80,200));
                lb6.setVisible(false);

                bre=new JButton("BACK");
                bre.setBounds(265, 420, 100, 20);
                bre.setBackground(Color.lightGray);
                bre.addActionListener(this);

                remove = new JButton("REMOVE");
                remove.setBounds(150,270,100,20);
                remove.setBackground(Color.lightGray);
                remove.setVisible(false);
                remove.addActionListener(this);

                lb7=new JLabel("Candidate Removed");
                lb7.setBounds(130,320,150,30);
                lb7.setFont(new Font("Times New Roman",Font.BOLD,16));
                lb7.setBackground(new Color(25,80,200));
                lb7.setVisible(false);

                rem.add(lb1); rem.add(lb2); rem.add(lb3);
                rem.add(lb4); rem.add(lb5); rem.add(lb6);
                rem.add(l12);rem.add(t4);rem.add(bre);
                rem.add(search);rem.add(remove);rem.add(lb7);
                rem.setVisible(true);
                f4.setVisible(false);
            }
        }
        else if (e.getSource()==bt)
        {
            timer.start();
        }
        else if (e.getSource()==rd)
        {
            frame.setVisible(false);
            f4.setVisible(true);
        }
        else if(e.getSource()==sb)
        {
            start.setVisible(false);
            f4.setVisible(true);
        }
        else if(e.getSource()==stb)
        {
            stop.setVisible(false);
            f4.setVisible(true);
        }
        else if(e.getSource()==stb1)
        {
            timer1.start();
        }
        else if (e.getSource()==rdc)
        {
            result.setVisible(false);
            f4.setVisible(true);
        }
        else if (e.getSource()==shb)
        {
            shb.setVisible(false);
            hb.setVisible(true);
            ps5.setEchoChar((char)0);
        }
        else if (e.getSource()==hb)
        {
            hb.setVisible(false);
            shb.setVisible(true);
            ps5.setEchoChar('*');
        }
        else if (e.getSource()==save)
        {
            //bre.setVisible(true);
            area1.setVisible(true);
        }
        else if (e.getSource()==search)
        {
            remove.setVisible(true);
            lb1.setVisible(true);
            lb2.setVisible(true);
            lb3.setVisible(true);
            lb4.setVisible(true);
            lb5.setVisible(true);
            lb6.setVisible(true);
        }
        else if(e.getSource()==bre)
        {
            rem.setVisible(false);
            f4.setVisible(true);
        }
        else if (e.getSource()==reb)
        {
            reg.setVisible(false);
            f4.setVisible(true);
        }
        else if (e.getSource()==remove)
        {
            lb7.setVisible(true);
        }
        else if (e.getSource()==vb)
        {
            fr1.setVisible(false);
            fm.setVisible(true);
        }
        else if (e.getSource()==bl)
        {
            can.setVisible(false);
            f2.setVisible(true);
        }

    }

}
