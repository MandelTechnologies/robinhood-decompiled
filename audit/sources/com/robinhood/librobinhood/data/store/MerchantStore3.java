package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.minerva.ApiAggregateMerchant;
import com.robinhood.models.dao.AggregateMerchantDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: MerchantStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.MerchantStore$getAggregateMerchantEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class MerchantStore3 extends AdaptedFunctionReference implements Function2<ApiAggregateMerchant, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    MerchantStore3(Object obj) {
        super(2, obj, AggregateMerchantDao.class, "insert", "insert(Lcom/robinhood/models/api/minerva/ApiAggregateMerchant;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAggregateMerchant apiAggregateMerchant, Continuation<? super Unit> continuation) {
        return MerchantStore.getAggregateMerchantEndpoint$insert$0((AggregateMerchantDao) this.receiver, apiAggregateMerchant, continuation);
    }
}
