#include<iostream>
using namespace std;
int main()
{
  int a,sum=0,b,Turn = 0;
  cin>>a;
  do
  {
    cin>>b;
    sum = sum + b;
    Turn = Turn + 1;
  }while(sum<a);
   
  cout<<"The number of turns is "<<Turn;
 
}