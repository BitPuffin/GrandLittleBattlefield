package glb;

import it.marteEngine.entity.Entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entity{
	
	private int health = 100;
	private float gravityAcceleration = 0.02f;
	
	//	Usually booleans aren't that good for states but in the case of falling or not
	//	it's fairly fitting
	private boolean falling = true;
	
	//	More "advanced" states
	SoliderState state;
	
	Vector2f velocity;
	Vector2f position;
	
	Image left;
	Image right;

	public Player( float x, float y ) throws SlickException {
		super( x, y );
		
		state = SoliderState.LOOKING_RIGHT;
		
		left = new Image( "Assets/solider/solider_left.png" );
		right = new Image( "Assets/solider/solider_right.png" );
		
		setGraphic( right );
		
		changeHitBox( state );
		
		falling = !collidingWithSolid( 1, 0 );
		
		velocity = new Vector2f( 0.0f, 0.0f );
		position = new Vector2f( x, y );
	}
	
	@Override
	public
	void update ( GameContainer container, int delta ) throws SlickException {
		super.update(container, delta);
		
		alwaysUpdate( delta );
		if( falling ) {
			fallingUpdate( delta );
		}
		else {
			groundUpdate( delta );
		}
		
		position = position.add( velocity );
		
		x = position.x;
		y = position.y;

	}
	
	private
	void alwaysUpdate( int delta ) {
		
	}
	
	private
	void fallingUpdate( int delta ) {
		velocity.y += gravityAcceleration * delta;
		
	}
	
	private
	void groundUpdate( int delta ) {
		
	}
	
	private
	boolean collidingWithSolid( int xOffset, int yOffset ) {
		boolean yes = true;
		if ( !(collide( SOLID, xOffset, yOffset ) != null) ) {
			yes = false;
		}
		
		return yes;
	}
	
	private
	void changeHitBox( SoliderState state ) {
		if ( state == SoliderState.LOOKING_LEFT ) {
			setHitBox( -10, 0, 40, 50 );
		}
		else if ( state == SoliderState.LOOKING_RIGHT ) {
			setHitBox( 10, 0, 40, 50 );
		}
	}
	
}
