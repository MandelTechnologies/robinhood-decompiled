package com.robinhood.android.optionschain.chainsettings;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionChainSettingsFragmentKey;
import com.robinhood.android.options.optionsstring.sbschain.OptionSideBySideChainMetricStrings;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging3;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.OptionChainSettingsSwitchToSbsTooltipShownPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnPreTradeStore;
import com.robinhood.models.api.OptionSeenContext;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionChainSettingsTableMetricsUpdate;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.prefs.BooleanPreference;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: OptionChainSettingsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 N2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001NB{\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020&2\u0006\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020&2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020&¢\u0006\u0004\b8\u0010*J\r\u00109\u001a\u00020&¢\u0006\u0004\b9\u0010*J\u0015\u0010<\u001a\u00020&2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020&¢\u0006\u0004\b>\u0010*J\r\u0010?\u001a\u00020&¢\u0006\u0004\b?\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010CR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010DR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010GR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010IR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010JR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionSimulatedReturnPreTradeStore", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainSettingsSwitchToSbsTooltipShownPref", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;Landroid/content/res/Resources;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "Lcom/robinhood/models/db/OptionChainSettingsTableMetric;", "newTableMetrics", "", "updateTableMetricsFromUser", "(Ljava/util/List;)V", "onCreate", "()V", "", "enabled", "toggleSideBySideChain", "(Z)V", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "metric", "toggleTableMetric", "(Lcom/robinhood/models/db/OptionSideBySideChainMetric;Z)V", "", "startIndex", "targetIndex", "reorderEnabledTableMetrics", "(II)V", "setSettingsSwitchToSbsTooltipSeen", "dismissSettingsSwitchToSbsTooltip", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "chartType", "updatePnlChartType", "(Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;)V", "setSbsBidAskPriceLabelNuxShown", "setBidAskPriceLabelSettingShown", "Lj$/time/Clock;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "Landroid/content/res/Resources;", "Lcom/robinhood/prefs/BooleanPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsDuxo extends BaseDuxo<OptionChainSettingsDataState, OptionChainSettingsViewState> implements HasSavedState {
    private final Clock clock;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final OptionAccountSwitcherStore optionAccountSwitcherStore;
    private final OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore;
    private final OptionChainCustomizationStore optionChainCustomizationStore;
    private final BooleanPreference optionChainSettingsSwitchToSbsTooltipShownPref;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionSideBySideChainStore optionSideBySideChainStore;
    private final OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptionChainSettingsDuxo(Clock clock, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, Resources resources, @OptionChainSettingsSwitchToSbsTooltipShownPref BooleanPreference optionChainSettingsSwitchToSbsTooltipShownPref, OptionChainSettingsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(optionChainSettingsSwitchToSbsTooltipShownPref, "optionChainSettingsSwitchToSbsTooltipShownPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OptionChainSettingsDataState(null, null, false, null, null, null, null, null, ((OptionChainSettingsFragmentKey) companion.getArgs(savedStateHandle)).getSource(), ((OptionChainSettingsFragmentKey) companion.getArgs(savedStateHandle)).isFocusedToSbsTooltipDismissedAndGreenDotVisible(), false, false, null, null, false, false, false, 130303, null), stateProvider, duxoBundle);
        this.clock = clock;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionSimulatedReturnPreTradeStore = optionSimulatedReturnPreTradeStore;
        this.resources = resources;
        this.optionChainSettingsSwitchToSbsTooltipShownPref = optionChainSettingsSwitchToSbsTooltipShownPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Observable<String> observableTake;
        Companion companion = INSTANCE;
        if (((OptionChainSettingsFragmentKey) companion.getArgs((HasSavedState) this)).getAccountNumber() != null) {
            observableTake = Observable.just(((OptionChainSettingsFragmentKey) companion.getArgs((HasSavedState) this)).getAccountNumber());
        } else {
            observableTake = this.optionAccountSwitcherStore.streamActiveAccountNumber().take(1L);
        }
        Observable observableDistinctUntilChanged = observableTake.switchMap(new Function() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionSettings> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return OptionChainSettingsDuxo.this.optionSettingsStore.streamOptionSettings(accountNumber);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSettingsDuxo.onCreate$lambda$0(this.f$0, (OptionSettings) obj);
            }
        });
        Observable<List<OptionChainSelectedMetrics>> observableDistinctUntilChanged2 = this.optionChainCustomizationStore.getStreamChainSelectedMetrics().asObservable(Unit.INSTANCE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainSettingsDuxo.onCreate$lambda$2(this.f$0, (List) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C242664(observableTake, this, null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C242675(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C242686(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C242697(null));
        applyMutation(new C242708(null));
        this.optionSideBySideChainStore.recordChainSettingsShown();
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C242719(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2426410(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C2426511(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(OptionChainSettingsDuxo optionChainSettingsDuxo, OptionSettings optionSettings) {
        optionChainSettingsDuxo.applyMutation(new OptionChainSettingsDuxo2(optionSettings, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(OptionChainSettingsDuxo optionChainSettingsDuxo, List list) {
        Intrinsics.checkNotNull(list);
        List<OptionChainSelectedMetrics> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (OptionChainSelectedMetrics optionChainSelectedMetrics : list2) {
            String id = optionChainSelectedMetrics.getId();
            if (Intrinsics.areEqual(id, OrderSide.BUY.getServerValue())) {
                optionChainSettingsDuxo.applyMutation(new OptionChainSettingsDuxo3(optionChainSelectedMetrics, null));
            } else if (Intrinsics.areEqual(id, OrderSide.SELL.getServerValue())) {
                optionChainSettingsDuxo.applyMutation(new OptionChainSettingsDuxo4(optionChainSelectedMetrics, null));
            }
            arrayList.add(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4 */
    static final class C242664 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<String> $accountNumberObs;
        int label;
        final /* synthetic */ OptionChainSettingsDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242664(Observable<String> observable, OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super C242664> continuation) {
            super(2, continuation);
            this.$accountNumberObs = observable;
            this.this$0 = optionChainSettingsDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C242664(this.$accountNumberObs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242664) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<String> observableTake = this.$accountNumberObs.take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableTake), Integer.MAX_VALUE, null, 2, null);
                final StateFlow<OptionChainSettingsViewState> stateFlow = this.this$0.getStateFlow();
                Flow flowCombine = Operators.combine(flowBuffer$default, FlowKt.take(new Flow<OptionSeenContext>() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionSeenContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                OptionSeenContext userSeenContext = ((OptionChainSettingsViewState) obj).getUserSeenContext();
                                if (userSeenContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(userSeenContext, anonymousClass1) == coroutine_suspended) {
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
                }, 1));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lcom/robinhood/models/api/OptionSeenContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$2", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends OptionSeenContext>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends OptionSeenContext> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<String, ? extends OptionSeenContext>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<String, ? extends OptionSeenContext> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    String str = (String) tuples2.component1();
                    OptionSeenContext optionSeenContext = (OptionSeenContext) tuples2.component2();
                    PostEndpoint<Tuples2<OptionSeenContext, String>, Unit> recordOptionUserContextSeen = this.this$0.optionChainCustomizationDiscoveryStore.getRecordOptionUserContextSeen();
                    Tuples2 tuples2M3642to = Tuples4.m3642to(optionSeenContext, str);
                    this.label = 1;
                    if (PostEndpoint.DefaultImpls.post$default(recordOptionUserContextSeen, tuples2M3642to, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5 */
    static final class C242675 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C242675(Continuation<? super C242675> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242675 c242675 = OptionChainSettingsDuxo.this.new C242675(continuation);
            c242675.L$0 = obj;
            return c242675;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242675) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.optionSideBySideChainStore.streamIsInSideBySideChainNuxRevampExperiment());
                    C503871 c503871 = new C503871(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c503871, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inSbsNuxRevampExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503871 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionChainSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503871(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super C503871> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainSettingsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503871 c503871 = new C503871(this.this$0, continuation);
                    c503871.Z$0 = ((Boolean) obj).booleanValue();
                    return c503871;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C503871) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        boolean z = this.Z$0;
                        this.this$0.applyMutation(new C503881(z, (this.this$0.optionSideBySideChainStore.getSbsNuxRevampSettingsShown() || this.this$0.optionChainSettingsSwitchToSbsTooltipShownPref.get()) ? false : true, null));
                        if (z && (((OptionChainSettingsFragmentKey) OptionChainSettingsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getLaunchMode() instanceof OptionChainLaunchMode.Normal)) {
                            this.this$0.optionSideBySideChainStore.recordSbsNuxRevampSettingsShown();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* compiled from: OptionChainSettingsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503881 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                    final /* synthetic */ boolean $inSbsNuxRevampExperiment;
                    final /* synthetic */ boolean $shouldShowSettingsSwitchToSbsTooltip;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503881(boolean z, boolean z2, Continuation<? super C503881> continuation) {
                        super(2, continuation);
                        this.$inSbsNuxRevampExperiment = z;
                        this.$shouldShowSettingsSwitchToSbsTooltip = z2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503881 c503881 = new C503881(this.$inSbsNuxRevampExperiment, this.$shouldShowSettingsSwitchToSbsTooltip, continuation);
                        c503881.L$0 = obj;
                        return c503881;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                        return ((C503881) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, false, this.$inSbsNuxRevampExperiment, null, null, false, false, this.$shouldShowSettingsSwitchToSbsTooltip, 63487, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionChainSettingsDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionChainSettingsDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{Experiments.OptionsSbsBidAskSetting.INSTANCE}, false, null, 6, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionChainSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainSettingsDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionChainSettingsDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$5$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C503891 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C503891(boolean z, Continuation<? super C503891> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C503891 c503891 = new C503891(this.$inExperiment, continuation);
                        c503891.L$0 = obj;
                        return c503891;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                        return ((C503891) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, this.$inExperiment, false, null, null, false, false, false, 130047, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C503891(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6 */
    static final class C242686 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C242686(Continuation<? super C242686> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C242686(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242686) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionChainSettingsDuxo.this.optionSideBySideChainStore.streamOptionChainDisplayMode());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionChainDisplayMode", "Lcom/robinhood/models/ui/OptionChainDisplayMode;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainDisplayMode, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainDisplayMode optionChainDisplayMode, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainDisplayMode, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503901 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                final /* synthetic */ OptionChainDisplayMode $optionChainDisplayMode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainSettingsDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503901(OptionChainSettingsDuxo optionChainSettingsDuxo, OptionChainDisplayMode optionChainDisplayMode, Continuation<? super C503901> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainSettingsDuxo;
                    this.$optionChainDisplayMode = optionChainDisplayMode;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503901 c503901 = new C503901(this.this$0, this.$optionChainDisplayMode, continuation);
                    c503901.L$0 = obj;
                    return c503901;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                    return ((C503901) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionChainSettingsDataState optionChainSettingsDataState = (OptionChainSettingsDataState) this.L$0;
                    if (optionChainSettingsDataState.getOptionChainDisplayMode() == null && ((OptionChainSettingsFragmentKey) OptionChainSettingsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getFromSideBySideChain()) {
                        OptionSideBySideChainStore optionSideBySideChainStore = this.this$0.optionSideBySideChainStore;
                        OptionChainDisplayMode optionChainDisplayMode = OptionChainDisplayMode.SIDE_BY_SIDE;
                        optionSideBySideChainStore.setSharedPrefOptionChainDisplayMode(optionChainDisplayMode);
                        return OptionChainSettingsDataState.copy$default(optionChainSettingsDataState, null, null, false, null, null, null, null, null, null, false, false, false, optionChainDisplayMode, null, false, false, false, 126975, null);
                    }
                    return OptionChainSettingsDataState.copy$default(optionChainSettingsDataState, null, null, false, null, null, null, null, null, null, false, false, false, this.$optionChainDisplayMode, null, false, false, false, 126975, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OptionChainDisplayMode optionChainDisplayMode = (OptionChainDisplayMode) this.L$0;
                OptionChainSettingsDuxo optionChainSettingsDuxo = this.this$0;
                optionChainSettingsDuxo.applyMutation(new C503901(optionChainSettingsDuxo, optionChainDisplayMode, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7 */
    static final class C242697 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C242697(Continuation<? super C242697> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C242697(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242697) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<OptionChainSettingsTableMetricsUpdate> flowStreamOptionSettingsTableMetrics = OptionChainSettingsDuxo.this.optionSideBySideChainStore.streamOptionSettingsTableMetrics();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamOptionSettingsTableMetrics, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tableMetricsResponse", "Lcom/robinhood/models/db/OptionChainSettingsTableMetricsUpdate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsTableMetricsUpdate, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsTableMetricsUpdate, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503911 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                final /* synthetic */ OptionChainSettingsTableMetricsUpdate $tableMetricsResponse;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503911(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super C503911> continuation) {
                    super(2, continuation);
                    this.$tableMetricsResponse = optionChainSettingsTableMetricsUpdate;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503911 c503911 = new C503911(this.$tableMetricsResponse, continuation);
                    c503911.L$0 = obj;
                    return c503911;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                    return ((C503911) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    OptionChainSettingsDataState optionChainSettingsDataState = (OptionChainSettingsDataState) this.L$0;
                    return this.$tableMetricsResponse.getUpdateTimestamp() > optionChainSettingsDataState.getTableMetricUpdate().getUpdateTimestamp() ? OptionChainSettingsDataState.copy$default(optionChainSettingsDataState, null, null, false, null, null, null, null, this.$tableMetricsResponse, null, false, false, false, null, null, false, false, false, 130943, null) : optionChainSettingsDataState;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503911((OptionChainSettingsTableMetricsUpdate) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$8", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$8 */
    static final class C242708 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C242708(Continuation<? super C242708> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242708 c242708 = OptionChainSettingsDuxo.this.new C242708(continuation);
            c242708.L$0 = obj;
            return c242708;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
            return ((C242708) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, false, false, null, null, false, OptionChainSettingsDuxo.this.optionSideBySideChainStore.getSideBySideChainShown(), !OptionChainSettingsDuxo.this.optionChainSettingsSwitchToSbsTooltipShownPref.get(), 32767, null);
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9 */
    static final class C242719 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C242719(Continuation<? super C242719> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C242719(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242719) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionChainSettingsDuxo.this.optionSimulatedReturnPreTradeStore.streamOptionChainSettingsPnlChartType());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsPnlChartType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsPnlChartType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503921 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                final /* synthetic */ OptionChainSettingsPnlChartType $chartType;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503921(OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, Continuation<? super C503921> continuation) {
                    super(2, continuation);
                    this.$chartType = optionChainSettingsPnlChartType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503921 c503921 = new C503921(this.$chartType, continuation);
                    c503921.L$0 = obj;
                    return c503921;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                    return ((C503921) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, false, false, null, this.$chartType, false, false, false, 122879, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503921((OptionChainSettingsPnlChartType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {225}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10 */
    static final class C2426410 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2426410(Continuation<? super C2426410> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C2426410(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2426410) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionChainSettingsDuxo.this.optionSettingsStore.streamSideBySideBidAskPriceLabelSetting());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "type", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsSideBySideBidAskPriceLabelType, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$10$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503851 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                final /* synthetic */ OptionChainSettingsSideBySideBidAskPriceLabelType $type;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503851(OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, Continuation<? super C503851> continuation) {
                    super(2, continuation);
                    this.$type = optionChainSettingsSideBySideBidAskPriceLabelType;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503851 c503851 = new C503851(this.$type, continuation);
                    c503851.L$0 = obj;
                    return c503851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                    return ((C503851) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, this.$type, false, null, null, null, null, null, null, false, false, false, null, null, false, false, false, 131069, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503851((OptionChainSettingsSideBySideBidAskPriceLabelType) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11 */
    static final class C2426511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2426511(Continuation<? super C2426511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C2426511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2426511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(OptionChainSettingsDuxo.this.optionSettingsStore.streamSbsBidAskPriceLabelNuxShown());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainSettingsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shown", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainSettingsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainSettingsDuxo optionChainSettingsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainSettingsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionChainSettingsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$onCreate$11$1$1, reason: invalid class name and collision with other inner class name */
            static final class C503861 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
                final /* synthetic */ boolean $shown;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503861(boolean z, Continuation<? super C503861> continuation) {
                    super(2, continuation);
                    this.$shown = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503861 c503861 = new C503861(this.$shown, continuation);
                    c503861.L$0 = obj;
                    return c503861;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                    return ((C503861) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, this.$shown, null, null, null, null, null, null, false, false, false, null, null, false, false, false, 131067, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C503861(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void toggleSideBySideChain(boolean enabled) {
        OptionChainSettingsLogging.logChangeDisplayMode(this.eventLogger, enabled);
        this.optionSideBySideChainStore.toggleSideBySideChain(enabled);
    }

    public final void toggleTableMetric(OptionSideBySideChainMetric metric, boolean enabled) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        OptionChainSettingsViewState5 metricViewState = getStateFlow().getValue().getMetricViewState();
        OptionChainSettingsTableMetricViewState optionChainSettingsTableMetricViewState = metricViewState instanceof OptionChainSettingsTableMetricViewState ? (OptionChainSettingsTableMetricViewState) metricViewState : null;
        if (optionChainSettingsTableMetricViewState == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.plus((Collection) optionChainSettingsTableMetricViewState.getEnabledTableRows(), (Iterable) optionChainSettingsTableMetricViewState.getDisabledTableRows()));
        Iterator it = mutableList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((OptionChainSettingsTableMetricRowViewState) it.next()).getMetric() == metric) {
                break;
            } else {
                i++;
            }
        }
        OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState = (OptionChainSettingsTableMetricRowViewState) CollectionsKt.getOrNull(mutableList, i);
        if (optionChainSettingsTableMetricRowViewState == null || optionChainSettingsTableMetricRowViewState.getEnabled() == enabled) {
            return;
        }
        mutableList.set(i, OptionChainSettingsTableMetricRowViewState.copy$default(optionChainSettingsTableMetricRowViewState, null, enabled, 1, null));
        List list = mutableList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((OptionChainSettingsTableMetricRowViewState) obj).getEnabled()) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$toggleTableMetric$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(OptionSideBySideChainMetricStrings.getOptionSideBySideChainMetricLongString(((OptionChainSettingsTableMetricRowViewState) t).getMetric(), this.this$0.resources), OptionSideBySideChainMetricStrings.getOptionSideBySideChainMetricLongString(((OptionChainSettingsTableMetricRowViewState) t2).getMetric(), this.this$0.resources));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((OptionChainSettingsTableMetricRowViewState) obj2).getEnabled()) {
                arrayList2.add(obj2);
            }
        }
        List<OptionChainSettingsTableMetricRowViewState> listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) listSortedWith);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState2 : listPlus) {
            arrayList3.add(new OptionChainSettingsTableMetric(optionChainSettingsTableMetricRowViewState2.getMetric(), optionChainSettingsTableMetricRowViewState2.getEnabled()));
        }
        EventLogger eventLogger = this.eventLogger;
        OptionChainSettingsLogging3 optionChainSettingsLogging3 = OptionChainSettingsLogging3.TAP;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (((OptionChainSettingsTableMetric) obj3).getEnabled()) {
                arrayList4.add(obj3);
            }
        }
        OptionChainSettingsLogging.logChangeSbsChainMetrics(eventLogger, optionChainSettingsLogging3, arrayList4);
        updateTableMetricsFromUser(arrayList3);
    }

    public final void reorderEnabledTableMetrics(int startIndex, int targetIndex) {
        OptionChainSettingsViewState5 metricViewState = getStateFlow().getValue().getMetricViewState();
        OptionChainSettingsTableMetricViewState optionChainSettingsTableMetricViewState = metricViewState instanceof OptionChainSettingsTableMetricViewState ? (OptionChainSettingsTableMetricViewState) metricViewState : null;
        if (optionChainSettingsTableMetricViewState == null) {
            return;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) optionChainSettingsTableMetricViewState.getEnabledTableRows());
        if (startIndex == targetIndex || startIndex < 0 || startIndex >= mutableList.size() || targetIndex < 0 || targetIndex >= mutableList.size()) {
            return;
        }
        mutableList.add(targetIndex, (OptionChainSettingsTableMetricRowViewState) mutableList.remove(startIndex));
        List<OptionChainSettingsTableMetricRowViewState> listPlus = CollectionsKt.plus((Collection) mutableList, (Iterable) optionChainSettingsTableMetricViewState.getDisabledTableRows());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (OptionChainSettingsTableMetricRowViewState optionChainSettingsTableMetricRowViewState : listPlus) {
            arrayList.add(new OptionChainSettingsTableMetric(optionChainSettingsTableMetricRowViewState.getMetric(), optionChainSettingsTableMetricRowViewState.getEnabled()));
        }
        EventLogger eventLogger = this.eventLogger;
        OptionChainSettingsLogging3 optionChainSettingsLogging3 = OptionChainSettingsLogging3.REORDER;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((OptionChainSettingsTableMetric) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        OptionChainSettingsLogging.logChangeSbsChainMetrics(eventLogger, optionChainSettingsLogging3, arrayList2);
        updateTableMetricsFromUser(arrayList);
    }

    private final void updateTableMetricsFromUser(List<OptionChainSettingsTableMetric> newTableMetrics) {
        OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate = new OptionChainSettingsTableMetricsUpdate(newTableMetrics, Instant.now(this.clock).toEpochMilli());
        applyMutation(new C242731(optionChainSettingsTableMetricsUpdate, null));
        this.optionSideBySideChainStore.updateTableMetrics(optionChainSettingsTableMetricsUpdate);
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$updateTableMetricsFromUser$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$updateTableMetricsFromUser$1 */
    static final class C242731 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
        final /* synthetic */ OptionChainSettingsTableMetricsUpdate $update;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C242731(OptionChainSettingsTableMetricsUpdate optionChainSettingsTableMetricsUpdate, Continuation<? super C242731> continuation) {
            super(2, continuation);
            this.$update = optionChainSettingsTableMetricsUpdate;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242731 c242731 = new C242731(this.$update, continuation);
            c242731.L$0 = obj;
            return c242731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
            return ((C242731) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, this.$update, null, false, false, false, null, null, false, false, false, 130943, null);
        }
    }

    public final void setSettingsSwitchToSbsTooltipSeen() {
        this.optionChainSettingsSwitchToSbsTooltipShownPref.set(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C242721(null), 3, null);
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$setSettingsSwitchToSbsTooltipSeen$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {316}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$setSettingsSwitchToSbsTooltipSeen$1 */
    static final class C242721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C242721(Continuation<? super C242721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainSettingsDuxo.this.new C242721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C242721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(7, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionChainSettingsDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainSettingsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$setSettingsSwitchToSbsTooltipSeen$1$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$setSettingsSwitchToSbsTooltipSeen$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
                return ((AnonymousClass1) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, false, false, null, null, false, false, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
            }
        }
    }

    public final void dismissSettingsSwitchToSbsTooltip() {
        this.optionChainSettingsSwitchToSbsTooltipShownPref.set(true);
        applyMutation(new C242621(null));
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$dismissSettingsSwitchToSbsTooltip$1", m3645f = "OptionChainSettingsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDuxo$dismissSettingsSwitchToSbsTooltip$1 */
    static final class C242621 extends ContinuationImpl7 implements Function2<OptionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C242621(Continuation<? super C242621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C242621 c242621 = new C242621(continuation);
            c242621.L$0 = obj;
            return c242621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionChainSettingsDataState optionChainSettingsDataState, Continuation<? super OptionChainSettingsDataState> continuation) {
            return ((C242621) create(optionChainSettingsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionChainSettingsDataState.copy$default((OptionChainSettingsDataState) this.L$0, null, null, false, null, null, null, null, null, null, false, false, false, null, null, false, false, false, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        }
    }

    public final void updatePnlChartType(OptionChainSettingsPnlChartType chartType) {
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        OptionChainSettingsLogging.logToggleSimulatedReturnChartType(this.eventLogger, chartType);
        this.optionSimulatedReturnPreTradeStore.setOptionChainSettingsPnlChartType(chartType);
    }

    public final void setSbsBidAskPriceLabelNuxShown() {
        this.optionSettingsStore.setSbsBidAskPriceLabelNuxShown();
    }

    public final void setBidAskPriceLabelSettingShown() {
        this.optionSideBySideChainStore.setBidAskPriceLabelSettingsShown();
    }

    /* compiled from: OptionChainSettingsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDuxo;", "Lcom/robinhood/android/options/contracts/OptionChainSettingsFragmentKey;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionChainSettingsDuxo, OptionChainSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainSettingsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionChainSettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionChainSettingsFragmentKey getArgs(OptionChainSettingsDuxo optionChainSettingsDuxo) {
            return (OptionChainSettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionChainSettingsDuxo);
        }
    }
}
