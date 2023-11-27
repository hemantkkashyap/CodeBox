package com.ForgetPassword;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

public class Submit extends JButton{

    public int getTopleft() {
        return Topleft;
    }

    public void setTopleft(int Topleft) {
        this.Topleft = Topleft;
          repaint();
    }

    public int getTopright() {
        return Topright;
    }

    public void setTopright(int Topright) {
        this.Topright = Topright;
          repaint();
    }

    public int getBottomleft() {
        return bottomleft;
    }

    public void setBottomleft(int bottomleft) {
        this.bottomleft = bottomleft;
          repaint();
    }

    public int getBottomright() {
        return bottomright;
    }

    public void setBottomright(int bottomright) {
        this.bottomright = bottomright;
        repaint();
    }
    private int Topleft = 0 ;
        private int Topright = 0 ;
            private int bottomleft = 0 ;
                private int bottomright = 0 ;
    
    public Submit(){
        setOpaque(false);
      
    }
    
    @Override
     protected void paintComponent(Graphics g){
         Graphics2D g2 = (Graphics2D) g.create();
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
         g2.setColor(getBackground());
         Area a = new Area(TopL());
         if(Topright>0){
             a.intersect(new Area(TopR()));
         }
         if(bottomleft>0){
             a.intersect(new Area(BottomL()));
         }
         if(bottomright>0){
             a.intersect(new Area(BottomR()));
         }
         g2.fill(a);
         g2.dispose();
         
         super.paintComponent(g);
         
     }
     
     private Shape TopL(){
         int w = getWidth();
         int h = getHeight();
         int x = Math.min(w, Topleft);
          int y= Math.min(h, Topleft);
          Area a = new Area(new RoundRectangle2D.Double(0,0,w,h,x,y));
          a.add(new Area(new Rectangle2D.Double(x/2,0,w-x/2,h)));
           a.add(new Area(new Rectangle2D.Double(0,y/2,w,h-y/2)));
           return a;
     }
     private Shape TopR(){
         int w = getWidth();
         int h = getHeight();
         int x = Math.min(w, Topright);
          int y= Math.min(h, Topright);
          Area a = new Area(new RoundRectangle2D.Double(0,0,w,h,x,y));
          a.add(new Area(new Rectangle2D.Double(0,0,w-x/2,h)));
           a.add(new Area(new Rectangle2D.Double(0,y/2,w,h-y/2)));
           return a;
     }
     
     private Shape BottomL(){
         int w = getWidth();
         int h = getHeight();
         int x = Math.min(w, bottomleft);
          int y= Math.min(h, bottomleft);
          Area a = new Area(new RoundRectangle2D.Double(0,0,w,h,x,y));
          a.add(new Area(new Rectangle2D.Double(x/2,0,w-x/2,h)));
           a.add(new Area(new Rectangle2D.Double(0,0,w,h-y/2)));
           return a;
     }
     
     private Shape BottomR(){
         int w = getWidth();
         int h = getHeight();
         int x = Math.min(w, bottomright);
          int y= Math.min(h, bottomright);
          Area a = new Area(new RoundRectangle2D.Double(0,0,w,h,x,y));
          a.add(new Area(new Rectangle2D.Double(0,0,w-x/2,h)));
           a.add(new Area(new Rectangle2D.Double(0,0,w,h-y/2)));
           return a;
     }
}
