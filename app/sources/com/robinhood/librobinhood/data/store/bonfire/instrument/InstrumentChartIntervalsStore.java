package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.api.bonfire.instrument.PostApiInstrumentChartIntervalsConfig;
import com.robinhood.models.dao.InstrumentChartIntervalsDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpanInterval;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: InstrumentChartIntervalsStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\n\u0010\u0017\u001a\u00060\fj\u0002`\rJ\"\u0010\u0018\u001a\u00020\u00192\n\u0010\u0017\u001a\u00060\fj\u0002`\r2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/dao/InstrumentChartIntervalsDao;", "instrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/InstrumentChartIntervalsDao;Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;Lcom/robinhood/store/StoreBundle;)V", "chartIntervalsGetEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentId;", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "chartIntervalsUpdateEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore$IntervalsUpdateRequest;", "", "chartIntervalsQuery", "Lcom/robinhood/android/moria/db/Query;", "streamChartIntervals", "Lio/reactivex/Observable;", "instrumentId", "updateChartIntervals", "Lkotlinx/coroutines/Job;", "selectedSpan", "selectedInterval", "IntervalsUpdateRequest", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentChartIntervalsStore extends Store {
    private final Endpoint<String, InstrumentChartIntervals> chartIntervalsGetEndpoint;
    private final Query<String, InstrumentChartIntervals> chartIntervalsQuery;
    private final PostEndpoint<IntervalsUpdateRequest, Unit> chartIntervalsUpdateEndpoint;
    private final InstrumentChartIntervalsDao dao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartIntervalsStore(InstrumentChartIntervalsDao dao, InstrumentsApi instrumentsApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(instrumentsApi, "instrumentsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        InstrumentChartIntervalsStore2 instrumentChartIntervalsStore2 = new InstrumentChartIntervalsStore2(instrumentsApi, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        InstrumentChartIntervalsStore3 instrumentChartIntervalsStore3 = new InstrumentChartIntervalsStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.chartIntervalsGetEndpoint = companion.create(instrumentChartIntervalsStore2, logoutKillswitch, instrumentChartIntervalsStore3, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.chartIntervalsUpdateEndpoint = PostEndpoint.INSTANCE.create(new InstrumentChartIntervalsStore4(instrumentsApi, null), new InstrumentChartIntervalsStore5(null));
        this.chartIntervalsQuery = Store.create$default(this, Query.INSTANCE, "queryInstrumentChartIntervals", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartIntervalsStore.chartIntervalsQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartIntervalsStore.chartIntervalsQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object chartIntervalsGetEndpoint$insert(InstrumentChartIntervalsDao instrumentChartIntervalsDao, InstrumentChartIntervals instrumentChartIntervals, Continuation continuation) {
        instrumentChartIntervalsDao.insert(instrumentChartIntervals);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow chartIntervalsQuery$lambda$0(InstrumentChartIntervalsStore instrumentChartIntervalsStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<String, InstrumentChartIntervals> endpoint = instrumentChartIntervalsStore.chartIntervalsGetEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow chartIntervalsQuery$lambda$1(InstrumentChartIntervalsStore instrumentChartIntervalsStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlowKt.filterNotNull(instrumentChartIntervalsStore.dao.streamIntervals(it));
    }

    public final Observable<InstrumentChartIntervals> streamChartIntervals(String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.chartIntervalsQuery.asObservable(instrumentId);
    }

    public final Job updateChartIntervals(String instrumentId, String selectedSpan, String selectedInterval) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(selectedSpan, "selectedSpan");
        Intrinsics.checkNotNullParameter(selectedInterval, "selectedInterval");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346401(instrumentId, new PostApiInstrumentChartIntervalsConfig(selectedSpan, selectedInterval), selectedSpan, selectedInterval, null), 3, null);
    }

    /* compiled from: InstrumentChartIntervalsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$updateChartIntervals$1", m3645f = "InstrumentChartIntervalsStore.kt", m3646l = {73, 92}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore$updateChartIntervals$1 */
    static final class C346401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $instrumentId;
        final /* synthetic */ PostApiInstrumentChartIntervalsConfig $postBody;
        final /* synthetic */ String $selectedInterval;
        final /* synthetic */ String $selectedSpan;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346401(String str, PostApiInstrumentChartIntervalsConfig postApiInstrumentChartIntervalsConfig, String str2, String str3, Continuation<? super C346401> continuation) {
            super(2, continuation);
            this.$instrumentId = str;
            this.$postBody = postApiInstrumentChartIntervalsConfig;
            this.$selectedSpan = str2;
            this.$selectedInterval = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentChartIntervalsStore.this.new C346401(this.$instrumentId, this.$postBody, this.$selectedSpan, this.$selectedInterval, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
        
            if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r0, r2, null, r17, 2, null) == r6) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<InstrumentChartIntervals> flowStreamIntervals = InstrumentChartIntervalsStore.this.dao.streamIntervals(this.$instrumentId);
                this.label = 1;
                objFirst = FlowKt.first(flowStreamIntervals, this);
                if (objFirst != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objFirst = obj;
            InstrumentChartIntervals instrumentChartIntervals = (InstrumentChartIntervals) objFirst;
            InstrumentChartIntervals instrumentChartIntervalsCopy$default = null;
            if (instrumentChartIntervals != null) {
                ImmutableList<InstrumentChartSpanInterval> spans = instrumentChartIntervals.getSpans();
                String str = this.$selectedSpan;
                String str2 = this.$selectedInterval;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
                for (InstrumentChartSpanInterval instrumentChartSpanInterval : spans) {
                    arrayList.add(InstrumentChartSpanInterval.copy$default(instrumentChartSpanInterval, null, null, Intrinsics.areEqual(instrumentChartSpanInterval.getSpanId(), str) ? str2 : instrumentChartSpanInterval.getSelectedInterval(), 3, null));
                }
                instrumentChartIntervalsCopy$default = InstrumentChartIntervals.copy$default(instrumentChartIntervals, null, extensions2.toImmutableList(arrayList), 1, null);
            }
            if (instrumentChartIntervalsCopy$default != null) {
                InstrumentChartIntervalsStore.this.dao.insert(instrumentChartIntervalsCopy$default);
            }
            PostEndpoint postEndpoint = InstrumentChartIntervalsStore.this.chartIntervalsUpdateEndpoint;
            IntervalsUpdateRequest intervalsUpdateRequest = new IntervalsUpdateRequest(this.$instrumentId, this.$postBody);
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InstrumentChartIntervalsStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore$IntervalsUpdateRequest;", "", "instrumentId", "", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentId;", "postBody", "Lcom/robinhood/models/api/bonfire/instrument/PostApiInstrumentChartIntervalsConfig;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/bonfire/instrument/PostApiInstrumentChartIntervalsConfig;)V", "getInstrumentId", "()Ljava/lang/String;", "getPostBody", "()Lcom/robinhood/models/api/bonfire/instrument/PostApiInstrumentChartIntervalsConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class IntervalsUpdateRequest {
        private final String instrumentId;
        private final PostApiInstrumentChartIntervalsConfig postBody;

        public static /* synthetic */ IntervalsUpdateRequest copy$default(IntervalsUpdateRequest intervalsUpdateRequest, String str, PostApiInstrumentChartIntervalsConfig postApiInstrumentChartIntervalsConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                str = intervalsUpdateRequest.instrumentId;
            }
            if ((i & 2) != 0) {
                postApiInstrumentChartIntervalsConfig = intervalsUpdateRequest.postBody;
            }
            return intervalsUpdateRequest.copy(str, postApiInstrumentChartIntervalsConfig);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final PostApiInstrumentChartIntervalsConfig getPostBody() {
            return this.postBody;
        }

        public final IntervalsUpdateRequest copy(String instrumentId, PostApiInstrumentChartIntervalsConfig postBody) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(postBody, "postBody");
            return new IntervalsUpdateRequest(instrumentId, postBody);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntervalsUpdateRequest)) {
                return false;
            }
            IntervalsUpdateRequest intervalsUpdateRequest = (IntervalsUpdateRequest) other;
            return Intrinsics.areEqual(this.instrumentId, intervalsUpdateRequest.instrumentId) && Intrinsics.areEqual(this.postBody, intervalsUpdateRequest.postBody);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.postBody.hashCode();
        }

        public String toString() {
            return "IntervalsUpdateRequest(instrumentId=" + this.instrumentId + ", postBody=" + this.postBody + ")";
        }

        public IntervalsUpdateRequest(String instrumentId, PostApiInstrumentChartIntervalsConfig postBody) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(postBody, "postBody");
            this.instrumentId = instrumentId;
            this.postBody = postBody;
        }

        public final String getInstrumentId() {
            return this.instrumentId;
        }

        public final PostApiInstrumentChartIntervalsConfig getPostBody() {
            return this.postBody;
        }
    }
}
