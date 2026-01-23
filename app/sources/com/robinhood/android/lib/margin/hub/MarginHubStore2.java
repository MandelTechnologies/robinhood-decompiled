package com.robinhood.android.lib.margin.hub;

import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubView;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubView;", "params", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore$BuyingPowerHubRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$buyingPowerHubEndpoint$1", m3645f = "MarginHubStore.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$buyingPowerHubEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore2 extends ContinuationImpl7 implements Function2<MarginHubStore.BuyingPowerHubRequestParams, Continuation<? super ApiBuyingPowerHubView>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore2(MarginHubStore marginHubStore, Continuation<? super MarginHubStore2> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore2 marginHubStore2 = new MarginHubStore2(this.this$0, continuation);
        marginHubStore2.L$0 = obj;
        return marginHubStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginHubStore.BuyingPowerHubRequestParams buyingPowerHubRequestParams, Continuation<? super ApiBuyingPowerHubView> continuation) {
        return ((MarginHubStore2) create(buyingPowerHubRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MarginHubStore.BuyingPowerHubRequestParams buyingPowerHubRequestParams = (MarginHubStore.BuyingPowerHubRequestParams) this.L$0;
        MarginHubApi marginHubApi = this.this$0.marginHubApi;
        String accountNumber = buyingPowerHubRequestParams.getAccountNumber();
        DisplayCurrency displayCurrency = buyingPowerHubRequestParams.getDisplayCurrency();
        this.label = 1;
        Object buyingPowerHubView = marginHubApi.getBuyingPowerHubView(accountNumber, displayCurrency, this);
        return buyingPowerHubView == coroutine_suspended ? coroutine_suspended : buyingPowerHubView;
    }
}
