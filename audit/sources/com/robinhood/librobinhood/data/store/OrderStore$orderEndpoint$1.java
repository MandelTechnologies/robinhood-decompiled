package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OrderStore$orderEndpoint$1 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiOrder>, Object>, ContinuationImpl6 {
    OrderStore$orderEndpoint$1(Object obj) {
        super(2, obj, Brokeback.class, "getOrder", "getOrder(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiOrder> continuation) {
        return ((Brokeback) this.receiver).getOrder(uuid, continuation);
    }
}
