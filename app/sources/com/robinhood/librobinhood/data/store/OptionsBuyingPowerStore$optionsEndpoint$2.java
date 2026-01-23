package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiOptionsBuyingPower;
import com.robinhood.models.dao.OptionsBuyingPowerDao;
import com.robinhood.models.p320db.OptionsBuyingPower2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiOptionsBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$optionsEndpoint$2", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionsBuyingPowerStore$optionsEndpoint$2 extends ContinuationImpl7 implements Function2<ApiOptionsBuyingPower, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsBuyingPowerStore$optionsEndpoint$2(OptionsBuyingPowerStore optionsBuyingPowerStore, Continuation<? super OptionsBuyingPowerStore$optionsEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = optionsBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsBuyingPowerStore$optionsEndpoint$2 optionsBuyingPowerStore$optionsEndpoint$2 = new OptionsBuyingPowerStore$optionsEndpoint$2(this.this$0, continuation);
        optionsBuyingPowerStore$optionsEndpoint$2.L$0 = obj;
        return optionsBuyingPowerStore$optionsEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionsBuyingPower apiOptionsBuyingPower, Continuation<? super Unit> continuation) {
        return ((OptionsBuyingPowerStore$optionsEndpoint$2) create(apiOptionsBuyingPower, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((OptionsBuyingPowerDao) OptionsBuyingPower2.toDbModel((ApiOptionsBuyingPower) this.L$0));
        return Unit.INSTANCE;
    }
}
