package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.api.ApiMarginSettings;
import com.robinhood.android.lib.margin.p167db.dao.LeveredMarginSettingsDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: LeveredMarginSettingsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.LeveredMarginSettingsStore$getEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class LeveredMarginSettingsStore3 extends AdaptedFunctionReference implements Function2<ApiMarginSettings, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    LeveredMarginSettingsStore3(Object obj) {
        super(2, obj, LeveredMarginSettingsDao.class, "insert", "insert(Lcom/robinhood/android/lib/margin/api/ApiMarginSettings;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarginSettings apiMarginSettings, Continuation<? super Unit> continuation) {
        return LeveredMarginSettingsStore.getEndpoint$insert((LeveredMarginSettingsDao) this.receiver, apiMarginSettings, continuation);
    }
}
