#include <iostream>
#include <map>
#include <fstream>
using namespace std;
class StudentRecord
{
    map<int, string> students;

    public:
    void addRecord()
    {
        int rollNo;
        string stuName;

        cout<<"Enter Roll No :";
        cin>>rollNo;

        cout<<"Enter name of student:";
        cin>>stuName;
 
        students[rollNo]=stuName;

    }

    void displayRecord()
    {
        cout<<"\nStudent record :\n";
        for(auto it : students)
        {
            cout<<"Roll No :"<<it.first
                <<"Name :"<<it.second<<endl;
        }
    }

    void saveTofile()
    {
        ofstream file("student.txt");
        for(auto it : students)
        {
            file<<it.first<<" "<<it.second<<" "<<endl;
        }
        file.close();
        cout<<"Data saved successsfully.\n";
    }
};
int main()
{
    StudentRecord obj;
    int choice;
    do 
    {
        cout<<"\nStudent record menu\n";
        cout<<"1.Add Record";
        cout<<"2.display record";
        cout<<"3.Saved to file";
        cout<<"4.Exit...";
        cout<<"Enter choice :";
        cin>>choice;
 
        switch(choice)
        {
            case 1:
            obj.addRecord();
            break;

            case 2:
            obj.displayRecord();
            break;

            case 3:
            obj.saveTofile();
            break;

            case 4:
            cout<<"Ending...";
            break;

            default:
            cout<<"Invalid choice";
        
        }
       
    }
     while(choice!=4);
        return 0;

};








// Q.5. Create a menu driven program for Student Record System. Use map to store rollNo and
// name.
// Menu options:

// 1. Add Record
// 2. Display Records
// 3. Save to File