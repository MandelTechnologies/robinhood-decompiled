package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesContractStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FuturesContractStore$relatedFuturesContractEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super List<? extends FuturesContract>>, Object>, ContinuationImpl6 {
    FuturesContractStore$relatedFuturesContractEndpoint$1(Object obj) {
        super(2, obj, ArsenalServiceExt.class, "getFuturesContractsByProduct", "getFuturesContractsByProduct(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super List<? extends FuturesContract>> continuation) {
        return invoke2(uuid, (Continuation<? super List<FuturesContract>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super List<FuturesContract>> continuation) {
        return ArsenalServiceExt.getFuturesContractsByProduct((InstrumentService) this.receiver, uuid, continuation);
    }
}
