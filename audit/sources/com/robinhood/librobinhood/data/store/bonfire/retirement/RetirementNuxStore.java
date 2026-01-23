package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.dao.RetirementNuxDao;
import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.bonfire.retirement.prefs.RetirementOptionsAssetHomeTooltipLastShownPref;
import com.robinhood.librobinhood.data.store.bonfire.retirement.prefs.RetirementOptionsAssetHomeTooltipTimesShownPref;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.squareup.moshi.JsonDataException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: RetirementNuxStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 02\u00020\u0001:\u00010BE\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R#\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+¨\u00061"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/api/retirement/RetirementApi;", "retirementApi", "Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;", "retirementNuxDao", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/prefs/StringPreference;", "retirementOptionsAssetHomeTooltipLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "retirementOptionsAssetHomeTooltipTimesShownPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "", "accountNumber", "Lio/reactivex/Observable;", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "getUninvestedViewModel", "(Ljava/lang/String;)Lio/reactivex/Observable;", "", "recordOptionsAssetHomeTooltipShown", "()V", "hideOptionsAssetHomeTooltip", "Lkotlinx/coroutines/flow/Flow;", "", "shouldShowOptionsAssetHomeTooltip", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/retirement/dao/RetirementNuxDao;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/IntPreference;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel;", "unfundedEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "unfundedViewModelQuery", "Lcom/robinhood/android/moria/db/Query;", "getUnfundedViewModelQuery", "()Lcom/robinhood/android/moria/db/Query;", "uninvestedEndpoint", "uninvestedViewModelQuery", "Companion", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RetirementNuxStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Clock clock;
    private final RegionGateProvider regionGateProvider;
    private final RetirementNuxDao retirementNuxDao;
    private final StringPreference retirementOptionsAssetHomeTooltipLastShownPref;
    private final IntPreference retirementOptionsAssetHomeTooltipTimesShownPref;
    private final Endpoint<Unit, RetirementUnfundedViewModel> unfundedEndpoint;
    private final Query<Unit, RetirementUnfundedViewModel> unfundedViewModelQuery;
    private final Endpoint<String, RetirementUninvestedViewModel> uninvestedEndpoint;
    private final Query<String, RetirementUninvestedViewModel> uninvestedViewModelQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementNuxStore(RetirementApi retirementApi, RetirementNuxDao retirementNuxDao, RegionGateProvider regionGateProvider, @RetirementOptionsAssetHomeTooltipLastShownPref StringPreference retirementOptionsAssetHomeTooltipLastShownPref, @RetirementOptionsAssetHomeTooltipTimesShownPref IntPreference retirementOptionsAssetHomeTooltipTimesShownPref, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(retirementNuxDao, "retirementNuxDao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipLastShownPref, "retirementOptionsAssetHomeTooltipLastShownPref");
        Intrinsics.checkNotNullParameter(retirementOptionsAssetHomeTooltipTimesShownPref, "retirementOptionsAssetHomeTooltipTimesShownPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementNuxDao = retirementNuxDao;
        this.regionGateProvider = regionGateProvider;
        this.retirementOptionsAssetHomeTooltipLastShownPref = retirementOptionsAssetHomeTooltipLastShownPref;
        this.retirementOptionsAssetHomeTooltipTimesShownPref = retirementOptionsAssetHomeTooltipTimesShownPref;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<Unit, RetirementUnfundedViewModel> endpointCreate$default = Endpoint.Companion.create$default(companion, new RetirementNuxStore2(retirementApi, null), getLogoutKillswitch(), new RetirementNuxStore3(retirementNuxDao), storeBundle.getClock(), null, 16, null);
        this.unfundedEndpoint = endpointCreate$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.unfundedViewModelQuery = Store.create$default(this, companion2, "retirementUnfundedV3ViewModelQuery", CollectionsKt.listOf(new RefreshEach(new RetirementNuxStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementNuxStore.unfundedViewModelQuery$lambda$0(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        Endpoint<String, RetirementUninvestedViewModel> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new RetirementNuxStore5(retirementApi, null), getLogoutKillswitch(), new RetirementNuxStore6(retirementNuxDao), storeBundle.getClock(), null, 16, null);
        this.uninvestedEndpoint = endpointCreate$default2;
        this.uninvestedViewModelQuery = Store.create$default(this, companion2, "retirementUninvestedViewModelQuery", CollectionsKt.listOf(new RefreshEach(new RetirementNuxStore7(endpointCreate$default2))), new RetirementNuxStore8(retirementNuxDao), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object unfundedEndpoint$insertUnfundedViewModel(RetirementNuxDao retirementNuxDao, RetirementUnfundedViewModel retirementUnfundedViewModel, Continuation continuation) {
        retirementNuxDao.insertUnfundedViewModel(retirementUnfundedViewModel);
        return Unit.INSTANCE;
    }

    public final Query<Unit, RetirementUnfundedViewModel> getUnfundedViewModelQuery() {
        return this.unfundedViewModelQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow unfundedViewModelQuery$lambda$0(RetirementNuxStore retirementNuxStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirementNuxStore.retirementNuxDao.getUnfundedViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object uninvestedEndpoint$insertUninvestedViewModel(RetirementNuxDao retirementNuxDao, RetirementUninvestedViewModel retirementUninvestedViewModel, Continuation continuation) {
        retirementNuxDao.insertUninvestedViewModel(retirementUninvestedViewModel);
        return Unit.INSTANCE;
    }

    public final Observable<RetirementUninvestedViewModel> getUninvestedViewModel(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Query<String, RetirementUninvestedViewModel> query = this.uninvestedViewModelQuery;
        final C347291 c347291 = new C347291(this.retirementNuxDao);
        final boolean z = true;
        Observable<RetirementUninvestedViewModel> observableOnErrorResumeNext = query.asObservable(accountNumber).onErrorResumeNext(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$getUninvestedViewModel$$inlined$deleteAllOnRoomJsonException$default$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends T> apply(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (t instanceof JsonDataException) {
                    final Function0 function0 = c347291;
                    Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$getUninvestedViewModel$$inlined$deleteAllOnRoomJsonException$default$1.1
                        @Override // java.util.concurrent.Callable
                        public /* bridge */ /* synthetic */ Object call() {
                            call();
                            return Unit.INSTANCE;
                        }

                        @Override // java.util.concurrent.Callable
                        public final void call() {
                            function0.invoke();
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(completableFromCallable, "fromCallable(...)");
                    if (z) {
                        return completableFromCallable.andThen(query.asObservable(accountNumber));
                    }
                    return completableFromCallable.toObservable();
                }
                return Observable.error(t);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        return observableOnErrorResumeNext;
    }

    /* compiled from: RetirementNuxStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$getUninvestedViewModel$1 */
    /* synthetic */ class C347291 extends FunctionReferenceImpl implements Function0<Unit> {
        C347291(Object obj) {
            super(0, obj, RetirementNuxDao.class, "deleteAllUninvestedViewModels", "deleteAllUninvestedViewModels()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RetirementNuxDao) this.receiver).deleteAllUninvestedViewModels();
        }
    }

    public final void recordOptionsAssetHomeTooltipShown() {
        this.retirementOptionsAssetHomeTooltipLastShownPref.set(this.clock.instant().toString());
        IntPreference intPreference = this.retirementOptionsAssetHomeTooltipTimesShownPref;
        intPreference.set(intPreference.get() + 1);
    }

    public final void hideOptionsAssetHomeTooltip() {
        this.retirementOptionsAssetHomeTooltipTimesShownPref.set(5);
    }

    public final Flow<Boolean> shouldShowOptionsAssetHomeTooltip() {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
        return new Flow<Boolean>() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$shouldShowOptionsAssetHomeTooltip$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$shouldShowOptionsAssetHomeTooltip$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ RetirementNuxStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$shouldShowOptionsAssetHomeTooltip$$inlined$map$1$2", m3645f = "RetirementNuxStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore$shouldShowOptionsAssetHomeTooltip$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, RetirementNuxStore retirementNuxStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = retirementNuxStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
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
                        boolean z = false;
                        if (((Boolean) obj).booleanValue()) {
                            Instant instant = this.this$0.clock.instant();
                            String str = this.this$0.retirementOptionsAssetHomeTooltipLastShownPref.get();
                            Instant instant2 = str != null ? RetirementNuxStore.INSTANCE.toInstant(str) : null;
                            if (instant2 != null) {
                                Intrinsics.checkNotNull(instant);
                                boolean z2 = instant2.until(instant, ChronoUnit.DAYS) < 7;
                                int i3 = this.this$0.retirementOptionsAssetHomeTooltipTimesShownPref.get();
                                if (!z2 && i3 < 4) {
                                    z = true;
                                }
                            }
                        }
                        Boolean boolBoxBoolean = boxing.boxBoolean(z);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* compiled from: RetirementNuxStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore$Companion;", "", "<init>", "()V", "", "j$/time/Instant", "toInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Instant toInstant(String str) {
            try {
                return Instant.parse(str);
            } catch (DateTimeParseException unused) {
                return null;
            }
        }
    }
}
