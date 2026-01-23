package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.strategybuilder.ApiOptionStrategyBuilder;
import com.robinhood.models.p320db.OptionChain;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionStrategyBuilderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/strategybuilder/ApiOptionStrategyBuilder;", "it", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getOptionStrategyBuilder$1", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionStrategyBuilderStore$getOptionStrategyBuilder$1 extends ContinuationImpl7 implements Function2<OptionChain.UnderlyingType, Continuation<? super ApiOptionStrategyBuilder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyBuilderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyBuilderStore$getOptionStrategyBuilder$1(OptionStrategyBuilderStore optionStrategyBuilderStore, Continuation<? super OptionStrategyBuilderStore$getOptionStrategyBuilder$1> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyBuilderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyBuilderStore$getOptionStrategyBuilder$1 optionStrategyBuilderStore$getOptionStrategyBuilder$1 = new OptionStrategyBuilderStore$getOptionStrategyBuilder$1(this.this$0, continuation);
        optionStrategyBuilderStore$getOptionStrategyBuilder$1.L$0 = obj;
        return optionStrategyBuilderStore$getOptionStrategyBuilder$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionChain.UnderlyingType underlyingType, Continuation<? super ApiOptionStrategyBuilder> continuation) {
        return ((OptionStrategyBuilderStore$getOptionStrategyBuilder$1) create(underlyingType, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        OptionChain.UnderlyingType underlyingType = (OptionChain.UnderlyingType) this.L$0;
        OptionsBonfireApi optionsBonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object optionStrategyBuilder = optionsBonfireApi.getOptionStrategyBuilder(underlyingType, this);
        return optionStrategyBuilder == coroutine_suspended ? coroutine_suspended : optionStrategyBuilder;
    }
}
