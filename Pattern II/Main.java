#include<iostream>
using namespace std;
int main()
{
  int a,b =1;
  cin>>a;
  for(int i = 1; i<=a ; i++)
  {
    if(i%2!=0)
    {
       for(int j = 1 ; j<=i ; j++)
    {
     cout<<b; 
      if( j!=i)
       {
        cout<<"*";
      }
       
      ++b;
    }
      b = b + i; 
      
    }
    
    else
    {
    for(int j = 1 ; j<=i ; j++)
    {
     cout<<b; 
      if( j!=i)
       {
        cout<<"*";
      }
       
      --b;
    }
      b = b + i + 1;
    }
    cout<<"\n";
  }
}