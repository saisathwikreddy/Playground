#include<iostream>
int main(){
  int a,i,p=1;
  std::cin>>a;
  for(i=1;i<=a;i++)
    p*=i;
  std::cout<<p;
}