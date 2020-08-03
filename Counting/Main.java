#include<iostream>
#include<string.h>
using namespace std;
int main() {
    string line;
    int vowels, consonant, digit, space,symbols;

    vowels = consonant = digit = space =symbols= 0;

 //  cin>>line;
    getline(cin,line);

    for (int i = 0; line[i] != '\0'; ++i) {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U') {
            ++vowels;
        } else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) {
            ++consonant;
        } else if (line[i] >= '0' && line[i] <= '9') {
            ++digit;
        } else if (line[i] == ' ') {
            ++space;
        } else{
        
        symbols++;
        }
    }

    cout<<"Vowels:"<<vowels;
    cout<<"\nConsonants:"<<consonant;
    
   cout<<"\nWhite Spaces:"<<space;
  cout<<"\nDigits:"<<digit;
     cout<<"\nSymbols:"<<symbols;
   
    return 0;
}