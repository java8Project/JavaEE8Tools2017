package qin.javaee8.domain;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class Student implements Serializable
{
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    @AttributeOverride(name = "firstName", column = @Column(name = "f_name", nullable = false))
    private Person personId;

    @Column(name = "location")
    private String location;

    public Student(Person personId, String location)
    {
        this.personId = personId;
        this.location = location;
    }

    public Person getPersonId()
    {
        return personId;
    }

    public void setPersonId(Person id)
    {
        this.personId = id;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}