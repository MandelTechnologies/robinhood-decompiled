package com.robinhood.android.newsfeed.store.breakingnews;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.newsfeed.api.breakingnews.BreakingNewsApi;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiBreakingNewsResponse;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: BreakingNewsStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J(\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "breakingNewsApi", "Lcom/robinhood/android/newsfeed/api/breakingnews/BreakingNewsApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/newsfeed/api/breakingnews/BreakingNewsApi;)V", "breakingNewsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore$Params;", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiBreakingNewsResponse;", "streamBreakingNews", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;", "assetId", "Ljava/util/UUID;", "assetType", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "accountNumber", "", "streamBreakingNewsOrNull", "Params", "Companion", "lib-store-breakingnews_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class BreakingNewsStore extends Store {
    private static final Duration pollingDuration = Duration.ofMinutes(1);
    private final BreakingNewsApi breakingNewsApi;
    private final Endpoint<Params, ApiBreakingNewsResponse> breakingNewsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakingNewsStore(StoreBundle storeBundle, BreakingNewsApi breakingNewsApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(breakingNewsApi, "breakingNewsApi");
        this.breakingNewsApi = breakingNewsApi;
        this.breakingNewsEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new BreakingNewsStore2(this, null), getLogoutKillswitch(), new BreakingNewsStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BreakingNewsStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore$Params;", "", "assetId", "Ljava/util/UUID;", "assetType", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;Ljava/lang/String;)V", "getAssetId", "()Ljava/util/UUID;", "getAssetType", "()Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-breakingnews_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class Params {
        private final String accountNumber;
        private final UUID assetId;
        private final ApiAssetType assetType;

        public static /* synthetic */ Params copy$default(Params params, UUID uuid, ApiAssetType apiAssetType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = params.assetId;
            }
            if ((i & 2) != 0) {
                apiAssetType = params.assetType;
            }
            if ((i & 4) != 0) {
                str = params.accountNumber;
            }
            return params.copy(uuid, apiAssetType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAssetId() {
            return this.assetId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiAssetType getAssetType() {
            return this.assetType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Params copy(UUID assetId, ApiAssetType assetType, String accountNumber) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            return new Params(assetId, assetType, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.assetId, params.assetId) && this.assetType == params.assetType && Intrinsics.areEqual(this.accountNumber, params.accountNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.assetId.hashCode() * 31) + this.assetType.hashCode()) * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(assetId=" + this.assetId + ", assetType=" + this.assetType + ", accountNumber=" + this.accountNumber + ")";
        }

        public Params(UUID assetId, ApiAssetType assetType, String str) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.assetId = assetId;
            this.assetType = assetType;
            this.accountNumber = str;
        }

        public final UUID getAssetId() {
            return this.assetId;
        }

        public final ApiAssetType getAssetType() {
            return this.assetType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    public final Flow<BreakingNews> streamBreakingNews(UUID assetId, ApiAssetType assetType, String accountNumber) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return FlowKt.filterNotNull(streamBreakingNewsOrNull(assetId, assetType, accountNumber));
    }

    public final Flow<BreakingNews> streamBreakingNewsOrNull(UUID assetId, ApiAssetType assetType, String accountNumber) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Endpoint<Params, ApiBreakingNewsResponse> endpoint = this.breakingNewsEndpoint;
        Params params = new Params(assetId, assetType, accountNumber);
        Duration pollingDuration2 = pollingDuration;
        Intrinsics.checkNotNullExpressionValue(pollingDuration2, "pollingDuration");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, params, pollingDuration2, null, 4, null);
        return new Flow<BreakingNews>() { // from class: com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$streamBreakingNewsOrNull$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$streamBreakingNewsOrNull$$inlined$map$1$2 */
            public static final class C225822<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$streamBreakingNewsOrNull$$inlined$map$1$2", m3645f = "BreakingNewsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore$streamBreakingNewsOrNull$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C225822.this.emit(null, this);
                    }
                }

                public C225822(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        BreakingNews dbModel = ((ApiBreakingNewsResponse) obj).toDbModel();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(dbModel, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BreakingNews> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C225822(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
