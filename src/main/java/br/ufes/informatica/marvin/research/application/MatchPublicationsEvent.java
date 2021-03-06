package br.ufes.informatica.marvin.research.application;

import br.ufes.informatica.marvin.core.domain.Academic;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (https://github.com/vitorsouza/)
 */
public class MatchPublicationsEvent {
  /** Researcher whose publications should be matched. */
  private Academic researcher;

  /** Constructor. */
  public MatchPublicationsEvent() {}

  /** Constructor. */
  public MatchPublicationsEvent(Academic researcher) {
    this.researcher = researcher;
  }

  /** Getter for researcher. */
  public Academic getResearcher() {
    return researcher;
  }
}
