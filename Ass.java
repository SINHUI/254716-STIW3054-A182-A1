package justTry;

import java.util.Scanner;  
import java.util.InputMismatchException;

class mainformula{
	
	private double totalSum;
	private double total;
	private double UUCP;
	private double TCF,SzUC;
	private double ECF;
	private double UCP;
	private double ManHours,AdjustedManHours;
	public double p,r;
	public int totalE=0;
	
		void textFormula(String type,String description, String Weight, String num) {
			System.out.println("\n=============================================================================================================");
			System.out.println(type+" "+description+" "+Weight+" "+num+" ");
			System.out.println("\n=============================================================================================================");	
		}
		
	 	void formula(String []question,String[] description, double[] weight,int userInput, String ansName) { 
	     
		int [] input = new int[userInput];
		int i;
		boolean done = false;
		boolean haizz = false;
		int x=2;
		double sum=0;
		double subsum;
		
		for(i=0;i<userInput; i++) {
			Scanner scan = new Scanner(System.in);
			if(x==1) {
				i=0;
						System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
							}
			else {
					System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
						}
		   try {
			   	input[i]=scan.nextInt();
			   	x=2;
			   	  	if(input[i]<0) {
				   		do {
				   		try {
				   			if(i==0) {
				   				input[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			input[i]=0;
				   			
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
						   System.out.println("\t\t----------------------------");
						  
						   haizz=true;
				   		      }
						   
				   		}catch(Exception e) {
				   			
				   	    }
					   }while(!haizz);
				   		}
			   	  	subsum=input[i]*weight[i];
			    	sum=sum+subsum;
				   }
		   catch (InputMismatchException e) { 
			   do {   
			      try {
				   Scanner scan2 = new Scanner(System.in); 
				   System.out.println("\n\t\t----------------------------");
				   System.out.println("\t\t   You must enter integer");
				   System.out.println("\t\t----------------------------"); 
				   if(x==1) {
					   i=0;
					   System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");
				   			}
				   else {System.out.print("\n"+question[i]+description[i]+weight[i]+"\t\t");}
				   input[i]=scan2.nextInt();
				   x=2;
				   if(input[i]<0) {
				   		do {
				   			try {
				   			if(i==0) {
				   				i=0;
				   				input[i]=0;
				   				System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t   Only accept positive integer.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;
				   			}
				   			else {
				   			i=i-1;
				   			input[i]=0;
						   System.out.println("\n\t\t----------------------------");
						   System.out.println("\t\t   Only accept positive integer.");
						   System.out.println("\t\t----------------------------");
						   haizz=true;
				   		}
				   			}catch(Exception e1) {
				   				
				   			}
						   
					   }while(!haizz);
				   		}
				   sum=sum+input[i]*weight[i];
				done=true;
				  
			   } catch (InputMismatchException e2) {
				//done=false;
			   }
			   
			   }while(!done);
			   }
		   }		
		total +=sum;
		System.out.println("\n=============================================================================================================");
		System.out.println("\t\t\t"+ansName+" = "+ sum);
		totalSum =sum;
		}
		
	 	void formula2(String q,String[] question, double[] weight,int userInput, String ansName) { 
		     
			int [] input = new int[userInput];
			int i;
			int E1_8=0;
			int x=2;
			boolean done = false;
			boolean haizz = false;
			double sum=0;
			double subsum;
			
	 	for(i=0;i<userInput; i++) {
	 		Scanner scan = new Scanner(System.in);
	 		if(x==1) {
	 			i=0;
	 		System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");
	 		}
	 		else{System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");}
	 			try {
	 				input[i]=scan.nextInt();
	 				x=2;
	 					if(input[i]>=0 || input[i]<=5) {
	 						if(i>=0 && i<=5) {
	 							if(input[i]>=0 && input[i]<3) {
	 								E1_8++;
	 								}
	 							}	
	 							
	 							else if (i>5) {
	 								if (input[i]>3 && input[i]<=5) {
	 									E1_8++;
	 								}
	 							}
	 						}
	 					totalE=E1_8;
	 					haizz=true;
			   	
			   	  	if(input[i]<0 || input[i]>5) {
				   		do {
				   		try {
				   			if(i==0) {
				   				i=0;
				   				input[i]=0;
				   				   System.out.println("\n\t\t----------------------------");
								   System.out.println("\t\t Rate each factor from 0 to 5.");
								   System.out.println("\t\t----------------------------");
								   x=1;
								   haizz=true;  
				   			 }else {
				   				 i=i-1;
				   				 input[i]=0;
				   				 System.out.println("\n\t\t----------------------------");
				   				 System.out.println("\t\t  Rate each factor from 0 to 5.");
				   				 System.out.println("\t\t----------------------------");
				   				 haizz=true;
				   			     }  
				   		  }catch(Exception e) {	
				   		}
					   }while(!haizz);
				   		}
			   	  	subsum=input[i]*weight[i];
			    	sum=sum+subsum;
				   }
	 			
		   catch (InputMismatchException e) { 
			   do {   
			   try {
				   Scanner scan2 = new Scanner(System.in); 
				   System.out.println("\n\t\t----------------------------");
				   System.out.println("\t\t   You must enter integer");
				   System.out.println("\t\t----------------------------"); 
				   if(x==1) {
					   i=0;
				   System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");
				   }
				   else {System.out.print("\n"+q+(i+1)+""+question[i]+""+weight[i]+"\t\t");}
				   input[i]=scan2.nextInt();
				   x=2;
				   if(input[i]<0 || input[i]>5) {
					   do {
					   		try {
					   			if(i==0) {
					   				i=0;
					   				input[i]=0;
					   				   System.out.println("\n\t\t----------------------------");
									   System.out.println("\t\t Rate each factor from 0 to 5.");
									   System.out.println("\t\t----------------------------");
									   x=1;
									   haizz=true;  
					   			 }else {
					   				 i=i-1;
					   				 input[i]=0;
					   				 System.out.println("\n\t\t----------------------------");
					   				 System.out.println("\t\t  Rate each factor from 0 to 5.");
					   				 System.out.println("\t\t----------------------------");
					   				 haizz=true;
					   			     }  
					   		  }catch(Exception e2) {	
					   		}
						   }while(!haizz);
				   		}
				   sum=sum+input[i]*weight[i];
				   done=true;
				  
			   } catch (InputMismatchException e2) {
				
			   }
			   
			   }while(!done);
			   }
		   }
		total +=sum;
		System.out.println("\n=============================================================================================================");
		System.out.println("\t\t\t"+ansName+" = "+ sum);
		totalSum =sum;
		}
	 	
	 	void formula3(String q,String[] question,int userInput, String ansName) { 
		   
	 		int [] qty = new int[userInput]; 
			int [] average = new int[userInput];
			int i;
			boolean done = false;
			boolean haizz = false;
			int x=2;
			double sum=0;
			double subsum;
			
			for(i=0;i<userInput; i++) {
				Scanner scan = new Scanner(System.in);
				if(x==1) {
					i=0;
							System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
								}
				else {
						System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
							}
			   try {
				   	qty[i]=scan.nextInt();
				   	System.out.print("\t\t\t\t\t\t\t\t");
				   	average[i]=scan.nextInt();					   	
				   	x=2;
				   	  	if(qty[i]<0 || average[i]<0) {
					   		do {
					   		try {
					   			if(i==0) {
					   				//i=0;
					   				average[i]=0;
					   				qty[i]=0;
					   				System.out.println("\n\t\t----------------------------");
									   System.out.println("\t\t   Only accept positive integer.");
									   System.out.println("\t\t----------------------------");
									   x=1;
									   haizz=true;
					   			}
					   			else {
					   			i=i-1;
					   			average[i]=0;
					   			qty[i]=0;
					   			
							   System.out.println("\n\t\t----------------------------");
							   System.out.println("\t\t   Only accept positive integer.");
							   System.out.println("\t\t----------------------------");
							  
							   haizz=true;
					   		      }
							   
					   		}catch(Exception e) {
					   			
					   	    }
						   }while(!haizz);
					   		}
				   	  	subsum=average[i]*qty[i];
				    	sum=sum+subsum;
					   }
			   catch (InputMismatchException e) { 
				   do {   
				      try {
					   Scanner scan2 = new Scanner(System.in); 
					   System.out.println("\n\t\t----------------------------");
					   System.out.println("\t\t   You must enter integer");
					   System.out.println("\t\t----------------------------"); 
					   if(x==1) {
						   i=0;
					   System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");
					   			}
					   else {System.out.print("\n"+q+(i+1)+""+question[i]+"\t\t");}
					   qty[i]=scan2.nextInt();
					   System.out.print("\t\t\t\t\t\t\t\t");
					   average[i]=scan2.nextInt();
					   x=2;
					   if(qty[i]<0 || average[i]<0) {
					   		do {
					   			try {
					   			if(i==0) {
					   				i=0;
					   				average[i]=0;
					   				qty[i]=0;
					   				System.out.println("\n\t\t----------------------------");
									   System.out.println("\t\t   Only accept positive integer.");
									   System.out.println("\t\t----------------------------");
									   x=1;
									   haizz=true;
					   			}
					   			else {
					   			i=i-1;
					   			average[i]=0;
					   			qty[i]=0;
							   System.out.println("\n\t\t----------------------------");
							   System.out.println("\t\t   Only accept positive integer.");
							   System.out.println("\t\t----------------------------");
							   haizz=true;
					   		}
					   			}catch(Exception e1) {
					   				
					   			}
							   
						   }while(!haizz);
					   		}
					   sum=sum+average[i]*qty[i];
					done=true;
					  
				   } catch (InputMismatchException e2) {
					//done=false;
				   }
				   
				   }while(!done);
				   }
			   }		
			total +=sum;
			System.out.println("\n=============================================================================================================");
			System.out.println("\t\t\t"+ansName+" = "+ sum);
			totalSum =sum;
			}
			

	public void UUCP() {
			UUCP = total;  //UUCP= UUCW + UAW
		System.out.printf("\t\t\tUUCP (Unadjusted Use Case Points) = %.2f\n",UUCP);
	}
	public void TCF() {
		TCF = 0.6+(0.01 *totalSum ); //TCF= 0.6+(0.01 * TFACTOR)
		SzUC=UUCP*TCF; //SzUC=size use case
		System.out.printf("\t\t\tTCF (Technical Complexity Factors) = %.2f\n",TCF);
		System.out.printf("\t\t\tSize of the software = %.2f\n",SzUC);
	}
	public void ECF() {
		ECF =1.4+(-0.03*totalSum); //Environmental Complexity Factors (ECF)
		System.out.printf("\t\t\tECF (Environmental Complexity Factors)= %.2f\n",ECF);
	}
	public void UCP() {
		UCP =SzUC*ECF; //Use Case Point
		System.out.printf("\t\t\tUCP (Use Case Points) = %.2f\n",UCP);
	}
	public void ManHours() {
		if (totalE<3) {
		ManHours =UCP*20;
		}
		else {
		ManHours =UCP*28;	
		}
		System.out.printf("\t\t\t = %.2f  hours\n",ManHours);
	}
	public void AjustedManHours() {
		boolean done=false;
		do {
		try {
		System.out.print("\n\tPlease identify the assumptions and apply a coefficient as a percentage (%) : ");
		Scanner scan3=new Scanner(System.in);
		p=scan3.nextDouble();
		done=true;
		}catch(InputMismatchException e) {
			System.out.println("\n\t\t----------------------------");
			   System.out.println("\t\t   You must enter integer");
			   System.out.println("\t\t----------------------------"); 
		}
		}while(!done);
		AdjustedManHours=(1.0+ p/100 )*ManHours;
		System.out.printf("\t\t\t = %.2f  (adjusted man-hours)",AdjustedManHours);
	}
	public void WeightingReports() {
		r=AdjustedManHours+totalSum;
		System.out.printf("\t\t\t = %.2f  (total man-hours)",r);
	}
}

//====================================================================================================

class step1{ //Weighting Actors for complexity / Unadjusted Actor Weight (UAW)
	mainformula s1;
	step1(mainformula ans1){
		s1=ans1;
}
	public void run() {
		System.out.println("\n\nStep 1: Please insert number of actors: ");
		s1.textFormula("Use Case Type\t","\tDescription\t\t\t\t","Weight\t"," Number of Actors\t");
				String [] question= {"Simple\t   ","Average\t  ","Complex\t  "};
				String [] description= {"\t\tDefined API\t\t\t\t ","\t\tInteractive or Protocol driven interface ", "\t\tGraphical User Interface\t\t "};
		double [] weight =  {1,2,3};
		s1.formula(question,description,weight,3,"Total Actor Points");
	}
	} 


//==================================================================================================
 class step2{ //Weighting Use Case For Complexity/ Unadjusted Use Case Points (UUCP)
	mainformula s1;
	step2(mainformula ans1){
		s1=ans1;	
	}
	public void run() {
		System.out.println("\n\nStep 2: Please insert number of use cases: ");
		s1.textFormula("Actor Type","\tDescription\t\t","\tWeight\t"," Number of use cases\t");
		String [] question= {"Simple\t  ","Average\t  ","Complex\t  "};
		String[] description= {"\t3 or fewer transactions\t\t ","\t4 to 7 transactions\t\t ","\tGreater than 7 transaction\t "};
		double [] weight ={5,10,15};
		s1.formula(question,description,weight,3,"Total Use Cases");
		s1.UUCP();
		
	}
}	
	
//==================================================================================================
class step3{ //Weighting Technical Factors / Technical Complexity Factors (TCF)
	mainformula s1;
	step3(mainformula ans1){
		s1=ans1;
}
	public void run()  {
		System.out.println("\n\nStep 3: Please insert number of assessment: ");
		s1.textFormula("Factor","\t\t\tDescription\t\t\t","\t\tWeight\t\t","Project Rating\t");
	    String [] question= {"\t\tMust have a distributed solution\t\t\t ","\t\tMust respond to specific performance objectives\t\t ",
	    		             "\t\tMust meet end-user efficiency desires\t\t\t ","\t\tComplex internal processing\t\t\t\t ",
							 "\t\tCode must be reusable\t\t\t\t\t ","\t\tMust be easy to install\t\t\t\t\t ",
							 "\t\tMust be easy to use\t\t\t\t\t ","\t\tMust be portable\t\t\t\t\t ","\t\tMust be easy to change\t\t\t\t\t ",
							 "\t\tMust allow concurrent users\t\t\t\t ","\t\tIncludes special security features\t\t\t ",
							 "\t\tMust provide direct access for 3rd parties\t\t ","\t\tRequires special user training facilities\t\t "};
		double [] weight = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
		s1.formula2(" T",question,weight,13,"Total TFACTOR");
		s1.TCF();
	}
	}

//==================================================================================================
class step4{ //Weighting Experience Factors / Environmental Complexity Factors (ECF)
	mainformula s1;
	step4(mainformula ans1){
		s1=ans1;
}
	public void run()  {
		System.out.println("\n\nStep 4: Please insert number of assessment: ");
		s1.textFormula("Factor","\t\t\tDescription\t\t\t","Weight\t","\tProject Rating\t");
		String [] question= {"\t\tFamiliarity with FPT software process\t  ","\t\tApplication experience\t\t\t  ",
				             "\t\tParadigm experience (OO)\t\t  ","\t\tLead analyst capability\t\t\t  ",
							 "\t\tMotivation\t\t\t\t  ","\t\tStable requirements\t\t\t  ",
							 "\t\tPart-time workers\t\t\t ","\t\tDifficulty of programming language\t "};
		double [] weight = {1,0.5,1,0.5,0,2,-1,-1};
		s1.formula2(" E",question,weight,8,"Total EFACTOR");
		s1.ECF();
		s1.UCP();
		s1.ManHours();
		s1.AjustedManHours();
	}
	}

//====================================================================================================

class step5{ //Weighting Reports For Complexity
	mainformula s1;
	step5(mainformula ans1){
		s1=ans1;	
	}
	public void run() {
		System.out.println("\n\nStep 5: Please insert the quantity and average man-hours: ");
		s1.textFormula("\tNo.\t","Report Type\t","Quantity\t"," Average Man-hours\t");
				String [] question= {"\tSimple\t  ","\tAverage\t  ","\tComplex\t  "};
		s1.formula3("\tS",question,3,"Reporting man-hours");
		s1.WeightingReports();
	}
}	

//==================================================================================================

public class Ass extends mainformula {

	public static void main(String[] args) {
		
		mainformula f1 =new mainformula();
		step1 s1=new step1(f1);
		s1.run();
		step2 s2 = new step2(f1);
		s2.run();
		step3 s3 = new step3(f1);
		s3.run();
		step4 s4 = new step4(f1);
		s4.run();
		step5 s5 = new step5(f1);
		s5.run();
	}
}


