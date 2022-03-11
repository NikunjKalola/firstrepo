#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n,b,sum=0;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    for(int i=1;n>0;i){
        b=n%10;
        sum=sum+b;
        n=n/10;
    }
    printf("%d\n",sum);
    return 0;
}
