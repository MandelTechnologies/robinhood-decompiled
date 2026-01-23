package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.api.ApiPositionsDisplayOptions;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsDisplayOptionsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/api/ApiPositionsDisplayOptions;", "<destruct>", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore$DisplayOptionsRequestParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$displayOptionsEndpoint$1", m3645f = "PositionsDisplayOptionsStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$displayOptionsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionsDisplayOptionsStore2 extends ContinuationImpl7 implements Function2<PositionsDisplayOptionsStore.DisplayOptionsRequestParams, Continuation<? super ApiPositionsDisplayOptions>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsDisplayOptionsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsDisplayOptionsStore2(PositionsDisplayOptionsStore positionsDisplayOptionsStore, Continuation<? super PositionsDisplayOptionsStore2> continuation) {
        super(2, continuation);
        this.this$0 = positionsDisplayOptionsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsDisplayOptionsStore2 positionsDisplayOptionsStore2 = new PositionsDisplayOptionsStore2(this.this$0, continuation);
        positionsDisplayOptionsStore2.L$0 = obj;
        return positionsDisplayOptionsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsDisplayOptionsStore.DisplayOptionsRequestParams displayOptionsRequestParams, Continuation<? super ApiPositionsDisplayOptions> continuation) {
        return ((PositionsDisplayOptionsStore2) create(displayOptionsRequestParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PositionsDisplayOptionsStore.DisplayOptionsRequestParams displayOptionsRequestParams = (PositionsDisplayOptionsStore.DisplayOptionsRequestParams) this.L$0;
        String accountNumber = displayOptionsRequestParams.getAccountNumber();
        PositionInstrumentType instrumentType = displayOptionsRequestParams.getInstrumentType();
        DisplayCurrency displayCurrency = displayOptionsRequestParams.getDisplayCurrency();
        PortfolioApi portfolioApi = this.this$0.portfolioApi;
        this.label = 1;
        Object positionDisplayValueOptions = portfolioApi.getPositionDisplayValueOptions(accountNumber, instrumentType, displayCurrency, this);
        return positionDisplayValueOptions == coroutine_suspended ? coroutine_suspended : positionDisplayValueOptions;
    }
}
