package com.robinhood.android.transfers.lib.lastused;

import com.robinhood.prefs.StringToLongMapPreference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePaymentMethodLastUsed.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"updatePaymentMethodLastUsed", "", "Lcom/robinhood/prefs/StringToLongMapPreference;", "paymentMethodId", "", "lib-payment-method-last-used_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.lib.lastused.UpdatePaymentMethodLastUsedKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UpdatePaymentMethodLastUsed {
    public static final void updatePaymentMethodLastUsed(StringToLongMapPreference stringToLongMapPreference, String paymentMethodId) {
        Intrinsics.checkNotNullParameter(stringToLongMapPreference, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Map<String, Long> mutableMap = MapsKt.toMutableMap(stringToLongMapPreference.getValues());
        mutableMap.put(paymentMethodId, Long.valueOf(System.currentTimeMillis()));
        stringToLongMapPreference.setValues(mutableMap);
    }
}
