package entity;

public class Zamovl {
	private int Zamovl_id;
	private int Project_id;
	private int KodZamovl_id;
	private String DataRegZamovl;
	private String NameZamovl;
	private String TypeZamovl;
    private int	 StatusZam;
    private String Prioritet;
	
	public Zamovl(int a, int b, int c, String d, String e, String f, int g, String h){
		setZamovl_id(a);
		setProject_id(b);
		setKodZamovl_id(c);
		setDataRegZamovl(d);
		setNameZamovl(e);
		setTypeZamovl(f);
		setStatusZam(g);
		setPrioritet(h);
		
	}
	public int getZamovl_id() {
		return Zamovl_id;
	}
	public void setZamovl_id(int zamovl_id) {
		Zamovl_id = zamovl_id;
	}
	public int getProject_id() {
		return Project_id;
	}
	public void setProject_id(int project_id) {
		Project_id = project_id;
	}
	public int getKodZamovl_id() {
		return KodZamovl_id;
	}
	public void setKodZamovl_id(int kodZamovl_id) {
		KodZamovl_id = kodZamovl_id;
	}
	public String getDataRegZamovl() {
		return DataRegZamovl;
	}
	public void setDataRegZamovl(String dataRegZamovl) {
		DataRegZamovl = dataRegZamovl;
	}
	public String getNameZamovl() {
		return NameZamovl;
	}
	public void setNameZamovl(String nameZamovl) {
		NameZamovl = nameZamovl;
	}
	public String getTypeZamovl() {
		return TypeZamovl;
	}
	public void setTypeZamovl(String typeZamovl) {
		TypeZamovl = typeZamovl;
	}
	public String getPrioritet() {
		return Prioritet;
	}
	public void setPrioritet(String prioritet) {
		Prioritet = prioritet;
	}
	public int getStatusZam() {
		return StatusZam;
	}
	public void setStatusZam(int statusZam) {
		StatusZam = statusZam;
	}
	

}
