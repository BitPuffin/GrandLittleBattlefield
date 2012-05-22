package glb;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import it.marteEngine.World;

public class War extends World {
	
	//	Common graphics stay in this class so they're only initalized once in the init method
	Image sprite_soliderLeft;
	Image sprite_soliderRight;
	Image sprite_ground;
	
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
		
		initGraphics();
		addGround();
		
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
	
	private
	void initGraphics() throws SlickException {
		sprite_ground = new Image("Assets/ground/ground.png");
	}
	
	private
	void addGround() {
		int xTiles = 250;
		int yTiles = 200;
		int tileWidth = sprite_ground.getWidth();
		int tileHeight = sprite_ground.getHeight();
		
		for ( int y = 0; y < yTiles; y += tileHeight ) {
			for( int x = 0; x < xTiles; x += tileWidth ) {
				Ground newGround = new Ground( x, y, sprite_ground );
				add( newGround );
			}
		}
	}

}
