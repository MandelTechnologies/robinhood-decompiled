package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionStrategyChainTemplate;
import com.robinhood.models.p320db.OptionStrategyChainTemplate2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionStrategyBuilderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOptionStrategyChainTemplate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2", m3645f = "OptionStrategyBuilderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2 extends ContinuationImpl7 implements Function2<ApiOptionStrategyChainTemplate, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyBuilderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2(OptionStrategyBuilderStore optionStrategyBuilderStore, Continuation<? super OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyBuilderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2 optionStrategyBuilderStore$getOptionsStrategyChainTemplate$2 = new OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2(this.this$0, continuation);
        optionStrategyBuilderStore$getOptionsStrategyChainTemplate$2.L$0 = obj;
        return optionStrategyBuilderStore$getOptionsStrategyChainTemplate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionStrategyChainTemplate apiOptionStrategyChainTemplate, Continuation<? super Unit> continuation) {
        return ((OptionStrategyBuilderStore$getOptionsStrategyChainTemplate$2) create(apiOptionStrategyChainTemplate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(OptionStrategyChainTemplate2.toDbModel((ApiOptionStrategyChainTemplate) this.L$0));
        return Unit.INSTANCE;
    }
}
