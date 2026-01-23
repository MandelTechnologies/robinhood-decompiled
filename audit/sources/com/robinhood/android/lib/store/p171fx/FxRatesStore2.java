package com.robinhood.android.lib.store.p171fx;

import com.robinhood.models.p325fx.api.ApiFxQuote;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: FxRatesStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.fx.FxRatesStore$fxRateEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class FxRatesStore2 extends AdaptedFunctionReference implements Function2<ApiFxQuote, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    FxRatesStore2(Object obj) {
        super(2, obj, SharedFlow2.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiFxQuote apiFxQuote, Continuation<? super Unit> continuation) {
        return FxRatesStore.fxRateEndpoint$tryEmit((SharedFlow2) this.receiver, apiFxQuote, continuation);
    }
}
