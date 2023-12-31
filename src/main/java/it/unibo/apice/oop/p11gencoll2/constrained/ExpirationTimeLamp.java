package it.unibo.apice.oop.p11gencoll2.constrained;
import java.util.Date;
/* Si esaurisce dopo un certo tempo (reale) dopo la prima accensione */
public class ExpirationTimeLamp extends LimitedLamp{
    
    /* Tengo il momento dell'accensione e la durata */
    private Date firstSwitchDate;
    private final long duration;
    
    public ExpirationTimeLamp(long duration){
    	super();
    	this.duration = duration;
    	this.firstSwitchDate = null;
    }
    
    /* Alla prima accensione, registro la data */
    protected void okSwitch(){
    	if (this.firstSwitchDate == null){
    	    this.firstSwitchDate = new java.util.Date();
    	}
    }
    
    /* Esaurita se è passato troppo tempo */
    public boolean isOver(){
    	return this.firstSwitchDate != null && 
    	       (new Date().getTime() - this.firstSwitchDate.getTime() 
    	       	>= this.duration);		
    }
} 
