package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.lib.api.p164fx.MarketDataApi;
import com.robinhood.android.lib.store.p171fx.FxRatesStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: FxRatesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.FxRatesStore$fxRateEndpoint$2", m3645f = "FxRatesStore.kt", m3646l = {78, 42}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.fx.FxRatesStore$fxRateEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class FxRatesStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiFxQuote>, Object> {
    int label;
    final /* synthetic */ FxRatesStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FxRatesStore3(FxRatesStore fxRatesStore, Continuation<? super FxRatesStore3> continuation) {
        super(2, continuation);
        this.this$0 = fxRatesStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FxRatesStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiFxQuote> continuation) {
        return ((FxRatesStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable<User> user = this.this$0.userStore.getUser();
            this.label = 1;
            obj = RxAwait3.awaitFirst(user, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String strForLocality = FxRatesStore.CurrencyPairs.INSTANCE.forLocality(((User) obj).getOrigin().getLocality());
        MarketDataApi marketDataApi = this.this$0.marketDataApi;
        this.label = 2;
        Object fxQuote = marketDataApi.getFxQuote(strForLocality, this);
        return fxQuote == coroutine_suspended ? coroutine_suspended : fxQuote;
    }
}
