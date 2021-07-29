#include <bits/stdc++.h>

using namespace std;

// Complete the factorial function below.
int factorial(int n) {
    
    int q=1;//,n;     //f(n)=f(n)*f(n-1)
    //scanf("%d",&n);
    for(int i=n;i>=1;i--)
    {//i=1,
        //2,3,5,    
        q=q*i;
    }
        cout<<q<<" "<<endl;
    return q;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    int result = factorial(n);

    fout << result << "\n";

    fout.close();

    return 0;
}
/**
Compiler Message
Success
Input (stdin)

Download
3
Expected Output

Download
6
*/