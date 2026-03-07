#include <iostream>
using namespace std;

int main()
{
    int a = 10, b = 5;

    // Assignment Operator
    int c;
    c = a + b;
    cout << "Assignment Operator (c = a + b): " << c << endl;

    // Unary Operator
    int x = 5;
    x++;
    cout << "Unary Operator (x++): " << x << endl;

    // Logical Operator
    if(a > b && b > 0)
    {
        cout << "Logical Operator: Condition is True" << endl;
    }

    // Ternary Operator
    int max;
    max = (a > b) ? a : b;
    cout << "Ternary Operator (Maximum): " << max << endl;

    return 0;
}