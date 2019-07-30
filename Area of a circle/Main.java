#include<stdio.h>
#define PI 3.14
int main()
{
  float d;
  float r,a;
  scanf("%f",&d);
  r=d/2;
  a=PI*r*r;
  printf("%.2f",a);
  return 0;
}