#include<iostream>
using namespace std;
int main()
{
  // Type your code here
 int i, n;
    float arr[100];

  
    cin >> n;
  

    // Store number entered by the user
    for(i = 0; i < n; ++i)
    {
      
       cin >> arr[i];
    }

    // Loop to store largest number to arr[0]
    for(i = 1;i < n; ++i)
    {
       // Change < to > if you want to find the smallest element
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    cout << arr[0];

    return 0;
}