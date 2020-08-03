#include<iostream>
using namespace std;
int main()
{
  int x,y,x1,y1,sum,sum1;
  cin>>x>>y>>x1>>y1;
  sum=x+x1+(y+y1)/100;
  sum1=(y+y1)%100;
   
  cout<<sum<<"\n"<<sum1;
}