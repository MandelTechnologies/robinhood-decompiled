package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.cashier.Cashier;
import com.robinhood.models.api.ApiDepositSchedule;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DepositScheduleStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.DepositScheduleStore$postDepositSchedule$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DepositScheduleStore4 extends FunctionReferenceImpl implements Function2<ApiDepositSchedule.Request, Continuation<? super ApiDepositSchedule>, Object>, ContinuationImpl6 {
    DepositScheduleStore4(Object obj) {
        super(2, obj, Cashier.class, "addDepositSchedule", "addDepositSchedule(Lcom/robinhood/models/api/ApiDepositSchedule$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiDepositSchedule.Request request, Continuation<? super ApiDepositSchedule> continuation) {
        return ((Cashier) this.receiver).addDepositSchedule(request, continuation);
    }
}
