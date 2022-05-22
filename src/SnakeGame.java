public class SnakeGame
{

    static GameFrame frame;

    public static void main(String[] args)
    {
        setFrame();
    }

    static GameFrame getFrame()
    {
        return frame;
    }

    static void setFrame()
    {
        frame = new GameFrame();
    }

}
