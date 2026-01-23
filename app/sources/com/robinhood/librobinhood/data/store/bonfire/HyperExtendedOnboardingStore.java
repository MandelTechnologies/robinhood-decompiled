package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.bonfire.ApiNewTradingHoursOnboarding;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
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

/* compiled from: HyperExtendedOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/HyperExtendedOnboardingStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingViewModel;", "getHyperExtendedOnboardingViewModel", "Lio/reactivex/Single;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class HyperExtendedOnboardingStore extends Store {
    private final TradeEquityBonfireApi bonfire;
    private final Endpoint<Unit, ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperExtendedOnboardingStore(TradeEquityBonfireApi bonfire2, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.bonfire = bonfire2;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new HyperExtendedOnboardingStore2(this, null), getLogoutKillswitch(), new HyperExtendedOnboardingStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: HyperExtendedOnboardingStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiNewTradingHoursOnboarding$HyperExtendedOnboardingViewModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.HyperExtendedOnboardingStore$getHyperExtendedOnboardingViewModel$1", m3645f = "HyperExtendedOnboardingStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.HyperExtendedOnboardingStore$getHyperExtendedOnboardingViewModel$1 */
    static final class C345121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel>, Object> {
        int label;

        C345121(Continuation<? super C345121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HyperExtendedOnboardingStore.this.new C345121(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel> continuation) {
            return ((C345121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = HyperExtendedOnboardingStore.this.endpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<ApiNewTradingHoursOnboarding.HyperExtendedOnboardingViewModel> getHyperExtendedOnboardingViewModel() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345121(null), 1, null);
    }
}
