package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.dao.RetirementAccountSwitcherDao;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RetirementAccountSwitcherStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore$retirementAccountSwitcherEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RetirementAccountSwitcherStore3 extends AdaptedFunctionReference implements Function2<RetirementAccountSwitcher, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RetirementAccountSwitcherStore3(Object obj) {
        super(2, obj, RetirementAccountSwitcherDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RetirementAccountSwitcher retirementAccountSwitcher, Continuation<? super Unit> continuation) {
        return RetirementAccountSwitcherStore.retirementAccountSwitcherEndpoint$insert((RetirementAccountSwitcherDao) this.receiver, retirementAccountSwitcher, continuation);
    }
}
