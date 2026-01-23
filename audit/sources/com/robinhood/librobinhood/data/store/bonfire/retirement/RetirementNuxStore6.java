package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementNuxDao;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RetirementNuxStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$uninvestedEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementNuxStore6 extends AdaptedFunctionReference implements Function2<RetirementUninvestedViewModel, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RetirementNuxStore6(Object obj) {
        super(2, obj, RetirementNuxDao.class, "insertUninvestedViewModel", "insertUninvestedViewModel(Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementUninvestedViewModel retirementUninvestedViewModel, Continuation<? super Unit> continuation) {
        return RetirementNuxStore.uninvestedEndpoint$insertUninvestedViewModel((RetirementNuxDao) this.receiver, retirementUninvestedViewModel, continuation);
    }
}
