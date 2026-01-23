package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.common.modelsfxdb.dao.McwDisplayCurrenciesDao;
import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: McwDisplayCurrenciesStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.fx.McwDisplayCurrenciesStore$mcwFxRatesEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class McwDisplayCurrenciesStore2 extends AdaptedFunctionReference implements Function2<McwDisplayCurrencies, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    McwDisplayCurrenciesStore2(Object obj) {
        super(2, obj, McwDisplayCurrenciesDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(McwDisplayCurrencies mcwDisplayCurrencies, Continuation<? super Unit> continuation) {
        return McwDisplayCurrenciesStore.mcwFxRatesEndpoint$insert((McwDisplayCurrenciesDao) this.receiver, mcwDisplayCurrencies, continuation);
    }
}
