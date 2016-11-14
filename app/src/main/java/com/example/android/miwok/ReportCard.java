package com.example.android.miwok;

import java.util.HashMap;
import java.util.Map;

/**
 * A custom Report Card class to represent a report card that returns student grades.
 * This class is indended to store a student's grades for a particular year.
 * Created by Andrew Osborne on 11/12/2016.
 */

public class ReportCard {

    private String mStudentName;
    private int numberOfCourses = 3;
    private Map<String, Double> grades = new HashMap<>();


    /**
     * Default constructor for ReportCard class
     *
     * @param studentName  is the name of the student (i.e. "Andy")
     * @param englishGrade is the student's English Grade as a double (i.e. 87.5)
     * @param mathGrade    is the student's Math grade
     * @param scienceGrade is the student's Science grade
     */
    public ReportCard(String studentName, double englishGrade, double mathGrade,
                      double scienceGrade) {
        mStudentName = studentName;
        grades.put("English", englishGrade);
        grades.put("Math", mathGrade);
        grades.put("Science", scienceGrade);
    }

    /**
     * Method to construct a ReportCard object without initial grades
     *
     * @param studentName is the name of the student (i.e. "Andy")
     */
    public ReportCard(String studentName) {
        mStudentName = studentName;
    }

    /**
     * Method to get the number of courses in the student's report card.
     *
     * @return the number of student's courses in a string format
     */
    public String getNumberOfCourses() {
        return Integer.toString(numberOfCourses);
    }

    /**
     * Method to change the number of courses. This is used to calculate a student's
     * GPA
     *
     * @param newNumberOfCourses is the desired number of courses
     */
    public void changeNumberOfCourses(int newNumberOfCourses) {
        numberOfCourses = newNumberOfCourses;
    }

    /**
     * Method to set a student's grades for all subjects at once
     *
     * @param englishGrade is the student's grade for English in double format (i.e. 85.7)
     * @param mathGrade    is the student's grade for Math in double format
     * @param scienceGrade is the student's grade for Science in double format
     */
    public void setAllGrades(double englishGrade, double mathGrade, double scienceGrade) {
        grades.put("English", englishGrade);
        grades.put("Math", mathGrade);
        grades.put("Science", scienceGrade);
    }

    /**
     * Method to set a student's grade for a particular subject
     *
     * @param subject to which to grade is to be added (i.e. "Math")
     * @param aGrade  the grade for the subject as a double (i.e. 87.5)
     */
    public void setGrade(String subject, double aGrade) {
        grades.put(subject, aGrade);
    }

    /**
     * Method to change a student's name after they have been created
     *
     * @param studentName the new name of the student
     */
    public void changeStudentName(String studentName) {
        mStudentName = studentName;
    }

    /**
     * Method to return the student name
     *
     * @return the student's name
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * Method to get a grade for a single subject
     *
     * @param subject for whose grade is desired
     * @return the grade formatted as a String
     */
    public String getGrade(String subject) {
        return Double.toString(grades.get(subject));
    }

    /**
     * Method to return all of the student's grades
     *
     * @return the grades of all subjects in String format
     */
    public String toString() {
        String allGrades =
                getStudentName() + ":\n" +
                        "English: " + Double.toString(grades.get("English")) + "\n" +
                        "Math: " + Double.toString(grades.get("Math")) + "\n" +
                        "Science: " + Double.toString(grades.get("Science")) +
                        "Overall GPA: " + getOverallGrade();

        return allGrades;
    }

    /**
     * Method to return the student's overall grade
     *
     * @return the student's overall grade in String format
     */
    public String getOverallGrade() {
        double overallGrade = (grades.get("English") + grades.get("Math") +
                grades.get("Science")) / numberOfCourses;
        return Double.toString(overallGrade);
    }
}



