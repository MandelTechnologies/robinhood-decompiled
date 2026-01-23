package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.chainsettings.ApiChainCustomization;
import com.robinhood.models.dao.OptionChainSelectedMetricsDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionChainCustomizationStore$getChainSelectedMetricsById$2 extends AdaptedFunctionReference implements Function2<ApiChainCustomization, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OptionChainCustomizationStore$getChainSelectedMetricsById$2(Object obj) {
        super(2, obj, OptionChainSelectedMetricsDao.class, "insert", "insert(Lcom/robinhood/models/api/chainsettings/ApiChainCustomization;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiChainCustomization apiChainCustomization, Continuation<? super Unit> continuation) {
        return OptionChainCustomizationStore.getChainSelectedMetricsById$insert((OptionChainSelectedMetricsDao) this.receiver, apiChainCustomization, continuation);
    }
}
