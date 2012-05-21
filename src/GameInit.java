import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

//	==========================================
//	=		This is what most people call
//	=		the "main" class!
//	==========================================

public class GameInit extends BasicGame {
	
	//	Some basic fields required for the game
	private static final String		gameName	= "Grand Little Battlefield";
	private static final int		width		= 800;
	private static final int		height		= 600;
	private static final boolean	fscrn		= false;
	
	public GameInit( String daFuckingNameOfDaFuckingGame ) {
		super( daFuckingNameOfDaFuckingGame );
	}


	@Override
	public 
	void render( GameContainer gc, Graphics g ) throws SlickException {
		
		
	}

	@Override
	public 
	void init( GameContainer gc ) throws SlickException {
		
		
	}

	@Override
	public
	void update( GameContainer gc, int delta ) throws SlickException {
		
		
	}
	
	public
	static void main( String snuskhummerbiten ) throws SlickException {
		AppGameContainer game = new AppGameContainer( new GameInit( gameName ));
		game.setDisplayMode( width, height, fscrn );
		game.start();
	}
}
