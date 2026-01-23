package com.robinhood.android.options.calculation.simulatedreturn.helper;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: IntrinsicValueCalculation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"intrinsicValue", "", Constants.RequestParamsKeys.SESSION_ID_KEY, Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "lib-options-calculation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.calculation.simulatedreturn.helper.IntrinsicValueCalculationKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class IntrinsicValueCalculation {
    public static final double intrinsicValue(double d, double d2) {
        return Math.max(d - d2, 0.0d);
    }
}
