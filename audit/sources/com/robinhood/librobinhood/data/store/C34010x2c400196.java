package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.chainsettings.ApiChainCustomization;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainCustomizationStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "customization", "Lcom/robinhood/models/api/chainsettings/ApiChainCustomization;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$updateStrategyBuilderSelectedMetricsEndpoint$2", m3645f = "OptionChainCustomizationStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionChainCustomizationStore$updateStrategyBuilderSelectedMetricsEndpoint$2 */
/* loaded from: classes13.dex */
final class C34010x2c400196 extends ContinuationImpl7 implements Function2<ApiChainCustomization, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionChainCustomizationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C34010x2c400196(OptionChainCustomizationStore optionChainCustomizationStore, Continuation<? super C34010x2c400196> continuation) {
        super(2, continuation);
        this.this$0 = optionChainCustomizationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C34010x2c400196 c34010x2c400196 = new C34010x2c400196(this.this$0, continuation);
        c34010x2c400196.L$0 = obj;
        return c34010x2c400196;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiChainCustomization apiChainCustomization, Continuation<? super Unit> continuation) {
        return ((C34010x2c400196) create(apiChainCustomization, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.optionChainSelectedMetricsDao.insertSelectedMetrics(((ApiChainCustomization) this.L$0).toDbModel());
        return Unit.INSTANCE;
    }
}
