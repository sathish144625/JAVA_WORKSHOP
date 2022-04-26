public class test
{
byte no;
char studentinitial;
String studentname;
short studentregno;
int mark;
double log;
float percentage;
boolean result=true;
long phonenumber;

public  static  void  main(String [] args )
{
test t = new test();
t.no=1;
t.studentinitial='S';
t.studentname="Sathish";
t.studentregno=1234;
t.mark=78;
t.log=68.f;
t.percentage=78l;
t.result=true;
t.phonenumber=9629006911l;


System.out.println("****************  STUDENT DETAILS  *****************");
System.out.println(" S.NO  : " + t.no +"\n STUDENTINIDIAL  " + t.studentinitial +"\n Student Name  :"+ t.studentname+"\n STUDENT REGISTER NUMBER  :"+ t.studentregno+"\n STUDENT MARK  :"+ t.mark+"\n STUDENT LOG  :"+ t.log+"\n STUDENT PERCENTAGE  :"+ t.percentage+"\n RESULT  :"+ t.result+"\n PHONE NUMBER  :"+ t.phonenumber);

	
}

}
