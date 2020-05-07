#include<iostream>
using namespace std;
int main()
{
  unsigned int birth_year,current_year;
  cin>>birth_year>>current_year;
  if (birth_year>0 && current_year==00) {
    int a = 100 - birth_year;
    cout<<a;
  }
  else if (birth_year<current_year) 
  {
    int b = current_year-birth_year;
    cout<<b;
  }
  else if (birth_year>current_year)
  {
    int c=(100-birth_year)+current_year;
    cout<<c;
  }
    else if (birth_year==current_year) 
  {
    cout<<birth_year;
  }
}