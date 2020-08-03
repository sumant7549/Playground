#include<iostream>
using namespace std;
int main()
{
  int a;
  
  cin>>a;
  int b = a;
  for(int i = 1; i<=4 ; i++)
  {
    for(int j = 1; j<=i ; j++)
    {
     cout<<b;
    }
     b = b + 1;
    cout<<"\n";
  }
  b = b -1;
   for(int i = 4; i>=1 ; i--)
  {
    for(int j = i; j>=1 ; j--)
    {
     cout<<b;
    }
     b = b - 1;
    cout<<"\n";
  }
}