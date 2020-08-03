#include<iostream>
  #include <cmath>
using namespace std;
int bacteria(int,int,int);
int main()
{
int m,n,req;
  cin>>m>>n>>req;

 
double exp{ std::pow(n, m) }; // 3 to the 4th power
  
  
  if(exp>req){
  
  cout<<"Doctor, you can proceed with your experiment.";
  }
  else{
  cout<<"Sorry Doctor! You need more bacteria.";
  }
  
}