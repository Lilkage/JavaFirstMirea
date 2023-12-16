package ru.mirea.task2.number1;

public class Author {
        private String employeeName;
        private String employeeEmail;
        private char employeeGender;

        public Author(String employeeName, String employeeEmail, char employeeGender) {
            this.employeeName = employeeName;
            this.employeeEmail = employeeEmail;
            this.employeeGender = employeeGender;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public String getEmployeeEmail() {
            return employeeEmail;
        }

        public char getEmployeeGender() {
            return employeeGender;
        }

        public void setEmployeeEmail(String employeeEmail) {
            this.employeeEmail = employeeEmail;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeName='" + employeeName + '\'' +
                    ", employeeEmail='" + employeeEmail + '\'' +
                    ", employeeGender=" + employeeGender +
                    '}';
        }
    }

    class TestEmployee {
        public static void main(String[] args) {
            Author e1 = new Author("Maksim", "Maksim@gmail.com", 'm');
            System.out.println(e1);
            e1.setEmployeeEmail("Maksim@mail.ru");
            System.out.println(e1);
            System.out.println("name: " + e1.getEmployeeName() + ", email: "
                    + e1.getEmployeeEmail() + ", gender: " + e1.getEmployeeGender());
        }
    }


