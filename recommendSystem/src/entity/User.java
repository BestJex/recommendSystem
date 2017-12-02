package entity;

public class User implements Comparable<User> {
	private String userId;      // �û���ʶ
	private String itemId;      // ��Ʒ��ʶ
	private int behaviorType;   // �û�����Ʒ����Ϊ����,����Ϊ��,����������ղء��ӹ��ﳵ�����򣬶�Ӧȡֵ�ֱ���1��2��3��4.
	private String userGeoHash; // �û�λ�õĿռ��ʶ
	private String itemCategory;// ��Ʒ�����ʶ
	private String time;        // ��Ϊʱ��
	private int count;
	private double weight;      // Ȩ��
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public int getBehaviorType() {
		return behaviorType;
	}
	public void setBehaviorType(int behaviorType) {
		this.behaviorType = behaviorType;
	}
	
	public String getUserGeoHash() {
		return userGeoHash;
	}
	public void setUserGeoHash(String userGeoHash) {
		this.userGeoHash = userGeoHash;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", itemId=" + itemId
				+ ", behaviorType=" + behaviorType + ", count=" + count + "]";
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(User o) {
		return (int)((-1) * (this.weight - o.weight));
	}
	
}
