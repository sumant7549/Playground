#include<iostream>
#include<string.h>
using namespace std;
int main()
{
 char  str1[50];
  int count=0;
  cin>>str1;
  for(int i=0;str1[i]!='\0';i++){
  
  count++;
  }
  cout<<"The number of letters in the name is "<<count;

}