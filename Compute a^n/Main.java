#include<iostream>
using namespace std;
int calculatePower(int, int);

int main()
{
    int base, powerRaised, result,a,n;

    
    cin >> base;
cout<< "Enter the value of a";
    
    cin >> powerRaised;
  cout<<"\nEnter the value of n";
    result = calculatePower(base, powerRaised);
    cout <<"\nThe value of "<<base << " power " << powerRaised << " is " << result;

    return 0;
}

int calculatePower(int base, int powerRaised)
{
    if (powerRaised != 0)
        return (base*calculatePower(base, powerRaised-1));
    else
        return 1;
}