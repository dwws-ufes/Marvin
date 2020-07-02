package br.ufes.informatica.marvin.core.persistence;

import javax.ejb.Local;
import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.informatica.marvin.core.domain.MarvinConfiguration;

/**
 * Interface for a DAO for objects of the MarvinConfiguration domain class.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation definitions are inherited from the
 * superclass, whereas operations that are specific to the managed domain class (if any) are
 * specified in this class.
 * 
 * @author Vítor E. Silva Souza (https://github.com/vitorsouza/)
 */
@Local
public interface MarvinConfigurationDAO extends BaseDAO<MarvinConfiguration> {
  /**
   * TODO: document this method.
   * 
   * @return
   * @throws PersistentObjectNotFoundException
   */
  MarvinConfiguration retrieveCurrentConfiguration() throws PersistentObjectNotFoundException;
}
