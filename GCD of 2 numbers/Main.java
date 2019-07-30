// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
int main()
{
int a,b,smaller,f=0;
scanf("%d",&a);
scanf("%d",&b);
if(a>b)
	smaller=b;
else
    smaller=a;
for(int i=smaller;i>1;i--)
      {
        if((a%i==0)&&(b%i==0))
           {
             printf("%d",i);
             f=1;
             break;
           }
      }
      if(f==0)
      {
        printf("1");
      }
 return 0;
}
