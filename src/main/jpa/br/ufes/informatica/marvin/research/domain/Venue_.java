package br.ufes.informatica.marvin.research.domain;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-05-28T09:07:32.366-0300")
@StaticMetamodel(Venue.class)
public class Venue_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<Venue, String> acronym;
	public static volatile SingularAttribute<Venue, String> issn;
	public static volatile SingularAttribute<Venue, String> name;
	public static volatile SingularAttribute<Venue, VenueCategory> category;
}
