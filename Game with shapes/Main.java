#include<iostream>
using namespace std;
int main()
{
  int radius,length;
  cin>>radius>>length;
  int diameter=2*radius;
  if (diameter!=length) {
    cout<<"circle cannot be inside a square";
  }
  else {
    cout<<"circle can be inside a square";
  }
}