package qin.javaee8.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SuperDomain
{
    @Id
    @GeneratedValue
    public Integer id;
}