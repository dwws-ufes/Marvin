package br.ufes.informatica.marvin.people.domain;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport_;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-28T09:07:32.338-0300")
@StaticMetamodel(Person.class)
public class Person_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Date> birthDate;
	public static volatile SingularAttribute<Person, Character> gender;
	public static volatile SingularAttribute<Person, String> cpf;
	public static volatile SingularAttribute<Person, String> identityCard;
	public static volatile SingularAttribute<Person, String> birthCity;
	public static volatile SingularAttribute<Person, String> nationality;
}
