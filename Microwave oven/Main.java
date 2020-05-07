#include<iostream>
using namespace std;
int main()
{
  int items;
  float heat_time;
  cin>>items>>heat_time;
  if (items == 3) {
    float a = heat_time;
    float b = float (heat_time * 50) / 100;
    float c = a + (b * 2);
    cout<<c;
  }
  else if (items == 2) {
    float a = heat_time;
    float b = float (heat_time * 50) / 100;
    float c = a + b;
    cout<<c;
  }
  else {
    cout<<"Number of items is more";
  } 
}