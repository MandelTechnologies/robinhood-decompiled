package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiBuySellOrderOnboardingResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Maybe;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BuySellOrderOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;", "markBuySellOrderOnboardingSeen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchBuySellOrderOnboarding", "Lio/reactivex/Maybe;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BuySellOrderOnboardingStore extends Store {
    private final Endpoint<Unit, ApiBuySellOrderOnboardingResponse> endpoint;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuySellOrderOnboardingStore(StoreBundle storeBundle, TradeEquityBonfireApi tradeEquityBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new BuySellOrderOnboardingStore2(this, null), getLogoutKillswitch(), new BuySellOrderOnboardingStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Object markBuySellOrderOnboardingSeen(Continuation<? super Unit> continuation) {
        Object objBuySellOrderOnboardingSeen = this.tradeEquityBonfireApi.buySellOrderOnboardingSeen(continuation);
        return objBuySellOrderOnboardingSeen == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBuySellOrderOnboardingSeen : Unit.INSTANCE;
    }

    /* compiled from: BuySellOrderOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiBuySellOrderOnboardingResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore$fetchBuySellOrderOnboarding$1", m3645f = "BuySellOrderOnboardingStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore$fetchBuySellOrderOnboarding$1 */
    static final class C336281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiBuySellOrderOnboardingResponse>, Object> {
        int label;

        C336281(Continuation<? super C336281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BuySellOrderOnboardingStore.this.new C336281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiBuySellOrderOnboardingResponse> continuation) {
            return ((C336281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = BuySellOrderOnboardingStore.this.endpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, unit, null, this, 2, null);
            return objFetch$default == coroutine_suspended ? coroutine_suspended : objFetch$default;
        }
    }

    public final Maybe<ApiBuySellOrderOnboardingResponse> fetchBuySellOrderOnboarding() {
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C336281(null), 1, null);
    }
}
