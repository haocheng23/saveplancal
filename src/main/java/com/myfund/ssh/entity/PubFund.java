package com.myfund.ssh.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "PUB_FUND", schema = "dbo", catalog = "PrimaryData_New")
@IdClass(PubFundPK.class)
public class PubFund {
    private int id;
    private String fundCode;
    private Timestamp dealDate;
    private String fundName;
    private BigDecimal unitEquity;
    private BigDecimal totalEquity;
    private BigDecimal equity;
    private BigDecimal dayYield;
    private BigDecimal profit;
    private BigDecimal dayBenefit;
    private BigDecimal weekBenefit;
    private BigDecimal adjustRatio;
    private BigDecimal checkBenefit;
    private Double fuQuanUnitEquity;
    private BigDecimal latestWeeklyYield;
    private BigDecimal dailyProfit;
    private Double lineChart;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "FundCode")
    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    @Id
    @Column(name = "DealDate")
    public Timestamp getDealDate() {
        return dealDate;
    }

    public void setDealDate(Timestamp dealDate) {
        this.dealDate = dealDate;
    }

    @Basic
    @Column(name = "FundName")
    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    @Basic
    @Column(name = "UnitEquity")
    public BigDecimal getUnitEquity() {
        return unitEquity;
    }

    public void setUnitEquity(BigDecimal unitEquity) {
        this.unitEquity = unitEquity;
    }

    @Basic
    @Column(name = "TotalEquity")
    public BigDecimal getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(BigDecimal totalEquity) {
        this.totalEquity = totalEquity;
    }

    @Basic
    @Column(name = "Equity")
    public BigDecimal getEquity() {
        return equity;
    }

    public void setEquity(BigDecimal equity) {
        this.equity = equity;
    }

    @Basic
    @Column(name = "DayYield")
    public BigDecimal getDayYield() {
        return dayYield;
    }

    public void setDayYield(BigDecimal dayYield) {
        this.dayYield = dayYield;
    }

    @Basic
    @Column(name = "Profit")
    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    @Basic
    @Column(name = "DayBenefit")
    public BigDecimal getDayBenefit() {
        return dayBenefit;
    }

    public void setDayBenefit(BigDecimal dayBenefit) {
        this.dayBenefit = dayBenefit;
    }

    @Basic
    @Column(name = "WeekBenefit")
    public BigDecimal getWeekBenefit() {
        return weekBenefit;
    }

    public void setWeekBenefit(BigDecimal weekBenefit) {
        this.weekBenefit = weekBenefit;
    }

    @Basic
    @Column(name = "AdjustRatio")
    public BigDecimal getAdjustRatio() {
        return adjustRatio;
    }

    public void setAdjustRatio(BigDecimal adjustRatio) {
        this.adjustRatio = adjustRatio;
    }

    @Basic
    @Column(name = "CheckBenefit")
    public BigDecimal getCheckBenefit() {
        return checkBenefit;
    }

    public void setCheckBenefit(BigDecimal checkBenefit) {
        this.checkBenefit = checkBenefit;
    }

    @Basic
    @Column(name = "FuQuanUnitEquity")
    public Double getFuQuanUnitEquity() {
        return fuQuanUnitEquity;
    }

    public void setFuQuanUnitEquity(Double fuQuanUnitEquity) {
        this.fuQuanUnitEquity = fuQuanUnitEquity;
    }

    @Basic
    @Column(name = "LatestWeeklyYield")
    public BigDecimal getLatestWeeklyYield() {
        return latestWeeklyYield;
    }

    public void setLatestWeeklyYield(BigDecimal latestWeeklyYield) {
        this.latestWeeklyYield = latestWeeklyYield;
    }

    @Basic
    @Column(name = "DailyProfit")
    public BigDecimal getDailyProfit() {
        return dailyProfit;
    }

    public void setDailyProfit(BigDecimal dailyProfit) {
        this.dailyProfit = dailyProfit;
    }

    @Basic
    @Column(name = "LineChart")
    public Double getLineChart() {
        return lineChart;
    }

    public void setLineChart(Double lineChart) {
        this.lineChart = lineChart;
    }


}
