#include<iostream>
using namespace std;
struct College { 
  char name[100], city[100];
  int establishmentYear;
  float passPercentage; 
  int n;

  
};

int main()
{
  
  struct College c1;
  cout<<"Enter the number of colleges";
  cin>>c1.n;
 
 for(int i=1;i<= c1.n;i++){  
    
  cout<<"\nEnter the details of college "<<i;
   cout<<"\nEnter name"<<"\nEnter city"<<"\nEnter year of establishment"<<"\nEnter pass percentage";
 }
  cout<<"\nDetails of colleges";
  for(int i=1;i<=c1.n;i++){
  cout<<"\nCollege:"<<i;
  cin>>c1.name;
  cout<<"\nName:"<<c1.name;
  cin>>c1.city;
  cout<<"\nCity:"<<c1.city;
  cin>>c1.establishmentYear;
  cout<<"\nYear of establishment:"<<c1.establishmentYear;
  cin>>c1.passPercentage;
  cout<<"\nPass percentage:"<<c1.passPercentage;
  }
}