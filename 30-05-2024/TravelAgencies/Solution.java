package assign2;

import java.util.*;

public class Solution {
	
	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] agents) {
		int maxprice = 0;
		for(TravelAgencies agent : agents) {
			if(agent.price > maxprice) {
				maxprice = agent.price;
			}
		}
		
		return maxprice;
	}
	
	public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] agents, int regNo, String pakageType) {
		for(TravelAgencies agent : agents) {
			if(agent.regNo == regNo && pakageType.equals(agent.pakageType) && agent.flightFacility == true) {
				return agent;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelAgencies agents[] = new TravelAgencies[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			int regNo = sc.nextInt();
			sc.nextLine();
			String agencyName = sc.nextLine();
			String pakageType = sc.nextLine();
			int price = sc.nextInt();
			boolean flightFacility = sc.nextBoolean();
			agents[i] = new TravelAgencies(regNo, agencyName, pakageType, price, flightFacility);
		}
		int regNo = sc.nextInt();
		sc.nextLine();
		String packageType = sc.nextLine();
		System.out.println(findAgencyWithHighestPackagePrice(agents));
		TravelAgencies  agent = agencyDetailsforGivenIdAndType(agents, regNo, packageType);
		System.out.println(agent.agencyName+":"+agent.price);
	}

}
