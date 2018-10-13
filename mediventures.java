import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Mediventure! Choose your level:\n1 for basic:\n2 for intermediate:\n3 for difficult:");
        int choice = in.nextInt();
        if (choice == 1)  {
            System.out.println("Are you in any type of pain?\n Press 1 for yes\n Press 2 for no");
            int pain = in.nextInt();
            if (pain == 1) {
                System.out.println("What degree of pain are you in?\nEnter a number from 1 to 10:");
                int intensity = in.nextInt();
                if (intensity >= 2)    {
                    System.out.println("How long has the pain lasted? (in months)");
                    int last = in.nextInt();
                    if (last <= 1) {
                        System.out.println("Take an Advil");
                    }   else if (last >=2 && last <= 9) {
                        System.out.println("What area is it concentrated in?\n1 for throat\n2 for head\n3 for chest\n4 for legs\n5 for feet\n6for hands\n7 for joints\n8 for other");
                        int concentrate = in.nextInt();
                        if (concentrate == 1)   {
                            System.out.println("Are there other symptons like fever or chills, nausea or headaches?\n1 for yes\n 2 for no");
                            int symptons = in.nextInt();
                            if (symptons == 1)  {
                                System.out.println("You have a flu or a cold");
                            }   else {
                                System.out.println("Do you have allergies with symptons of itchy eyes, or a swollen throat?\n1 for yes\n2 for no");
                                int alergies = in.nextInt();
                                if (alergies == 1)  {
                                    System.out.println("You have allergies");
                                }   else {
                                    System.out.println("We cannot help you");
                                }
                            }
                        }   else {
                            System.out.println("You have chronic pain or something weird! Go see a doctor.");
                        }
                    }   else {
                        System.out.println("You are going to die, you should go see a doctor");
                    } 
                }   else    {
                    System.out.println("You will be fine, just get some rest");
                }
            }   else {
                System.out.println("Do you have red, flaking, or scaly skin?\n1 for yes\n2 for no");
                int eczema = in.nextInt();
                if (eczema == 1)    {
                    System.out.println("You have ezcema!");
                }else {
                    System.out.println("What part hurts?\n1 for throat\n2 for head\n3 for chest\n4 for legs\n5 for feet\n6 for hands\n7 for joints\n8 for other");
                    int part = in.nextInt();
                    if (part == 1)  {
                        System.out.println("Are there other symptons like fever/chills, nausea, or headaches?\n1 for yes\n2 for no");
                        int sympts = in.nextInt();
                        if (sympts == 1)    {
                            System.out.println("You have a cold!");
                        }   else {
                            System.out.println("I'd recommend a doctor!");
                        }
                    }   else {
                        System.out.println("Do you have allergies with symptons of itchy eyes, or swollen throat?\n1 for yes\n2 for no");
                        int allergic = in.nextInt();
                        if (allergic == 1)  {
                            System.out.println("You have Allergies!");
                        }   else {
                            System.out.println("we can't help you buddy!");
                        }
                    }
                }
            }
        }   else if (choice == 2)   {
            int score = 0;
            System.out.println("Does your family have a history of eye, heart/lung disease, or diabetes?\n1 for yes\n2 for no");
            int history = in.nextInt();
            if (history == 1)   {
                System.out.println("Which disease?\n1 for eye\n2 for lung\n3 for heart\n4 for diabetes");
                int diseases = in.nextInt();
                if (diseases == 1)  {
                    score = score + 1;
                }   else if (diseases == 2) {
                    score = score + 3;
                }   else if (diseases == 3) {
                    score = score + 5;
                }   else if (diseases == 4) {
                    score = score + 7;
                }   else {
                    score = score + 0;
                }
            }   else    {
                score = score + 0;
            }
            System.out.println("Do you have blurry vision?\n1 for yes\n2 for no");
            int blurry = in.nextInt();
            if (blurry == 1)    {
                System.out.println("Do you have concentrated eye blind spots?\n1 for yes\n2 for no");
                int blind = in.nextInt();
                if (blind == 1) {
                    System.out.println("You have cataracts.");
                }   else    {
                    score = score + 1;
                }   
            }   else {
                    System.out.println("Do you have chest pain and shortness of breath?\n1 for yes\n2 for no");
                    int heart = in.nextInt();
                    if (heart == 1) {
                        System.out.println("You have heart disease");
                    }   else {
                        System.out.println("Do you have a persistent cough or have expectorated blood?\n1 for yes\n2 for no");
                        int lung = in.nextInt();
                        if (lung == 1)  {
                            System.out.println("You have lung disease!");
                        }   else {
                            System.out.println("We can't help you");
                        }
                    }
                }
            System.out.println("Do you have problems sleeping with symptons?\n1 for yes\n2 for no");  {
                int sleep = in.nextInt();
                if (sleep == 1) {
                    System.out.println("You have a disorder!");
                }   else {
                    System.out.println("Try again!");
                }
            if (score <= 2) {
                System.out.println("You have the risk to develop eye problems.");
            }   else if (score == 3)    {
                System.out.println("You have the risk to develop lung disease.");
            }   else if (score == 4 || score == 5)  {
                System.out.println("You have the risk of developing heart disease.");
            }   else if (score >= 5 && score <= 20) {
                System.out.println("You have the risk of developing diabetes");
            }   else    {
                System.out.println("You are okay.");
            }
            
            }
        }
        else if (choice == 3)   {
            System.out.println("Are you in physical pain?\n1 for yes\n2 for no");
            int physicalpain = in.nextInt();
            if (physicalpain == 1)  {
                System.out.println("Do you have a burning or itching sensation in your genital area?\n1 for yes\n2 for no");
                int abdominal = in.nextInt();
                if (abdominal == 1)    {
                    System.out.println("Does your abdomen hurt?\n1 for yes\n2 for no");
                    int chlamydia = in.nextInt();
                    if (chlamydia == 1) {
                        System.out.println("You have chlamydia!");
                    }   else {
                        System.out.println("You have gonorrhea!");
                    }
                }   else    {
                    System.out.println("Do your joints give you pain or do you have trouble in moving in your daily life?\n1 for yes \n 2 for no");
                    int athritis = in.nextInt();
                    if (athritis == 1) {
                        System.out.println("You have athritis!");
                    }   else {
                        System.out.println("Do you have unusual lumps in your body or a sore that will not heal?\n1 for yes\n2 for no");
                        int cancer = in.nextInt();
                        if (cancer == 1)    {
                            System.out.println("You need to seek a doctor immediately. You may have cancer.");
                        }   else {
                            System.out.println("You have a form of arthitis or MS. You need to see a doctor.");
                        }
                    }
                }
            }   else {
                System.out.println("Have you felt fatigued lately\n1 for yes\n2 for no");
                int depression = in.nextInt();
                if (depression == 1)    {
                    System.out.println("You have depression!");
                }   else {
                    System.out.println("Do you feel pressured or panicked in your daily life when life can be stressful?\n1 for yes\n2 for no");
                    int anxiety = in.nextInt();
                    if (anxiety == 1)   {
                        System.out.println("You have anxiety");
                    }   else {
                        System.out.println("Are you able to keep still to focus on work at hand?\1 for yes\n2 for no");
                        int disorder = in.nextInt();
                        if (disorder == 1)   {
                            System.out.println("Are you easily distracted while working?\n1 for yes\n2 for no");
                            int dddisorder = in.nextInt();
                            if (dddisorder == 1)    {
                                System.out.println("You have ADD.");
                            }   else {
                                System.out.println("You're good");
                            }
                        }   else {
                            System.out.println("You have ADHD");
                        }   
                    }
                }
            }   
        }
    }
}
