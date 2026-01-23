package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesProductStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.arsenal.FuturesProductStore$futuresProductEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class FuturesProductStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super FuturesProduct>, Object>, ContinuationImpl6 {
    FuturesProductStore2(Object obj) {
        super(2, obj, ArsenalServiceExt.class, "getFuturesProduct", "getFuturesProduct(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super FuturesProduct> continuation) {
        return ArsenalServiceExt.getFuturesProduct((InstrumentService) this.receiver, uuid, continuation);
    }
}
