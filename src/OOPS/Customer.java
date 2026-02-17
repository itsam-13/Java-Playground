package OOPS;

class Customer {

    protected int custId;
    protected String custName;

    public Customer() {
        System.out.println("Customer");
    }
    public Customer(int custId, String custName) {
        custId = custId;
        custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int cid) {
        custId = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String cname) {
        custName = cname;
    }
}

class Guest extends Customer {

    private int delCharges;
    public Guest(){
        System.out.println("Guest Customer");
    }
    public Guest(int custId, String custName, int delCharges) {

        setCustId(custId);
        setCustName(custName);
        this.delCharges = delCharges;

    }
}

class Regular extends Customer {

    protected int disc;
    public Regular(){
        System.out.println("Regular Customer");
    }
    public Regular(int custId, String custName, int disc) {
        setCustId(custId);
        setCustName(custName);
        this.disc = disc;
    }
}

class Premium extends Regular {

    private int points;
    public Premium(){
        System.out.println("Premium Customer");
    }
    public Premium(int cid,String name,int disc, int points) {
        setCustName(name);
        setCustId(cid);
        setCustName("Premium");
        this.points = points;

    }
}

class Tester {

    public static void main(String[] args) {
        Customer cobj = new Customer();
        Guest oGuest =new Guest();
        Regular oRegular = new Regular();
        Premium oPremium = new Premium();
    }
}