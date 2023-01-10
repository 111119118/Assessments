package com.example.Employee.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {



        @Id
        private String EmployeeId;
        private String EmployeeName;
        private String Analyst;

        private String city;
        private String Email;

        
        public String getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(String employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmployeeName() {
			return EmployeeName;
		}
		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}
		public String getAnalyst() {
			return Analyst;
		}
		public void setAnalyst(String analyst) {
			Analyst = analyst;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		
        public Employee() {
            super();
        }



    }
