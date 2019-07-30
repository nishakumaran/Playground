#include<stdio.h>
int main()
{
  int n,s,r,c;
  scanf("%d",&n);
  s=n/100;
  r=(n%100)%10;
  c=s+r;
  printf("%d",c);
  return 0;
}