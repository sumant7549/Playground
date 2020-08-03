#include<iostream>
using namespace std;
int main()
{
  int n,c,sum=0;
  cin>>n;
  while(n>0)
  {
    c = n%10;
    sum = sum+c;
    n=n/1000;
  }
  cout<<sum;
}