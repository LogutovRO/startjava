public class Variables {
    public static void main(String[] args) {
        byte numCores = 6; //кол-во ядер
        short ram = 12; //оперативная память Гб
        int bitRate = 500; //скорость интернета
        long serialNum = 49026347234l;

        float freqCPU = 3.2f; //частота
        double buildNum = 120.221235300d; //номер сборки

        char discName = 'D';

        boolean current = true;

        System.out.println(numCores);
        System.out.println(ram);
        System.out.println(bitRate);
        System.out.println(serialNum);
        System.out.println(freqCPU);
        System.out.println(buildNum);
        System.out.println(discName);
        System.out.println(current);
    }
}