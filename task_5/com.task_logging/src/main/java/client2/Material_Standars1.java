package client2;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Material_Standars1 {
	private static final Logger LOGGER=LogManager.getLogger(Material_Standars1.class);
	static String Material_Standard="";
	static int Area;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		Material_Standars1 object=new Material_Standars1();
		LOGGER.info("Enter Material standard : standard materials or above standard materials or high standard materials or high standard materials and fully automated home:");
		Material_Standard=scan.nextLine();
		 LOGGER.info("Enter Area if you want fully automated house otherwise make it 0 :0 ");
		 Area=scan.nextInt();
		 String amount=object.Constructions_Materials(Material_Standard,Area);
		LOGGER.info("Amount estimated for Construction :"+amount);
		
	}
	
	public String Constructions_Materials(String Material_Standard, int Area) {
		if(Material_Standard.contentEquals("standard materials")&&Area==0) {
			return "1200INR";
		}
		if(Material_Standard.contentEquals("above standard materials")&&Area==0)
			return "1500INR";
		if(Material_Standard.contentEquals("high standard materials")&&Area==0)
		return "1800INR";
		if(Material_Standard.contentEquals("high standard materials and fully automated home")&&Area>0)
			return "2500INR";
			return null;
			}


}
