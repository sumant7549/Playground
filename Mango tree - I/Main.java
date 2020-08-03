#include<iostream>
using namespace std;
int main()
{
  int r,c,Tree;
  cin>>r>>c>>Tree;
  if(Tree<r || Tree%5==0||(Tree-1)%5==0 || (Tree-1)%2==0)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  
}