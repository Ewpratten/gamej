import game.*;
import game.drawing.*;
import game.physics.*;

public class Template extends GameJava {

    public Template() {
        super(640, 480, 60, 60);
	}
	
	public static void main(String[] args) throws InterruptedException {
        new Template();   
    }
	
	@Override
	public void draw() {
        // called at the set update rate
	}

	@Override
	public void update() {
        // called at the set frame rate
    }	
    
    @Override
    public void absoluteDraw() {
        // called imediately after draw, all drawing is the same but without the camera affecting anything
    }
}