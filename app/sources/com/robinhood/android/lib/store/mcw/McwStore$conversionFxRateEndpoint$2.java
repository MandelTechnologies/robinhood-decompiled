package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: McwStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class McwStore$conversionFxRateEndpoint$2 extends AdaptedFunctionReference implements Function2<ConversionFxRate, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    McwStore$conversionFxRateEndpoint$2(Object obj) {
        super(2, obj, SharedFlow2.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConversionFxRate conversionFxRate, Continuation<? super Unit> continuation) {
        return McwStore.conversionFxRateEndpoint$tryEmit$0((SharedFlow2) this.receiver, conversionFxRate, continuation);
    }
}
