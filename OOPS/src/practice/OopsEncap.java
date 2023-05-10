package practice;

public class OopsEncap {
public static void main (String args[]) 
{
OopsEnc f = new OopsEnc();

System.out.println("###LOCKER AMT###");    //GET
int lockerAmt = f.getLockerAmt();
System.out.println(lockerAmt);

f.setLockerAmt(500);                      //SET
int lockerAmt2 = f.getLockerAmt();
System.out.println(lockerAmt2);

System.out.println("###BOOK###");         //GET
String b = f.getBook();
System.out.println(b);

f.setBook("Bio");                         //SET
String b1 = f.getBook();
System.out.println(b1);

System.out.println("###NUM###");          //GET
int num = f.getNum(); 
System.out.println(num);

f.setNum(1000);                           //SET
int num2 = f.getNum();
System.out.println(num2);
}
}


