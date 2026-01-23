package com.robinhood.android.lib.margin.api;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InterestRateModels.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m3636d2 = {"toRates", "Lcom/robinhood/android/lib/margin/api/MarginInterestRates;", "", "Lcom/robinhood/android/lib/margin/api/MarginInterestRateChoice;", "lib-margin_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.margin.api.InterestRateModelsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InterestRateModels {
    public static final MarginInterestRates toRates(List<MarginInterestRateChoice> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<MarginInterestRateChoice> list2 = list;
        for (MarginInterestRateChoice marginInterestRateChoice : list2) {
            if (marginInterestRateChoice.getPlanId() == null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((MarginInterestRateChoice) next).getPlanId() != null) {
                        break;
                    }
                }
                return new MarginInterestRates(marginInterestRateChoice, (MarginInterestRateChoice) next);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
