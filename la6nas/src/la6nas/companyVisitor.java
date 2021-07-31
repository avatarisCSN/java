
package la6nas;

public class companyVisitor extends Trevel {
	  public String info2;

	    public companyVisitor (String nameOfCompany, String info2) {
	        super(nameOfCompany);
	        this.info2 = info2;
	    }

	    public String getInformation() {
	        return info2;
	    }
}