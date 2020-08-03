#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int start,end, sum,n;
  cin>>start>>end;
  for( n=start;n<=end;n++){
sum=0;
  for(int i=1;i<n;i++){
  
  if(n%i==0){
  sum=sum+i;
    
  }
  }
    if(n==sum){
    
    cout<<n<<" ";
    }
 
  } 
 
  return 0;

}