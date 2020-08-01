import java.io.*;
import java.util.*;
import java.util.Calendar;

class staff
{
String sid,sname,desg,gender;
int salary;
void new_staff()
{
Scanner input=new Scanner(System.in); 
System.out.print("ID:-");				sid=input.nextLine();
System.out.print("NAME:-");				sname=input.nextLine();
System.out.print("DESIGINATION:-");		desg=input.nextLine();
System.out.print("GENDER:-");gender=	input.nextLine();
System.out.print("SALARY:-");salary=	input.nextInt();
}
void staff_info()
{
System.out.println(sid+"\t"+sname+"\t"+gender+"\t"+salary);
}
}


class doctor
{
String did,dname,specilist,appoint,doc_qual;
int droom;
 
void new_doctor()
{
Scanner input=new Scanner(System.in); 
System.out.print("ID:-");				did=input.nextLine();
System.out.print("NAME:-");				dname=input.nextLine();
System.out.print("SPECILIZATION:-");	specilist=input.nextLine();
System.out.print("work time:-");		appoint=input.nextLine();
System.out.print("QUALIFICATION:-");	doc_qual=input.nextLine();
System.out.print("ROOM NO.:-");			droom=input.nextInt();
}
void doctor_info()
{
System.out.println(did+"\t"+dname+"  \t"+specilist+"     \t"+appoint+"    \t"+doc_qual+"       \t"+droom);

}
}


class patient
{
String pid,pname,disease,gender,admit_status;
int age;
 
void new_patient()
{
Scanner input=new Scanner(System.in);
System.out.print("ID:-");			pid=input.nextLine();
System.out.print("NAME:-");			pname=input.nextLine();
System.out.print("DISEASE:-");		disease=input.nextLine();
System.out.print("GENDER:-");		gender=input.nextLine();
System.out.print("ADMIT_STATUS:-");	admit_status=input.nextLine();
System.out.print("AGE:-");			age=input.nextInt();
}
void patient_info()
{
System.out.println(pid+"\t"+pname+" \t"+disease+"     \t"+gender+"      \t"+admit_status+"\t"+age);
}
}


class medical
{
String med_name,med_comp,exp_date;
int med_cost,count;

void new_medi()
{
Scanner input=new Scanner(System.in); 
System.out.print("NAME:-");					med_name=input.nextLine();
System.out.print("COMPANY:-");				med_comp=input.nextLine();
System.out.print("EXPIRY DATE:-");			exp_date=input.nextLine();
System.out.print("COST:-");					med_cost=input.nextInt();
System.out.print("NO OF UNIT:-");			count=input.nextInt();
}
void find_medi()
{
System.out.println(med_name+"  \t"+med_comp+"    \t"+exp_date+"     \t"+med_cost);
}
}

class lab
{
String facility;
int lab_cost;

void new_feci()
{
Scanner input=new Scanner(System.in); 
System.out.print("FACILITY:-");facility=input.nextLine();
System.out.print("cost:-");lab_cost=input.nextInt();
}
void feci_list()
{
System.out.println(facility+"\t\t"+lab_cost);
}
}


class facility  
{
 
String fec_name;
void add_feci()
{
Scanner input=new Scanner(System.in);
System.out.print("FACILITY:-");fec_name=input.nextLine();

}
void show_feci()
{
System.out.println(fec_name);
}
}


