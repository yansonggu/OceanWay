package apis.json.samplecode1;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Employee {

    private String name;
    private String surname;
    private String age;
    private Address address;
    private Office office;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("surname", surname).append("age", age).append("address", address).append("office", office).toString();
    }

}
