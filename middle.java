import java.util.*;
class middle{
public static void main(String args[]){
String s=new Scanner(System.in).next();
String output="";
int n1=s.length();
int n2=output.length();
int middle=n1/2;
while(n1>n2){
output=output+s.charAt(middle++);
n2++;
for(int i=0;i<n1-n2;i++)
System.out.print(" ");
System.out.println(output);
middle=middle%n1;
}
}
}
