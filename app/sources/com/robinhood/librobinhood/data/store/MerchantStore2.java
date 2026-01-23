package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.api.minerva.ApiAggregateMerchant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MerchantStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.MerchantStore$getAggregateMerchantEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class MerchantStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiAggregateMerchant>, Object>, ContinuationImpl6 {
    MerchantStore2(Object obj) {
        super(2, obj, Minerva.class, "getAggregateMerchant", "getAggregateMerchant(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiAggregateMerchant> continuation) {
        return ((Minerva) this.receiver).getAggregateMerchant(uuid, continuation);
    }
}
