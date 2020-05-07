#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int liters,distance;
  cin>>mileage>>liters>>distance;
  float total_distance = mileage * liters;
  if (total_distance<distance) {
    cout<<"Cannot reach";
  }
  else {
    cout<<"Can reach";
  }
}