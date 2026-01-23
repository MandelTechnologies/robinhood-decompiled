package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementNuxDao;
import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RetirementNuxStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$unfundedEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementNuxStore3 extends AdaptedFunctionReference implements Function2<RetirementUnfundedViewModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RetirementNuxStore3(Object obj) {
        super(2, obj, RetirementNuxDao.class, "insertUnfundedViewModel", "insertUnfundedViewModel(Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementUnfundedViewModel retirementUnfundedViewModel, Continuation<? super Unit> continuation) {
        return RetirementNuxStore.unfundedEndpoint$insertUnfundedViewModel((RetirementNuxDao) this.receiver, retirementUnfundedViewModel, continuation);
    }
}
