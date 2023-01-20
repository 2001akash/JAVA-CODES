//Abstraction
//Abstraction is a practice in OOP that help us expose relavant functionalities and hide the unnecessary ones.

//to Implementation abstarction we use interface & abstarct class.

interface HOD {
    void defineClassSchedule();

    void prepareTeamReport();

    void allowLeaves();
}

interface Professor {
    void takeClasses();

    void markAttendance();

    void setExamPaper();
}

class Abstraction implements HOD, Professor {
    public static void main(String[] args) {
        HOD hodObject = new Abstraction();
        Professor pObj = new Abstraction();
    }

    // Abstraction ab=new Abstraction();
    @Override
    public void takeClasses() {
        //
    }

    @Override
    public void markAttendance() {
    }
}
