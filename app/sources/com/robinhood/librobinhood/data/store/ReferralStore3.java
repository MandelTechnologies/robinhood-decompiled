package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiReferral;
import com.robinhood.models.dao.ReferralDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ReferralStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.ReferralStore$getReferralsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ReferralStore3 extends AdaptedFunctionReference implements Function2<PaginatedResult<? extends ApiReferral>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ReferralStore3(Object obj) {
        super(2, obj, ReferralDao.class, "insert", "insert(Lcom/robinhood/models/PaginatedResult;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiReferral> paginatedResult, Continuation<? super Unit> continuation) {
        return ReferralStore.getReferralsEndpoint$insert((ReferralDao) this.receiver, paginatedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiReferral> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiReferral>) paginatedResult, continuation);
    }
}
