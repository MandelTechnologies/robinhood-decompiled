package com.robinhood.android.advisory.portfolio.update;

import com.robinhood.models.api.BrokerageAccountType;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"getMicrogramLaunchArguments", "", "accountNumber", "applicationId", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", Footer.f10637type, "", "feature-advisory-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final String getMicrogramLaunchArguments(String str, String str2, BrokerageAccountType brokerageAccountType, boolean z) {
        if (str != null) {
            return "{ \"account_number\": \"" + str + "\", \"account_type\": \"" + (brokerageAccountType != null ? brokerageAccountType.getServerValue() : null) + "\", \"footer\": \"" + z + "\" }";
        }
        if (str2 != null) {
            return "{\"application_id\": \"" + str2 + "\", \"account_type\": \"" + (brokerageAccountType != null ? brokerageAccountType.getServerValue() : null) + "\", \"footer\": \"" + z + "\" }";
        }
        throw new IllegalStateException("must provide either account number or application id");
    }
}
