package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionSettings;
import com.robinhood.models.dao.OptionSettingsDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OptionSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$setShortSharesOnOptionEvents$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionSettingsStore5 extends AdaptedFunctionReference implements Function2<ApiOptionSettings, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OptionSettingsStore5(Object obj) {
        super(2, obj, OptionSettingsDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiOptionSettings;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionSettings apiOptionSettings, Continuation<? super Unit> continuation) {
        return OptionSettingsStore.setShortSharesOnOptionEvents$insert$2((OptionSettingsDao) this.receiver, apiOptionSettings, continuation);
    }
}
