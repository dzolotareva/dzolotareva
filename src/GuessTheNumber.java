public class GuessTheNumber {
    public static void main(String[] args) {
        int hiddenNumber = (int) (Math.random()*100);
        int estimatedNumber = (int) (Math.random()*100);
        while (true) {
            if (estimatedNumber == hiddenNumber) {
                System.out.println("Вы победили!");
                break;
            } else if (estimatedNumber > hiddenNumber) {
                System.out.println("Число " + estimatedNumber + " больше того, что загадал компьютер");
                estimatedNumber--;
            } else if (estimatedNumber < hiddenNumber) {
                System.out.println("Число " + estimatedNumber + " меньше того, что загадал компьютер");
                estimatedNumber++;
            }
        }
    }

}
