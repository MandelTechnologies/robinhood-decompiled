package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.MarginInvestingInfoStore;
import com.robinhood.android.lib.margin.api.ApiMarginInvestingInfo;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginInvestingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/api/ApiMarginInvestingInfo;", "params", "Lcom/robinhood/android/lib/margin/MarginInvestingInfoStore$Params;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginInvestingInfoStore$getEndpoint$2", m3645f = "MarginInvestingInfoStore.kt", m3646l = {32}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.MarginInvestingInfoStore$getEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginInvestingInfoStore3 extends ContinuationImpl7 implements Function2<MarginInvestingInfoStore.Params, Continuation<? super ApiMarginInvestingInfo>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginInvestingInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginInvestingInfoStore3(MarginInvestingInfoStore marginInvestingInfoStore, Continuation<? super MarginInvestingInfoStore3> continuation) {
        super(2, continuation);
        this.this$0 = marginInvestingInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginInvestingInfoStore3 marginInvestingInfoStore3 = new MarginInvestingInfoStore3(this.this$0, continuation);
        marginInvestingInfoStore3.L$0 = obj;
        return marginInvestingInfoStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginInvestingInfoStore.Params params, Continuation<? super ApiMarginInvestingInfo> continuation) {
        return ((MarginInvestingInfoStore3) create(params, continuation)).invokeSuspend(Unit.INSTANCE);
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
        MarginInvestingInfoStore.Params params = (MarginInvestingInfoStore.Params) this.L$0;
        MarginInvestingApi marginInvestingApi = this.this$0.marginInvestingApi;
        String accountNumber = params.getAccountNumber();
        DisplayCurrency displayCurrency = params.getDisplayCurrency();
        this.label = 1;
        Object marginInvestingInfo = marginInvestingApi.getMarginInvestingInfo(accountNumber, displayCurrency, this);
        return marginInvestingInfo == coroutine_suspended ? coroutine_suspended : marginInvestingInfo;
    }
}
