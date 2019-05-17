package com.myfund.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class PubFundPK implements Serializable {
    private String fundCode;
    private Timestamp dealDate;

    @Column(name = "FundCode")
    @Id
    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    @Column(name = "DealDate")
    @Id
    public Timestamp getDealDate() {
        return dealDate;
    }

    public void setDealDate(Timestamp dealDate) {
        this.dealDate = dealDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PubFundPK pubFundPK = (PubFundPK) o;

        if (fundCode != null ? !fundCode.equals(pubFundPK.fundCode) : pubFundPK.fundCode != null) return false;
        if (dealDate != null ? !dealDate.equals(pubFundPK.dealDate) : pubFundPK.dealDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fundCode != null ? fundCode.hashCode() : 0;
        result = 31 * result + (dealDate != null ? dealDate.hashCode() : 0);
        return result;
    }
}
