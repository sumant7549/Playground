#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int birthyear,currentyear;
  cin>>birthyear>>currentyear;
  int age=currentyear-birthyear;
  if(age<0)
  {
    age=age+100;
    cout<<age;
  }
  else
  {
    cout<<age;
  }
}