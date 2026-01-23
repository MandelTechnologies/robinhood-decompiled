package com.robinhood.android.equityadvancedorder.datastate;

import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ILimit.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m3636d2 = {"mutateLimit", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit;", "mutator", "Lkotlin/Function1;", "Lcom/robinhood/android/equityadvancedorder/datastate/ILimit$LimitState;", "Lkotlin/ExtensionFunctionType;", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.datastate.ILimitKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ILimit2 {
    public static final ILimit mutateLimit(ILimit iLimit, Function1<? super ILimit.LimitState, ILimit.LimitState> mutator) {
        Intrinsics.checkNotNullParameter(iLimit, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (iLimit instanceof LimitStandard) {
            LimitStandard limitStandard = (LimitStandard) iLimit;
            return LimitStandard.copy$default(limitStandard, null, mutator.invoke(limitStandard.getLimitState()), 1, null);
        }
        if (!(iLimit instanceof LimitTaxLots)) {
            throw new NoWhenBranchMatchedException();
        }
        LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
        return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, mutator.invoke(limitTaxLots.getLimitState()), 1, null), null, 2, null);
    }
}
