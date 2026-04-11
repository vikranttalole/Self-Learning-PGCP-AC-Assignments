#include <iostream>
using namespace std;
class Outer
{
    int outerdata;

public :
    class Inner
    {
        int innerdata;
    
    public:

    void setInner(int x)
    {
        innerdata=x;
    }

    void displayInner()
    {
        cout<<"Innerdata is "<<innerdata<<endl;
    }
    };
    void setOuter(int y)
    {
        outerdata=y;
    }
    void displayOuter()
    {
        cout<<"Outer data is "<<outerdata<<endl;
    }
};
int main()
{
    Outer obj;
    obj.setOuter(50);
    obj.displayOuter();
    
    Outer::Inner innerobj;
    innerobj.setInner(10);
    innerobj.displayInner();
    return 0;
    

}
// 3. Write a program to implement inner class in C++