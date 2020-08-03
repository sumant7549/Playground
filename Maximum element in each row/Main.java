#include<iostream>
using namespace std;
int main()
{
  int x,y,max;
    cin>>x>>y;
  int a[x][y];
  for(int i=0;i<=x-1;i++){
    for(int j=0;j<=y-1;j++){
    cin>>a[i][j];    
    }
    
  }
  
  for(int i=0;i<=x-1;i++){
    int max=a[i][0];
    for(int j=0;j<=y-1;j++){
    
      
      if(a[i][j]>max){
      max=a[i][j];
       
      }
   }
    cout<<max<<"\n";
}
}