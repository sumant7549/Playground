#include<iostream>
using namespace std;
int main()
{
  int a,b = 1;
  
  cin>>a;
  
  for(int i = 1; i<=a ; i++)
  {
    for(int j = 1; j<=i ; j++)      
    {
      cout<<b;
      if(j!=i)
      {
        cout<<"*";
      }
      
    }
    b++;
    cout<<"\n";
  }
   b = b - 1;
   for(int i = a; i>=1 ; i--)
  {  
    for(int j = i; j>=1 ; j--)      
    {
      cout<<b;
      if(j!=1)
      {
        cout<<"*";
      }
      
    }
    b--;
    cout<<"\n";
  }
 

}