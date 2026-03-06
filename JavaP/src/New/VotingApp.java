package New;

public class VotingApp {
	
		private String VotingRights;
		private String Identity;
		
		public void setVotingRights(String VotingRights) {
			this.VotingRights=VotingRights;
		}
		public void setIdentity(String Identity) {
			this.Identity=Identity;
		}
		
		public String getVotingRights() {
			return VotingRights;
		}
		public String getIdentity() {
			return Identity;
		}
		
	 
		public static void main(String[] args) {
			VotingApp v= new VotingApp();
			v.setVotingRights("Yes, you are eligible");
			v.setIdentity("Prakhar");
			
			System.out.println("Voting Rights:" +v.getVotingRights());
			System.out.println("Identity:" +v.getIdentity());
	 
		}
	 
	}


