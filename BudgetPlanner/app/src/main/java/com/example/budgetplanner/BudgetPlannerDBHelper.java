package com.example.budgetplanner;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BudgetPlannerDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "budget.db";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "income";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_INCOME = "income";
    private static final String COLUMN_EXPENSES = "expenses";

    public BudgetPlannerDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createIncomeTable = "CREATE TABLE income (" +
                "incomeId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                 "incomeType VARCHAR(255), " +
                "hoursWorked FLOAT," +
                 "perHourSalary FLOAT ," +
                "monthlySalary FLOAT," +
                "totalSalaryperMonth FLOAT )";
        db.execSQL(createIncomeTable);

        String createExpenseTable = "CREATE TABLE expense (" +
                "expenseId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "expenseName VARCHAR(255), " +
                "expenseAmount FLOAT  )";
        db.execSQL(createExpenseTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS income");
        db.execSQL("DROP TABLE IF EXISTS expense");
        onCreate(db);
    }

    public boolean insertDataIntoIncome(Income newIncome) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("incomeId", newIncome.getIncomeID());
        contentValues.put("hoursWorked", newIncome.getHoursWorked());
        contentValues.put("perHourSalary", newIncome.getIncomePerHour());
        contentValues.put("totalSalaryperMonth", newIncome.getIncomePerMonth());
        contentValues.put("incomeType", newIncome.getIncomeType());
        contentValues.put("monthlySalary", newIncome.getMonthlySalary());
        long result = db.insert(TABLE_NAME, null, contentValues);
        return result != -1;
    }

    public Cursor getData() {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }

    public void deleteData() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME);
    }
}

