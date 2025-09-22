//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     EmojiCombate lut[] = new EmojiCombate[6];
        lut[0] = new EmojiCombate("PrettyBoy","França", 31, 1.75f, 68.9f, 11, 2, 1 );
        lut[1] = new EmojiCombate("PutScript", "Brasil", 29, 1.68f,57.8f,14,2,3);
        lut[2] = new EmojiCombate("SnapShadow", "Eua", 35,1.65f,80.f,12,2,1);
        lut[3] = new EmojiCombate("Dead Code", "Austrália", 28,1.93f,81.6f,14,0,2);
        lut[4] = new EmojiCombate("SmileCry", "Espanhol", 40,1.70f,119.4f,6,3,2);
        lut[5] =new EmojiCombate("UFOCobol", "Brasil", 30, 1.81f,105.7f,12,4,2);

        Luta UEC = new Luta();
        UEC.marcarLuta(lut[2],lut[3]);
        UEC.lutar();
    }
}