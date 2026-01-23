package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiTaxLotEligibility;
import com.robinhood.models.dao.TaxLotEligibilityDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TaxLotEligibilityStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.TaxLotEligibilityStore$singleTaxLotEligibilityEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class TaxLotEligibilityStore3 extends AdaptedFunctionReference implements Function2<ApiTaxLotEligibility, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TaxLotEligibilityStore3(Object obj) {
        super(2, obj, TaxLotEligibilityDao.class, "insert", "insert(Lcom/robinhood/models/api/ApiTaxLotEligibility;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiTaxLotEligibility apiTaxLotEligibility, Continuation<? super Unit> continuation) {
        return TaxLotEligibilityStore.singleTaxLotEligibilityEndpoint$insert((TaxLotEligibilityDao) this.receiver, apiTaxLotEligibility, continuation);
    }
}
