#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==0|n==1)
    cout<<"1";
  else
  {
    for(int i=n-1;i>0;i--)
      n*=i;
    cout<<n;
  }
}