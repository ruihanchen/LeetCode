//Solution One
public String getRoman(int num, int count){
  char[]ten={'I','X','C','M'};
	char[]five={'V','L','D'};
	String r="";
	if(num<=3){
		while(num!=0){
			r+=ten[count];
			num--;
		}
	}
	if(num==4){
		r=(ten[count]+'')+(five[count]+"");
	}
	if(num==5){
		r=fiv[count]+"";
	}
	if(num>5&&num<9){
		r=five[count]+"";
		num-=5;
		while(num!=0){
			r+=ten[count];
			num--;
		}
	}
	if(num==9){
		r = (ten[count] + "") + (ten[count + 1] + "");
	}
	return r;
}
public String intToRoman(int num) {
	String r="";
	int count=0;
	while(num!=0){
		int pop=num%10;
		r=getRoman(pop,count)+r;
		count++;
		num/10;
	}
	return r;
}
//Solution One End
