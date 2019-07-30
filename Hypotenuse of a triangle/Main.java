#include<stdio.h>
#include<math.h>
int main()
{
  float opo,adj,hyp;
  scanf("%f%f",&opo,&adj);
  hyp=(opo*opo)+(adj*adj);
  printf("%0.2f",sqrt(hyp));
  return 0;
}