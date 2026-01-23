package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import java.util.UUID;
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

/* compiled from: RecsRetirementPortfolioStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "recsRetirementApi", "Lcom/robinhood/api/retrofit/RecsRetirementApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/RecsRetirementApi;)V", "postEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore$Request;", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio;", "getPortfolio", "Lio/reactivex/Single;", "recommendationId", "Ljava/util/UUID;", "isReorder", "", "Request", "lib-store-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecsRetirementPortfolioStore extends Store {
    private final PostEndpoint<Request, ApiRecsRetirementPortfolio> postEndpoint;
    private final RecsRetirementApi recsRetirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsRetirementPortfolioStore(StoreBundle storeBundle, RecsRetirementApi recsRetirementApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(recsRetirementApi, "recsRetirementApi");
        this.recsRetirementApi = recsRetirementApi;
        this.postEndpoint = PostEndpoint.INSTANCE.create(new RecsRetirementPortfolioStore2(this, null), new RecsRetirementPortfolioStore3(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RecsRetirementPortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementPortfolioStore$Request;", "", "recommendationId", "Ljava/util/UUID;", "isReorder", "", "<init>", "(Ljava/util/UUID;Z)V", "getRecommendationId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Request {
        private final boolean isReorder;
        private final UUID recommendationId;

        public static /* synthetic */ Request copy$default(Request request, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = request.recommendationId;
            }
            if ((i & 2) != 0) {
                z = request.isReorder;
            }
            return request.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsReorder() {
            return this.isReorder;
        }

        public final Request copy(UUID recommendationId, boolean isReorder) {
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            return new Request(recommendationId, isReorder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.recommendationId, request.recommendationId) && this.isReorder == request.isReorder;
        }

        public int hashCode() {
            return (this.recommendationId.hashCode() * 31) + Boolean.hashCode(this.isReorder);
        }

        public String toString() {
            return "Request(recommendationId=" + this.recommendationId + ", isReorder=" + this.isReorder + ")";
        }

        public Request(UUID recommendationId, boolean z) {
            Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
            this.recommendationId = recommendationId;
            this.isReorder = z;
        }

        public final UUID getRecommendationId() {
            return this.recommendationId;
        }

        public final boolean isReorder() {
            return this.isReorder;
        }
    }

    /* compiled from: RecsRetirementPortfolioStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore$getPortfolio$1", m3645f = "RecsRetirementPortfolioStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementPortfolioStore$getPortfolio$1 */
    static final class C138751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiRecsRetirementPortfolio>, Object> {
        final /* synthetic */ boolean $isReorder;
        final /* synthetic */ UUID $recommendationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138751(UUID uuid, boolean z, Continuation<? super C138751> continuation) {
            super(2, continuation);
            this.$recommendationId = uuid;
            this.$isReorder = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecsRetirementPortfolioStore.this.new C138751(this.$recommendationId, this.$isReorder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiRecsRetirementPortfolio> continuation) {
            return ((C138751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = RecsRetirementPortfolioStore.this.postEndpoint;
            Request request = new Request(this.$recommendationId, this.$isReorder);
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, request, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiRecsRetirementPortfolio> getPortfolio(UUID recommendationId, boolean isReorder) {
        Intrinsics.checkNotNullParameter(recommendationId, "recommendationId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C138751(recommendationId, isReorder, null), 1, null);
    }
}
