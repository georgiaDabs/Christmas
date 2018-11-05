import java.util.Random;
public class Tree
{
    // instance variables - replace the example below with your own
    private int height=0;
    public Tree(int height){
        this.height=height;
    }

    public void printTree(int width){
        int baulble=0;
        int light=0;
        for(int i=0;i<height;i++){
            int n=i/2;
            n=1+2*n;
            int space1=(width-n);
            int space2=width+n;
            for(int j=0;j<width*2;j++){

                if((j<=space1)||(j>=space2)){
                    System.out.print(" ");
                }else {
                    baulble++;
                    baulble=baulble%7;
                    light++;
                    light=light%5;
                    if(baulble==4){
                        System.out.print("O");
                    }else if(light==3){
                        System.out.print("X");
                        
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
        int space3=width;
        String stump="";
        for(int i=0;i<width*2;i++){
            if((i<space3)||(i>space3)){
                stump=stump+" ";
            }else{
                stump=stump+"*";
            }
        }
        System.out.println(stump);
        System.out.println(stump);
        int space4=(width-1);
        
        String stump2="";
        for(int i=0;i<width*2;i++){
            if((i<space4)||(i>(width*2-space4))){
                stump2=stump2+" ";
            }else{
                stump2=stump2+"*";
            }
        }
        System.out.println(stump2);
        System.out.println(stump2);
    }
}
