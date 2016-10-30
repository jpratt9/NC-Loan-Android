

        package me.floatr.models;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;


public class LoanOffer {

    @SerializedName("loaner")
    @Expose
    private Loaner loaner;
    @SerializedName("min_offer")
    @Expose
    private Integer minOffer;
    @SerializedName("max_offer")
    @Expose
    private Integer maxOffer;
    @SerializedName("interest_rate")
    @Expose
    private Integer interestRate;
    @SerializedName("period")
    @Expose
    private Integer period;
    @SerializedName("period_unit")
    @Expose
    private String periodUnit;

    /**
     *
     * @return
     * The loaner
     */
    public Loaner getLoaner() {
        return loaner;
    }

    /**
     *
     * @param loaner
     * The loaner
     */
    public void setLoaner(Loaner loaner) {
        this.loaner = loaner;
    }

    /**
     *
     * @return
     * The minOffer
     */
    public Integer getMinOffer() {
        return minOffer;
    }

    /**
     *
     * @param minOffer
     * The min_offer
     */
    public void setMinOffer(Integer minOffer) {
        this.minOffer = minOffer;
    }

    /**
     *
     * @return
     * The maxOffer
     */
    public Integer getMaxOffer() {
        return maxOffer;
    }

    /**
     *
     * @param maxOffer
     * The max_offer
     */
    public void setMaxOffer(Integer maxOffer) {
        this.maxOffer = maxOffer;
    }

    /**
     *
     * @return
     * The interestRate
     */
    public Integer getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param interestRate
     * The interest_rate
     */
    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    /**
     *
     * @return
     * The period
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     *
     * @param period
     * The period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     *
     * @return
     * The periodUnit
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    /**
     *
     * @param periodUnit
     * The period_unit
     */
    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

}
