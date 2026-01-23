package com.robinhood.librobinhood.data.store;

import com.robinhood.android.models.taxcenter.dao.PreviousTaxFormsDao;
import com.robinhood.android.models.taxcenter.dao.TaxCenterTimelineDao;
import com.robinhood.android.models.taxcenter.dao.TaxDocumentDao;
import com.robinhood.android.models.taxcenter.dao.TaxTimelineInfoDao;
import com.robinhood.android.models.taxcenter.p195db.PreviousTaxForms;
import com.robinhood.android.models.taxcenter.p195db.TaxCenterTimeline;
import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import com.robinhood.android.models.taxcenter.p195db.TaxTimelineInfo;
import com.robinhood.android.models.taxcenter.p195db.YearlyTaxForms;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.taxcenter.api.TaxCenterApi;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;

/* compiled from: TaxCenterStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130!J\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150!J\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170!J\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0!2\u0006\u0010%\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "Lcom/robinhood/store/Store;", "taxCenterApi", "Lcom/robinhood/android/taxcenter/api/TaxCenterApi;", "timelineDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxCenterTimelineDao;", "timelineInfoDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxTimelineInfoDao;", "previousTaxFormsDao", "Lcom/robinhood/android/models/taxcenter/dao/PreviousTaxFormsDao;", "taxDocumentDao", "Lcom/robinhood/android/models/taxcenter/dao/TaxDocumentDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/taxcenter/api/TaxCenterApi;Lcom/robinhood/android/models/taxcenter/dao/TaxCenterTimelineDao;Lcom/robinhood/android/models/taxcenter/dao/TaxTimelineInfoDao;Lcom/robinhood/android/models/taxcenter/dao/PreviousTaxFormsDao;Lcom/robinhood/android/models/taxcenter/dao/TaxDocumentDao;Lcom/robinhood/store/StoreBundle;)V", "timelineEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/taxcenter/db/TaxCenterTimeline;", "timelineInfoEndpoint", "Lcom/robinhood/android/models/taxcenter/db/TaxTimelineInfo;", "previousTaxFormsEndpoint", "Lcom/robinhood/android/models/taxcenter/db/PreviousTaxForms;", "taxDocumentEndpoint", "", "Lcom/robinhood/android/models/taxcenter/db/TaxDocument;", "timelineQuery", "Lcom/robinhood/android/moria/db/Query;", "timelineInfoQuery", "previousTaxFormsQuery", "taxDocumentQuery", "responseFlow", "Lkotlinx/coroutines/flow/Flow;", "timelineInfoFlow", "previousTaxFormsFlow", "taxDocumentFlow", "documentId", "lib-store-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TaxCenterStore extends Store {
    private final PreviousTaxFormsDao previousTaxFormsDao;
    private final Endpoint<Unit, PreviousTaxForms> previousTaxFormsEndpoint;
    private final Query<Unit, PreviousTaxForms> previousTaxFormsQuery;
    private final TaxCenterApi taxCenterApi;
    private final TaxDocumentDao taxDocumentDao;
    private final Endpoint<String, TaxDocument> taxDocumentEndpoint;
    private final Query<String, TaxDocument> taxDocumentQuery;
    private final TaxCenterTimelineDao timelineDao;
    private final Endpoint<Unit, TaxCenterTimeline> timelineEndpoint;
    private final TaxTimelineInfoDao timelineInfoDao;
    private final Endpoint<Unit, TaxTimelineInfo> timelineInfoEndpoint;
    private final Query<Unit, TaxTimelineInfo> timelineInfoQuery;
    private final Query<Unit, TaxCenterTimeline> timelineQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxCenterStore(TaxCenterApi taxCenterApi, TaxCenterTimelineDao timelineDao, TaxTimelineInfoDao timelineInfoDao, PreviousTaxFormsDao previousTaxFormsDao, TaxDocumentDao taxDocumentDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(taxCenterApi, "taxCenterApi");
        Intrinsics.checkNotNullParameter(timelineDao, "timelineDao");
        Intrinsics.checkNotNullParameter(timelineInfoDao, "timelineInfoDao");
        Intrinsics.checkNotNullParameter(previousTaxFormsDao, "previousTaxFormsDao");
        Intrinsics.checkNotNullParameter(taxDocumentDao, "taxDocumentDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.taxCenterApi = taxCenterApi;
        this.timelineDao = timelineDao;
        this.timelineInfoDao = timelineInfoDao;
        this.previousTaxFormsDao = previousTaxFormsDao;
        this.taxDocumentDao = taxDocumentDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.timelineEndpoint = Endpoint.Companion.create$default(companion, new TaxCenterStore6(this, null), getLogoutKillswitch(), new TaxCenterStore7(timelineDao), storeBundle.getClock(), null, 16, null);
        this.timelineInfoEndpoint = Endpoint.Companion.create$default(companion, new TaxCenterStore8(this, null), getLogoutKillswitch(), new TaxCenterStore9(timelineInfoDao), storeBundle.getClock(), null, 16, null);
        this.previousTaxFormsEndpoint = Endpoint.Companion.create$default(companion, new TaxCenterStore2(this, null), getLogoutKillswitch(), new TaxCenterStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.taxDocumentEndpoint = Endpoint.Companion.create$default(companion, new TaxCenterStore4(this, null), getLogoutKillswitch(), new TaxCenterStore5(taxDocumentDao), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.timelineQuery = Store.create$default(this, companion2, "pollTaxCenterTimeline", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.timelineQuery$lambda$2(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.timelineQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.timelineInfoQuery = Store.create$default(this, companion2, "pollTaxCenterTimelineInfo", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.timelineInfoQuery$lambda$4(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.timelineInfoQuery$lambda$5(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.previousTaxFormsQuery = Store.create$default(this, companion2, "pollPreviousTaxForms", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.previousTaxFormsQuery$lambda$6(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.previousTaxFormsQuery$lambda$11(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.taxDocumentQuery = Store.create$default(this, companion2, "pollTaxDocument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.taxDocumentQuery$lambda$12(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TaxCenterStore.taxDocumentQuery$lambda$13(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object timelineEndpoint$insert(TaxCenterTimelineDao taxCenterTimelineDao, TaxCenterTimeline taxCenterTimeline, Continuation continuation) {
        taxCenterTimelineDao.insert(taxCenterTimeline);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object timelineInfoEndpoint$insert$0(TaxTimelineInfoDao taxTimelineInfoDao, TaxTimelineInfo taxTimelineInfo, Continuation continuation) {
        taxTimelineInfoDao.insert(taxTimelineInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object taxDocumentEndpoint$insert$1(TaxDocumentDao taxDocumentDao, TaxDocument taxDocument, Continuation continuation) {
        taxDocumentDao.insert(taxDocument);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow timelineQuery$lambda$2(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, TaxCenterTimeline> endpoint = taxCenterStore.timelineEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow timelineQuery$lambda$3(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return taxCenterStore.timelineDao.getTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow timelineInfoQuery$lambda$4(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, TaxTimelineInfo> endpoint = taxCenterStore.timelineInfoEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow timelineInfoQuery$lambda$5(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return taxCenterStore.timelineInfoDao.getTimelineInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow previousTaxFormsQuery$lambda$6(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, PreviousTaxForms> endpoint = taxCenterStore.previousTaxFormsEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, unit, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow previousTaxFormsQuery$lambda$11(TaxCenterStore taxCenterStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Flow<List<YearlyTaxForms>> previousTaxForms = taxCenterStore.previousTaxFormsDao.getPreviousTaxForms();
        return new Flow<PreviousTaxForms>() { // from class: com.robinhood.librobinhood.data.store.TaxCenterStore$previousTaxFormsQuery$lambda$11$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.TaxCenterStore$previousTaxFormsQuery$lambda$11$$inlined$map$1$2 */
            public static final class C343612<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.TaxCenterStore$previousTaxFormsQuery$lambda$11$$inlined$map$1$2", m3645f = "TaxCenterStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.TaxCenterStore$previousTaxFormsQuery$lambda$11$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C343612.this.emit(null, this);
                    }
                }

                public C343612(FlowCollector flowCollector) {
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
                        List<YearlyTaxForms> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (YearlyTaxForms yearlyTaxForms : list) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to(yearlyTaxForms.getYear(), yearlyTaxForms.getContent());
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        if (linkedHashMap.isEmpty()) {
                            linkedHashMap = null;
                        }
                        PreviousTaxForms previousTaxForms = linkedHashMap != null ? new PreviousTaxForms(linkedHashMap) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(previousTaxForms, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PreviousTaxForms> flowCollector, Continuation continuation) {
                Object objCollect = previousTaxForms.collect(new C343612(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow taxDocumentQuery$lambda$12(TaxCenterStore taxCenterStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<String, TaxDocument> endpoint = taxCenterStore.taxDocumentEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow taxDocumentQuery$lambda$13(TaxCenterStore taxCenterStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return taxCenterStore.taxDocumentDao.getDocument(it);
    }

    public final Flow<TaxCenterTimeline> responseFlow() {
        return Context7.buffer$default(RxConvert.asFlow(this.timelineQuery.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<TaxTimelineInfo> timelineInfoFlow() {
        return Context7.buffer$default(RxConvert.asFlow(this.timelineInfoQuery.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<PreviousTaxForms> previousTaxFormsFlow() {
        return Context7.buffer$default(RxConvert.asFlow(this.previousTaxFormsQuery.asObservable(Unit.INSTANCE)), Integer.MAX_VALUE, null, 2, null);
    }

    public final Flow<TaxDocument> taxDocumentFlow(String documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return Context7.buffer$default(RxConvert.asFlow(this.taxDocumentQuery.asObservable(documentId)), Integer.MAX_VALUE, null, 2, null);
    }
}
