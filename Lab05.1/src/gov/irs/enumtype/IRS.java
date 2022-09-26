package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {

  //methods in Interface are abstract unless declared static, public or default.
  static IRS getInstance() {
    return IRSEnum.INSTANCE;
  }

  void collectTaxes();

  void register(TaxPayer payer);



}
