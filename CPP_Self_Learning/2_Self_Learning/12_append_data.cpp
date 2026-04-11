#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream fout("data.txt", ios::app);

    fout << "\nAppending new line";

    fout.close();

    cout << "Data appended!" << endl;

    return 0;
}
// 12. Assignments on files doing different operations