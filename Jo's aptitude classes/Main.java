#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,gcd;
  cin>>a>>b>>c>>d;
  int small=0;
  if(a<b&&a<c){
    small=a;
} else if(a>b&&c>b){
  
  small=b;
  }    else{
  small=c;
  }
while(small>=1)
{
if(a%small==0 && b%small==0 && c%small==0){
gcd=small;
  break;

}
small--; 
  
}
  if(gcd==d){
 cout<<"Answer is correct."; 
   }else
  {
  cout<<"Answer is wrong.";
  }
}