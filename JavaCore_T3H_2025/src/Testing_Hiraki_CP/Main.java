package Testing_Hiraki_CP;

import Testing_Hiraki_CP.dao.ProductionDao;
import Testing_Hiraki_CP.dao.impl.ProductionDaoImpl;

public class Main {
    public static void main(String[] args) {
        ProductionDao productionDao = new ProductionDaoImpl();
        productionDao.showAllProductions();
    }
}
