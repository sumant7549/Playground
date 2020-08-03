#include<iostream>
using namespace std;
int main()
{
  int f_shirt,f_discount,f_ship;
  int s_shirt,s_discount,s_ship;
  int a_shirt,a_discount,a_ship;
  cin>>f_shirt>>f_discount>>f_ship;
  cin>>s_shirt>>s_discount>>s_ship;
  cin>>a_shirt>>a_discount>>a_ship;
 
  f_discount=(f_shirt*f_discount)/100;
  s_discount=(s_shirt*s_discount)/100;
  a_discount=(a_shirt*a_discount)/100;
  int f_amt=(f_shirt-f_discount)+f_ship;
   int s_amt=(s_shirt-s_discount)+s_ship;
   int a_amt=(a_shirt-a_discount)+a_ship;
 
if(f_amt<=s_amt&&f_amt<a_amt){

cout<<"In Flipkart Rs."<<f_amt;
cout<<"\nIn Snapdeal Rs."<<s_amt;
 cout<<"\nIn Amazon Rs."<<a_amt;
  cout<<"\nHe will prefer Flipkart";


}  else
if(s_amt<=f_amt&&s_amt<a_amt){

cout<<"In Flipkart Rs."<<f_amt;
cout<<"\nIn Snapdeal Rs."<<s_amt;
 cout<<"\nIn Amazon Rs."<<a_amt;
  cout<<"\nHe will prefer Snapdeal";


}  
  else{

cout<<"In Flipkart Rs."<<f_amt;
cout<<"\nIn Snapdeal Rs."<<s_amt;
 cout<<"\nIn Amazon Rs."<<a_amt;
  cout<<"\nHe will prefer Amazon";

}  
  
}
