package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiOptionStrategyChainTemplate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionStrategyBuilderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionStrategyChainTemplate;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiOptionStrategyChainTemplate>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyBuilderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1(OptionStrategyBuilderStore optionStrategyBuilderStore, Continuation<? super OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyBuilderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1 optionStrategyBuilderStore$getOptionsStrategyChainTemplate$1 = new OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1(this.this$0, continuation);
        optionStrategyBuilderStore$getOptionsStrategyChainTemplate$1.L$0 = obj;
        return optionStrategyBuilderStore$getOptionsStrategyChainTemplate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiOptionStrategyChainTemplate> continuation) {
        return ((OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        String str = (String) this.L$0;
        OptionsBonfireApi optionsBonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object optionStrategyChainTemplate = optionsBonfireApi.getOptionStrategyChainTemplate(str, this);
        return optionStrategyChainTemplate == coroutine_suspended ? coroutine_suspended : optionStrategyChainTemplate;
    }
}
