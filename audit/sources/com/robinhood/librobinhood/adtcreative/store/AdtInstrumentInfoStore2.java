package com.robinhood.librobinhood.adtcreative.store;

import com.robinhood.android.api.alldaytrading.AllDayTradingApi;
import com.robinhood.models.alldaytrading.api.ApiAdtInstrumentInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AdtInstrumentInfoStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.adtcreative.store.AdtInstrumentInfoStore$endpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class AdtInstrumentInfoStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiAdtInstrumentInfo>, Object>, ContinuationImpl6 {
    AdtInstrumentInfoStore2(Object obj) {
        super(2, obj, AllDayTradingApi.class, "getInstrumentInfo", "getInstrumentInfo(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiAdtInstrumentInfo> continuation) {
        return ((AllDayTradingApi) this.receiver).getInstrumentInfo(uuid, continuation);
    }
}
