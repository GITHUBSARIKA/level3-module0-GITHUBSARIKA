/* Copy the code into a new Processing sketch and complete then steps. */
import java.util.Random;
//1. create an array of ints. don't initialize it yet.
int[] integer;
Random random=new Random();
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(1000,1000);
  

  //3. initialize your array with the built in width variable
integer=new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  
  for(int i=0;i<integer.length;i++){
    integer[i]=random.nextInt(height);
  }
  

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(102,221,221);

  //7. set the color for your graph
fill(255,000,170);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
  for(int i=0;i<integer.length;i++){
    rect(i,height,1,-integer[i]);
  }


  //9. call the stepSort method
  stepSort(integer);

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  if(mousePressed){
    randomize();
  }
}
void randomize(){
  for(int i=0;i<integer.length;i++){
    integer[i]=random.nextInt(height);
  }
  

}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}