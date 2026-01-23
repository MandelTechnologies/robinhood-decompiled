package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.retirement.models.p364ui.UiRecsRetirementIntro;
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

/* compiled from: RecsRetirementIntroStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementIntroStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "recsRetirementApi", "Lcom/robinhood/api/retrofit/RecsRetirementApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/RecsRetirementApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "getIntro", "Lio/reactivex/Single;", "accountNumber", "lib-store-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecsRetirementIntroStore extends Store {
    private final Endpoint<String, UiRecsRetirementIntro> endpoint;
    private final RecsRetirementApi recsRetirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsRetirementIntroStore(StoreBundle storeBundle, RecsRetirementApi recsRetirementApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(recsRetirementApi, "recsRetirementApi");
        this.recsRetirementApi = recsRetirementApi;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RecsRetirementIntroStore2(this, null), getLogoutKillswitch(), new RecsRetirementIntroStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: RecsRetirementIntroStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/ui/UiRecsRetirementIntro;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementIntroStore$getIntro$1", m3645f = "RecsRetirementIntroStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementIntroStore$getIntro$1 */
    static final class C138741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiRecsRetirementIntro>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138741(String str, Continuation<? super C138741> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecsRetirementIntroStore.this.new C138741(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiRecsRetirementIntro> continuation) {
            return ((C138741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = RecsRetirementIntroStore.this.endpoint;
            String str = this.$accountNumber;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, str, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UiRecsRetirementIntro> getIntro(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C138741(accountNumber, null), 1, null);
    }
}
