import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args){
        System.out.println("potion game");
        App app = new App();
        app.runSketch();
    }

    public void settings(){
        size(600,400);
    }

    public void setup(){
        text("yoyo", 260, 80);
    }

    public void draw(){
        
    }
}
