/**
 * File Name: TcpApplyBean.java<br>
 * CopyRight: Copyright by www.center.china<br>
 * Description:<br>
 * CREATER: ZHUACHEN<br>
 * CreateTime: 2011-7-10<br>
 * Grant: open source to everybody
 */
package com.china.center.oa.tcp.bean;


import com.china.center.jdbc.annotation.Entity;
import com.china.center.jdbc.annotation.FK;
import com.china.center.jdbc.annotation.Id;
import com.china.center.jdbc.annotation.Table;
import com.china.center.oa.tcp.constanst.TcpConstanst;

import java.io.Serializable;


/**
 * 中收激励统计明细表
 * 
 * @author ZHUZHU
 * @version 2015-04-13
 * @see com.china.center.oa.tcp.bean.TcpIbReportItemBean
 * @since 3.0
 */
@Entity
@Table(name = "T_CENTER_TCPIBREPORT_ITEM")
public class TcpIbReportItemBean implements Serializable
{
    @Id
    private String id = "";

    /**
     * 对应的TcpIbReportBean ID
     */
    @FK
    private String refId = "";

    /**
     * 申请类型：中收: 0 激励：1
     */
    private int type = TcpConstanst.IB_TYPE;

    private String customerName = "";

    private String fullId = "";

    private String productName = "";

    private String productId = "";

    private double price = 0.0d;

    private int amount = 0;

    /**
     * 中收金额
     */
    private double ibMoney = 0.0d;

    /**
     * 激励金额
     */
    private double motivationMoney = 0.0d;



    /**
     * default constructor
     */
    public TcpIbReportItemBean()
    {
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the type
     */
    public int getType()
    {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(int type)
    {
        this.type = type;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFullId() {
        return fullId;
    }

    public void setFullId(String fullId) {
        this.fullId = fullId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getIbMoney() {
        return ibMoney;
    }

    public void setIbMoney(double ibMoney) {
        this.ibMoney = ibMoney;
    }

    public double getMotivationMoney() {
        return motivationMoney;
    }

    public void setMotivationMoney(double motivationMoney) {
        this.motivationMoney = motivationMoney;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TcpIbReportItemBean{" +
                "id='" + id + '\'' +
                ", refId='" + refId + '\'' +
                ", type=" + type +
                ", customerName='" + customerName + '\'' +
                ", fullId='" + fullId + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", ibMoney=" + ibMoney +
                ", motivationMoney=" + motivationMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TcpIbReportItemBean that = (TcpIbReportItemBean) o;

        if (amount != that.amount) return false;
        if (Double.compare(that.ibMoney, ibMoney) != 0) return false;
        if (Double.compare(that.motivationMoney, motivationMoney) != 0) return false;
        if (type != that.type) return false;
        if (!customerName.equals(that.customerName)) return false;
        if (!fullId.equals(that.fullId)) return false;
        if (!productName.equals(that.productName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type;
        result = 31 * result + customerName.hashCode();
        result = 31 * result + fullId.hashCode();
        result = 31 * result + productName.hashCode();
        result = 31 * result + amount;
        temp = Double.doubleToLongBits(ibMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(motivationMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
