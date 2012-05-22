package glb;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import it.marteEngine.entity.Entity;

public class Solider extends Entity {

	SoliderState state;
	
	Race soliderType;

	public Solider( float x, float y, Race race ) throws SlickException {
		super( x, y );
		setRace( race );
		
		initGraphics();
		
	}
	
	private
	void setRace( Race race ) {
		soliderType = race;
		raceChanged();
	}
	
	private
	void initGraphics() throws SlickException {
	}
	
	private
	void setState( SoliderState newState ) {
		this.state = newState;
		playerStateChanged();
	}
	
	private
	void playerStateChanged() {
		switch( state ) {
		
		}
	}
	
	private
	void raceChanged() {
		
	}

}
