#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int  enc_n, nt,num;
  int sum = 0;
  cin>>enc_n>>nt;
  num = enc_n+nt;
  for(int i=1;i<num;i++)
  {
    if(num%i==0)
    {
      sum = sum+i;
    }
  }
  if(num==sum)
  {
    cout<<"They can read the message";
  }
  else{
    cout<<"They can't read the message";
  }
  return 0;
}
  