package com.robinhood.android.home.iac.events.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.home.iac.events.store.Alert;
import com.robinhood.android.lib.psp.ShowPspDetailOnLaunchPref;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.regiongate.PspRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.slip.lib.SlipUpdatedAgreementManager;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p355ui.UiUpdatedAgreementsResponse;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: HomeIacEventsStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/HomeIacEventsStore;", "Lcom/robinhood/store/Store;", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "slipUpdatedAgreementManager", "Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;", "showPspDetailOnLaunchPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/slip/lib/SlipUpdatedAgreementManager;Lcom/robinhood/prefs/StringToBooleanMapPreference;Lcom/robinhood/store/StoreBundle;)V", "streamEvents", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/home/iac/events/store/Alert;", "accountNumber", "", "crossSellPolllingScope", "Lkotlinx/coroutines/CoroutineScope;", "bottomSheetEventsFlow", "pollingScope", "pspEligibilityEventsFlow", "slipAgreementEventsFlow", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HomeIacEventsStore extends Store {
    private final CrossSellLaunchManager crossSellLaunchManager;
    private final PositionsV2Store positionsV2Store;
    private final RegionGateProvider regionGateProvider;
    private final StringToBooleanMapPreference showPspDetailOnLaunchPref;
    private final SlipUpdatedAgreementManager slipUpdatedAgreementManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeIacEventsStore(CrossSellLaunchManager crossSellLaunchManager, PositionsV2Store positionsV2Store, RegionGateProvider regionGateProvider, SlipUpdatedAgreementManager slipUpdatedAgreementManager, @ShowPspDetailOnLaunchPref StringToBooleanMapPreference showPspDetailOnLaunchPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "crossSellLaunchManager");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(slipUpdatedAgreementManager, "slipUpdatedAgreementManager");
        Intrinsics.checkNotNullParameter(showPspDetailOnLaunchPref, "showPspDetailOnLaunchPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.crossSellLaunchManager = crossSellLaunchManager;
        this.positionsV2Store = positionsV2Store;
        this.regionGateProvider = regionGateProvider;
        this.slipUpdatedAgreementManager = slipUpdatedAgreementManager;
        this.showPspDetailOnLaunchPref = showPspDetailOnLaunchPref;
    }

    public final Flow<Alert> streamEvents(String accountNumber, CoroutineScope crossSellPolllingScope) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(crossSellPolllingScope, "crossSellPolllingScope");
        return FlowKt.merge(bottomSheetEventsFlow(accountNumber, crossSellPolllingScope), pspEligibilityEventsFlow(accountNumber), slipAgreementEventsFlow());
    }

    private final Flow<Alert> bottomSheetEventsFlow(String accountNumber, CoroutineScope pollingScope) {
        final Flow flowStreamBottomSheetNavigationKey$default = CrossSellLaunchManager.streamBottomSheetNavigationKey$default(this.crossSellLaunchManager, pollingScope, IacAlertSheetLocation.TOP_LEVEL_INVESTING, accountNumber, null, null, null, null, null, null, 504, null);
        return new Flow<Alert.BottomSheet>() { // from class: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$bottomSheetEventsFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$bottomSheetEventsFlow$$inlined$map$1$2 */
            public static final class C184572<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.home.iac.events.store.HomeIacEventsStore$bottomSheetEventsFlow$$inlined$map$1$2", m3645f = "HomeIacEventsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$bottomSheetEventsFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C184572.this.emit(null, this);
                    }
                }

                public C184572(FlowCollector flowCollector) {
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
                        Alert.BottomSheet bottomSheet = new Alert.BottomSheet((NavigationKey) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(bottomSheet, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Alert.BottomSheet> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamBottomSheetNavigationKey$default.collect(new C184572(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    private final Flow<Alert> pspEligibilityEventsFlow(String accountNumber) {
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ObservablesKt.connectWhen$default(PositionsV2Store.streamPositions$default(this.positionsV2Store, accountNumber, PositionInstrumentType.PSP, PositionsLocation.HOME_TAB, null, 8, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, PspRegionGate.INSTANCE, false, 2, null), null, 2, null)), Integer.MAX_VALUE, null, 2, null);
        final Flow<UUID> flow = new Flow<UUID>() { // from class: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ HomeIacEventsStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$mapNotNull$1$2", m3645f = "HomeIacEventsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "emit")
                /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, HomeIacEventsStore homeIacEventsStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = homeIacEventsStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
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
                        List<PositionsV2.PositionListItemV2> results = ((PositionsV2) obj).getResults();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = results.iterator();
                        while (it.hasNext()) {
                            UUID metadataId = ((PositionsV2.PositionListItemV2) it.next()).getMetadataId();
                            if (metadataId != null) {
                                arrayList.add(metadataId);
                            }
                        }
                        Iterator<T> it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it2.next();
                            Map<String, Boolean> values = this.this$0.showPspDetailOnLaunchPref.getValues();
                            String string2 = ((UUID) next).toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            if (values.getOrDefault(string2, boxing.boxBoolean(true)).booleanValue()) {
                                break;
                            }
                        }
                        if (next != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<Alert.PspEligibilityProgram>() { // from class: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$map$1$2 */
            public static final class C184582<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$map$1$2", m3645f = "HomeIacEventsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$pspEligibilityEventsFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C184582.this.emit(null, this);
                    }
                }

                public C184582(FlowCollector flowCollector) {
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
                        Alert.PspEligibilityProgram pspEligibilityProgram = new Alert.PspEligibilityProgram((UUID) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(pspEligibilityProgram, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Alert.PspEligibilityProgram> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C184582(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    private final Flow<Alert> slipAgreementEventsFlow() {
        Observable<Optional<UiUpdatedAgreementsResponse>> observable = this.slipUpdatedAgreementManager.getAgreementsToSign().toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observable), Integer.MAX_VALUE, null, 2, null);
        final Flow<Optional<? extends UiUpdatedAgreementsResponse>> flow = new Flow<Optional<? extends UiUpdatedAgreementsResponse>>() { // from class: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends UiUpdatedAgreementsResponse>> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C184602(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$filter$1$2 */
            public static final class C184602<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$filter$1$2", m3645f = "HomeIacEventsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C184602.this.emit(null, this);
                    }
                }

                public C184602(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    List<UiUpdatedAgreementsResponse.UpdatedAgreement> updatedAgreements;
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
                        UiUpdatedAgreementsResponse uiUpdatedAgreementsResponse = (UiUpdatedAgreementsResponse) ((Optional) obj).component1();
                        if (uiUpdatedAgreementsResponse != null && (updatedAgreements = uiUpdatedAgreementsResponse.getUpdatedAgreements()) != null && (!updatedAgreements.isEmpty())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
        };
        return new Flow<Alert.UpdatedSlipAgreement>() { // from class: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Alert.UpdatedSlipAgreement> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C184612(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$map$1$2 */
            public static final class C184612<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$map$1$2", m3645f = "HomeIacEventsStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.home.iac.events.store.HomeIacEventsStore$slipAgreementEventsFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C184612.this.emit(null, this);
                    }
                }

                public C184612(FlowCollector flowCollector) {
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
                        Alert.UpdatedSlipAgreement updatedSlipAgreement = Alert.UpdatedSlipAgreement.INSTANCE;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(updatedSlipAgreement, anonymousClass1) == coroutine_suspended) {
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
        };
    }
}
