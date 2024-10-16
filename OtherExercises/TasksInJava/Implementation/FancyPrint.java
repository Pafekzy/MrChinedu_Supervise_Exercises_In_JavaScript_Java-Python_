import com.github.lalyos.jfiglet.FigletFont;

public class FancyPrint {
    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("Flower");
        System.out.println(asciiArt);
    }
}
