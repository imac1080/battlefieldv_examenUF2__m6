package practica;
// Generated 20-ene-2020 17:31:08 by Hibernate Tools 5.4.7.Final

/**
 * Bfplayer generated by hbm2java
 */
public class Bfplayer implements java.io.Serializable {

	private String userId;
	private int classId;
	private int primaryWeapon;
	private int device1;
	private int kills;
	private int deads;

	public Bfplayer() {
	}

	public Bfplayer(String userId, int classId, int primaryWeapon, int device1, int kills, int deads) {
		this.userId = userId;
		this.classId = classId;
		this.primaryWeapon = primaryWeapon;
		this.device1 = device1;
		this.kills = kills;
		this.deads = deads;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getPrimaryWeapon() {
		return this.primaryWeapon;
	}

	public void setPrimaryWeapon(int primaryWeapon) {
		this.primaryWeapon = primaryWeapon;
	}

	public int getDevice1() {
		return this.device1;
	}

	public void setDevice1(int device1) {
		this.device1 = device1;
	}

	public int getKills() {
		return this.kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeads() {
		return this.deads;
	}

	public void setDeads(int deads) {
		this.deads = deads;
	}

}
