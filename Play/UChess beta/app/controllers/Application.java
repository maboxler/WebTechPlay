package controllers;



import htwg.se.chess.Init;
import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
	
	Init init = null;
	
    public Result index() {   	
    	//Init.main(null); //ruft Spiel auf    	
        return ok(index.render("UChess Titel"));
        
    }
    
    public Result game(){   
    	
    	init = Init.getInstance();
    	
    	return ok(main.render("Welcome To UChess",init.getWTui().replaceAll(" ", "&nbsp;")));
    }
    
    public Result reset(){   	
    	
    	Init.getInstance().getCc().reset();
    	
    	return ok(main.render("Welcome To UChess",Init.getInstance().getWTui().replaceAll(" ", "&nbsp;")));
    }
    
    public Result move(String command){
    	Init init = Init.getInstance();
    	init.getTui().processInputLine(command);
    	
    	return ok(main.render("WTUI",Init.getInstance().getWTui().replaceAll(" ", "&nbsp;")));
    }

}
