package br.ufes.informatica.marvin.people.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/**
 * Domain class that represents telephone numbers.
 * 
 * <i>This class is part of a "Legal Entity" mini framework for EJB3.</i>
 * 
 * @author Vítor E. Silva Souza (https://github.com/vitorsouza/)
 */
@Entity
public class Telephone extends PersistentObjectSupport implements Comparable<Telephone> {
  /** The unique identifier for a serializable class. */
  private static final long serialVersionUID = 1L;

  /** The number. */
  @Basic
  @NotNull
  @Size(max = 25)
  protected String number;

  /** The type of contact. */
  @ManyToOne(optional = false)
  @NotNull
  protected ContactType type;

  /** Getter for number. */
  public String getNumber() {
    return number;
  }

  /** Setter for number. */
  public void setNumber(String number) {
    this.number = number;
  }

  /** Getter for type. */
  public ContactType getType() {
    return type;
  }

  /** Setter for type. */
  public void setType(ContactType type) {
    this.type = type;
  }

  @Override
  public int compareTo(Telephone o) {
    // First, order by contact type.
    if (type == null)
      return 1;
    if ((o == null) || (o.type == null))
      return -1;
    int cmp = type.compareTo(o.type);
    if (cmp != 0)
      return cmp;

    // If it's the same, order by phone number.
    if (number == null)
      return 1;
    if (o.number == null)
      return -1;
    cmp = number.compareTo(o.number);
    if (cmp != 0)
      return cmp;

    // If it's the same type and number, check if it's the same entity.
    return uuid.compareTo(o.uuid);
  }

  @Override
  public String toString() {
    return number + " (" + type + ")";
  }
}
