import javax.swing.JOptionPane;

   public class employeePayCalculator{
   //main method
   public static void main(String[] args){
         //variable declarations
         String employeeNum;
         String employeeNum2;
         String pay;
         String tax;
         String fedTax;
         String fica;
         int answerss = 0;
      //while loop to constantly keep gathering employee number
      while (answerss >= 0 )
      {
         employeeNum = JOptionPane.showInputDialog(null, "Enter employee number: ");
         int answerOne = Integer.parseInt(employeeNum);
     //if employee number equals zero, end program
     if (answerOne == 0)
     {
       JOptionPane.showMessageDialog(null, "Program ended ");
       System.exit(0);
       }
     //else statement to gather gross pay, state tax, fed tax, anf fica withholding
     else{
         pay = JOptionPane.showInputDialog(null, "Enter gross pay amount: ");
         double answerTwo = Double.parseDouble(pay);
     
         tax = JOptionPane.showInputDialog(null, "Enter state tax amount: ");
         double answerThree = Double.parseDouble(tax);
     
         fedTax = JOptionPane.showInputDialog(null, "Enter federal tax amount: ");
         double answerFour = Double.parseDouble(fedTax);
     
         fica = JOptionPane.showInputDialog(null, "Enter FICA withholding amount: ");
         double answerFive = Double.parseDouble(fica);
     
         double totalOut = answerThree+answerFour+answerFive;
         double grossPay = answerTwo-totalOut;
         //Display entered amounts to user using JOptionPane
         JOptionPane.showMessageDialog(null, "Gross pay: "+pay);
         JOptionPane.showMessageDialog(null, "State tax: "+tax);
         JOptionPane.showMessageDialog(null, "Federal Tax: "+fedTax);
         JOptionPane.showMessageDialog(null, "FICA withholding: "+fica);
         //Net pay displayed using JOptionPane
         JOptionPane.showMessageDialog(null, "The toal Net pay for the employee number entered is: "+grossPay);
      }
    }
  }
}
