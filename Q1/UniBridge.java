public class UniBridge extends Bridge {
    public UniBridge(IImage image){
        super(image);
    }

    @Override
    public void display(){
        image.display();
    }
}
