#include<stdio.h>
#define PI 3.14
int main()
{
  float r,angle,len;
  scanf("%f%f",&r,&angle);
  len=2*PI*r*(angle/360);
  printf("%0.2f",len);
  return 0;
}