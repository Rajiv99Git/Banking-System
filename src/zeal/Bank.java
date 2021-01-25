
package zeal;


public class Bank { 

    static Object obj;
    private String name;
    private double balance;
    private int account;
    private final String password;
    private static int a=1001;
    public Bank(String n,double b,String p)
    {
        name=n;
        balance=b;
        password=p;
        account=a++;
        javax.swing.JOptionPane.showMessageDialog(null,"Your account is"+account);
    }     

    Bank(String text) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void deposit(double d)
    {
        balance=balance+d;
        javax.swing.JOptionPane.showMessageDialog(null,"Your new balance"+balance);
    }
    public void withdraw(double d)
    {
        if(balance>=d)
        {
            balance=balance-d;
            javax.swing.JOptionPane.showMessageDialog(null,"Your new balance"+balance);
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null,"Insuffient balance");
    }
    public String getpass()
    {
        return password;
    }
    public double getBal()
    {
        return balance;
    }
    public int getAcc()
    {
        return account;
    }

    Bank get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
