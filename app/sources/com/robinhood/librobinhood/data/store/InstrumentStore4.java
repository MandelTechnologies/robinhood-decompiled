package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.api.ApiInstrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: InstrumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentStore$instrumentByIdEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentStore4 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiInstrument>, Object>, ContinuationImpl6 {
    InstrumentStore4(Object obj) {
        super(2, obj, EquitiesBrokeback.class, "getInstrument", "getInstrument(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiInstrument> continuation) {
        return ((EquitiesBrokeback) this.receiver).getInstrument(uuid, continuation);
    }
}
