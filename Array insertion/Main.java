 #include<iostream>
using namespace std;
int main()
{
  int a,i;
  cout<<"Enter the number of elements in the array\n";
  cin>>a;
 int arr[a];
 cout<<"Enter the elements in the array\n";
 for( i = 0 ; i<a ; i++) 
 {
   cin>>arr[i];
   //cout<<arr[i];
 }
 cout<<"Enter the location where you wish to insert an element\n"; 
  int b;
  cin>>b;
   if(b>a)
    {
      cout<<"Invalid Input";
      return 0;
    }
  cout<<"Enter the value to insert\n";
  int val;
  cin>>val;
  cout<<"Array after insertion is\n";
  int arr_new[a+1];
  for(i = 0; i<a+1 ;i++)
  {
    if(i==b-1)
    {
      arr_new[i] = val;
      cout<<arr_new[i]<<"\n";
     
    }
  
    else if(i<b-1)
    {
      arr_new [i]= arr[i];
       cout<<arr_new[i]<<"\n";
    }
    else
    {
      arr_new [i]= arr[i-1]; 
       cout<<arr_new[i]<<"\n";
    }
  }
  
}