#include<iostream>
using namespace std;
int main()
{
  int age;
  float timing;
  cin>>age>>timing;
  if (age>13 && timing >=13.00)
    cout<<"$5.00";
  else if(age>13 && timing<13.00)
    cout<<"$8.00";
  else if(age>13 && timing>16.00)
    cout<<"$5.00";
  else if (age<=13 && timing<13.00)
    cout<<"$4.00";
  else if(age<=13 && timing>=13.00)
    cout<<"$2.00";
  else if(age<=13 && timing>16.00)
    cout<<"$4.00";
}