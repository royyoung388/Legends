/***
 * Board controller, control the board
 */
public interface BoardController {
    void fill(Marker[][] markers);

    Marker moveTo(int row, int column);

    void show();

    int getRow();

    int getColumn();

    int getPRow();

    int getPColumn();

    void setMarker(int row, int column, Marker marker);

    void setPlayer(int row, int column);
//
//    void setMarker(int row, int column, Marker mark);
//
//    Marker getMarker(int row, int column);
//
//    int getRow();
//
//    int getColumn();
}

