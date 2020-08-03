#include<iostream>
using namespace std;
int main()
{
int r,c;
  cin>>r>>c;
  int mat1[r][c];
  int mat[r][c];
  int mat2[r][c];
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++){
  
  cin>>mat1[i][j];
  
  }
   
  }
   for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++){
  
  cin>>mat[i][j];
  
  }
  }
   for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++){
  
    mat2[i][j]=mat1[i][j]+mat[i][j];
    
  cout<<mat2[i][j]<<" ";
  
  }
     cout<<endl;
  }
}