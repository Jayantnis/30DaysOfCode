#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
      int n,i;
    string name;
    long num;
    cin>>n;
    cin.ignore();
    map<string,long>pBook;
    for (i = 0; i < n; i++)
    {
        cin >> name;
        cin >> num;
     pBook[name] = num;
    }
    while(cin >> name)
    {
        if (pBook.find(name) != pBook.end()) 
        {
        cout << name << "=" << pBook.find(name)->second << endl;
        } 
        else
        {
        cout << "Not found" << endl;
        }
    }
    return 0;
}
/***
 * 
 * Compiler Message
Success
Input (stdin)

Download
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry
Expected Output

Download
sam=99912222
Not found
harry=12299933*/