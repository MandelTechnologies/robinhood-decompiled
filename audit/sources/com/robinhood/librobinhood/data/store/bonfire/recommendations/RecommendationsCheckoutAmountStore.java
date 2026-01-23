package com.robinhood.librobinhood.data.store.bonfire.recommendations;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.retrofit.RecommendationsApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsCheckoutAmount;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: RecommendationsCheckoutAmountStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\fR(\u0010\b\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsCheckoutAmountStore;", "Lcom/robinhood/store/Store;", "recommendationsApi", "Lcom/robinhood/api/retrofit/RecommendationsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/RecommendationsApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "getCheckoutAmount", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "accountNumber", "recommendationId", "Companion", "lib-store-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RecommendationsCheckoutAmountStore extends Store {
    public static final long STALE_TIME_SECONDS = 0;
    private final Endpoint<Tuples2<String, UUID>, UiRecommendationsCheckoutAmount> endpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendationsCheckoutAmountStore(RecommendationsApi recommendationsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(recommendationsApi, "recommendationsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Endpoint.Companion companion = Endpoint.INSTANCE;
        RecommendationsCheckoutAmountStore2 recommendationsCheckoutAmountStore2 = new RecommendationsCheckoutAmountStore2(recommendationsApi, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        RecommendationsCheckoutAmountStore3 recommendationsCheckoutAmountStore3 = new RecommendationsCheckoutAmountStore3(null);
        Clock clock = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(0L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.endpoint = companion.create(recommendationsCheckoutAmountStore2, logoutKillswitch, recommendationsCheckoutAmountStore3, clock, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
    }

    public static /* synthetic */ Single getCheckoutAmount$default(RecommendationsCheckoutAmountStore recommendationsCheckoutAmountStore, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return recommendationsCheckoutAmountStore.getCheckoutAmount(str, uuid);
    }

    /* compiled from: RecommendationsCheckoutAmountStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/recommendations/models/ui/UiRecommendationsCheckoutAmount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore$getCheckoutAmount$1", m3645f = "RecommendationsCheckoutAmountStore.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsCheckoutAmountStore$getCheckoutAmount$1 */
    static final class C346951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends UiRecommendationsCheckoutAmount>>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $recommendationId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346951(String str, UUID uuid, Continuation<? super C346951> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$recommendationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecommendationsCheckoutAmountStore.this.new C346951(this.$accountNumber, this.$recommendationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends UiRecommendationsCheckoutAmount>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<UiRecommendationsCheckoutAmount>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<UiRecommendationsCheckoutAmount>> continuation) {
            return ((C346951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                Endpoint endpoint = RecommendationsCheckoutAmountStore.this.endpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$recommendationId);
                this.L$0 = companion2;
                this.label = 1;
                Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, tuples2M3642to, null, this, 2, null);
                if (objFetch$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = objFetch$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    public final Single<Optional<UiRecommendationsCheckoutAmount>> getCheckoutAmount(String accountNumber, UUID recommendationId) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C346951(accountNumber, recommendationId, null), 1, null);
    }
}
