package Pres_Layer;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Intrest1 implements Presented1{
	private static final Logger LOGGER=LogManager.getLogger(Intrest1.class);
	public static void main(String[] args) {
		Intrest1 object=new Intrest1();
		@SuppressWarnings({ "resource", "unused" })
		Scanner scanObj=new Scanner(System.in);
		LOGGER.info("Enter principle Amount :500 ");
		int Principle_Amount=500;
		LOGGER.info("Enter Rate of Interest :10 ");
		int Rate_Of_Interest=10;
		LOGGER.info("Time : 3");
		int Time=3;
		int k=object.Simple_Interest_Action(Principle_Amount,Rate_Of_Interest,Time);
		int k1=object.Compound_Interest_Action(Principle_Amount,Rate_Of_Interest,Time);
		LOGGER.info("Simple Interest : "+k);
		LOGGER.info("Compound Interest : "+k1);
	}

	public int Simple_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
		return Simple_Interest_result;
	}

	public int Compound_Interest_Action(int Principle_Amount, int Rate_Of_Interest, int Time) {
		double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
		//float result=(float)Compound_Interest_result;
		return (int)Math.round(Compound_Interest_result);
	}

}
