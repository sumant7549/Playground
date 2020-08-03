#include<iostream>
using namespace std;
int main()
{


int n, Sum, Reminder;
 
  cin>>n;
  while(n >= 10)
  {
    for (Sum=0; n > 0; n= n/10)
    {
      Reminder = n % 10;
      Sum=Sum + Reminder;  
    }
    if(Sum >= 10)
    {
      n = Sum;
    }
    else
    {
      cout<<Sum;
      return 0;
    }
  } 
}