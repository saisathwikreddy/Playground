#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i,c=0;
  cin>>n;
  if(n==1||n==2)
    c=1;
  for(i=2;i<n;i++)
  {
    if(n%i==0)
    {
      c++;
      break;
    }}
  if (c==0)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}