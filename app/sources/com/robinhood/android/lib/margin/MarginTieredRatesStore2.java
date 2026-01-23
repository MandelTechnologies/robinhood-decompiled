package com.robinhood.android.lib.margin;

import com.robinhood.android.lib.margin.MarginTieredRatesStore;
import com.robinhood.android.lib.margin.api.ApiMarginTieredRates;
import com.robinhood.android.lib.margin.api.MarginInvestingApi;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginTieredRatesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/db/models/MarginTieredRates;", "request", "Lcom/robinhood/android/lib/margin/MarginTieredRatesStore$Request;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.MarginTieredRatesStore$getEndpoint$1", m3645f = "MarginTieredRatesStore.kt", m3646l = {20}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.MarginTieredRatesStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginTieredRatesStore2 extends ContinuationImpl7 implements Function2<MarginTieredRatesStore.Request, Continuation<? super MarginTieredRates>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginTieredRatesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginTieredRatesStore2(MarginTieredRatesStore marginTieredRatesStore, Continuation<? super MarginTieredRatesStore2> continuation) {
        super(2, continuation);
        this.this$0 = marginTieredRatesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginTieredRatesStore2 marginTieredRatesStore2 = new MarginTieredRatesStore2(this.this$0, continuation);
        marginTieredRatesStore2.L$0 = obj;
        return marginTieredRatesStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginTieredRatesStore.Request request, Continuation<? super MarginTieredRates> continuation) {
        return ((MarginTieredRatesStore2) create(request, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MarginTieredRatesStore.Request request = (MarginTieredRatesStore.Request) this.L$0;
            MarginInvestingApi marginInvestingApi = this.this$0.marginInvestingApi;
            String accountNumber = request.getAccountNumber();
            boolean skipMin2kEquityCheck = request.getSkipMin2kEquityCheck();
            boolean skipSuitability = request.getSkipSuitability();
            String source = request.getSource();
            this.label = 1;
            obj = marginInvestingApi.getMarginTieredRates(accountNumber, skipMin2kEquityCheck, skipSuitability, source, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return MarginTieredRates2.toDbModel((ApiMarginTieredRates) obj);
    }
}
