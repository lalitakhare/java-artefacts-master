package au.org.consumerdatastandards.api.common.models;

import au.org.consumerdatastandards.support.data.*;

@DataDefinition
@CustomAttributes({
    @CustomAttribute(name = "x-conditional", value = "person", multiple = true),
    @CustomAttribute(name = "x-conditional", value = "organisation", multiple = true)
})
public class ResponseCommonCustomerDetail extends BaseResponse {

    @Property(
        required = true
    )
    ResponseCommonCustomerDetailData data;
}
