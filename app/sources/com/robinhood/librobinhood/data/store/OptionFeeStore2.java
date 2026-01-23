package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionOrderFee;
import com.robinhood.models.api.ApiOptionOrderFeeRequest;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionFeeStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionOrderFee;", "request", "Lcom/robinhood/models/api/ApiOptionOrderFeeRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionFeeStore$getOptionOrderFeeEndpoint$1", m3645f = "OptionFeeStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionFeeStore$getOptionOrderFeeEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionFeeStore2 extends ContinuationImpl7 implements Function2<ApiOptionOrderFeeRequest, Continuation<? super ApiOptionOrderFee>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionFeeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionFeeStore2(OptionFeeStore optionFeeStore, Continuation<? super OptionFeeStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionFeeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionFeeStore2 optionFeeStore2 = new OptionFeeStore2(this.this$0, continuation);
        optionFeeStore2.L$0 = obj;
        return optionFeeStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiOptionOrderFeeRequest apiOptionOrderFeeRequest, Continuation<? super ApiOptionOrderFee> continuation) {
        return ((OptionFeeStore2) create(apiOptionOrderFeeRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        ApiOptionOrderFeeRequest apiOptionOrderFeeRequest = (ApiOptionOrderFeeRequest) this.L$0;
        OptionsApi optionsApi = this.this$0.optionsApi;
        String accountNumber = apiOptionOrderFeeRequest.getAccountNumber();
        OptionChain.UnderlyingType underlyingType = apiOptionOrderFeeRequest.getUnderlyingType();
        String json = this.this$0.legListAdapter.toJson(apiOptionOrderFeeRequest.getLegs());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        BigDecimal quantity = apiOptionOrderFeeRequest.getQuantity();
        Boolean boolIsGold = apiOptionOrderFeeRequest.isGold();
        BigDecimal limitPrice = apiOptionOrderFeeRequest.getLimitPrice();
        String json2 = this.this$0.apiCollateralCashAdapter.toJson(apiOptionOrderFeeRequest.getCollateral());
        int tradeValueMultiplier = apiOptionOrderFeeRequest.getTradeValueMultiplier();
        OrderDirection orderDirection = apiOptionOrderFeeRequest.getOrderDirection();
        OrderTrigger trigger = apiOptionOrderFeeRequest.getTrigger();
        OrderType type2 = apiOptionOrderFeeRequest.getType();
        this.label = 1;
        Object optionOrderFee = optionsApi.getOptionOrderFee(accountNumber, underlyingType, json, quantity, boolIsGold, limitPrice, json2, tradeValueMultiplier, orderDirection, trigger, type2, this);
        return optionOrderFee == coroutine_suspended ? coroutine_suspended : optionOrderFee;
    }
}
