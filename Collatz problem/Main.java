#include<iostream>
using namespace std;
int main()
{
  int a,b,count=0;
  cin>>a;
  b = a;
  cout<<a<<"\n";
  do
  {
    if(b%2==0)
    {
      b = b/2;
      count = count + 1;
      cout<<b<<"\n";
    }
    else if(b==1)
    {
      //cout<<b;
     break;
      
    }
    else
    {
      b = 3*b + 1;
      count = count + 1;
      cout<<b<<"\n";
    }
    
  } while(b!=1); 
  cout<<count;
 
}