#include <iostream>
using namespace std;
int swap (int &p, int &q);
int main()
{
    int x=10;
    int y=5;

    cout<<"Before swapping numbers ";
    cout<<"X is : "<<x<<endl;
    cout<<"Y is : "<<y<<endl;

    swap (x,y);
    cout<<"After swapping numbers ";
    cout<<"X is : "<<x<<endl;
    cout<<"Y is : "<<y<<endl;

}
int swap(int &p ,int &q)
{
    int temp;
    temp=p;
    p-q;
    q=temp;
    cout<<"After swapping number ";
    cout<<"Value of P is : "<<p<<endl;
    cout<<"Value of Q is : "<<q<<endl;
    return 0;
}


