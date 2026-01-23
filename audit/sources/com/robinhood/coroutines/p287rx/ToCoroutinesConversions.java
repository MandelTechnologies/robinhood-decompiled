package com.robinhood.coroutines.p287rx;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: ToCoroutinesConversions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\b¨\u0006\u0005"}, m3636d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "", "Lio/reactivex/Observable;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.rx.ToCoroutinesConversionsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ToCoroutinesConversions {
    public static final <T> Flow<T> asFlow(Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
    }
}
