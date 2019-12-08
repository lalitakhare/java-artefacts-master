/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.math.BigDecimal;
import java.util.Objects;
/**
 * Defines the criteria and conditions for which a rate applies
 */
public class BankingProductRateTier {

    public enum RateApplicationMethod {
        PER_TIER,
        WHOLE_BALANCE
    }

    public enum UnitOfMeasure {
        DAY,
        DOLLAR,
        MONTH,
        PERCENT
    }

    private BankingProductRateCondition applicabilityConditions;

    private BigDecimal maximumValue;

    private BigDecimal minimumValue;

    private String name;

    private RateApplicationMethod rateApplicationMethod;

    private BankingProductRateTierSubTier subTier;

    private UnitOfMeasure unitOfMeasure;

    /**
     * Get applicabilityConditions
     * @return applicabilityConditions
     */
    public BankingProductRateCondition getApplicabilityConditions() {
        return applicabilityConditions;
    }

    public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
        this.applicabilityConditions = applicabilityConditions;
    }

    /**
     * The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 – 2 months, 2 – 3 months). If absent the tier&#39;s range has no upper bound.
     * @return maximumValue
     */
    public BigDecimal getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(BigDecimal maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value
     * @return minimumValue
     */
    public BigDecimal getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(BigDecimal minimumValue) {
        this.minimumValue = minimumValue;
    }

    /**
     * A display name for the tier
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get rateApplicationMethod
     * @return rateApplicationMethod
     */
    public RateApplicationMethod getRateApplicationMethod() {
        return rateApplicationMethod;
    }

    public void setRateApplicationMethod(RateApplicationMethod rateApplicationMethod) {
        this.rateApplicationMethod = rateApplicationMethod;
    }

    /**
     * Get subTier
     * @return subTier
     */
    public BankingProductRateTierSubTier getSubTier() {
        return subTier;
    }

    public void setSubTier(BankingProductRateTierSubTier subTier) {
        this.subTier = subTier;
    }

    /**
     * Get unitOfMeasure
     * @return unitOfMeasure
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductRateTier bankingProductRateTier = (BankingProductRateTier) o;
        return Objects.equals(this.applicabilityConditions, bankingProductRateTier.applicabilityConditions) &&
            Objects.equals(this.maximumValue, bankingProductRateTier.maximumValue) &&
            Objects.equals(this.minimumValue, bankingProductRateTier.minimumValue) &&
            Objects.equals(this.name, bankingProductRateTier.name) &&
            Objects.equals(this.rateApplicationMethod, bankingProductRateTier.rateApplicationMethod) &&
            Objects.equals(this.subTier, bankingProductRateTier.subTier) &&
            Objects.equals(this.unitOfMeasure, bankingProductRateTier.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            applicabilityConditions,
            maximumValue,
            minimumValue,
            name,
            rateApplicationMethod,
            subTier,
            unitOfMeasure);
    }

    @Override
    public String toString() {
        return "class BankingProductRateTier {\n" +
            "   applicabilityConditions: " + toIndentedString(applicabilityConditions) + "\n" + 
            "   maximumValue: " + toIndentedString(maximumValue) + "\n" + 
            "   minimumValue: " + toIndentedString(minimumValue) + "\n" + 
            "   name: " + toIndentedString(name) + "\n" + 
            "   rateApplicationMethod: " + toIndentedString(rateApplicationMethod) + "\n" + 
            "   subTier: " + toIndentedString(subTier) + "\n" + 
            "   unitOfMeasure: " + toIndentedString(unitOfMeasure) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
