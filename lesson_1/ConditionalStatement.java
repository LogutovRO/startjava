public class ConditionalStatement {   
    public static void main(String[] args) {

        int age = 31;
        boolean isSexMale = true;
        float height = 1.88f;
        char firstLetterName = 'R';

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        if (isSexMale) {
            System.out.println("Пол мужской");
        }

        if (!isSexMale) {
            System.out.println("Пол не мужской");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже 1.8 метра");
        } else {
            System.out.println("Рост составляет " + height + " метра");
        }

        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else {
            System.out.println("Первая буква имени " + firstLetterName);
        }

    }
}