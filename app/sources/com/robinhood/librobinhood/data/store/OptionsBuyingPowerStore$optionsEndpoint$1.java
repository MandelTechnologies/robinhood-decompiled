package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsBonfireApi;
import com.robinhood.models.api.ApiOptionsBuyingPower;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionsBuyingPower;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$optionsEndpoint$1", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionsBuyingPowerStore$optionsEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super ApiOptionsBuyingPower>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsBuyingPowerStore$optionsEndpoint$1(OptionsBuyingPowerStore optionsBuyingPowerStore, Continuation<? super OptionsBuyingPowerStore$optionsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = optionsBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsBuyingPowerStore$optionsEndpoint$1 optionsBuyingPowerStore$optionsEndpoint$1 = new OptionsBuyingPowerStore$optionsEndpoint$1(this.this$0, continuation);
        optionsBuyingPowerStore$optionsEndpoint$1.L$0 = obj;
        return optionsBuyingPowerStore$optionsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ApiOptionsBuyingPower> continuation) {
        return ((OptionsBuyingPowerStore$optionsEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Object buyingPowerForOptions = optionsBonfireApi.getBuyingPowerForOptions(str, this);
        return buyingPowerForOptions == coroutine_suspended ? coroutine_suspended : buyingPowerForOptions;
    }
}
