#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a;
  int n;
   int even=0,odd=0;
  cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n; i++){
  cin>>*(a+i);
  }
  for(int i=0;i<n;i++){
 //int even=0,odd=0;
  if(*(a+i)%2==0){
    even++;
  }
    else{
      odd++;
  }
  }
    cout<<odd<<" ";
    cout<<"\n"<<even<<" ";
    return 0;
}