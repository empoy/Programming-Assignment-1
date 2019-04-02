
        package sis;
        import javax.swing.JOptionPane;
        import java.io.*;
        import java.util.ArrayList;
public class SIS {
            static ArrayList<student> studentList = new ArrayList<>();
            int choise;
            



        public static void main(String[] args) throws IOException {
        SIS sis;
        sis=new SIS();
        sis.logIn();
        
                
        
       
        
       



        }
        public void logIn() throws IOException {
        JOptionPane.showMessageDialog(null, "Welcome to the SIS, Student Information System.");

        menu();
        }
        public void menu() throws IOException{
        String input;
        
        input=JOptionPane.showInputDialog("Choose one of the options below"+
                "\n"+"1. Add a new student"+
                "\n"+"2. Show student information"+
                "\n"+"3. List of all students"+
                "\n"+"4. Update student information"+
                "\n"+"5. Delete  student information"+
                "\n"+"6. Show GPA"+
                "\n"+"7. Show average GPA");
                choise=Integer.parseInt(input);
                if(choise==1){
                    addStudent();
                }
                if(choise==2){
                    studentInfo();
                }
                if(choise==3){
                    list();
                }
        

}
         public void addStudent() throws IOException{
            
            String input;
            int temp;
            Double temp1;
             student st=new student();
            
            
           
            input=JOptionPane.showInputDialog("Write down the ID:");
            temp=Integer.parseInt(input);
            st.setId(temp);
            
            input=JOptionPane.showInputDialog("Write down the name:");
            st.setName(input);
            
            input=JOptionPane.showInputDialog("Write down the last name:");
            st.setlastName(input);
            
            input=JOptionPane.showInputDialog("Course 1 grade:");
            temp1=Double.parseDouble(input);
            st.setGrade1(temp1);
            
            input=JOptionPane.showInputDialog("Course 2 grade:");
            temp1=Double.parseDouble(input);
            st.setGrade2(temp1);
            
            input=JOptionPane.showInputDialog("Course 3 grade:");
            temp1=Double.parseDouble(input);
            st.setGrade3(temp1);
            
            input=JOptionPane.showInputDialog("Course 4 grade:");
            temp1=Double.parseDouble(input);
            st.setGrade4(temp1);
            
            input=JOptionPane.showInputDialog("Course 5 grade:");
            temp1=Double.parseDouble(input);
            st.setGrade5(temp1);
            
            studentList.add(st);
            st.studentPrint();
            input=JOptionPane.showInputDialog("1.Menu"+"\n"+"2. Add");
            choise=Integer.parseInt(input);
            if(choise==1){
                menu();
            }
            if(choise==2){
                addStudent();
            }
            
           
            
          
            
               
            
            
            
            
            
        }
         public void studentInfo() throws IOException{
             String input;
              int search;
        
        input=JOptionPane.showInputDialog("Which student's information you wish to see?"+"\n"+"Write down the student's ID.");
         search=Integer.parseInt(input);
         for(int i=0;i<studentList.size();i++){
        Integer temp=studentList.get(i).id;
        if(search==temp){
            JOptionPane.showMessageDialog(null, "ID: "+studentList.get(i).id+" "+"Name: "+studentList.get(i).name+" "+"Last name:"+" "+studentList.get(i).lastName+" "+
                        "Course 1: "+studentList.get(i).grade1+ " "+
                        "Course 2: "+studentList.get(i).grade2+" "+
                        "Course 3: "+studentList.get(i).grade3+" "+
                        "Course 4: "+studentList.get(i).grade4+" "+
                        "Course 5: "+studentList.get(i).grade5);
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Sorry, ID not found."+"\n"+"Try again.");
            studentInfo();
        }
         }
        
         
        
               }
         public void list() throws IOException{
            
            FileReader fr=new FileReader("student.txt");
    BufferedReader br=new BufferedReader(fr);
      int i; 
    while ((i=br.read()) != -1){  
     
      System.out.print((char) i); 
    }
  }
         
}
        
         

       
             
        
        
    
        
        


