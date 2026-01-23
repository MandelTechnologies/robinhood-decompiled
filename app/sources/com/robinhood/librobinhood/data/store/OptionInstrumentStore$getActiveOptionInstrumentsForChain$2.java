package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionInstrument;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/GetActiveOptionInstrumentsForChainParams;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionInstrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionInstrumentStore$getActiveOptionInstrumentsForChain$2", m3645f = "OptionInstrumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionInstrumentStore$getActiveOptionInstrumentsForChain$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends GetActiveOptionInstrumentsForChainParams, ? extends PaginationCursor>, PaginatedResult<? extends ApiOptionInstrument>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionInstrumentStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionInstrumentStore$getActiveOptionInstrumentsForChain$2(OptionInstrumentStore optionInstrumentStore, Continuation<? super OptionInstrumentStore$getActiveOptionInstrumentsForChain$2> continuation) {
        super(3, continuation);
        this.this$0 = optionInstrumentStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GetActiveOptionInstrumentsForChainParams, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiOptionInstrument> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<GetActiveOptionInstrumentsForChainParams, PaginationCursor>) tuples2, (PaginatedResult<ApiOptionInstrument>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GetActiveOptionInstrumentsForChainParams, PaginationCursor> tuples2, PaginatedResult<ApiOptionInstrument> paginatedResult, Continuation<? super Unit> continuation) {
        OptionInstrumentStore$getActiveOptionInstrumentsForChain$2 optionInstrumentStore$getActiveOptionInstrumentsForChain$2 = new OptionInstrumentStore$getActiveOptionInstrumentsForChain$2(this.this$0, continuation);
        optionInstrumentStore$getActiveOptionInstrumentsForChain$2.L$0 = paginatedResult;
        return optionInstrumentStore$getActiveOptionInstrumentsForChain$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getStaleDecider().updateAll(this.this$0.dao.insert((PaginatedResult<ApiOptionInstrument>) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
