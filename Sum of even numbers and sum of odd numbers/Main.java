#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<=n-1;i++){
  
  cin>>a[i];
  
  
  }
  int sum=0,sum1=0;
  for(int i=0;i<=n-1;i++){
  
  if(a[i]%2==0){
  sum+=a[i];
  
  }else{
  
  sum1+=a[i];
    
  }
  }  
 cout<<"The sum of the even numbers in the array is "<<sum;
  cout<<"\nThe sum of the odd numbers in the array is "<<sum1;
}