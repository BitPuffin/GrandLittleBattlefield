package glb;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.GeomUtil.HitResult;
import org.newdawn.slick.state.StateBasedGame;

import it.marteEngine.World;

public class War extends World {
	
	//	Initialize the ground sprite instead of every time a ground object is created
	Image sprite_ground;
	
	private int maxPlayers = 1; 
	private int playerCount = 0;
	
	private int playerInitialX = 400;
	private int playerInitialY = 100;
	
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
		addPlayer();
		
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
		int xTilePos = 0;
		int yTilePos = 300;
		int xRows = 100;
		int yRows = 2;
		int tileWidth = sprite_ground.getWidth();
		int tileHeight = sprite_ground.getHeight();
		
		for( int yAdded = 0; yAdded < yRows; yAdded++ ) {
			for ( int xAdded = 0; xAdded < xRows; xAdded++ ) {
				Ground newGround = new Ground( xTilePos, yTilePos, sprite_ground );
				add( newGround );
				xTilePos += tileWidth;
			}
			yTilePos += tileHeight;
			xTilePos = 0;
		}
	}
	
	private
	void addPlayer() throws SlickException{
		if ( playerCount >= maxPlayers ) {
			System.out.println( "DON'T INITIALIZE PLAYER MORE THAN ONCE" );
			System.exit( -1 );
		}
		
		player = new Player( playerInitialX, playerInitialY );
		add ( player );
		
	}

}
