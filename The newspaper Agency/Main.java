#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int  w,x,y,profit;
  w=1000;
  x=2;
  y=1;
  std::cin>>w>>x>>y;
  profit=(w*x)-(w*y)-100;
  std::cout<<profit;
  
}