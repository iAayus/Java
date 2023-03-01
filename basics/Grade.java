package basics;

class student {
    double physics;
    double chemistry;
    double maths;
    double english;
    double hindi;
    double total;
    double percent;

    void calc() {
        total = physics + chemistry + maths + english + hindi;
        percent = total / 5;
    }

    void grade() {
        if (percent <= 39) {
            System.out.println("You have failed");
        } else if (percent >= 40 && percent <= 59) {
            System.out.println("C Grade");
        } else if (percent >= 60 && percent <= 75) {
            System.out.println("B Grade");
        } else if (percent >= 76 && percent <= 100) {
            System.out.println("A Grade");
        }
    }
}

class Grade {
    public static void main(String args[]) {
        student s = new student();
        s.physics = 70;
        s.chemistry = 80;
        s.maths = 90;
        s.english = 65;
        s.hindi = 75;
        s.calc();
        System.out.println("Total marks: " + s.total);
        System.out.println("Percentage: " + s.percent + "%");
        s.grade();
    }
}
