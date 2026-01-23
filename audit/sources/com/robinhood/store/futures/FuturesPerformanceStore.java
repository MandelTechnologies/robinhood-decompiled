package com.robinhood.store.futures;

import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.models.futures.dao.FuturesIntervalPerformanceDao;
import com.robinhood.android.models.futures.p189db.FuturesIntervalPerformance2;
import com.robinhood.android.models.futures.p189db.UiFuturesIntervalPerformance;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetFuturesIntervalPerformanceResponseDto;
import com.robinhood.ceres.p284v1.SpanDto;
import com.robinhood.idl.Response;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesPerformanceStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: FuturesPerformanceStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesPerformanceStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/ceres/v1/Ceres;", "ceres", "Lcom/robinhood/android/models/futures/dao/FuturesIntervalPerformanceDao;", "futuresIntervalPerformanceDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/models/futures/dao/FuturesIntervalPerformanceDao;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "accountId", "Lcom/robinhood/ceres/v1/SpanDto;", "span", "j$/time/Duration", "duration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/db/UiFuturesIntervalPerformance;", "streamFuturesIntervalPerformance", "(Ljava/util/UUID;Lcom/robinhood/ceres/v1/SpanDto;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/ceres/v1/Ceres;", "Lcom/robinhood/android/models/futures/dao/FuturesIntervalPerformanceDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/futures/FuturesPerformanceStore$FuturesIntervalPerformanceParams;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetFuturesIntervalPerformanceResponseDto;", "getFuturesIntervalPerformanceEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "queryFuturesIntervalPerformance", "Lcom/robinhood/android/moria/db/Query;", "FuturesIntervalPerformanceParams", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesPerformanceStore extends Store {
    private final Ceres ceres;
    private final FuturesIntervalPerformanceDao futuresIntervalPerformanceDao;
    private final Endpoint<FuturesIntervalPerformanceParams, Response<GetFuturesIntervalPerformanceResponseDto>> getFuturesIntervalPerformanceEndpoint;
    private final Query<FuturesIntervalPerformanceParams, UiFuturesIntervalPerformance> queryFuturesIntervalPerformance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesPerformanceStore(Ceres ceres, FuturesIntervalPerformanceDao futuresIntervalPerformanceDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresIntervalPerformanceDao, "futuresIntervalPerformanceDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresIntervalPerformanceDao = futuresIntervalPerformanceDao;
        this.getFuturesIntervalPerformanceEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new FuturesPerformanceStore2(this, null), getLogoutKillswitch(), new FuturesPerformanceStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.queryFuturesIntervalPerformance = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryFuturesIntervalPerformance", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesPerformanceStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPerformanceStore.queryFuturesIntervalPerformance$lambda$0(this.f$0, (FuturesPerformanceStore.FuturesIntervalPerformanceParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesPerformanceStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesPerformanceStore.queryFuturesIntervalPerformance$lambda$4(this.f$0, (FuturesPerformanceStore.FuturesIntervalPerformanceParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFuturesIntervalPerformance$lambda$0(FuturesPerformanceStore futuresPerformanceStore, FuturesIntervalPerformanceParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlBackendPolling.backendPoll$default(futuresPerformanceStore.getFuturesIntervalPerformanceEndpoint, params, params.getDuration(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFuturesIntervalPerformance$lambda$4(FuturesPerformanceStore futuresPerformanceStore, FuturesIntervalPerformanceParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.transformLatest(FlowKt.filterNotNull(futuresPerformanceStore.futuresIntervalPerformanceDao.getFuturesIntervalPerformance(FuturesIntervalPerformance2.toDbModel(params.getSpan()))), new C41465x9bed62e3(null, futuresPerformanceStore));
    }

    public static /* synthetic */ Flow streamFuturesIntervalPerformance$default(FuturesPerformanceStore futuresPerformanceStore, UUID uuid, SpanDto spanDto, Duration duration, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(5L);
        }
        return futuresPerformanceStore.streamFuturesIntervalPerformance(uuid, spanDto, duration);
    }

    public final Flow<UiFuturesIntervalPerformance> streamFuturesIntervalPerformance(UUID accountId, SpanDto span, Duration duration) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return this.queryFuturesIntervalPerformance.asFlow(new FuturesIntervalPerformanceParams(accountId, span, duration));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesPerformanceStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesPerformanceStore$FuturesIntervalPerformanceParams;", "", "Ljava/util/UUID;", "accountId", "Lcom/robinhood/ceres/v1/SpanDto;", "span", "j$/time/Duration", "duration", "<init>", "(Ljava/util/UUID;Lcom/robinhood/ceres/v1/SpanDto;Lj$/time/Duration;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/ceres/v1/SpanDto;", "component3", "()Lj$/time/Duration;", "copy", "(Ljava/util/UUID;Lcom/robinhood/ceres/v1/SpanDto;Lj$/time/Duration;)Lcom/robinhood/store/futures/FuturesPerformanceStore$FuturesIntervalPerformanceParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getAccountId", "Lcom/robinhood/ceres/v1/SpanDto;", "getSpan", "Lj$/time/Duration;", "getDuration", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class FuturesIntervalPerformanceParams {
        private final UUID accountId;
        private final Duration duration;
        private final SpanDto span;

        public static /* synthetic */ FuturesIntervalPerformanceParams copy$default(FuturesIntervalPerformanceParams futuresIntervalPerformanceParams, UUID uuid, SpanDto spanDto, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = futuresIntervalPerformanceParams.accountId;
            }
            if ((i & 2) != 0) {
                spanDto = futuresIntervalPerformanceParams.span;
            }
            if ((i & 4) != 0) {
                duration = futuresIntervalPerformanceParams.duration;
            }
            return futuresIntervalPerformanceParams.copy(uuid, spanDto, duration);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        /* renamed from: component2, reason: from getter */
        public final SpanDto getSpan() {
            return this.span;
        }

        /* renamed from: component3, reason: from getter */
        public final Duration getDuration() {
            return this.duration;
        }

        public final FuturesIntervalPerformanceParams copy(UUID accountId, SpanDto span, Duration duration) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(duration, "duration");
            return new FuturesIntervalPerformanceParams(accountId, span, duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FuturesIntervalPerformanceParams)) {
                return false;
            }
            FuturesIntervalPerformanceParams futuresIntervalPerformanceParams = (FuturesIntervalPerformanceParams) other;
            return Intrinsics.areEqual(this.accountId, futuresIntervalPerformanceParams.accountId) && this.span == futuresIntervalPerformanceParams.span && Intrinsics.areEqual(this.duration, futuresIntervalPerformanceParams.duration);
        }

        public int hashCode() {
            return (((this.accountId.hashCode() * 31) + this.span.hashCode()) * 31) + this.duration.hashCode();
        }

        public String toString() {
            return "FuturesIntervalPerformanceParams(accountId=" + this.accountId + ", span=" + this.span + ", duration=" + this.duration + ")";
        }

        public FuturesIntervalPerformanceParams(UUID accountId, SpanDto span, Duration duration) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.accountId = accountId;
            this.span = span;
            this.duration = duration;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }

        public final SpanDto getSpan() {
            return this.span;
        }

        public final Duration getDuration() {
            return this.duration;
        }
    }
}
