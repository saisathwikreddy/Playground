#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,i,k,t,u,y,z;
  cin>>n;
  k=n*n;
  y=log10(k)+1;
  for(i=1;i<=y;i++)
  {
    z=pow(10,y-i);
    t=k/z;
    u=k%z;
    if(t+u==n){
      cout<<"Kaprekar Number";
      return 0;
    }
  }
  cout<<"Not a Kaprekar Number";
}