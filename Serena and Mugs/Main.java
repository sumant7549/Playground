#include<iostream>
using namespace std;
int main()
{
  int n,a[5],b,i,s=0;
  cin>>n>>b;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    s=s+a[i];
  }
  if(s<=b)
    cout<<"YES";
 
  else
    cout<<"NO";
}