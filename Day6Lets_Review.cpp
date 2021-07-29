#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string.h>
#include <stdlib.h>
using namespace std;
void myFunction(char s[])
{
    for(int i=0;i<strlen(s);i++)
    {
        if (i%2 == 0)
        {
            cout<<s[i];
        }
    }
    
    cout<<" ";

    for(int i=0;i<strlen(s);i++)
    {
        if (i%2 != 0)
        {
            cout<<s[i];
        }
    } 
    
    cout<<"\n";

    }


int main() 
{   
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  // a[0],a[1]...n-1
    
    //char arr[6]={'H','a','c','k','e','r'};
    /*            0    1  2   3   4   5 */
    //char arr1[4]={'R','a','n','k'};
    /*             0  1   2   3*/
    
    /*cout<<arr[0]<<arr[2]<<arr[4]<<" "<<arr[1]<<arr[3]<<arr[5]<<endl;
    cout<<arr1[0]<<arr1[2]<<" "<<arr1[1]<<arr1[3]<<endl;
    */
  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int n;
     char s[10000];
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
       cin>>s;
       myFunction(s);
   }

}
/***
 *  
 * 
 * Compiler Message
Success
Input (stdin)

Download
2
Hacker
Rank
Expected Output

Download
Hce akr
Rn ak
 * */