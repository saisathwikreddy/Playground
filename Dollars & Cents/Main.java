#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,doll,cent;
  std::cin>>a>>b>>c>>d;
  cent=b+d;
  doll=a+c;
  while(cent>=100){
    doll++;
    cent-=100;
  }
  std::cout<<doll<<"\n"<<cent;
}