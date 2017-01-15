package javatest.com.bjsxt.frameGame;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class GameFrame extends Frame
{
    private static final long serialVersionUID = -2028197206945845884L;

    public void lanuch()
    {
        setSize(1000, 1000);
        setLocation(200, 200);

        setVisible(true);

        //new PaintThread().start();

        //实现关闭功能
        addWindowListener
                  (
                            new WindowAdapter()
                            {
                                @Override
                                public void windowClosing(WindowEvent e)
                                {
                                    System.exit(0);
                                }
                            }
                  );
    }

    @Override
    public void paint(Graphics g)
    {
        try
        {
            g.drawImage(GameUtil.getImage("sun.jpg"), 200, 200, null);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new GameFrame().lanuch();
    }

    /**
     * 定义一个重画窗口的线程类，是一个内部类
     *
     * @author dell
     */
    class PaintThread extends Thread
    {

        public void run()
        {
            while (true)
            {
                repaint();
                try
                {
                    Thread.sleep(40); //1s = 1000ms
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }
}




















