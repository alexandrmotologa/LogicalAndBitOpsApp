
public class LogicalAndBitOpsApp {

	public static void main(String[] args) {
		
		//CONDITIONS
		char windDirection = 'N';
		int minSpeedKmH = 200;
		int maxSpeedKmH = 400;
		boolean freeRoad = true;
		
		//PLANE
		char planeDirection = 'N';
		int planeSpeedKmH = 400;
		boolean critical = false;
		
		//OUT
		boolean willLand = freeRoad == true && critical == true 
				||
				freeRoad == true && planeSpeedKmH >= minSpeedKmH && planeSpeedKmH <= maxSpeedKmH
				&&
				windDirection == planeDirection
				;
		System.out.println("Will the plane land? " + willLand);

	}

}
