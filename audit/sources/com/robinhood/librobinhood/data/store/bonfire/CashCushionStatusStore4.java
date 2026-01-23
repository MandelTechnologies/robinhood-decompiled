package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiCashCushionSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CashCushionStatusStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.CashCushionStatusStore$setStatusEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CashCushionStatusStore4 extends FunctionReferenceImpl implements Function2<ApiCashCushionSetting, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    CashCushionStatusStore4(Object obj) {
        super(2, obj, RhyBonfireApi.class, "updateCashCushionStatus", "updateCashCushionStatus(Lcom/robinhood/models/api/bonfire/rhy/ApiCashCushionSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCashCushionSetting apiCashCushionSetting, Continuation<? super Unit> continuation) {
        return ((RhyBonfireApi) this.receiver).updateCashCushionStatus(apiCashCushionSetting, continuation);
    }
}
