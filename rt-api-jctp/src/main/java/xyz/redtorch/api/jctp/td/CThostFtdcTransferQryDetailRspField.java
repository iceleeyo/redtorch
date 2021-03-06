/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.td;

public class CThostFtdcTransferQryDetailRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryDetailRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryDetailRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTransferQryDetailRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeDate(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TradeCode_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureID_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setBankSerial(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankSerial_set(swigCPtr, this, value);
  }

  public int getBankSerial() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankSerial_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_BankAccount_get(swigCPtr, this);
  }

  public void setCertCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_CertCode_set(swigCPtr, this, value);
  }

  public String getCertCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_CertCode_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_CurrencyCode_get(swigCPtr, this);
  }

  public void setTxAmount(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TxAmount_set(swigCPtr, this, value);
  }

  public double getTxAmount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_TxAmount_get(swigCPtr, this);
  }

  public void setFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_Flag_set(swigCPtr, this, value);
  }

  public char getFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferQryDetailRspField_Flag_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryDetailRspField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTransferQryDetailRspField(), true);
  }

}
