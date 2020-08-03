#include <iostream>
using namespace std;
int main() {
    int a,b=1;
  cin>>a;
  for(int i = 1; i<=a ; i++)
  {
    for(int j = 1; j<=a ; j++)
    {
     
      if( i%2!=0 && j==a )
      {
        cout<<b+1;
      }
     
     else if( i%2==0 && j==1 )
      {
        cout<<b+1;
      }
      else
      {
        cout<<b;
      }
    }
    b++;
    cout<<"\n";
      
  }
    return 0;
}