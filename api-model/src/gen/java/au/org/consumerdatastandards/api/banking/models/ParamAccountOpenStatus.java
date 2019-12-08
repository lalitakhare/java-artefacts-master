package au.org.consumerdatastandards.api.banking.models;

import au.org.consumerdatastandards.support.data.*;

@DataDefinition(
    description = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed"
)
public enum ParamAccountOpenStatus {
    OPEN,
    CLOSED,
    ALL
}
