package projava;

public class TraverseDeep {

    static public boolean traverse(int[][] map, int curX, int curY){

        switch (map[curY][curX]){
            case 0:
                break;
            case 2:
                return true;
            default:
                return false;
        }

        map[curY][curX] = 3;
        if (traverse(map, curX+1, curY) ||
                traverse(map, curX-1, curY) ||
                traverse(map, curX, curY+1) ||
                traverse(map, curX+1, curY-1) ){
            return true;
        }
        map[curX][curY] = 0;

        return false;
    }
}
