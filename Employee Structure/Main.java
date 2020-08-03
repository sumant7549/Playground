#include<iostream>
using namespace std;
struct employee{
 char name[30];
  int id,age ;
  char designation[50];
  float salary;


};

int main()
{
 struct employee  e1;
  cout<<"Enter name:"<<"\nEnter ID:"<<"\nEnter age:"<<"\nEnter designation:"<<"\nEnter Salary:"<<"\nEmployee Details";
  cin>>e1.name;
  cout<<"\nName of the Employee : "<<e1.name;
  cin>>e1.id>>e1.age>>e1.designation>>e1.salary;
  cout<<"\nID of the Employee : "<<e1.id<<"\nAge of the Employee : "<<e1.age;
 cout<<"\nDesignation of the Employee : "<<e1.designation<<"\nSalary of the Employee : "<<e1.salary;
}