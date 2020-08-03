#include<iostream>
using namespace std;
int main()
{
  int q,p,s = 0,t;
  cin>>q;
  p = q * q;
  t = p;
  int a,b=0;
  do
  {
    a = q % 10;
    b = b + a;
    q = q / 10;
  }while(q>0);
 
  
  
  do
  {
    t = p % 10;
    s = s + t;
    p = p / 10;
  }while(p>0  );
  
  if(s == b)
  {
    cout<<"Kaprekar Number";
  }
  else
  {
    cout<<"Not a Kaprekar Number";
  }
  
}