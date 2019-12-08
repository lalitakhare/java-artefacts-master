package au.org.consumerdatastandards.api.banking.models;

import java.util.List;
import au.org.consumerdatastandards.support.data.*;

@DataDefinition(
    description = "Indicates that the schedule of payments is defined by a series of intervals. Mandatory if recurrenceUType is set to intervalSchedule"
)
public class BankingScheduledPaymentRecurrenceIntervalSchedule {

    public enum NonBusinessDayTreatment {
        AFTER,
        BEFORE,
        ON,
        ONLY
    }

    @Property(
        description = "The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely"
    )
    @CDSDataType(CustomDataType.Date)
    String finalPaymentDate;

    @Property(
        description = "Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value, If neither field is present the payments will continue indefinitely"
    )
    @CDSDataType(CustomDataType.PositiveInteger)
    Integer paymentsRemaining;

    @Property(
        description = "Enumerated field giving the treatment where a scheduled payment date is not a business day.  If absent assumed to be ON"
    )
    NonBusinessDayTreatment nonBusinessDayTreatment = NonBusinessDayTreatment.ON;

    @Property(
        description = "An array of interval objects defining the payment schedule.  Each entry in the array is additive, in that it adds payments to the overall payment schedule.  If multiple intervals result in a payment on the same day then only one payment will be made. Must have at least one entry",
        required = true
    )
    List<BankingScheduledPaymentInterval> intervals;
}
