package projava;

import java.util.ArrayDeque;

public class TraverseDeep {

    static public boolean traverse(int[][] map, int curX, int curY){

        record Position(int x, int y){}

        var stack = new ArrayDeque<Position>();
        stack.push(new Position(curX, curY));

        for(Position p; (p = stack.pollFirst()) != null ;) {

            switch (map[p.y()][p.x()]) {
                case 0:
                    break;
                case 2:
                    return true;
                default:
                    continue;
            }

            map[p.y()][p.x()] = 3;
            stack.push(new Position(p.x() - 1, p.y()));
            stack.push(new Position(p.x() + 1, p.y()));
            stack.push(new Position(p.x(), p.y() - 1));
            stack.push(new Position(p.x(), p.y() + 1));
        }


        return false;
    }
}
