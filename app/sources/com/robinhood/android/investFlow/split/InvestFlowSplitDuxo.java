package com.robinhood.android.investFlow.split;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider;
import com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProviderFactory;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.investFlow.InvestFlowExtensions;
import com.robinhood.android.investFlow.split.InvestFlowSplitViewState;
import com.robinhood.android.investFlow.utils.AssetAllocationUtils;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionsSortType;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: InvestFlowSplitDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001-B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010*\u001a\u00020\u0017J\u0010\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "allocationProviderFactory", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProviderFactory;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sortPreferenceRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "onCreate", "", "onResume", "setCustomAssetAllocations", "customAssetAllocations", "", "Ljava/util/UUID;", "Lcom/robinhood/models/util/Money;", "confirmAssetAllocations", "overrideOrderTotalAmount", "", "reset", "logAlertDisappear", "type", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState$PriceAlertType;", "updateFrequency", "frequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "logBottomSheetAppear", "logAlertAppear", "logBottomSheetDisappear", AnalyticsStrings.BUTTON_LIST_SORT, "sortPreference", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowSplitDuxo extends OldBaseDuxo<InvestFlowSplitViewState> implements HasSavedState {
    private final InvestFlowAllocationProviderFactory allocationProviderFactory;
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final SavedStateHandle savedStateHandle;
    private final BehaviorRelay<Optional<PositionsSortPreference>> sortPreferenceRelay;
    private final UnifiedAccountStore unifiedAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvestFlowSplitDuxo(InstrumentStore instrumentStore, EventLogger eventLogger, InvestFlowAllocationProviderFactory allocationProviderFactory, UnifiedAccountStore unifiedAccountStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(allocationProviderFactory, "allocationProviderFactory");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InvestFlowSplitViewState(((InvestFlowSplitArgs) companion.getArgs(savedStateHandle)).getTotalAmount(), ((InvestFlowSplitArgs) companion.getArgs(savedStateHandle)).getSelectedFrequency(), ((InvestFlowSplitArgs) companion.getArgs(savedStateHandle)).isCrypto(), null, null, null, null, null, null, null, null, null, null, null, 16376, null), null, 2, null);
        this.instrumentStore = instrumentStore;
        this.eventLogger = eventLogger;
        this.allocationProviderFactory = allocationProviderFactory;
        this.unifiedAccountStore = unifiedAccountStore;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Optional<PositionsSortPreference>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.sortPreferenceRelay = behaviorRelayCreateDefault;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.sortPreferenceRelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InvestFlowSplitDuxo investFlowSplitDuxo, Optional optional) {
        final PositionsSortPreference positionsSortPreference = (PositionsSortPreference) optional.component1();
        investFlowSplitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onCreate$lambda$1$lambda$0(positionsSortPreference, (InvestFlowSplitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState onCreate$lambda$1$lambda$0(PositionsSortPreference positionsSortPreference, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : positionsSortPreference, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        InvestFlowAllocationProviderFactory investFlowAllocationProviderFactory = this.allocationProviderFactory;
        Companion companion = INSTANCE;
        final InvestFlowAllocationProvider investFlowAllocationProviderCreateProvider = investFlowAllocationProviderFactory.createProvider(((InvestFlowSplitArgs) companion.getArgs((HasSavedState) this)).getAllocationStrategy());
        final Observable<List<Instrument>> instruments = this.instrumentStore.getInstruments(((InvestFlowSplitArgs) companion.getArgs((HasSavedState) this)).getManifest().getInstrumentIds());
        Observable<List<Instrument>> observableDistinctUntilChanged = instruments.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$3(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = instruments.switchMapSingle(new Function() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Map<Instrument, Money>> apply(List<Instrument> instruments2) {
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                return investFlowAllocationProviderCreateProvider.getSplit(((InvestFlowSplitArgs) InvestFlowSplitDuxo.INSTANCE.getArgs((HasSavedState) this)).getTotalAmount(), instruments2);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$5(this.f$0, (Map) obj);
            }
        });
        Observable<R> observableSwitchMap = this.sortPreferenceRelay.switchMap(new Function() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Map<UUID, String>> apply(Optional<PositionsSortPreference> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                PositionsSortPreference positionsSortPreferenceComponent1 = optional.component1();
                String sortQuery = positionsSortPreferenceComponent1 != null ? positionsSortPreferenceComponent1.getSortQuery() : null;
                if (Intrinsics.areEqual(sortQuery, PositionsSortType.SYMBOL.getServerValue())) {
                    return instruments.map(new Function() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo.onResume.4.1
                        @Override // io.reactivex.functions.Function
                        public final Map<UUID, String> apply(List<Instrument> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            List<Instrument> list = it;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                            for (Instrument instrument : list) {
                                Tuples2 tuples2M3642to = Tuples4.m3642to(instrument.getId(), instrument.getName());
                                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                            }
                            return linkedHashMap;
                        }
                    });
                }
                if (!Intrinsics.areEqual(sortQuery, PositionsSortType.YOUR_EQUITY.getServerValue()) && !Intrinsics.areEqual(sortQuery, PositionsSortType.LAST_PRICE.getServerValue())) {
                    return Observable.just(MapsKt.emptyMap());
                }
                return Observable.just(MapsKt.emptyMap());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$7(this.f$0, (Map) obj);
            }
        });
        if (((InvestFlowSplitArgs) companion.getArgs((HasSavedState) this)).getTotalAmount() == null) {
            this.unifiedAccountStore.refresh(true);
            LifecycleHost.DefaultImpls.bind$default(this, this.unifiedAccountStore.streamAccount(((InvestFlowSplitArgs) companion.getArgs((HasSavedState) this)).getAccountNumber()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InvestFlowSplitDuxo.onResume$lambda$9(this.f$0, (Optional) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(InvestFlowSplitDuxo investFlowSplitDuxo, final List list) {
        investFlowSplitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$3$lambda$2(list, (InvestFlowSplitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState onResume$lambda$3$lambda$2(List list, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : list, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(InvestFlowSplitDuxo investFlowSplitDuxo, final Map map) {
        investFlowSplitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$5$lambda$4(map, (InvestFlowSplitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState onResume$lambda$5$lambda$4(Map map, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : new UiEvent(Unit.INSTANCE), (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : map, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(InvestFlowSplitDuxo investFlowSplitDuxo, final Map map) {
        investFlowSplitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$7$lambda$6(map, (InvestFlowSplitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState onResume$lambda$7$lambda$6(Map map, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : map, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(InvestFlowSplitDuxo investFlowSplitDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) optional.component1();
        investFlowSplitDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.onResume$lambda$9$lambda$8(unifiedAccountV2, (InvestFlowSplitViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState onResume$lambda$9$lambda$8(UnifiedAccountV2 unifiedAccountV2, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : unifiedAccountV2);
    }

    public final void setCustomAssetAllocations(final Map<UUID, Money> customAssetAllocations) {
        Intrinsics.checkNotNullParameter(customAssetAllocations, "customAssetAllocations");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.setCustomAssetAllocations$lambda$10(customAssetAllocations, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState setCustomAssetAllocations$lambda$10(Map map, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : map, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    public final void confirmAssetAllocations(final boolean overrideOrderTotalAmount) {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.confirmAssetAllocations$lambda$11(overrideOrderTotalAmount, this, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState confirmAssetAllocations$lambda$11(boolean z, InvestFlowSplitDuxo investFlowSplitDuxo, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (z) {
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : new UiEvent(AssetAllocationUtils.mapToApiAssetAllocations(applyMutation.getAssetAllocations(), applyMutation.isCrypto())), (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
        }
        if (applyMutation.getShowMinAlert()) {
            InvestFlowSplitViewState.PriceAlertType priceAlertType = InvestFlowSplitViewState.PriceAlertType.MIN;
            investFlowSplitDuxo.logAlertAppear(priceAlertType);
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : new UiEvent(priceAlertType), (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
        }
        if (applyMutation.getShowMaxAlert()) {
            InvestFlowSplitViewState.PriceAlertType priceAlertType2 = InvestFlowSplitViewState.PriceAlertType.MAX;
            investFlowSplitDuxo.logAlertAppear(priceAlertType2);
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : new UiEvent(priceAlertType2), (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
        }
        if (applyMutation.getShowNotEnoughBuyingPowerAlert()) {
            InvestFlowSplitViewState.PriceAlertType priceAlertType3 = InvestFlowSplitViewState.PriceAlertType.BUYING_POWER;
            investFlowSplitDuxo.logAlertAppear(priceAlertType3);
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : new UiEvent(priceAlertType3), (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
        }
        if (!applyMutation.getShowBottomSheet()) {
            return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : new UiEvent(AssetAllocationUtils.mapToApiAssetAllocations(applyMutation.getAssetAllocations(), applyMutation.isCrypto())), (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
        }
        investFlowSplitDuxo.logBottomSheetAppear();
        StringResource bannerText = applyMutation.getBannerText();
        Intrinsics.checkNotNull(bannerText);
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : new UiEvent(bannerText), (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState reset$lambda$12(InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : null, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : new UiEvent(Unit.INSTANCE), (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : MapsKt.emptyMap(), (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    public final void reset() {
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.reset$lambda$12((InvestFlowSplitViewState) obj);
            }
        });
    }

    public final void logAlertDisappear(final InvestFlowSplitViewState.PriceAlertType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Single<InvestFlowSplitViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.logAlertDisappear$lambda$14(this.f$0, type2, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAlertDisappear$lambda$14(InvestFlowSplitDuxo investFlowSplitDuxo, InvestFlowSplitViewState.PriceAlertType priceAlertType, InvestFlowSplitViewState investFlowSplitViewState) {
        EventLogger eventLogger = investFlowSplitDuxo.eventLogger;
        Screen screen = investFlowSplitViewState.getScreen();
        Component component = new Component(Component.ComponentType.ERROR_ALERT, InvestFlowSplitDuxo2.toLoggingString(priceAlertType), null, 4, null);
        int numSelectedInstruments = investFlowSplitViewState.getNumSelectedInstruments();
        Map<Instrument, Money> assetAllocations = investFlowSplitViewState.getAssetAllocations();
        ArrayList arrayList = new ArrayList(assetAllocations.size());
        Iterator<Map.Entry<Instrument, Money>> it = assetAllocations.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Basket(numSelectedInstruments, InvestFlowExtensions.toInvestFlowLoggingString(arrayList), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -262145, -1, -1, -1, 16383, null), 9, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestFlowSplitViewState updateFrequency$lambda$15(InvestFlowFrequency investFlowFrequency, InvestFlowSplitViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16375 & 1) != 0 ? applyMutation.totalAmount : null, (16375 & 2) != 0 ? applyMutation.selectedFrequency : investFlowFrequency, (16375 & 4) != 0 ? applyMutation.isCrypto : false, (16375 & 8) != 0 ? applyMutation.confirmUiEvent : null, (16375 & 16) != 0 ? applyMutation.alertUiEvent : null, (16375 & 32) != 0 ? applyMutation.resetUiEvent : null, (16375 & 64) != 0 ? applyMutation.requestInputFocusEvent : null, (16375 & 128) != 0 ? applyMutation.sortPreference : null, (16375 & 256) != 0 ? applyMutation.sortInfoMap : null, (16375 & 512) != 0 ? applyMutation.instrumentList : null, (16375 & 1024) != 0 ? applyMutation.bottomSheetUiEvent : null, (16375 & 2048) != 0 ? applyMutation.defaultAssetAllocations : null, (16375 & 4096) != 0 ? applyMutation.customAssetAllocations : null, (16375 & 8192) != 0 ? applyMutation.unifiedAccount : null);
    }

    public final void updateFrequency(final InvestFlowFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.updateFrequency$lambda$15(frequency, (InvestFlowSplitViewState) obj);
            }
        });
    }

    private final void logBottomSheetAppear() {
        Single<InvestFlowSplitViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.logBottomSheetAppear$lambda$17(this.f$0, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBottomSheetAppear$lambda$17(InvestFlowSplitDuxo investFlowSplitDuxo, InvestFlowSplitViewState investFlowSplitViewState) {
        EventLogger eventLogger = investFlowSplitDuxo.eventLogger;
        Screen screen = investFlowSplitViewState.getScreen();
        Component component = new Component(Component.ComponentType.BOTTOM_SHEET, InvestFlowConstants.Logging.ORDER_TOTAL_MISMATCH, null, 4, null);
        int numSelectedInstruments = investFlowSplitViewState.getNumSelectedInstruments();
        Map<Instrument, Money> assetAllocations = investFlowSplitViewState.getAssetAllocations();
        ArrayList arrayList = new ArrayList(assetAllocations.size());
        Iterator<Map.Entry<Instrument, Money>> it = assetAllocations.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Basket(numSelectedInstruments, InvestFlowExtensions.toInvestFlowLoggingString(arrayList), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -262145, -1, -1, -1, 16383, null), 9, null);
        return Unit.INSTANCE;
    }

    private final void logAlertAppear(final InvestFlowSplitViewState.PriceAlertType type2) {
        Single<InvestFlowSplitViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.logAlertAppear$lambda$19(this.f$0, type2, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAlertAppear$lambda$19(InvestFlowSplitDuxo investFlowSplitDuxo, InvestFlowSplitViewState.PriceAlertType priceAlertType, InvestFlowSplitViewState investFlowSplitViewState) {
        EventLogger eventLogger = investFlowSplitDuxo.eventLogger;
        Screen screen = investFlowSplitViewState.getScreen();
        Component component = new Component(Component.ComponentType.ERROR_ALERT, InvestFlowSplitDuxo2.toLoggingString(priceAlertType), null, 4, null);
        int numSelectedInstruments = investFlowSplitViewState.getNumSelectedInstruments();
        Map<Instrument, Money> assetAllocations = investFlowSplitViewState.getAssetAllocations();
        ArrayList arrayList = new ArrayList(assetAllocations.size());
        Iterator<Map.Entry<Instrument, Money>> it = assetAllocations.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Basket(numSelectedInstruments, InvestFlowExtensions.toInvestFlowLoggingString(arrayList), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -262145, -1, -1, -1, 16383, null), 9, null);
        return Unit.INSTANCE;
    }

    public final void logBottomSheetDisappear() {
        Single<InvestFlowSplitViewState> singleFirstOrError = getStates().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitDuxo.logBottomSheetDisappear$lambda$21(this.f$0, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBottomSheetDisappear$lambda$21(InvestFlowSplitDuxo investFlowSplitDuxo, InvestFlowSplitViewState investFlowSplitViewState) {
        EventLogger eventLogger = investFlowSplitDuxo.eventLogger;
        Screen screen = investFlowSplitViewState.getScreen();
        Component component = new Component(Component.ComponentType.ERROR_ALERT, InvestFlowConstants.Logging.ORDER_TOTAL_MISMATCH, null, 4, null);
        int numSelectedInstruments = investFlowSplitViewState.getNumSelectedInstruments();
        Map<Instrument, Money> assetAllocations = investFlowSplitViewState.getAssetAllocations();
        ArrayList arrayList = new ArrayList(assetAllocations.size());
        Iterator<Map.Entry<Instrument, Money>> it = assetAllocations.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, component, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Basket(numSelectedInstruments, InvestFlowExtensions.toInvestFlowLoggingString(arrayList), null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -262145, -1, -1, -1, 16383, null), 9, null);
        return Unit.INSTANCE;
    }

    public final void sort(PositionsSortPreference sortPreference) {
        this.sortPreferenceRelay.accept(Optional3.asOptional(sortPreference));
    }

    /* compiled from: InvestFlowSplitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitDuxo;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InvestFlowSplitDuxo, InvestFlowSplitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowSplitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InvestFlowSplitArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InvestFlowSplitArgs getArgs(InvestFlowSplitDuxo investFlowSplitDuxo) {
            return (InvestFlowSplitArgs) DuxoCompanion.DefaultImpls.getArgs(this, investFlowSplitDuxo);
        }
    }
}
