package BankingApp;

class Client{
    
    public void Welcome(){
        System.out.println("Welcome to our bank!");
    }
    
    private String name;
    private int acctnum;
    private int driversLicense;
    private String address;
    private Account account;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAcctNum(int acctnum){
        this.acctnum = acctnum;
    }
    
    public int getAcctNum(){
        return acctnum;
    }
    
    public void setDL(int driversLicense){
        this.driversLicense = driversLicense;
    }
    public int getDL(){
        return driversLicense;
    }
    
    public void setAddress(String address){
        this.address =  address;
    }
    public String getAddress(){
        return address;
    }
    public void setAccount(Account account){
        this.account=account;
    }
    public Account getAccount(){
        return account;
    }
    
}