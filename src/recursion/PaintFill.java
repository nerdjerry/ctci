package recursion;

import java.util.Random;

public class PaintFill{

    public enum Color {Black, Green, Red, Blue};

    public static void main(String[] args){
        Color[][] canvas = new Color[25][25];
        Random rand = new Random();
        for(int row = 0; row < canvas.length; row++){
            for(int col = 0; col < canvas[0].length; col++){
                canvas[row][col] = Color.values()[rand.nextInt(4)];
            }
        }
        paintFill(canvas, 15, 15, Color.Red);
    }

    static boolean paintFill(Color[][] canvas, int r, int c, Color nColor){
        if(canvas[r][c] == nColor) return false;
        return fillPaint(canvas, r, c, canvas[r][c], nColor);
    }

    private static boolean fillPaint(Color[][] canvas, int r, int c, Color oColor, Color nColor) {
        if(r < 0 || r > canvas.length || c < 0 || c > canvas[0].length){
            return false;
        }
        if(canvas[r][c] == oColor){
            fillPaint(canvas, r-1, c, oColor, nColor);
            fillPaint(canvas, r + 1, c, oColor, nColor);
            fillPaint(canvas, r, c-1, oColor, nColor);
            fillPaint(canvas, r, c + 1, oColor, nColor);
        }
        return true;
    }
}