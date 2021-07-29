#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n,count=0;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    
    while(n!=0)
    {
        n=(n & ( n << 1 ) );
        count++;
    }
    cout<<count<<endl;
   // return count;
}
/**
 * 
 * 
 * Compiler Message
Success
Input (stdin)

Download
5
Expected Output

Download
1
 * */