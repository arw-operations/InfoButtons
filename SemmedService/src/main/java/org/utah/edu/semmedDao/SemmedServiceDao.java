package org.utah.edu.semmedDao;

import java.util.List;

/**
 * Created by JoeNarus on 5/23/16.
 */
public interface SemmedServiceDao {

List<RecentCitationsEntity> getCitations(List<String> PMIDs);
   List<ConceptFrequencySemmedEntity> getFilters(List<String> PMIDs);

}
