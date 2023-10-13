package service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import classes.compte;

@WebService
public class BanqueService {
	
	 private compte compte;
     public BanqueService()
     {
    	 this.compte= new compte(30.5f, new Date(), 2);
    	 System.out.println("compte object created with solde: " + compte.getSolde());
     }
     @WebMethod
 	public double conversion(@WebParam double mont)
 	{
    	 System.out.println("Received mont: " + mont);
    	    double result = mont * 3.5;
    	    System.out.println("Result: " + result);
 		    return result;
 	}
 	@WebMethod
 	public double retirer(@WebParam double mont) {
 	    double currentSolde = this.compte.getSolde();
 	    double newSolde = currentSolde - mont;
 	    System.out.println("Current Solde: " + currentSolde);
 	    System.out.println("Montant to withdraw: " + mont);
 	    System.out.println("New Solde: " + newSolde);

 	    if (newSolde < 0) {
 	        System.out.println("Insufficient funds. Withdrawal not allowed.");
 	       
 	    } else {
 	        this.compte.setSolde(newSolde); 
 	    }

 	    return newSolde;
 	}
 	@WebMethod
 	public double verser( @WebParam double mont)
 	{   
 		double newSolde=this.compte.getSolde()+mont;
 		this.compte.setSolde(newSolde);

 		return newSolde;
 	}
 	@WebMethod
 	public double getCurrentSolde() {
 		return this.compte.getSolde();
 	}
 
}