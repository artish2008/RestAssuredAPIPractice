package com.RestAssured.studentPOJO;
import java.util.List;


public class StudentPOJO {
	
	// payload
	/*//
	[
      {
        "id": 1,
        "firstName": "Vernon",
        "lastName": "Harper",
        "email": "egestas.rhoncus.Proin@massaQuisqueporttitor.org",
        "programme": "Financial Analysis",
        "courses": 
        [
            "Accounting",
            "Statistics"
        ]
    },
    {
        "id": 2,
        "firstName": "Murphy",
        "lastName": "Holmes",
        "email": "faucibus.orci.luctus@Duisac.net",
        "programme": "Financial Analysis",
        "courses": 
        [
            "Accounting",
            "Statistics"
        ]*/
    //create POJO based getter setter methods to pass from java objects to Json response.

	
		    private	String firstName;
			private String lastName;
			private String email;
			private String programme;
			
			private List<String> courses;

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getProgramme() {
				return programme;
			}

			public void setProgramme(String programme) {
				this.programme = programme;
			}

			public List<String> getCourses() {
				return courses;
			}

			public void setCourses(List<String> courses) {
				this.courses = courses;
			}
			

		}




