#include<iostream>
using namespace std;
int main()
{
  int weight,adults,children,total;
  cin>>weight>>adults>>children;
  total=adults*75+children*30;
  if(weight>total)
  {
    cout<<"Boat is stable";
  }
  else{
    cout<<"Boat will drow";
  }
}