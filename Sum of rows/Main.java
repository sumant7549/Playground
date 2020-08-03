#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a>>b;
  int s[a][b];
  
  for(int i=0;i<=a-1;i++){
     sum=0;
  for(int j=0;j<=b-1;j++){
  cin>>s[i][j];
    
    sum+=s[i][j];
  
  }
      cout<<sum<<"\n"; 
  }
   

  
  
}