package br.ufes.informatica.marvin.research.application;

import java.io.Serializable;
import javax.ejb.Local;
import br.ufes.informatica.marvin.research.domain.BibGenConfiguration;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (https://github.com/vitorsouza/)
 */
@Local
public interface GenerateBibliographyService extends Serializable {
  /**
   * TODO: document this method.
   * 
   * @param config
   * @return
   */
  StringBuilder generateBibliography(BibGenConfiguration config);
}
