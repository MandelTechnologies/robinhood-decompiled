package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionEvent;
import com.robinhood.models.dao.OptionEventDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: OptionEventStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionEventStore$getOptionEvents$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionEventStore3 extends AdaptedFunctionReference implements Function2<PaginatedResult<? extends ApiOptionEvent>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    OptionEventStore3(Object obj) {
        super(2, obj, OptionEventDao.class, "insertPaginated", "insertPaginated(Lcom/robinhood/models/PaginatedResult;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiOptionEvent> paginatedResult, Continuation<? super Unit> continuation) {
        return OptionEventStore.getOptionEvents$insertPaginated((OptionEventDao) this.receiver, paginatedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiOptionEvent> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiOptionEvent>) paginatedResult, continuation);
    }
}
