#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=0,d;
  cin>>a;
  while(a>0){
    d=a%10;
    if(d%2)
      c+=d;
    else
      b+=d;
    a/=10;
  }
  if(b==c)
    cout<<"Yes";
  else
    cout<<"No";
}