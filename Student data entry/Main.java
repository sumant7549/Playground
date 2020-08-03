#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s1;
  gets(s1.name);

   cin>>s1.roll;
   cin>>s1.marks;
                     
                     
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s1.name;
  cout<<"\nRoll: "<<s1.roll;
  cout<<"\nMarks: "<<s1.marks;
 
}