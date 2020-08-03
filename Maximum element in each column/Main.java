#include<iostream>
using namespace std;
int main()
{
  int r,c,a,b,i,j ;
  cin>>r>>c;
  int mat[r][c],mat1[c][r];
  for(i = 0 ; i<=r-1 ; i++)
  {
    for( j = 0 ; j<=c-1 ; j++)
    {
      
      cin>>mat[i][j];
     // cout<<mat[i][j]<<" ";
         
    }
   //cout<<"\n\n";
  }
   for(i = 0 ; i<=r-1 ; i++)
  {
    for( j = 0 ; j<=c-1 ; j++)
    {
      mat1[j][i]=  mat[i][j];
   }
   }
  
  /*  for(i = 0 ; i<=r-1 ; i++)
  {
    for( j = 0 ; j<=c-1 ; j++)
    {
     
      cout<<mat1[j][i]<<" ";
         
    }
   cout<<"\n";
  }*/
  
  
  
  
  
   for( i = 0 ; i<=c-1 ; i++)
  {
      int max = mat1[i][0];
    for(j = 0; j<=r-1; j++)
    {
     
      if(mat1[i][j]>max)
      {
        max = mat1[i][j] ;
      }
     
    }
    cout<<max<<"\n";
  }
}