package Homework07;

public abstract class Applicant implements Observer {
    protected String name;
    protected int salary;
    protected boolean finderStatus;

    @Override
    public boolean getFinderStatus() {
        return this.finderStatus;
    }
}
