package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionSettings;", "it", "Lcom/robinhood/models/api/ApiOptionSettings$TradeOnExpirationRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSettingsStore$setTradeOnExpirationSetting$1", m3645f = "OptionSettingsStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionSettingsStore$setTradeOnExpirationSetting$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionSettingsStore6 extends ContinuationImpl7 implements Function2<ApiOptionSettings.TradeOnExpirationRequest, Continuation<? super ApiOptionSettings>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSettingsStore6(OptionSettingsStore optionSettingsStore, Continuation<? super OptionSettingsStore6> continuation) {
        super(2, continuation);
        this.this$0 = optionSettingsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionSettingsStore6 optionSettingsStore6 = new OptionSettingsStore6(this.this$0, continuation);
        optionSettingsStore6.L$0 = obj;
        return optionSettingsStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionSettings.TradeOnExpirationRequest tradeOnExpirationRequest, Continuation<? super ApiOptionSettings> continuation) {
        return ((OptionSettingsStore6) create(tradeOnExpirationRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionSettings.TradeOnExpirationRequest tradeOnExpirationRequest = (ApiOptionSettings.TradeOnExpirationRequest) this.L$0;
        OptionsApi optionsApi = this.this$0.optionsApi;
        String account_number = tradeOnExpirationRequest.getAccount_number();
        this.label = 1;
        Object objSubmitTradeOnExpirationRequest = optionsApi.submitTradeOnExpirationRequest(account_number, tradeOnExpirationRequest, this);
        return objSubmitTradeOnExpirationRequest == coroutine_suspended ? coroutine_suspended : objSubmitTradeOnExpirationRequest;
    }
}
