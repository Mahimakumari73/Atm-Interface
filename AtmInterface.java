import java.util.*;  
    class ATM  
    {  
        int User_pin,User_id;
         ATM(int id,int pin)
        {
           User_id=id;
           User_pin=pin;
        }
    }
    class AtmInterface 
    {
        public static void main(String args[] )  
        { 
            ArrayList<String> t=new ArrayList<>();   
            int bal= 20000, withdraw, deposit; 
            int money=0;  
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter user id:");
            int id=sc.nextInt(); 
            System.out.println("Enter pin:");
            int pin=sc.nextInt();
            ATM user=new ATM(id,pin); 
            while(true)  
            {  
                System.out.println("WELCOME!!!");
                System.out.println("1:Transactions History");  
                System.out.println("2: Withdraw");  
                System.out.println("3: Deposit");  
                System.out.println("4: Transfer");  
                System.out.println("5: Exit");
                System.out.println("choose an option:");    
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:
                     if(t.size()==0)
                     {
                        System.out.println("No Transactions are done yet!!!");
                     }
                     else
                    {
                        System.out.println(" Your Transactions Details!!!");
                        System.out.println();
                        for(int i=0;i<t.size();i++)
                        {
                           System.out.println(t.get(i));
                        }
                   }
                    System.out.println(); 
                   case 2:  
                     System.out.print("Enter money to be withdrawn:");  
                     withdraw = sc.nextInt();  
                     if(bal >= withdraw)  
                     {    
                        bal = bal - withdraw;  
                        System.out.println("Withdrawn Money Successfully\n"); 
                        System.out.println("Your Current Balance is "+bal); 
                     }  
                    else  
                    {  
                       System.out.println("Insufficient Balance\n");  
                    }   
                   break;  
                   case 3:  
                     System.out.print("Enter money to be deposited:\n");   
                     deposit = sc.nextInt();   
                     bal = bal + deposit;  
                     System.out.println("successfully deposited\n");  
                     System.out.println("Your Current Balance is "+bal);
                     break;  
                   case 4:   
                     System.out.println("Enter account id to which you want to transfer");
                     int account_id=sc.nextInt();
                     System.out.println("Enter cash you want to transfer");
                     money=sc.nextInt();
                     if(money<=bal)
                     {
                         bal-=money;
                         t.add(money+" transfered to the account "+account_id);
                         System.out.println(money+" transfered to the account "+account_id+" successfully");
                         System.out.println("Your Current Balance is "+bal);
                     }
                     else
                    {
                        System.out.println("No suffcient money in your account");
                    }
                    System.out.println();  
                    break; 
                    case 5:  
                    System.out.println("You can remove your card\n"); 
                    System.out.println("Thank you visit again...");
                    System.exit(0); 
                }  
            }  
        } 
    } 
     