 #include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  
   if(a>b && a>c)
   {
     if(b>c)
     {
     cout<<"The treasure is in box which has number "<<b<<endl;
     }
     else 
     {
     cout<<"The treasure is in box which has number "<<c<<endl;
     }
   }
    else if (b>a && b>c)
    {
     if(a>c)
     {
     cout<<"The treasure is in box which has number "<<a<<endl;
     }
      else
      {
      cout<<"The treasure is in box which has number "<<c<<endl;
     }
      }
   else
   {
   cout<<"The treasure is in box which has number "<<b<<endl;
   }
    
  
  
  if( b%a==0 && c%a==0)
  {
   cout<<"The code to open the box is "<<a;
  }
  else
  {
   cout<<"The code to open the box is "<<1;
  }

   
}