package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.p355ui.bonfire.rhy.RhySignupEligibility;
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

/* compiled from: RhyWaitlistStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyWaitlistStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "rhyBonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/rhy/RhyBonfireApi;)V", "eligibilityEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/ui/bonfire/rhy/RhySignupEligibility;", "getEligibility", "Lio/reactivex/Single;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyWaitlistStore extends Store {
    private final Endpoint<Unit, RhySignupEligibility> eligibilityEndpoint;
    private final RhyBonfireApi rhyBonfireApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyWaitlistStore(StoreBundle storeBundle, RhyBonfireApi rhyBonfireApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(rhyBonfireApi, "rhyBonfireApi");
        this.rhyBonfireApi = rhyBonfireApi;
        this.eligibilityEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyWaitlistStore2(this, null), getLogoutKillswitch(), new RhyWaitlistStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RhyWaitlistStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/bonfire/rhy/RhySignupEligibility;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyWaitlistStore$getEligibility$1", m3645f = "RhyWaitlistStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyWaitlistStore$getEligibility$1 */
    static final class C343061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super RhySignupEligibility>, Object> {
        int label;

        C343061(Continuation<? super C343061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyWaitlistStore.this.new C343061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RhySignupEligibility> continuation) {
            return ((C343061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = RhyWaitlistStore.this.eligibilityEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<RhySignupEligibility> getEligibility() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343061(null), 1, null);
    }
}
