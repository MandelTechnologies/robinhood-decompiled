package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiOptionStrategyInfo;
import com.robinhood.models.dao.OptionStrategyInfoDao;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStrategyInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "strategyInfoList", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionStrategyInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyInfoStore$getOptionStrategyInfo$2", m3645f = "OptionStrategyInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyInfoStore$getOptionStrategyInfo$2, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionStrategyInfoStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiOptionStrategyInfo>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyInfoStore3(OptionStrategyInfoStore optionStrategyInfoStore, Continuation<? super OptionStrategyInfoStore3> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyInfoStore3 optionStrategyInfoStore3 = new OptionStrategyInfoStore3(this.this$0, continuation);
        optionStrategyInfoStore3.L$0 = obj;
        return optionStrategyInfoStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiOptionStrategyInfo> paginatedResult, Continuation<? super Unit> continuation) {
        return ((OptionStrategyInfoStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiOptionStrategyInfo> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiOptionStrategyInfo>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List results = ((PaginatedResult) this.L$0).getResults();
        OptionStrategyInfoDao optionStrategyInfoDao = this.this$0.dao;
        Iterator it = results.iterator();
        while (it.hasNext()) {
            optionStrategyInfoDao.insert((ApiOptionStrategyInfo) it.next());
        }
        return Unit.INSTANCE;
    }
}
