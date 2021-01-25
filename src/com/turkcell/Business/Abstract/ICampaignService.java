package com.turkcell.Business.Abstract;

import com.turkcell.entities.Concrete.Campaign;
import java.util.List;

public interface ICampaignService {
  List<Campaign> getAll();
  void add(Campaign campaign);
  void update(Campaign campaign);
  void deleteAll();
  void findById(int id);

}
