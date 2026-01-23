package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionStrategyBreakevenLegacy;
import com.robinhood.models.api.ApiOptionStrategyBreakevenRequestLegacy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyDetailStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenLegacy;", "request", "Lcom/robinhood/models/api/ApiOptionStrategyBreakevenRequestLegacy;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionStrategyBreakevenLegacy$1", m3645f = "OptionStrategyDetailStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionStrategyDetailStore$getOptionStrategyBreakevenLegacy$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionStrategyDetailStore4 extends ContinuationImpl7 implements Function2<ApiOptionStrategyBreakevenRequestLegacy, Continuation<? super ApiOptionStrategyBreakevenLegacy>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionStrategyDetailStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionStrategyDetailStore4(OptionStrategyDetailStore optionStrategyDetailStore, Continuation<? super OptionStrategyDetailStore4> continuation) {
        super(2, continuation);
        this.this$0 = optionStrategyDetailStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionStrategyDetailStore4 optionStrategyDetailStore4 = new OptionStrategyDetailStore4(this.this$0, continuation);
        optionStrategyDetailStore4.L$0 = obj;
        return optionStrategyDetailStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionStrategyBreakevenRequestLegacy apiOptionStrategyBreakevenRequestLegacy, Continuation<? super ApiOptionStrategyBreakevenLegacy> continuation) {
        return ((OptionStrategyDetailStore4) create(apiOptionStrategyBreakevenRequestLegacy, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionStrategyBreakevenRequestLegacy apiOptionStrategyBreakevenRequestLegacy = (ApiOptionStrategyBreakevenRequestLegacy) this.L$0;
        OptionsApi optionsApi = this.this$0.optionsApi;
        String strategyCode = apiOptionStrategyBreakevenRequestLegacy.getStrategyCode();
        String json = this.this$0.moneyJsonAdapter.toJson(apiOptionStrategyBreakevenRequestLegacy.getAverageCost());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        this.label = 1;
        Object optionStrategyBreakeven = optionsApi.getOptionStrategyBreakeven(strategyCode, json, this);
        return optionStrategyBreakeven == coroutine_suspended ? coroutine_suspended : optionStrategyBreakeven;
    }
}
