package GameProject;

public class Program {
		private int id;
		private String nickName;
		private String price;
		
		public Program(int id, String nickName, String price) {
			super();
			this.id = id;
			this.nickName = nickName;
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
		
}
