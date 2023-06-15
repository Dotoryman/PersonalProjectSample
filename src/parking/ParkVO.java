package parking;

public class ParkVO {
		// 차량번호
		private String plateNumber;
		// 들어온 시간
		private int inTime;

		// 필드에 대한 게터/세터
		public String getPlateNumber() {
			return plateNumber;
		}

		public void setPlateNumber(String plateNumber) {
			this.plateNumber = plateNumber;
		}

		public int getInTime() {
			return inTime;
		}

		public void setInTime(int inTime) {
			this.inTime = inTime;
		}

		// equals() 메소드
		public boolean equals(Object obj) {
			if (obj instanceof ParkVO) {
				ParkVO parkVO = (ParkVO) obj;
				if (plateNumber.equals(parkVO.plateNumber)) {
					return true;
				}
			}

			return false;
		}

		// 생성자
		public ParkVO() {
			plateNumber = new String();
			inTime = 0;
		}
}
