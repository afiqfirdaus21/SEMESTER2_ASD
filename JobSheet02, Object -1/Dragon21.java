public class Dragon21 {
    int x, y, width, height;

    void moveLeft(){
        x -= 1;
        System.out.println("x: "+x+" y: "+y);
        detectCollision(x,y);
    }
    void moveRight(){
        x += 1;
        System.out.println("x: "+x+" y: "+y);
        detectCollision(x,y);
    }
    void moveUp(){
        y -= 1;
        System.out.println("x: "+x+" y: "+y);
        detectCollision(x,y);
    }
    void moveDown(){
        y += 1;
        System.out.println("x: "+x+" y: "+y);
        detectCollision(x,y);
    }
    void detectCollision(int x, int y){
        if(x <= 0 || x > width || y <= 0 || y > height){
            System.out.println("Game Over");
        }
    }
}