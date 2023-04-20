package com.example.budgetplanner;

public class Income {
    String incomeType;
    Float incomeID ;
    Float incomePerHour;
    Float incomePerMonth;
    Float HoursWorked;
    Float monthlySalary;



    public Income(String IncomeType,
    Float IncomeID ,
    Float IncomePerHour,
    Float hoursWorked,
    Float MonthlySalary)
    {
            this.HoursWorked=hoursWorked;
            this.incomeID=IncomeID;
            this.incomePerHour=IncomePerHour;
            this.incomeType=IncomeType;
            this.monthlySalary=MonthlySalary;

        this.incomePerMonth = this.incomePerHour * this.HoursWorked;
    }

    // Getters and Setters
    public Float getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(Float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public Float getIncomeID() {
        return incomeID;
    }

    public void setIncomeID(Float incomeID) {
        this.incomeID = incomeID;
    }

    public Float getIncomePerHour() {
        return incomePerHour;
    }

    public void setIncomePerHour(Float incomePerHour) {
        this.incomePerHour = incomePerHour;
    }

    public Float getIncomePerMonth() {
        return incomePerMonth;
    }

    public void setIncomePerMonth(Float incomePerMonth) {
        this.incomePerMonth = incomePerMonth;
    }

    public Float getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(Float hoursWorked) {
        this.HoursWorked = hoursWorked;
        this.incomePerMonth = this.incomePerHour * this.HoursWorked;
    }

}
