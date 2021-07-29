#include<iostream>

using namespace std;
/*4
1234
4321
*/
int main()///array reversey 
{    int a,arr[10000];
//    cout<<"array SIZE:- "<<endl;
    cin>>a;    
    for(int i=1;i<=a;i++)
    {    //    cout<<"go";
        cin>>arr[i];
    }
    for(int j=a;j>=1;j--)
    {    //    cout<<"go";
        cout<<arr[j]<<" ";
    }
    
    return 0;
}
/**
 * Compiler Message
Success
Input (stdin)

Download
8
6676 3216 4063 8373 423 586 8850 6762
Expected Output

Download
6762 8850 586 423 8373 4063 3216 6676
 * **/