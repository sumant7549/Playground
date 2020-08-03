#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c,temp;
  cin>>n;
  for(int i=1;i<n-1;i++){
 
    c=a+b;
    a=b;
    b=c;
  }
   cout<<c;
}