
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall, wall2;
    private Square window, bottomWindow;
    private Square door, doorTop;
    private Square grass;
    private Triangle roof, bush, bush2;
    private Circle sun, doorknob, circleWindow;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(10);
        wall.changeSize(100);
        wall.moveHorizontal(-20);
        wall.makeVisible();
                
        wall2 = new Square();
        wall2.moveVertical(10);
        wall2.changeSize(100);
        wall2.moveHorizontal(80);
        wall2.makeVisible();
        
        door = new Square();
        door.changeSize(25);
        door.moveVertical(85);
        door.moveHorizontal(68);
        door.changeColor("blue");
        door.makeVisible();
        
        doorTop = new Square();
        doorTop.changeSize(25);
        doorTop.moveVertical(65);
        doorTop.moveHorizontal(68);
        doorTop.changeColor("blue");
        doorTop.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeColor("black");
        doorknob.moveHorizontal(128);
        doorknob.moveVertical(75);
        doorknob.changeSize(5);
        doorknob.makeVisible();
        
        grass = new Square();
        grass.moveVertical(110);
        grass.moveHorizontal(-60);
        grass.changeSize(300);
        grass.makeVisible();
        grass.changeColor("green");

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-5);
        window.moveVertical(22);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(30);
        window.moveVertical(22);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(135);
        window.moveVertical(22);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(22);
        window.makeVisible();
        
        bottomWindow = new Square();
        bottomWindow.changeColor("black");
        bottomWindow.moveHorizontal(-5);
        bottomWindow.moveVertical(62);
        bottomWindow.makeVisible();
        
        bottomWindow = new Square();
        bottomWindow.changeColor("black");
        bottomWindow.moveHorizontal(30);
        bottomWindow.moveVertical(62);
        bottomWindow.makeVisible();
        
        bottomWindow = new Square();
        bottomWindow.changeColor("black");
        bottomWindow.moveHorizontal(135);
        bottomWindow.moveVertical(62);
        bottomWindow.makeVisible();
        
        bottomWindow = new Square();
        bottomWindow.changeColor("black");
        bottomWindow.moveHorizontal(100);
        bottomWindow.moveVertical(62);
        bottomWindow.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 200);
        roof.moveHorizontal(90);
        roof.moveVertical(-5);
        roof.changeColor("magenta");
        roof.makeVisible();
        
        circleWindow = new Circle();
        circleWindow.changeColor("black");
        circleWindow.moveHorizontal(107);
        circleWindow.moveVertical(-30);
        circleWindow.changeSize(25);
        circleWindow.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(240);
        sun.moveVertical(-60);
        sun.changeSize(40);
        sun.makeVisible();
        
        bush = new Triangle();
        bush.changeColor("yellow");
        bush.changeSize(14, 30);
        bush.moveHorizontal(15);
        bush.moveVertical(132);
        bush.makeVisible();
        
        bush = new Triangle();
        bush.changeColor("yellow");
        bush.changeSize(14, 30);
        bush.moveHorizontal(25);
        bush.moveVertical(132);
        bush.makeVisible();
        
        bush = new Triangle();
        bush.changeColor("yellow");
        bush.changeSize(14, 30);
        bush.moveHorizontal(45);
        bush.moveVertical(132);
        bush.makeVisible();
        
        bush = new Triangle();
        bush.changeColor("yellow");
        bush.changeSize(14, 30);
        bush.moveHorizontal(55);
        bush.moveVertical(132);
        bush.makeVisible();
        
        bush2 = new Triangle();
        bush2.changeColor("yellow");
        bush2.changeSize(14, 30);
        bush2.moveHorizontal(125);
        bush2.moveVertical(132);
        bush2.makeVisible();
        
        bush2 = new Triangle();
        bush2.changeColor("yellow");
        bush2.changeSize(14, 30);
        bush2.moveHorizontal(135);
        bush2.moveVertical(132);
        bush2.makeVisible();
        
        bush2 = new Triangle();
        bush2.changeColor("yellow");
        bush2.changeSize(14, 30);
        bush2.moveHorizontal(155);
        bush2.moveVertical(132);
        bush2.makeVisible();
        
        bush2 = new Triangle();
        bush2.changeColor("yellow");
        bush2.changeSize(14, 30);
        bush2.moveHorizontal(165);
        bush2.moveVertical(132);
        bush2.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
