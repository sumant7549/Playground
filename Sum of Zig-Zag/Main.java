#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
 int sum_first=0;
 int sum_last=0;
 int sum_dia=0;
  int ma[r][c];
  int re[10];
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cin>>ma[i][j];
   }
  }
//displaying matrix
/*cout<<"\nEntered matrix : \n";
   for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    cout<<ma[i][j]<<" ";
   }
   cout<<"\n";
  }
*/
//sum of first row  
for(int i=0;i<r;i++)
{
 for(int j=0;j<c;j++)
 {
  sum_first=sum_first+ma[i][j];
 }
 break;
}
//sum of last row
for(int i=r-1;i<r;i++)
{
 for(int j=0;j<c;j++)
 {
  sum_last=sum_last+ma[i][j];
 }
//sum of diagonal elements
for(int i=1;i<r-1;i++)
{
 for(int j=c-2;j>0;j--)
 {
  sum_dia=sum_dia+ma[i][j];
 }
}
}
cout<<"Sum of Zig-Zag pattern is "<<sum_first+sum_last+sum_dia;
}