public class HOSPITALMGT
{
public static void main(String args[])
{
String months[] = {
"Jan", "Feb", "Mar", "Apr",
"May", "Jun", "Jul", "Aug",
"Sep", "Oct", "Nov", "Dec"};
Calendar calendar = Calendar.getInstance();
//System.out.println("--------------------------------------------------------------------------------");
int count1=4,count2=4,count3=4,count4=4,count5=4,count6=4;

System.out.println("--------------------------------------------------------------------------------");
System.out.println("                          ***HOSPITAL MANAGEMENT SYATEM***");
System.out.println("--------------------------------------------------------------------------------");
System.out.print("Date: "+months[calendar.get(Calendar.MONTH)]+" " + calendar.get(Calendar.DATE) + " "+calendar.get(Calendar.YEAR));
System.out.println("\t\t\t\t\t\tTime: "+calendar.get(Calendar.HOUR) + ":"+calendar.get(Calendar.MINUTE) + ":"+calendar.get(Calendar.SECOND));

doctor[] d=new doctor[25];
patient[] p=new patient[100];
lab[] l=new lab[20];
facility[] f=new facility[20];
medical[] m=new medical[100];
staff[] s=new staff[100];
int i;
for(i=0;i<25;i++)
d[i]=new doctor();
for(i=0;i<100;i++)
p[i]=new patient();
for(i=0;i<20;i++)
l[i]=new lab();
for(i=0;i<20;i++)
f[i]=new facility();
for(i=0;i<100;i++)
m[i]=new medical();
for(i=0;i<100;i++)
s[i]=new staff();

d[0].did="21"; d[0].dname="Dr.ANURAG"; d[0].specilist="ENT"; d[0].appoint="10-4"; d[0].doc_qual="MBBS,Md"; d[0].droom=17;   
d[1].did="32"; d[1].dname="Dr.VIKRAM"; d[1].specilist="Caodiologist."; d[1].appoint="10-4"; d[1].doc_qual="MBBS,md"; d[1].droom=45;   
d[2].did="17"; d[2].dname="Dr.AMIT"; d[2].specilist="Child spl"; d[2].appoint="10-4"; d[2].doc_qual="MBBS"; d[2].droom=8;   
d[3].did="33"; d[3].dname="Dr.PRAMOD"; d[3].specilist="Arthologist"; d[3].appoint="10-4"; d[3].doc_qual="MBBS,ms"; d[3].droom=40;   

p[0].pid="12"; p[0].pname="PANKAJ"; p[0].disease="cough"; p[0].gender="male"; p[0].admit_status="y"; p[0].age=30; 
p[1].pid="13"; p[1].pname="ANIKET"; p[1].disease="cold"; p[1].gender="male"; p[1].admit_status="y"; p[1].age=23; 
p[2].pid="14"; p[2].pname="GAURAV"; p[2].disease="Fever"; p[2].gender="male"; p[2].admit_status="y"; p[2].age=45; 
p[3].pid="15"; p[3].pname="TEJAS"; p[3].disease="addiction"; p[3].gender="male"; p[3].admit_status="y"; p[3].age=25; 

m[0].med_name="corex"; m[0].med_comp="cino pvt"; m[0].exp_date="9-5-16"; m[0].med_cost=55; m[0].count=8;
m[1].med_name="nytra"; m[1].med_comp="ace pvt"; m[1].exp_date="4-4-15"; m[1].med_cost=500; m[1].count=5;
m[2].med_name="brufa"; m[2].med_comp="reckitt"; m[2].exp_date="12-7-17"; m[2].med_cost=50; m[2].count=56;
m[3].med_name="pride"; m[3].med_comp="ddf pvt"; m[3].exp_date="12-4-12"; m[3].med_cost=1100; m[3].count=100;

l[0].facility="x-ray     "; l[0].lab_cost=800;
l[1].facility="ct scan   "; l[1].lab_cost=1200;
l[2].facility="or scan   "; l[2].lab_cost=500;
l[3].facility="blood bank"; l[3].lab_cost=50;

f[0].fec_name="AMBULANCE";
f[1].fec_name="ADMIT FACILITY";
f[2].fec_name="CANTEEN";
f[3].fec_name="24hrs DOCTOR";

s[0].sid="22"; s[0].sname="RAVI"; s[0].desg="worker"; s[0].gender="male"; s[0].salary=5000;
s[1].sid="23"; s[1].sname="KOMAL"; s[1].desg="nurse"; s[1].gender="female"; s[1].salary=2000;
s[2].sid="24"; s[2].sname="RAJU"; s[2].desg="worker"; s[2].gender="male"; s[2].salary=5000;
s[3].sid="25"; s[3].sname="RANI"; s[3].desg="nurse"; s[3].gender="female"; s[3].salary=20000;

Scanner input=new Scanner(System.in); 

int choice,j,c1,status=1,s1=1,s2=1,s3=1,s4=1,s5=1,s6=1;
while(status==1)
{

System.out.println("\n         MADE BY:- AMIT YADAV && ANURAG VERMA                           ");
System.out.println("\n                                    MAIN MENU");
System.out.println("--------------------------------------------------------------------------------");
System.out.println("1.DOCTOR  2. PATIENT  3.MEDICAL  4.LAB  5. FACILITY  6.STAFF 7.EXIT");
System.out.println("--------------------------------------------------------------------------------");

choice=input.nextInt();
switch(choice)
{
case 1:
   {
System.out.println("--------------------------------------------------------------------------------");
   System.out.println("                      **DOCTOR SECTION**");
   System.out.println("--------------------------------------------------------------------------------");
   s1=1;
   while(s1==1)
   {
    System.out.println("1.new entry\n2.doctor list");
    c1=input.nextInt();
    switch(c1)
    {
    case 1:
      {
      d[count1].new_doctor();count1++;
      break;
      }
    case 2:
      {
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("id \t NAME\t SPECIALIST \t TIMING \t QUALIFICATION \t ROOM NO");
      System.out.println("--------------------------------------------------------------------------------");
     for(j=0;j<count1;j++)
       {
       d[j].doctor_info();
       }
      break;
      }
     }
     
     System.out.println("RETURN BACK press (1/0) for more");
     s1=input.nextInt();
    }
    break;
 }
case 2:
{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("                     **PATIENT SECTION**");
System.out.println("--------------------------------------------------------------------------------");
s2=1;
while(s2==1)
{
System.out.println("1.new entry\n2.patient list");
c1=input.nextInt();
switch(c1)
{
case 1:{p[count2].new_patient();count2++;break;}
case 2:
{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("id \t name \t disease \t gender \t admit_status \t age");
System.out.println("--------------------------------------------------------------------------------");
for(j=0;j<count2;j++){p[j].patient_info();}break;}
}
System.out.println("RETURN BACK press (1/0) for more");
s2=input.nextInt();
}
break;
}
case 3:
{
s3=1;
System.out.println("--------------------------------------------------------------------------------");
System.out.println("                     **MEDICAL SECTION**");
System.out.println("--------------------------------------------------------------------------------");
while(s3==1)
{
System.out.println("1.new entry\n2.medicine list");
c1=input.nextInt();
switch(c1)
{
case 1:{m[count3].new_medi();count3++;break;}
case 2:
{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("name \t company \t expirity date \t cost");
System.out.println("--------------------------------------------------------------------------------");
for(j=0;j<count3;j++){m[j].find_medi();}break;}
}
System.out.println("RETURN BACK press (1/0) for more");
s3=input.nextInt();
}
break;
}
case 4:
{
s4=1;
System.out.println("--------------------------------------------------------------------------------");
System.out.println("                    **LABORATRY SECTION**");
System.out.println("--------------------------------------------------------------------------------");
while(s4==1)
{
System.out.println("1.new entry \n2.lab list");
c1=input.nextInt();
switch(c1)
{
case 1:{l[count4].new_feci();count4++;break;}
case 2:
{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("facility\t\tcost");
System.out.println("--------------------------------------------------------------------------------");
for(j=0;j<count4;j++){l[j].feci_list();
}
break;
}
}
System.out.println("RETURN BACK press (1/0) for more");
s4=input.nextInt();
}
break;
}
case 5:
{
s5=1;
System.out.println("--------------------------------------------------------------------------------");
System.out.println("          **HOSPILITY FACILITY SECTION**");
System.out.println("--------------------------------------------------------------------------------");
while(s5==1)
{
System.out.println("1.new entry\n2.facility list");
c1=input.nextInt();
switch(c1)
{
case 1:{f[count5].add_feci();count5++;break;}
case 2:{
System.out.println("--------------------------------------------------------------------------------");
System.out.println("hospility facility are:-");
System.out.println("--------------------------------------------------------------------------------");
for(j=0;j<count5;j++){f[j].show_feci();}break;}
}
System.out.println("RETURN BACK press (1/0) for more");
s5=input.nextInt();
}
break;
}
case 6:
{
s6=1;
System.out.println("--------------------------------------------------------------------------------");
System.out.println("                       **STAFF SECTION**");
System.out.println("--------------------------------------------------------------------------------");
  while(s6==1)
  {

  String a="nurse",b="worker",c="security";
   System.out.println("1.new entry\n2.nurse list\n3.worker list \n4.securuty list");
   c1=input.nextInt();
   switch(c1)
   {
     case 1:{s[count6].new_staff();count6++;break;}
     case 2:
       {
System.out.println("--------------------------------------------------------------------------------");

       System.out.println("id \t name \t gender \t salary");
System.out.println("--------------------------------------------------------------------------------");
         for(j=0;j<count6;j++)
         {
         if(a.equals(s[j].desg))
            s[j].staff_info();
         }
       break;
       }
     case 3:
       {
System.out.println("--------------------------------------------------------------------------------");
       System.out.println("id \t name \t gender \t salary");
System.out.println("--------------------------------------------------------------------------------");
       for(j=0;j<count6;j++)
         {
         if(b.equals(s[j].desg))
            s[j].staff_info();
         }
       break;
       }
     case 4:
       {
System.out.println("--------------------------------------------------------------------------------");
       System.out.println("id \t name \t gender \t salary");
System.out.println("--------------------------------------------------------------------------------");
        for(j=0;j<count6;j++)
        {
        if(c.equals(s[j].desg))
        s[j].staff_info();
        }
       break;
       }
    }
   System.out.println("RETURN BACK press (1/0) for more");
   s6=input.nextInt();
   }
break;
}
case 7:
{
break;
}
default:
{
System.out.println("enter wrong choice!");
}
}
System.out.println("RETURN MAIN MENU press (1/0) for more");
status=input.nextInt();
}
}
}