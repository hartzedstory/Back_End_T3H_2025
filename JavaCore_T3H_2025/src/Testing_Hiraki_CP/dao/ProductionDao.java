package Testing_Hiraki_CP.dao;

import Testing_Hiraki_CP.model.ProductionDetailModel;
import Testing_Hiraki_CP.model.ProductionModel;

import java.util.List;

public interface ProductionDao {

    public void showAllProductions();

    public List<ProductionModel> getProductions();

    public List<ProductionDetailModel> getProductionDetails(List<Integer> idsProduction);
}
