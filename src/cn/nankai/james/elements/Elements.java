package cn.nankai.james.elements;
/**
 * 
 * @author james
 * 2015/06/09
 * night
 *
 */
public class Elements {
	//this class is used to hold all common characteristics of the wolrd
	//its like the periodic table of the elements
	//ID is corresponding to its location in the table
	private int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	private String name;
	private String chineseName;

}
