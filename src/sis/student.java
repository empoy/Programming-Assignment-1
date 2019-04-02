/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import static sis.SIS.studentList;

/**
 *
 * @author makan
 */
public class student {
     int id;
            String name;
            String lastName;
            double grade1,grade2,grade3,grade4,grade5;
            public student(int id, String name,String lastName,double grade1,double grade2,double grade3,double grade4,double grade5) throws IOException {
                this.id=id;
                this.name=name;
                this.lastName=lastName;
                this.grade1=grade1;
                this.grade2=grade2;
                this.grade3=grade3;
                this.grade4=grade4;
                this.grade5=grade5;
              
                




                
                
                
            }

    student() {
         //To change body of generated methods, choose Tools | Templates.
    }

    
    

            public void studentPrint() throws IOException{
               Collections.sort(studentList,new Comparator<student>(){
                
                @Override
                public int compare(student s1, student s2){
                    return Integer.valueOf(s1.id).compareTo(s2.id);
                }
            });
                FileWriter fw=new FileWriter("student.txt", true);

         
               PrintWriter student=new PrintWriter(fw);
               for(int i=0;i<studentList.size();i++){
                student.println("ID: "+studentList.get(i).id+" "+"Name: "+studentList.get(i).name+" "+"Last name:"+" "+studentList.get(i).lastName+" "+
                        "Course 1: "+studentList.get(i).grade1+ " "+
                        "Course 2: "+studentList.get(i).grade2+" "+
                        "Course 3: "+studentList.get(i).grade3+" "+
                        "Course 4: "+studentList.get(i).grade4+" "+
                        "Course 5: "+studentList.get(i).grade5);
               }
               student.close();
               
               
                
                
                        
                
                
                
        
             }
        
           
             public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public Double getGrade1() {
        return grade1;
    }

    public void setGrade1(Double grade1) {
        this.grade1 = grade1;
    }
    public Double getGrade2() {
        return grade2;
    }
    public void setGrade2(Double grade2) {
        this.grade2 = grade2;
    }
    public Double getGrade3() {
        return grade3;
    }
    public void setGrade3(Double grade3) {
        this.grade3 = grade3;
    }
    public Double getGrade4() {
        return grade4;
    }
    public void setGrade4(Double grade4) {
        this.grade4 = grade4;
    }
    public Double getGrade5() {
        return grade5;
    }
    public void setGrade5(Double grade5) {
        this.grade5 = grade5;
    }
    
    

    
            
}
