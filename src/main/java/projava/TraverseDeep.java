package projava;

import java.util.ArrayDeque;
import java.util.Queue;

public class TraverseDeep {

    static public boolean traverse(int[][] map, int curX, int curY){

        record Position(int x, int y){}

        Queue<Position> queue = new ArrayDeque<>();
        queue.offer(new Position(curX, curY));

        for(Position p; (p = queue.poll()) != null ;) {

            switch (map[p.y()][p.x()]) {
                case 0:
                    break;
                case 2:
                    return true;
                default:
                    continue;
            }

            map[p.y()][p.x()] = 3;
            queue.offer(new Position(p.x() + 1, p.y()));
            queue.offer(new Position(p.x() - 1, p.y()));
            queue.offer(new Position(p.x(), p.y() + 1));
            queue.offer(new Position(p.x(), p.y() - 1));
        }


        return false;
    }
}
