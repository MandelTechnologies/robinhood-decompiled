package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementSypDao;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RetirementMatchStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementMatchStore3 extends AdaptedFunctionReference implements Function2<RetirementMatchRate, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RetirementMatchStore3(Object obj) {
        super(2, obj, RetirementSypDao.class, "insertMatchRate", "insertMatchRate(Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementMatchRate retirementMatchRate, Continuation<? super Unit> continuation) {
        return RetirementMatchStore.endpoint$insertMatchRate((RetirementSypDao) this.receiver, retirementMatchRate, continuation);
    }
}
