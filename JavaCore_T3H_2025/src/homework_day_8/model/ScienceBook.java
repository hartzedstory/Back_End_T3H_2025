package homework_day_8.model;

import java.util.Scanner;

public class ScienceBook extends Book {
    private String researchSubject;

    public String getResearchSubject() {
        return researchSubject;
    }

    public void setResearchSubject(String researchSubject) {
        this.researchSubject = researchSubject;
    }

    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap linh vuc nghien cuu: ");
        this.setResearchSubject(input.nextLine());
    }
}
