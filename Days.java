import java.util.ArrayList;
public class Days
{
    public String getString(int i){
        String str=null;
        switch(i+1){
           case 1:  str="a partridge in a pear tree";
                    break;
           case 2:  str="2 turtle doves";
                    break;
           case 3:  str="3 French Horns";
                    break;
           case 4:   str="4 calling birds";
                    break;
           case 5:  str= "5 gold birds";
           break;
           case 6: str="6 Geese a-Laying";
           break;
           case 7 : str="7 swana a-Swimming";
           break;
           case 8: str="8 Maids a-Milking";
           break;
           case 9: str= "9 Ladies Drumming";
           break;
           case 10: str="10 lords a-Leaping";
           break;
           case 11: str="11 Pipers piping";
           break;
           case 12: str="12 drummers drumming";
           break;
        }
        return str;
    }
    public void printSong(){
        for(int i=0;i<12; i++){
            String str=null;
            if((i+1)==1){
                str="st";
            }else if((i+1)==2){
                str="nd";
            }else if((i+1)==3){
                str="rd";
            }else{
                str="th";
            }
            System.out.println("on the "+(i+1)+str+" day of Christmas my true love gave to me");
            for(int j=i;j>=0;j--){
                if((j==0)&&(i!=0)){System.out.print("and ");}
                System.out.println(getString(j));
            }
        }
    }
}
