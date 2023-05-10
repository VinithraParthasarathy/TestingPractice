package Statements;

public class ControlSwitch {
	String checkproof = "LICENSE";
	String weekname = "WEDNESDAY";

	public void controlSwitch() 
{
		switch(checkproof)
	{
		case "passport":
			System.out.println(checkproof+"is a valid proof");	
			break;
	case"aadhar":
	System.out.println(checkproof+"is a valid proof");
	break;
	case"LICENSE":
		System.out.println(checkproof+" is a valid proof");
		break;
	}
		switch(weekname)
		{
		case "monday":
		System.out.println("1");	
		break;
		case "tuesday":
			System.out.println("2");	
			break;
		default:
			System.out.println("3");
			break;
		}
	}

	public static void main(String args[]) {
		ControlSwitch d = new ControlSwitch();
		d.controlSwitch();
	}

}