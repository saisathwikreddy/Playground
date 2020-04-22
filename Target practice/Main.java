#include<iostream>
using namespace std;
int main()
{
  int n,k,s=0,c=0;
  cin>>n;
  for(c=0;s<n;c++)
  {
    cin>>k;
    s+=k;
  }
  cout<<"The number of turns is "<<c;
}