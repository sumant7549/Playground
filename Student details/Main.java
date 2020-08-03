#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct student
{
  char name[30];
  char department[25];
  int year;
  float cgpa;
}s[10];
bool compare(student a, student b)
{
  if(a.name<b.name)
    return 1;
  else
    return 0;
}
int main()
{
  std::cout<<"Enter the number of students";
  int n;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cout<<"\nEnter the details of student "<<i+1;
    std::cout<<"\nEnter name";
    std::cin>>s[i].name;
    std::cout<<"\nEnter department";
    std::cin>>s[i].department;
    std::cout<<"\nEnter year of study";
    std::cin>>s[i].year;
    std::cout<<"\nEnter cgpa";
    std::cin>>s[i].cgpa;
  }
  sort(s,s+n,compare);
    std::cout<<"\nDetails of students";
  for(int i=0;i<n;i++)
  {
    std::cout<<"\nStudent "<<i+1;
    std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nDepartment:"<<s[i].department;
    std::cout<<"\nYear of study:"<<s[i].year;
    std::cout<<"\nCGPA:"<<s[i].cgpa;
  } 
}