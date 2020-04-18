#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=3,h=0,j=4,x,y;
  std::cin>>x>>y;
  while(i<=x || j<=y)
  {
    if(i<=x)
      i++;
    if(j<=y)
      j++;
    h++;
  }
  std::cout<<h-1;
}