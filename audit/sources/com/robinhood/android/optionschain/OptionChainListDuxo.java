package com.robinhood.android.optionschain;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarState;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.OptionChainListViewState;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.GetActiveOptionInstrumentsForChainParams;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionChainListDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020\"J\u000e\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u00020\"J\u000e\u00105\u001a\u00020\"2\u0006\u00106\u001a\u000207J\u0014\u00108\u001a\u00020\"2\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:J\u000e\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>J\u0014\u0010?\u001a\u00020\"2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AJ\u000e\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020\u001dJ\u0010\u0010E\u001a\u00020\"2\b\u0010F\u001a\u0004\u0018\u00010GJ\u0010\u0010H\u001a\u00020\"2\b\u0010I\u001a\u0004\u0018\u00010JJ\u0006\u0010K\u001a\u00020\"J\u0006\u0010L\u001a\u00020\"J\u000e\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\u001dJ\u000e\u0010O\u001a\u00020\"2\u0006\u0010N\u001a\u00020\u001dJ\u000e\u0010P\u001a\u00020\"2\u0006\u0010N\u001a\u00020\u001dJ\u000e\u0010Q\u001a\u00020\"2\u0006\u0010N\u001a\u00020\u001dJ\u0010\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020JH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u001e\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\u001d0\u001d  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001f0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/optionschain/OptionChainListViewState;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Landroid/view/View;)V", "containerStartRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "containerScopeObs", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "onResume", "", "onContainerLifecycleChange", "started", "onOptionChainConfigurationChange", "config", "Lcom/robinhood/android/optionschain/OptionChainConfiguration;", "onConfigurationBundle", "bundle", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "setDiscoverZeroDteSnackbarState", "discoverZeroDteSnackbarState", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteSnackbarState;", "onRestoreScrollTarget", "restoredStoreTarget", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "clearConfigurationBundle", "scrollToTarget", "newTarget", "clearScrollTarget", "saveCurrentScrollPosition", "position", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "showUpsellHook", "upsellHookEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/optionschain/OptionChainViewState$UpsellHook;", "setAccount", "account", "Lcom/robinhood/models/db/Account;", "setFeatures", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "setMultilegAvailable", "multilegAvailable", "setDefaultPricingType", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "setOptionInstrumentToRollId", "optionInstrumentToRollId", "Ljava/util/UUID;", "setInitialInstrumentsLoaded", "refreshTradability", "setFragmentSelloutSnackbarDismissedOrElapsed", "enabled", "setIsSelloutSnackbarDismissalExperimentEnabled", "setInSelloutImprovementExperiment", "setSnackbarDismissalFollowUpExperiment", "onOptionQuoteLoaded", "chainId", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainListDuxo extends ViewDuxo<OptionChainListViewState> {
    public static final int $stable = 8;
    private final Observable<Boolean> containerScopeObs;
    private final BehaviorRelay<Boolean> containerStartRelay;
    private final QuoteStore equityQuoteStore;
    private final IndexStore indexStore;
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionMarketHoursStore optionMarketHoursStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionsWatchlistStore optionsWatchlistStore;
    private final PerformanceLogger performanceLogger;

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionChainListDuxo(QuoteStore equityQuoteStore, IndexStore indexStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionPositionStore optionPositionStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, PerformanceLogger performanceLogger, View hostView) {
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Scheduler scheduler = null;
        super(hostView, new OptionChainListViewState(null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, Integer.MAX_VALUE, null), scheduler, 4, null);
        this.equityQuoteStore = equityQuoteStore;
        this.indexStore = indexStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionPositionStore = optionPositionStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.performanceLogger = performanceLogger;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.containerStartRelay = behaviorRelayCreateDefault;
        this.containerScopeObs = behaviorRelayCreateDefault.distinctUntilChanged();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$optionConfigurationBundleObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionConfigurationBundle> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionConfigurationBundle());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<Boolean> containerScopeObs = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs, "containerScopeObs");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(ObservablesKt.connectWhen$default(map, containerScopeObs, null, 2, null)).distinctUntilChanged();
        Observable map2 = observableDistinctUntilChanged.map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$uiOptionChainObs$1
            @Override // io.reactivex.functions.Function
            public final Optional<UiOptionChain> apply(OptionConfigurationBundle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionChainBundle().getUiOptionChain());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNull(observableDistinctUntilChanged2);
        Observable<Boolean> containerScopeObs2 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs2, "containerScopeObs");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableDistinctUntilChanged2, containerScopeObs2, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$1(this.f$0, (UiOptionChain) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.optionMarketHoursStore.streamCurrentOrNextMarketDates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$3(this.f$0, (OptionCurrentOrNextMarketDates) obj);
            }
        });
        Observable<R> map3 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final Optional<OptionInstrument> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(CollectionsKt.firstOrNull((List) it.getOptionInstruments()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable<Boolean> containerScopeObs3 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs3, "containerScopeObs");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(ObservablesKt.connectWhen$default(map3, containerScopeObs3, null, 2, null)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$5(this.f$0, (OptionInstrument) obj);
            }
        });
        Observable<R> map4 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account account = ((OptionChainListViewState) it).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainListDuxo$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        final OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        Observable observableDistinctUntilChanged5 = observableDistinctUntilChanged4.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final Observable<OptionSettings.TradingOnExpirationState> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionSettingsStore.streamTradeOnExpirationState(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$8(this.f$0, (OptionSettings.TradingOnExpirationState) obj);
            }
        });
        Observable<R> map5 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionChainListViewState optionChainListViewState = (OptionChainListViewState) it;
                List<String> strategyCodes = optionChainListViewState.getStrategyCodes();
                return Optional3.asOptional(strategyCodes != null ? Tuples4.m3642to(strategyCodes, Boolean.valueOf(optionChainListViewState.getWatchlistActionsAvailable())) : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainListDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map5).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.9
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<OptionWatchlistItemState>> apply(Tuples2<? extends List<String>, Boolean> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                List<String> listComponent1 = tuples2.component1();
                if (tuples2.component2().booleanValue()) {
                    return OptionChainListDuxo.this.optionsWatchlistStore.streamWatchlistItemStates(listComponent1);
                }
                List<String> list = listComponent1;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str : list) {
                    arrayList.add(OptionWatchlistItemState.NOT_AVAILABLE);
                }
                Observable observableJust = Observable.just(arrayList);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged6, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$12(this.f$0, (List) obj);
            }
        });
        Observable<List<OptionChainSelectedMetrics>> observableDistinctUntilChanged7 = this.optionChainCustomizationStore.getStreamChainSelectedMetrics().asObservable(Unit.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$16(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.12
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<OptionInstrument>> apply(OptionConfigurationBundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                return OptionChainListDuxo.this.optionInstrumentStore.getTradeableOptionInstruments(bundle.getOptionChainBundle().getOptionChainId(), bundle.getOptionContractType(), bundle.getExpirationDate());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable<Boolean> containerScopeObs4 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs4, "containerScopeObs");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap, containerScopeObs4, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$18(this.f$0, (List) obj);
            }
        });
        Observable observableSwitchMap2 = observableDistinctUntilChanged2.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.14
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UUID, Map<UUID, OptionInstrumentQuote>>> apply(UiOptionChain uiOptionChain) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                final UUID id = uiOptionChain.getOptionChain().getId();
                Observable<R> map6 = OptionChainListDuxo.this.optionQuoteStore.getQuotesForOptionSymbol(id).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.14.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UUID, List<OptionInstrumentQuote>> apply(List<OptionInstrumentQuote> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Tuples4.m3642to(id, it);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
                Observable observable = OptionChainListDuxo.this.containerScopeObs;
                Intrinsics.checkNotNullExpressionValue(observable, "access$getContainerScopeObs$p(...)");
                return ObservablesKt.connectWhen$default(map6, observable, null, 2, null).throttleLatest(1000L, TimeUnit.MILLISECONDS, Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.14.2
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<UUID, Map<UUID, OptionInstrumentQuote>> apply(Tuples2<UUID, ? extends List<OptionInstrumentQuote>> tuples2) {
                        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                        UUID uuidComponent1 = tuples2.component1();
                        List<OptionInstrumentQuote> listComponent2 = tuples2.component2();
                        Intrinsics.checkNotNullExpressionValue(listComponent2, "component2(...)");
                        List<OptionInstrumentQuote> list = listComponent2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((OptionInstrumentQuote) t).getOptionInstrumentId(), t);
                        }
                        return Tuples4.m3642to(uuidComponent1, linkedHashMap);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$20(this.f$0, (Tuples2) obj);
            }
        });
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        Observable<Boolean> containerScopeObs5 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs5, "containerScopeObs");
        Observable observableSwitchMap3 = ObservablesKt.connectWhen$default(observableDistinctUntilChanged, containerScopeObs5, null, 2, null).filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.16
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionConfigurationBundle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionChainBundle().getUiOptionChain().getUnderlyingType() == OptionChain.UnderlyingType.EQUITY;
            }
        }).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.17
            @Override // io.reactivex.functions.Function
            public final Optional<UUID> apply(OptionConfigurationBundle it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionChainBundle().getEquityInstrumentId());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.18
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Quote>> apply(Optional<UUID> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                UUID uuidComponent1 = optional.component1();
                if (uuidComponent1 != null) {
                    Observable<Quote> observableAsObservable = OptionChainListDuxo.this.equityQuoteStore.getStreamQuote().asObservable(uuidComponent1);
                    final Optional.Companion companion = Optional.INSTANCE;
                    return observableAsObservable.map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.18.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<Quote> apply(Quote quote) {
                            return companion.m2972of(quote);
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$22(this.f$0, (Optional) obj);
            }
        });
        Observable<Boolean> containerScopeObs6 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs6, "containerScopeObs");
        Observable map6 = ObservablesKt.connectWhen$default(observableDistinctUntilChanged2, containerScopeObs6, null, 2, null).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((UiOptionChain) it).getIndexUnderlyingId());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainListDuxo$onResume$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableSwitchMap4 = ObservablesKt.filterIsPresent(map6).switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.21
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends IndexValue> apply(UUID indexUnderlyingId) {
                Intrinsics.checkNotNullParameter(indexUnderlyingId, "indexUnderlyingId");
                OptionChainListDuxo optionChainListDuxo = OptionChainListDuxo.this;
                return optionChainListDuxo.asObservable(optionChainListDuxo.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexUnderlyingId)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$25(this.f$0, (IndexValue) obj);
            }
        });
        Observable<R> map7 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$onResume$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account account = ((OptionChainListViewState) it).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainListDuxo$onResume$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableDistinctUntilChanged8 = ObservablesKt.filterIsPresent(map7).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        Observable observableSwitchMap5 = observableDistinctUntilChanged8.switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.24
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Map<UUID, UiOptionPositionCounts>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                OptionPositionStore.refresh$default(OptionChainListDuxo.this.optionPositionStore, false, (UUID) null, accountNumber, 2, (Object) null);
                return OptionChainListDuxo.this.optionPositionStore.getOptionPositionCountsByInstrument(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        Observable<Boolean> containerScopeObs7 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs7, "containerScopeObs");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap5, containerScopeObs7, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$28(this.f$0, (Map) obj);
            }
        });
        Observable<Boolean> containerScopeObs8 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs8, "containerScopeObs");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableDistinctUntilChanged, containerScopeObs8, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$29(this.f$0, (OptionConfigurationBundle) obj);
            }
        });
        Observable<R> map8 = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.27
            @Override // io.reactivex.functions.Function
            public final Optional<List<OptionInstrument>> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionInstruments());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map8);
        Observable<Boolean> containerScopeObs9 = this.containerScopeObs;
        Intrinsics.checkNotNullExpressionValue(containerScopeObs9, "containerScopeObs");
        Observable observableSwitchMap6 = ObservablesKt.connectWhen$default(observableFilterIsPresent, containerScopeObs9, null, 2, null).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.onResume.28
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(List<OptionInstrument> optionInstruments) {
                Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
                if (!optionInstruments.isEmpty()) {
                    OptionQuoteStore optionQuoteStore = OptionChainListDuxo.this.optionQuoteStore;
                    List<OptionInstrument> list = optionInstruments;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((OptionInstrument) it.next()).getId());
                    }
                    return optionQuoteStore.pollQuotes(arrayList);
                }
                return Observable.empty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap6, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap6, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OptionChainListDuxo optionChainListDuxo, final UiOptionChain uiOptionChain) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$1$lambda$0(uiOptionChain, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$1$lambda$0(UiOptionChain uiOptionChain, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, uiOptionChain, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483391, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OptionChainListDuxo optionChainListDuxo, final OptionCurrentOrNextMarketDates dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$3$lambda$2(dates, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$3$lambda$2(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, optionCurrentOrNextMarketDates, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483645, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(OptionChainListDuxo optionChainListDuxo, final OptionInstrument optionInstrument) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$5$lambda$4(optionInstrument, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$5$lambda$4(OptionInstrument optionInstrument, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, optionInstrument.getSelloutDatetime(), null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147450879, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OptionChainListDuxo optionChainListDuxo, final OptionSettings.TradingOnExpirationState tradingOnExpirationState) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$8$lambda$7(tradingOnExpirationState, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$8$lambda$7(OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, tradingOnExpirationState, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147418111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(OptionChainListDuxo optionChainListDuxo, final List list) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$12$lambda$11(list, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$12$lambda$11(List list, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, false, false, false, false, 2139095039, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(OptionChainListDuxo optionChainListDuxo, List list) {
        Intrinsics.checkNotNull(list);
        List<OptionChainSelectedMetrics> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final OptionChainSelectedMetrics optionChainSelectedMetrics : list2) {
            String id = optionChainSelectedMetrics.getId();
            if (Intrinsics.areEqual(id, OrderSide.BUY.getServerValue())) {
                optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainListDuxo.onResume$lambda$16$lambda$15$lambda$13(optionChainSelectedMetrics, (OptionChainListViewState) obj);
                    }
                });
            } else if (Intrinsics.areEqual(id, OrderSide.SELL.getServerValue())) {
                optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainListDuxo.onResume$lambda$16$lambda$15$lambda$14(optionChainSelectedMetrics, (OptionChainListViewState) obj);
                    }
                });
            }
            arrayList.add(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$16$lambda$15$lambda$13(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionChainSelectedMetrics, null, null, false, false, false, false, 2130706431, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$16$lambda$15$lambda$14(OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionChainSelectedMetrics, null, false, false, false, false, 2113929215, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(OptionChainListDuxo optionChainListDuxo, final List list) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$18$lambda$17(list, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$18$lambda$17(List list, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147481599, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$20(OptionChainListDuxo optionChainListDuxo, Tuples2 tuples2) {
        UUID uuid = (UUID) tuples2.component1();
        final Map map = (Map) tuples2.component2();
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$20$lambda$19(map, (OptionChainListViewState) obj);
            }
        });
        optionChainListDuxo.onOptionQuoteLoaded(uuid);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$20$lambda$19(Map map, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, map, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147467263, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$22(OptionChainListDuxo optionChainListDuxo, Optional optional) {
        final Quote quote = (Quote) optional.component1();
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$22$lambda$21(quote, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$22$lambda$21(Quote quote, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, quote, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483643, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$25(OptionChainListDuxo optionChainListDuxo, final IndexValue indexValue) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$25$lambda$24(indexValue, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$25$lambda$24(IndexValue indexValue, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, indexValue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483519, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$28(OptionChainListDuxo optionChainListDuxo, final Map map) {
        optionChainListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onResume$lambda$28$lambda$27(map, (OptionChainListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onResume$lambda$28$lambda$27(Map map, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(map);
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, map, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147475455, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$29(OptionChainListDuxo optionChainListDuxo, OptionConfigurationBundle optionConfigurationBundle) {
        optionChainListDuxo.optionInstrumentStore.getGetActiveOptionInstrumentsForChain().refreshAllPages(new GetActiveOptionInstrumentsForChainParams(optionConfigurationBundle.getOptionChainBundle().getOptionChainId(), optionConfigurationBundle.getOptionContractType(), optionConfigurationBundle.getExpirationDate()), false);
        return Unit.INSTANCE;
    }

    public final void onContainerLifecycleChange(boolean started) {
        this.containerStartRelay.accept(Boolean.valueOf(started));
    }

    public final void onOptionChainConfigurationChange(final OptionChainConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onOptionChainConfigurationChange$lambda$30(config, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onOptionChainConfigurationChange$lambda$30(OptionChainConfiguration optionChainConfiguration, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, optionChainConfiguration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483135, null);
    }

    public final void onConfigurationBundle(final OptionConfigurationBundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onConfigurationBundle$lambda$32(bundle, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final OptionChainListViewState onConfigurationBundle$lambda$32(OptionConfigurationBundle optionConfigurationBundle, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (Intrinsics.areEqual(optionConfigurationBundle, applyMutation.getOptionConfigurationBundle())) {
            return applyMutation;
        }
        if (optionConfigurationBundle.differsOnlyBySide(applyMutation.getOptionConfigurationBundle())) {
            return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, optionConfigurationBundle, CollectionsKt.emptyList(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147480575, null);
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (optionConfigurationBundle.differsOnlyByType(applyMutation.getOptionConfigurationBundle())) {
            List listEmptyList = CollectionsKt.emptyList();
            OptionChainListViewState.ScrollTarget currentScrollPosition = applyMutation.getCurrentScrollPosition();
            if (currentScrollPosition == null) {
                currentScrollPosition = new OptionChainListViewState.ScrollTarget.UnderlyingQuote(false);
            }
            return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, optionConfigurationBundle, listEmptyList, null, null, null, null, null, null, new OptionChainListViewState.PendingScrollTarget(currentScrollPosition, applyMutation.getCurrentScrollPosition() != null ? Integer.valueOf(applyMutation.getOptionInstruments().size()) : null), null, null, null, null, null, null, null, null, false, false, false, false, 2147218431, null);
        }
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, optionConfigurationBundle, CollectionsKt.emptyList(), null, null, null, null, null, null, new OptionChainListViewState.PendingScrollTarget(new OptionChainListViewState.ScrollTarget.UnderlyingQuote(false), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, false, false, 2147218431, null);
    }

    public final void setDiscoverZeroDteSnackbarState(final OptionDiscoverZeroDteSnackbarState discoverZeroDteSnackbarState) {
        Intrinsics.checkNotNullParameter(discoverZeroDteSnackbarState, "discoverZeroDteSnackbarState");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setDiscoverZeroDteSnackbarState$lambda$33(discoverZeroDteSnackbarState, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setDiscoverZeroDteSnackbarState$lambda$33(OptionDiscoverZeroDteSnackbarState optionDiscoverZeroDteSnackbarState, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionDiscoverZeroDteSnackbarState, false, false, false, false, 2080374783, null);
    }

    public final void onRestoreScrollTarget(final OptionChainListViewState.ScrollTarget restoredStoreTarget) {
        Intrinsics.checkNotNullParameter(restoredStoreTarget, "restoredStoreTarget");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.onRestoreScrollTarget$lambda$34(restoredStoreTarget, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState onRestoreScrollTarget$lambda$34(OptionChainListViewState.ScrollTarget scrollTarget, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return !(applyMutation.getScrollTarget() instanceof OptionChainListViewState.ScrollTarget.InstrumentId) ? applyMutation.mutateWithScrollTarget(scrollTarget) : applyMutation;
    }

    public final void clearConfigurationBundle() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.clearConfigurationBundle$lambda$35((OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState clearConfigurationBundle$lambda$35(OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147482623, null);
    }

    public final void scrollToTarget(final OptionChainListViewState.ScrollTarget newTarget) {
        Intrinsics.checkNotNullParameter(newTarget, "newTarget");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.scrollToTarget$lambda$36(newTarget, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState scrollToTarget$lambda$36(OptionChainListViewState.ScrollTarget scrollTarget, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.mutateWithScrollTarget(scrollTarget);
    }

    public final void clearScrollTarget() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.clearScrollTarget$lambda$37((OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState clearScrollTarget$lambda$37(OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2143944703, null);
    }

    public final void saveCurrentScrollPosition(final OptionChainListViewState.ScrollTarget.PositionWithOffset position) {
        Intrinsics.checkNotNullParameter(position, "position");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.saveCurrentScrollPosition$lambda$38(position, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState saveCurrentScrollPosition$lambda$38(OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, positionWithOffset, null, null, null, null, null, null, null, false, false, false, false, 2146959359, null);
    }

    public final void showUpsellHook(final UiEvent<OptionChainViewState.UpsellHook> upsellHookEvent) {
        Intrinsics.checkNotNullParameter(upsellHookEvent, "upsellHookEvent");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.showUpsellHook$lambda$39(upsellHookEvent, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState showUpsellHook$lambda$39(UiEvent uiEvent, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, uiEvent, null, null, null, null, false, false, false, false, 2143289343, null);
    }

    public final void setAccount(final Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setAccount$lambda$40(account, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setAccount$lambda$40(Account account, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, account, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483646, null);
    }

    public final void setFeatures(final Set<? extends OptionChainLaunchMode.Feature> featureSet) {
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setFeatures$lambda$41(featureSet, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setFeatures$lambda$41(Set set, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, set, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483631, null);
    }

    public final void setMultilegAvailable(final boolean multilegAvailable) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setMultilegAvailable$lambda$42(multilegAvailable, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setMultilegAvailable$lambda$42(boolean z, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, z, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483615, null);
    }

    public final void setDefaultPricingType(final OptionSettings.DefaultPricingSetting defaultPricingType) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setDefaultPricingType$lambda$43(defaultPricingType, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setDefaultPricingType$lambda$43(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, defaultPricingSetting, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483639, null);
    }

    public final void setOptionInstrumentToRollId(final UUID optionInstrumentToRollId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setOptionInstrumentToRollId$lambda$44(optionInstrumentToRollId, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setOptionInstrumentToRollId$lambda$44(UUID uuid, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, uuid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147479551, null);
    }

    public final void setInitialInstrumentsLoaded() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setInitialInstrumentsLoaded$lambda$45((OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r0.intValue() != r2) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OptionChainListViewState setInitialInstrumentsLoaded$lambda$45(OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getPendingScrollTarget() != null) {
            if (applyMutation.getPendingScrollTarget().getExpectedNumInstruments() != null) {
                Integer expectedNumInstruments = applyMutation.getPendingScrollTarget().getExpectedNumInstruments();
                int size = applyMutation.getOptionInstruments().size();
                if (expectedNumInstruments != null) {
                }
            }
            return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, true, null, null, null, null, null, null, null, null, null, null, applyMutation.getPendingScrollTarget().getTarget(), null, null, null, null, null, null, null, null, null, false, false, false, false, 2147352511, null);
        }
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 2147483583, null);
    }

    public final void refreshTradability() {
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo.refreshTradability.1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionConfigurationBundle> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionConfigurationBundle());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.refreshTradability$lambda$46(this.f$0, (OptionConfigurationBundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshTradability$lambda$46(OptionChainListDuxo optionChainListDuxo, OptionConfigurationBundle optionConfigurationBundle) {
        optionChainListDuxo.optionInstrumentStore.refreshChainByExpiration(true, optionConfigurationBundle.getOptionChainBundle().getOptionChainId(), optionConfigurationBundle.getExpirationDate());
        return Unit.INSTANCE;
    }

    public final void setFragmentSelloutSnackbarDismissedOrElapsed(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setFragmentSelloutSnackbarDismissedOrElapsed$lambda$47(enabled, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setFragmentSelloutSnackbarDismissedOrElapsed$lambda$47(boolean z, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z, false, false, false, 2013265919, null);
    }

    public final void setIsSelloutSnackbarDismissalExperimentEnabled(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setIsSelloutSnackbarDismissalExperimentEnabled$lambda$48(enabled, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setIsSelloutSnackbarDismissalExperimentEnabled$lambda$48(boolean z, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, z, false, false, 1879048191, null);
    }

    public final void setInSelloutImprovementExperiment(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setInSelloutImprovementExperiment$lambda$49(enabled, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setInSelloutImprovementExperiment$lambda$49(boolean z, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, z, false, 1610612735, null);
    }

    public final void setSnackbarDismissalFollowUpExperiment(final boolean enabled) {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListDuxo.setSnackbarDismissalFollowUpExperiment$lambda$50(enabled, (OptionChainListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainListViewState setSnackbarDismissalFollowUpExperiment$lambda$50(boolean z, OptionChainListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionChainListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, z, 1073741823, null);
    }

    private final void onOptionQuoteLoaded(UUID chainId) {
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_CHAIN_ITEMS_LOADED, false);
        PerformanceLogger performanceLogger = this.performanceLogger;
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN, chainId);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_CONTRACT_TYPE, chainId);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_EXPIRATION_DATE, chainId);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_CHAIN_DIFFERENT_SIDE, chainId);
        performanceLogger.completeMetric(PerformanceMetricEventData.Name.OPTIONS_CONTRACT_DATE_CONTRACTS, chainId);
    }
}
