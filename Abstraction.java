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

    @Override
    public void setExamPaper() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setExamPaper'");
    }

    @Override
    public void defineClassSchedule() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defineClassSchedule'");
    }

    @Override
    public void prepareTeamReport() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepareTeamReport'");
    }

    @Override
    public void allowLeaves() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allowLeaves'");
    }
}
