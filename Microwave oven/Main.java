#include<iostream>
using namespace std;
int main()
{
  int i;
  float p,q;
  cin>>i>>p;
    
  if(i==2)
  {
    q = p + p * 0.5;
    cout<<q;
  }
  else if(i==3)
  {
    q = 2*p;
    cout<<q;
  }
  else
  {
    cout<<"Number of items is more";
  }
  
  
}