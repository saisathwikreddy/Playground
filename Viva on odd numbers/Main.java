#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  float d=0;
  while(c<3)
  {
    std::cin>>a;
    if(a<0){
      c=3;
      d-=1;
    }
    else if(a%2){
      c+=1;
      d+=1;
    }
    else{
      d-=0.5;
  }
  }
    std::cout<<d;
}