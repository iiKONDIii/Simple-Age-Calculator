import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();
        int currentMonth = localDate.getMonthValue();
        int currentDay = localDate.getDayOfMonth();
        int [] leapYears = {2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044,2048};
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hello, this is an age calculator, this will tell you how old you are,\nyour zodiac,\nyour star-sign \n" +
                "and if you were born on a leap year!");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What year were you born?");
        int yearOfBirth = input.nextInt();
        System.out.println("What month of the year were you born eg 1= Jan, 2= Feb etc ");
        int birthMonth = input.nextInt();
        System.out.println("What day of the month were you born on eg 1st, 2nd etc");
        int dayOfBirth = input.nextInt();
        int age = currentYear - yearOfBirth;
        System.out.println("So "+name+" this is what we have found out about you");
        switch (birthMonth) {
            case 1:
                System.out.println("You are born in January,  the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if ((currentMonth > birthMonth) && (dayOfBirth <= currentDay)) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;

                }
                break;
            case 2:
                System.out.println("You are born in February, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 3:
                System.out.println("You are born in March, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;

                }
                break;

            case 4:
                System.out.println("You are born in April, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 20) {
                    System.out.println("you are an aries");
                } else if (dayOfBirth >= 21) {
                    System.out.println("You are a taurus");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;

                }
                break;

            case 5:
                System.out.println("You are born in May, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 21) {
                    System.out.println("you are an Taurus");
                } else if (dayOfBirth >= 21) {
                    System.out.println("You are a Gemini");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;

                }
                break;

            case 6:
                System.out.println("You are born in June, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 21) {
                    System.out.println("you are a Gemini");
                } else if (dayOfBirth >= 22) {
                    System.out.println("You are a Cancer");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 7:
                System.out.println("You are born in July, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 22) {
                    System.out.println("you are an Cancer");
                } else if (dayOfBirth >= 23) {
                    System.out.println("You are a Leo");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 8:
                System.out.println("You are born in August, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 23) {
                    System.out.println("you are an Leo");
                } else if (dayOfBirth >= 24) {
                    System.out.println("You are a Virgo");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 9:
                System.out.println("You are born in September, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if (currentMonth >= birthMonth) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 23) {
                    System.out.println("you are an Virgo");
                } else if (dayOfBirth >= 24) {
                    System.out.println("You are a Libra");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 10:
                System.out.println("You are born in October, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if ((currentMonth >= birthMonth) && (dayOfBirth <= currentDay)) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 23) {
                    System.out.println("you are an Libra");
                } else if (dayOfBirth >= 24) {
                    System.out.println("You are a Scorpio");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;

                }
                break;

            case 11:
                System.out.println("You are born in November, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
                if ((currentMonth >= birthMonth) && (dayOfBirth <= currentDay)) {
                    System.out.println("Your age is: " + age);
                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 22) {
                    System.out.println("you are an Scorpio");
                } else if (dayOfBirth >= 23) {
                    System.out.println("You are a Sagittarius");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;

            case 12:
                System.out.println("You are born in December, the year was: " + yearOfBirth + " and the date was the: " + dayOfBirth);
                for (int leapYearCalc : leapYears) {
                    if (leapYearCalc == yearOfBirth) {
                        System.out.println("Your year of birth was a leap year");
                    }
                }
               /* for (int i = 0; i < multipleYears.length; i++){
                    for (int j = 0; j < zodiacRats.length; j++){
                        for (int k = 0; k < zodiacOx.length; k++){
                            int zodiacYear = multipleYears[i];
                            int rats = zodiacRats[j];
                            int oxs = zodiacOx[k];
                            if ((zodiacYear == rats) && (rats == yearOfBirth)) {
                                System.out.println("you are a rat in the chinese zodiac");
                            }
                            if ((zodiacYear == oxs)&&(oxs == yearOfBirth)){
                                System.out.println("You are an Ox in the chinese zodiac");
                            }
                        }
                    }
                }*/
                if ((currentMonth >= birthMonth) && (dayOfBirth <= currentDay)) {
                    System.out.println("Your age is: " + age);

                } else {
                    System.out.println("Your age is: " + (age - 1));
                }
                if (dayOfBirth <= 21) {
                    System.out.println("you are a Sagittarius");
                } else if (dayOfBirth >= 22) {
                    System.out.println("You are a Capricorn");
                }
                if (dayOfBirth == 25){
                    System.out.println("You were born on Christmas Day!!");
                }
                switch (yearOfBirth % 12) {
                    case 0:
                        System.out.println("Your zodiac is: monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac is: rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac is: dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac is: pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac is: rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac is: ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac is: tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac is: rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac is: dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac is: snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac is: horse");
                        break;
                    case 11:
                        System.out.println("Your zodiac is: sheep");
                        break;
                }
                break;
        }
    }
}
