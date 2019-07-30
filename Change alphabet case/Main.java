#include <stdio.h>
int main() {
	char c,ch;
    scanf("%c",&c);
    if(c>='a'&&c<='z')
    {
      ch=c-32;
      printf("%c",ch);
    }
    else if(c>='A'&&c<='Z')
    {
      ch=c+32;
      printf("%c",ch);
    }
	return 0;
}