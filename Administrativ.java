
package javaapplication6;


import javaapplication6.Organization;

public class main {
    static public void main(String[] args)
    {
        Organization org = new Organization();

        System.out.println(org);
    }
}


/**1.package javaapplication6;

public abstract class AdministrativeStaff extends Staff {

}

2. package javaapplication6;

public class Department {
    public Staff[] staff;
}

3.package javaapplication6;

public class Department {
    public Staff[] staff;
}

4.package javaapplication6;

public class FrontDeskStuff extends AdministrativeStaff {

}

5. package javaapplication6;

public class Doctor extends OperationsStaff {

    public String[] specialty;
    public String[] locations;
}

6.package javaapplication6;

public class Hospital {
    public String id;
    public String address;
    public String phone;
    public Department[] departments;
}

7.package javaapplication6;

public class Nurse extends OperationsStaff {

}

8.package javaapplication6;

public class Organization {
    public Person person;
}

9.package javaapplication6;

import java.util.Date;

public class Patient extends Person
{
    public String id;
    public Date accepted;
    public String[] sickness;
    public String[] prescriptions;
    public String[] allergies;
    public String[] specialReqs;

    public int age()
    {
        return accepted.getYear() - birthDate.getYear();
    }
}

10.package javaapplication6;
import java.util.Date;

public class Person {
    public String title;
    public String givenName;
    public String middleName;
    public String familyName;
    public Date birthDate;
    public boolean gender;
    public String phone;
    public String homeAddress;

    public String fullName() {
        return title + givenName + middleName + familyName;
    }
}

11.package javaapplication6;

import java.util.Date;

public class Staff extends Person
{
    public Date joined;
    public String[] education;
    public String[] certifications;
    public String[] languages;
}

12.package javaapplication6;

public class Surgeon extends Doctor {
}

13.package javaapplication6;

public class SurgicalTechnologist extends Technologist {

}

14.

package javaapplication6;

public class Technician extends TechnicalStaff {

}

15.package javaapplication6;

public class Technologist extends TechnicalStaff {

}

 */