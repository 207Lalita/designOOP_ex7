public abstract class Bridge {
    protected IImage image;

    public Bridge(IImage image){
        this.image = image;
    }

    public abstract void display();
}
