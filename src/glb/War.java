package glb;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import it.marteEngine.World;

public class War extends World {
	
	private int playerInitialX = 400;
	private int playerInitialY = 300;
	
	private Player player;

	public War(int id, GameContainer gc) {
		super(id);
	}
	
	//	Initialize a level and add entities
	@Override
	public
	void init( GameContainer container, StateBasedGame game ) throws SlickException {
		super.init(container, game);
		player = new Player( playerInitialX, playerInitialY, Race.LITTLE );		// TODO REMEMBER TO CHANGE THE Race.LITTLE SO THAT IT DEPENDS ON A STATE
																				// (THE RACE CHOSED AT BOOT)
	}
	
	//	Update the game logic
	@Override
	public
	void update( GameContainer container, StateBasedGame game, int delta ) throws SlickException {
		super.update( container, game, delta );
		
	}
	
	//	Render dat game
	@Override
	public
	void render( GameContainer container, StateBasedGame game, Graphics g ) throws SlickException {
		super.render( container, game, g );
		
	}

}
