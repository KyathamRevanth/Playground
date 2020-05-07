#include<iostream>
using namespace std;
int main()
{
  int amount,intrest,years;
  float first,second,third,last;
  cin>>amount;
  cin>>intrest;
  cin>>years;
  first = (amount * intrest * years) / 100;
  second = amount + first;
  third = (first / 100)* 2;
  last = second - third;
  cout<<first<<"\n"<<second<<"\n"<<third<<"\n"<<last;
  
}