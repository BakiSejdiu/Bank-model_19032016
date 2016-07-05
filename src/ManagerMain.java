import javax.swing.*;
public class ManagerMain{
   
   public static void main(String[]args)  {
      
   // 1( A person's account) , 2(B person's account), 3(Bankier)	
      int a = new Integer(JOptionPane.showInputDialog("Write: 1,2 , or 3(bankier)")).intValue();    
      if (a==3)
      {    int b= new Integer(JOptionPane.showInputDialog("1 or 2")).intValue();               
         if (b==1)
         {       BankReader reader = new BankReader();
            BankAccount account = new BankAccount(0);
            BankWriter writer = new BankWriter("A person's account", account);
            AccountController controller =
               new AccountController(reader, writer, account);
            controller.processTransactions();}
            
         else if (b==2)
         {       BankReader reader = new BankReader();
            BankAccount account = new BankAccount(0);
            BankWriter writer = new BankWriter("B person's account", account);
            AccountController controller =
               new AccountController(reader, writer, account);
         
            controller.processTransactions();}
            
      }
      else if (a==1)
      {       BankReader reader = new BankReader();
         BankAccount account = new BankAccount(0);
         BankWriter writer = new BankWriter("B person's account", account);
         AccountController controller =
            new AccountController(reader, writer, account);
         controller.processTransactions();}
      
      else if (a==2)
      {       BankReader reader = new BankReader();
         BankAccount account = new BankAccount(0);
         BankWriter writer = new BankWriter("B person's account", account);
         AccountController controller =
            new AccountController(reader, writer, account);
         controller.processTransactions();}
   	
   	
   }

}
