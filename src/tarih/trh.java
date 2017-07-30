package tarih;

public class trh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long gun_cevirici,hafta_cevirici,ay_cevirici;
		gun_cevirici=Gunsonra(2017,7,30);
		hafta_cevirici=Haftasonra(2017,7,30);
		ay_cevirici=Aysonra(2017,7,30);
		
		System.out.println((gun_cevirici%100) +("/") + ( (gun_cevirici%10000)/100) +"/" + (gun_cevirici/10000));
		System.out.println((hafta_cevirici%100) +("/") + ( (hafta_cevirici%10000)/100) +"/" + (hafta_cevirici/10000));
		System.out.println((ay_cevirici%100) +("/") + ( (ay_cevirici%10000)/100) +"/" + (ay_cevirici/10000));
		
	}
	
public static long Gunsonra(int yil,int ay,int gun){

if(((ay==1 || ay==3 || ay==5 || ay==7 || ay==8 || ay==10)&&(gun==31)) || ((ay==4 || ay==6 || ay==9 || ay==11 ) && (gun == 30)) ||
(ay==2 &&(yil%4!=0) && gun==28) || (ay==2 && (yil%4==0) && gun==29)	){
return ((yil*10000)+((ay+1)*100)+1);  
}else if (ay==12 && gun==31){
return (((yil+1)*10000)+(100)+(1));
}else return ((yil*10000) + (ay*100) + (gun+1)); 
}



public static long Haftasonra (int yil,int ay,int gun){
if(ay==12 && gun>=25){ 
return (((yil+1)*10000)+(100)+((gun+7)%31));  
}else if ((ay==1 || ay==3 || ay==5 || ay==7 || ay==8 || ay==10)&& (gun>=25)){
return ((yil*10000)+((ay +1)*100) + ((gun+7)%31));
}else if ((ay==4 || ay==6 || ay==9 || ay==11 ) && (gun>=24)){
return ((yil*10000)+((ay +1)*100)+((gun+7)%30));
}else if (ay==2 &&(yil%4!=0) && (gun>=22)){ 
return ((yil*10000)+((ay +1)*100)+((gun+7)%28));
}else if ((ay==2 &&(yil%4==0) && (gun>=23))){
return ((yil*10000)+((ay +1)*100)+((gun+7)%29));
}else return ((yil*10000) + (ay*100) + (gun+7));

}


public static long Aysonra(int yil,int ay,int gun){
if((ay==3 || ay==5 || ay==7 || ay==8 || ay==10)&&(gun >= 2)){ 
return ((yil*10000)+((ay +1)*100)+((gun+30)%31));
}else if (ay==1 && gun ==1){ 
return ((yil*10000)+(100)+(31));
}else if (ay==1 && gun>1 && gun<30){ 
return ((yil*10000)+((200))+((gun+30)%31));
}else if (ay ==1 && gun>29 && (yil%4!=0)){ 
return ((yil*10000)+((300))+((gun%10)+1)) ;
}else if (ay==1 && gun ==30 && (yil%4==0)){ 
return ((yil*10000)+(200) +(29));
}else if (ay==1 && gun ==31 && (yil%4==0)){
return ((yil*10000)+(300) +(1)); 
}else if ((ay==4 && ay==6 && ay==9 && ay==11 )){
return ((yil*10000)+((ay +1)*100)+(gun));
}else if (ay==12 && gun==1){  
return ((yil*10000)+(1200)+31); 
}else 
return ((yil+1)*1000 + (100) + (gun +30)%31) ;
}


}

