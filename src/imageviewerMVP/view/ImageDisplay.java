package imageviewerMVP.view;

import imageviewerMVP.model.Image;

public interface ImageDisplay {
    void display(Image image);

    Image currentImage();
    
    void  on(Shift shift);
    
    interface Shift{
        Image left();
        Image right();
    }
}
