#include<iostream>
using namespace std;
int isMagicSquare(int matrix[50][50], int n, int m); 
  
int main(){ 
    int matrix[50][50], n, m;
    cin >> n;
    m=n;
    if(n != m){
        cout<<"No";
        exit(0);
    }
    for(int i = 0; i < n; i++)
        for(int j = 0; j < m; j++)
            cin>>matrix[i][j];
    if (isMagicSquare(matrix, n, m))
        cout << "Yes"; 
    else
        cout << "No"; 
      
    return 0; 
}
int isMagicSquare(int matrix[50][50], int n, int m)
{  
    int sum1 = 0, sum2=0;
    //finding the sum of first diagonal
    for (int i = 0; i < n; i++) 
        sum1 = sum1 + matrix[i][i];
    //finding the sum of seciond diagonal
    for (int i = 0; i < n; i++) 
        sum2 = sum2 + matrix[i][n - 1 - i]; 
    
    //Checking, whether the sum of two diagonal is same or not
    if(sum1 != sum2)  
        return 0; 
  
    //finding the sum of each row 
    for (int i = 0; i < n; i++)
    { 
          
        int rowSum = 0;
        for (int j = 0; j < m; j++) 
            rowSum = rowSum + matrix[i][j]; 
          
        
        if (rowSum != sum1) 
            return 0; 
    } 
  
    
    for (int i = 0; i < n; i++)
    { 
          
        int columnSum = 0;  
        for (int j = 0; j < n; j++) 
            columnSum += matrix[j][i]; 
  
       
        if (columnSum != sum1)  
            return 1; 
    } 
  
    return true; 
}