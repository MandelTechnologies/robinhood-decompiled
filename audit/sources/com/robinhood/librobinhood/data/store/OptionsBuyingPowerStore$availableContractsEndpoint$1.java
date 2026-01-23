package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPower;
import com.robinhood.models.api.ApiOptionsDisplayedBuyingPowerRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionsBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPower$NumOfContracts;", "request", "Lcom/robinhood/models/api/ApiOptionsDisplayedBuyingPowerRequest$NumOfContracts;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore$availableContractsEndpoint$1", m3645f = "OptionsBuyingPowerStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionsBuyingPowerStore$availableContractsEndpoint$1 extends ContinuationImpl7 implements Function2<ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts, Continuation<? super ApiOptionsDisplayedBuyingPower.NumOfContracts>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionsBuyingPowerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsBuyingPowerStore$availableContractsEndpoint$1(OptionsBuyingPowerStore optionsBuyingPowerStore, Continuation<? super OptionsBuyingPowerStore$availableContractsEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = optionsBuyingPowerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionsBuyingPowerStore$availableContractsEndpoint$1 optionsBuyingPowerStore$availableContractsEndpoint$1 = new OptionsBuyingPowerStore$availableContractsEndpoint$1(this.this$0, continuation);
        optionsBuyingPowerStore$availableContractsEndpoint$1.L$0 = obj;
        return optionsBuyingPowerStore$availableContractsEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts numOfContracts, Continuation<? super ApiOptionsDisplayedBuyingPower.NumOfContracts> continuation) {
        return ((OptionsBuyingPowerStore$availableContractsEndpoint$1) create(numOfContracts, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts numOfContracts = (ApiOptionsDisplayedBuyingPowerRequest.NumOfContracts) this.L$0;
        OptionsApi optionsApi = this.this$0.optionsApi;
        String account_number = numOfContracts.getAccount_number();
        String strategy_code = numOfContracts.getStrategy_code();
        UUID order_to_replace_id = numOfContracts.getOrder_to_replace_id();
        this.label = 1;
        Object optionsOrderAvailableContracts = optionsApi.getOptionsOrderAvailableContracts(account_number, strategy_code, order_to_replace_id, this);
        return optionsOrderAvailableContracts == coroutine_suspended ? coroutine_suspended : optionsOrderAvailableContracts;
    }
}
