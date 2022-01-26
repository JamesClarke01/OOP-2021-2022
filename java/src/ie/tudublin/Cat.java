package ie.tudublin;

public class Cat extends Animal
{
    private int NumLives;

    public int getLives()
    {
        return NumLives;
    }

    public void kill()
    {

        if (NumLives > 0)  //if lives left, decrement 1
        {
            System.out.println("ouch!");
            NumLives = NumLives - 1;
        }
        else  //else the cat ded
        {
            System.out.println("dead");
        }
    }
    
    public Cat(String name)
    {
        super(name);
        this.NumLives = 9;
    }

}