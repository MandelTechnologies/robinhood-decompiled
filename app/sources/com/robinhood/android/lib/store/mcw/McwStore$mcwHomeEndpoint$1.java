package com.robinhood.android.lib.store.mcw;

import com.robinhood.android.lib.store.mcw.data.McwHomeSectionData;
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
/* synthetic */ class McwStore$mcwHomeEndpoint$1 extends AdaptedFunctionReference implements Function2<McwHomeSectionData, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    McwStore$mcwHomeEndpoint$1(Object obj) {
        super(2, obj, SharedFlow2.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(McwHomeSectionData mcwHomeSectionData, Continuation<? super Unit> continuation) {
        return McwStore.mcwHomeEndpoint$tryEmit((SharedFlow2) this.receiver, mcwHomeSectionData, continuation);
    }
}
