package com.robinhood.android.brokeragecontent;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BrokerageResource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m3636d2 = {"getContentfulId", "", "Lcom/robinhood/android/brokeragecontent/BrokerageResource;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "lib-brokerage-content_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.brokeragecontent.BrokerageResourceKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BrokerageResource2 {
    public static final String getContentfulId(BrokerageResource<?> brokerageResource, CountryCode.Supported supported) {
        String sgContentfulId;
        Intrinsics.checkNotNullParameter(brokerageResource, "<this>");
        if (Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            sgContentfulId = brokerageResource.getUkContentfulId();
        } else {
            sgContentfulId = Intrinsics.areEqual(supported, CountryCode.Supported.Singapore.INSTANCE) ? brokerageResource.getSgContentfulId() : null;
        }
        return sgContentfulId == null ? brokerageResource.getContentfulId() : sgContentfulId;
    }
}
