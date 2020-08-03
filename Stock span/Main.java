#include<iostream>
using namespace std;
int main()
{
  int n,c=2,m,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"1"<<endl;
  for(i=1;i<n;i++)
  {
    if(a[i]<a[i-1])
    {
        cout<<"1"<<endl;
    }
    else
    {
        cout<<c<<endl;
      c=c+2;
    }
  }
  
}