#include <cstring>
#include <iostream>
using namespace std;
int main()
{
 string str;
  getline(cin,str);
  
  if(str.length()>50){
  
  cout<<"Caption not eligible for the contest";
  
  }
  else{
  
  
  cout<<"Caption eligible for the contest";
  
  
  
  }
}