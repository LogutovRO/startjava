public class ConditionalStatement {   
    public static void main(String[] args) {
        int age = 31;
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        }

        boolean isSexMale = true;
        if (isSexMale) {
            System.out.println("Пол мужской");
        }

        if (!isSexMale) {
            System.out.println("Пол не мужской");
        }

        float height = 1.88f;
        if (height < 1.80) {
            System.out.println("Рост ниже 1.8 метра");
        } else {
            System.out.println("Рост составляет " + height + " метра");
        }

        char firstLetterName = 'R';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени " + firstLetterName);
        } else {
            System.out.println("Первая буква имени " + firstLetterName);
        }

    }
}