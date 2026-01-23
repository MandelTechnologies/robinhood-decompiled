package com.robinhood.android.equityadvancedorder.datastate;

import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: InitialDataStateHelper.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toSharesQuantityText", "", "Ljava/math/BigDecimal;", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.datastate.InitialDataStateHelperKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InitialDataStateHelper2 {
    public static final String toSharesQuantityText(BigDecimal bigDecimal) {
        BigDecimal bigDecimalM822m;
        if (bigDecimal == null || (bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal)) == null) {
            return null;
        }
        return bigDecimalM822m.toPlainString();
    }
}
