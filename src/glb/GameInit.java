package glb;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

//	==========================================
//	=		This is what most people call
//	=		the "main" class!
//	==========================================

public class GameInit extends StateBasedGame {
	
	public GameInit( String windowFackingCuntTitleDontDenyItICanPromiseThatItWillShowUpOnTheGameWindowUnlessItIsFullScreenSoThereYouHaveIt ) {
		super( windowFackingCuntTitleDontDenyItICanPromiseThatItWillShowUpOnTheGameWindowUnlessItIsFullScreenSoThereYouHaveIt );
	}
	
	@Override
	public
	void initStatesList( GameContainer container ) {
		addState( new War( 1, container ) );
	}
	
	//	Some basic fields required for the game
	private static final String		gameName	= "Grand Little Battlefield";
	private static final int		width		= 800;
	private static final int		height		= 600;
	private static final boolean	fscrn		= false;
	
	public
	static void main( String[] snuskhummerbiten ) throws SlickException {
	}
}
