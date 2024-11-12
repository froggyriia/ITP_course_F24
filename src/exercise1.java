enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int levelCode;

    Level(int levelCode){
        this.levelCode = levelCode;
    }

    public int getLevelCode(){
        return this.levelCode;
    }

}

//enum Level2 {
//    public abstract String asLowerCase();
//    HIGH {
//        @Override
//        public String asLowerCase
//    }
//}

public class exercise1 {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;
        System.out.println(level.getLevelCode());

    }
}
