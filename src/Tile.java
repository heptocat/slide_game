import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Tile extends Rectangle implements IPositionable {
    /*private final int x;
    private final int y;
    private final int width;
    private final int height;*/
    private Action.Type action;

    public Tile(double x, double y, double width, double height, Action.Type action) {
        super(x, y, width, height);
        this.action = action;
    }

    /*public Tile(Tile t) {
        this(t.getX(), t.getY(), t.getWidth(), t.getHeight(), t.getAction());
    }*/

    public Action.Type getAction() {
        return action;
    }

    public Color getColor() {
        switch (action) {
            case NONE:
                return Color.CADETBLUE;
            case MOVE_LEFT:
                return Color.ROSYBROWN;
            case MOVE_RIGHT:
                return Color.INDIANRED;
            case MOVE_UP:
                return Color.PLUM;
            case MOVE_DOWN:
                return Color.GOLD;
            case MOVE_STOP:
                return Color.SALMON;
            default:
                return null;
        }
    }

    public void updateColor() {
        switch (action) {
            case NONE:
                setFill(Color.CADETBLUE);
                break;
            case MOVE_LEFT:
                setFill(Color.LEMONCHIFFON);
                break;
            case MOVE_RIGHT:
                setFill(Color.INDIANRED);
                break;
            case MOVE_UP:
                setFill(Color.PLUM);
                break;
            case MOVE_DOWN:
                setFill(Color.GOLD);
                break;
            case MOVE_STOP:
                setFill(Color.SALMON);
                break;
            default:
                break;
        }
    }

    public String getActionName() {
        switch (action) {
            case NONE:
                return "NONE";
            case MOVE_LEFT:
                return "LEFT";
            case MOVE_RIGHT:
                return "RIGHT";
            case MOVE_UP:
                return "UP";
            case MOVE_DOWN:
                return "DOWN";
            case MOVE_STOP:
                return "STOP";
            default:
                return null;
        }
    }

    public void setAction(Action.Type action) {
        this.action = action;
    }

    /*@Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }*/
}
