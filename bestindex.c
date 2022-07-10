#include <stdio.h>
int main(){
	int asize;
	scanf("%d",&asize);
	int ar1[asize];
	int sum[asize],index=0;
	int flag=0,no=0;
	for(int i=0;i<asize;i++) //assigning 0 to sum array
	sum[i]=0;
	for(int i=0;i<asize;i++){ // scan ar1
	    scanf("%d",&ar1[i]);
	}
	for(int i=0;i<asize;i++){ // loop to do sum 0 for single single element
		index = i;
		flag = 1;
		no = 0;
		while(flag!=-1){
			if(index+no<asize){ //check pair is valid or not i.e- 1+(2+3)+(4+5+6)
				for(int k=1;k<=no+1;k++){ //do sum
					sum[i] = sum[i] + ar1[index];
					index++;
				}
				no++;
			}
			else // if if part was not executed then break loop of continue for next value of i
				flag = -1;	
		}
	}
	int large = sum[0];
	for(int i=1;i<asize;i++){ // find maximum sum from the sum array
	    if(sum[i]>large)
	    large = sum[i];
	}
	printf("%d",large); //print maximum number of sum array
}
