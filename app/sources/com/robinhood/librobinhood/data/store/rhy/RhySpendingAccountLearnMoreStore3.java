package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.models.dao.RhySpendingAccountLearnMoreDao;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: RhySpendingAccountLearnMoreStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhySpendingAccountLearnMoreStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RhySpendingAccountLearnMoreStore3 extends AdaptedFunctionReference implements Function2<RhySpendingAccountLearnMore, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    RhySpendingAccountLearnMoreStore3(Object obj) {
        super(2, obj, RhySpendingAccountLearnMoreDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhySpendingAccountLearnMore rhySpendingAccountLearnMore, Continuation<? super Unit> continuation) {
        return RhySpendingAccountLearnMoreStore.endpoint$insert((RhySpendingAccountLearnMoreDao) this.receiver, rhySpendingAccountLearnMore, continuation);
    }
}
