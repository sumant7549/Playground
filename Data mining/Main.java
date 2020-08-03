#include<iostream>
using namespace std;
int main()
{
 int a,no,r,Even = 0,Odd = 0;
 cin>>a;
  no = a;
  
  while(no>0)
  {
    r = no % 10;
    
    if(r % 2 ==0)
    {
     Even = Even + r;
     
        }
    if(r % 2 != 0)
    {
     Odd = Odd + r;
     
    }
    no = no / 10;
    
  }
  
  if(Odd == Even)
  {
    cout<<"Yes";
  }
  else 
  {
    cout<<"No";
  }
  
  
}