package com.robinhood.librobinhood.data.store.rhy;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: RecurringContributionInfoStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u00162\u0006\u0010\u0017\u001a\u00020\nR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b \u000f*\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RecurringContributionInfoStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "contributionInfoCache", "", "", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "contributionInfoRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "contributionInfoEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "contributionInfoQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "streamContributionInfo", "Lio/reactivex/Observable;", "achDepositScheduleId", "Companion", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RecurringContributionInfoStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, ApiRecurringIraContributionInfo> contributionInfoCache;
    private final Endpoint<String, ApiRecurringIraContributionInfo> contributionInfoEndpoint;
    private final Query<String, Optional<ApiRecurringIraContributionInfo>> contributionInfoQuery;
    private final PublishRelay<Tuples2<String, ApiRecurringIraContributionInfo>> contributionInfoRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringContributionInfoStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.contributionInfoCache = new LinkedHashMap();
        PublishRelay<Tuples2<String, ApiRecurringIraContributionInfo>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.contributionInfoRelay = publishRelayCreate;
        this.contributionInfoEndpoint = Endpoint.INSTANCE.createWithParams(new RecurringContributionInfoStore4(transfersBonfireApi, null), getLogoutKillswitch(), new RecurringContributionInfoStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_DAY(), storeBundle.getClock()));
        this.contributionInfoQuery = Store.createOptional$default(this, Query.INSTANCE, "queryContributionInfo", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringContributionInfoStore.contributionInfoQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringContributionInfoStore.contributionInfoQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job contributionInfoQuery$lambda$0(RecurringContributionInfoStore recurringContributionInfoStore, String achDepositScheduleId) {
        Intrinsics.checkNotNullParameter(achDepositScheduleId, "achDepositScheduleId");
        return Endpoint.DefaultImpls.refresh$default(recurringContributionInfoStore.contributionInfoEndpoint, achDepositScheduleId, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow contributionInfoQuery$lambda$2(RecurringContributionInfoStore recurringContributionInfoStore, String achDepositScheduleId) {
        Intrinsics.checkNotNullParameter(achDepositScheduleId, "achDepositScheduleId");
        Companion companion = INSTANCE;
        Observable<Tuples2<String, ApiRecurringIraContributionInfo>> observableHide = recurringContributionInfoStore.contributionInfoRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable observableMapToCacheEntry = companion.mapToCacheEntry(observableHide, achDepositScheduleId, recurringContributionInfoStore.contributionInfoCache.get(achDepositScheduleId));
        Intrinsics.checkNotNullExpressionValue(observableMapToCacheEntry, "access$mapToCacheEntry(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableMapToCacheEntry), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiRecurringIraContributionInfo>() { // from class: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2", m3645f = "RecurringContributionInfoStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$contributionInfoQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ApiRecurringIraContributionInfo> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<Optional<ApiRecurringIraContributionInfo>> streamContributionInfo(String achDepositScheduleId) {
        Intrinsics.checkNotNullParameter(achDepositScheduleId, "achDepositScheduleId");
        return this.contributionInfoQuery.asObservable(achDepositScheduleId);
    }

    /* compiled from: RecurringContributionInfoStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u0004\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u0005*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t0\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RecurringContributionInfoStore$Companion;", "", "<init>", "()V", "mapToCacheEntry", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/bonfire/ApiRecurringIraContributionInfo;", "kotlin.jvm.PlatformType", "Lkotlin/Pair;", "", "achDepositScheduleId", "cacheEntry", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Observable<Optional<ApiRecurringIraContributionInfo>> mapToCacheEntry(Observable<Tuples2<String, ApiRecurringIraContributionInfo>> observable, final String str, ApiRecurringIraContributionInfo apiRecurringIraContributionInfo) {
            return observable.filter(new Predicate() { // from class: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$Companion$mapToCacheEntry$1
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Tuples2<String, ApiRecurringIraContributionInfo> tuples2) {
                    Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                    return Intrinsics.areEqual(str, tuples2.component1());
                }
            }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore$Companion$mapToCacheEntry$2
                @Override // io.reactivex.functions.Function
                public final Optional<ApiRecurringIraContributionInfo> apply(Tuples2<String, ApiRecurringIraContributionInfo> tuples2) {
                    Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                    return Optional3.asOptional(tuples2.component2());
                }
            }).startWith((Observable<R>) Optional3.asOptional(apiRecurringIraContributionInfo));
        }
    }
}
