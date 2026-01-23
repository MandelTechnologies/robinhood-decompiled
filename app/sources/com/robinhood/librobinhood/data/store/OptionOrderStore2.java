package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrder;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrderEndpoint$1", m3645f = "OptionOrderStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionOrderStore$getOptionOrderEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionOrderStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiOptionOrder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOrderStore2(OptionOrderStore optionOrderStore, Continuation<? super OptionOrderStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOrderStore2 optionOrderStore2 = new OptionOrderStore2(this.this$0, continuation);
        optionOrderStore2.L$0 = obj;
        return optionOrderStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiOptionOrder> continuation) {
        return ((OptionOrderStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        OptionsApi optionsApi = this.this$0.optionsApi;
        this.label = 1;
        Object optionsOrder = optionsApi.getOptionsOrder(uuid, this);
        return optionsOrder == coroutine_suspended ? coroutine_suspended : optionsOrder;
    }
}
