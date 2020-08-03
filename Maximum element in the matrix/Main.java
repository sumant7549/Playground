#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int mat[r][c];
  
  for(i = 0; i<r ; i++)
  {
    for(j = 0; j<c ; j++)
    {
      cin>>mat[i][j];
    //  cout<<mat[i][j];
    }
  }
   int max = mat[0][0];
   for(i = 0; i<r ; i++)
  {
    for(j = 0; j<c ; j++)
    {
      if(mat[i][j]>max)
      {
        max = mat[i][j];
      }
   
    }
  }
  cout<<"The maximum element is "<<max;
}