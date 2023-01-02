package com.chysk5.service;

import java.util.List;

import com.chysk5.domain.PriceRankDTO;
import com.chysk5.domain.RegResellProductDTO;
import com.chysk5.domain.ResellPriceDTO;
import com.chysk5.domain.ResellProductInfoDTO;

public interface ResellService {

   public ResellProductInfoDTO getMyResellProduct(String pro_opt_id);
   public List<ResellPriceDTO> getPrice(String pro_opt_id);
   public int register(RegResellProductDTO regResellProductDTO);
   public int getPriceRank(String pro_opt_id, int pInt);
}