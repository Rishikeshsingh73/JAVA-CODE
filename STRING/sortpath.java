//GIVEN-A-ROUTE-CONAINING 4-DIRECTIONS-(E,W,N,S)-FIND-THE-SORTEST-PATH-TO-REACH-DESTINATION

public class sortpath {
    public static float getShortestPath(String path){
        int x=0,y=0;
    for(int i=0 ; i<path.length() ; i++){
        char dir=path.charAt(i);

    //SOUTH

    if(dir=='S'){
        y--;
    }

    //NORTH

    else if(dir=='N'){
        y++;
    }

    //WEST

    else if(dir=='W'){
        x--;
    }

    //EAST

    else{
        x++;
    }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
    }

public static void main(String args[]){
   String path="WNEENESENNN";
    System.out.println(getShortestPath(path));

   // String str="RISHI KESH";
    //System.out.println(str.substring(0,7));
}    
}
