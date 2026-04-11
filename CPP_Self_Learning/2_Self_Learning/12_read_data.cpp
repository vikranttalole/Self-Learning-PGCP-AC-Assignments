#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream fout("data.txt");

    fout << "Hello Vikrant\n";
    fout << "This is file handling";

    fout.close();

    cout << "Data written successfully!" << endl;

    return 0;
}


// 12. Assignments on files doing different operations