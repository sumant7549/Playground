#include<iostream>
using namespace std;
int main()
{
 int r,c,sum=0,j;
 cin>>r>>c;
 int mat[r][c],row[r],col[c];
  
  for(int i = 0; i<r ; i++)
  {
    for(int j = 0; j<c ; j++)
    {
      cin>>mat[i][j];
     }
  }
  
    cout<<"Sum of rows is ";
    for(int i = 0; i<r ; i++)
  {
      sum = 0;
    for(int j = 0; j<c ; j++)
    {
     sum = sum +mat[i][j];
    }
      row[i]=sum;
      cout<<sum<<" ";
  }
  cout<<"\n";
    int max1 = row[0],count1=0;
    
  for(int i = 0 ;i<r ; i++)
  {
    if(row[i]>max1)
    {
      max1 = row[i];
     }
   }
  
  for(int i = 0 ;i<r ; i++)
  {
    if(row[i]==max1)
    {
     break;
     }
    count1++;
   }
   
   cout<<"Row "<<count1+1<<" has maximum sum";
  cout<<"\n";
   cout<<"Sum of columns is ";
    for(int j = 0; j<c ; j++)
  {
      sum = 0;
    for(int i = 0; i<r ; i++)
    {
     sum = sum +mat[i][j];
    }
      col[j]=sum;
      cout<<sum<<" ";
  }
   cout<<"\n";
   int max2 = col[0],count2=0;
 
  for(int j = 0 ;j<c ; j++)
  {
    if(col[j]>max2)
    {
      max2 = col[j];
   }
 }
  int max22 = max2;
  for(int j = 0 ;j<c ; j++)
  {
    if(col[j]==max22)
    {
     break;
   }
    count2++;
 }
   cout<<"Column "<<count2+1<<" has maximum sum";
 }