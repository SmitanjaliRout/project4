package chr.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

public class ReadCurrentSystem43 {

	public static void main(String[] args) {
	Date dt=new Date();
	System.out.println(dt);
	//To create our own format
	DateFormat df=new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
	System.out.println(df.format(dt));

	}

}
