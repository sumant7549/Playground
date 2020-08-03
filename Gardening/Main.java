#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(2*r==n)
  {
    cout<<"It is a mango tree";
  }
  else if((c-1)*r==n)
  {
    cout<<"It is a mango tree";
  }
  else{
    cout<<"It is not a mango tree";
  }
}