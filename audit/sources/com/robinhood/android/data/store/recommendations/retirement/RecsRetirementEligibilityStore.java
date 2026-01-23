package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.functions.Function;
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

/* compiled from: RecsRetirementEligibilityStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementEligibilityStore;", "Lcom/robinhood/store/Store;", "recsRetirementApi", "Lcom/robinhood/api/retrofit/RecsRetirementApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecsRetirementApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "isEligible", "Lio/reactivex/Single;", "accountNumber", "lib-store-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecsRetirementEligibilityStore extends Store {
    private final Endpoint<String, Boolean> endpoint;
    private final RecsRetirementApi recsRetirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsRetirementEligibilityStore(RecsRetirementApi recsRetirementApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recsRetirementApi, "recsRetirementApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.recsRetirementApi = recsRetirementApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecsRetirementEligibilityStore2(this, null), getLogoutKillswitch(), new RecsRetirementEligibilityStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RecsRetirementEligibilityStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore$isEligible$1", m3645f = "RecsRetirementEligibilityStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore$isEligible$1 */
    static final class C138721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138721(String str, Continuation<? super C138721> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecsRetirementEligibilityStore.this.new C138721(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C138721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = RecsRetirementEligibilityStore.this.endpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Boolean> isEligible(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Single<Boolean> singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C138721(accountNumber, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementEligibilityStore.isEligible.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        return singleOnErrorReturn;
    }
}
