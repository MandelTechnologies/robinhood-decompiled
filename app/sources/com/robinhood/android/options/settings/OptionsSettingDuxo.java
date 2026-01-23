package com.robinhood.android.options.settings;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.instant.p160ui.InstantCashLogger;
import com.robinhood.android.instant.p160ui.InstantCashLogger2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.options.contracts.OptionsSettingsFragmentKey;
import com.robinhood.android.options.contracts.OptionsSettingsFragmentKey2;
import com.robinhood.android.options.settings.ChangeOptionLevelState;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore;
import com.robinhood.librobinhood.data.store.OptionUpgradeStore2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsSettingDuxo.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0006\u0010\u001c\u001a\u00020\u001bJ\"\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!J\"\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!J\u0010\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'J\u0006\u0010(\u001a\u00020\u001bJ\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/options/settings/OptionsSettingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionUpgradeStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;", "instantCashLogger", "Lcom/robinhood/android/instant/ui/InstantCashLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradeStore;Lcom/robinhood/android/instant/ui/InstantCashLogger;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "forceRefreshExperiments", "toggleTradeOnExpiration", "newTradeOnExpirationSetting", "", "onError", "Lkotlin/Function1;", "", "toggleShortSelling", "checked", "downgradeOptionLevel", "optionLevel", "", "logLaunchMarginUpgrade", "logDismissEnableSpreads", "logSeenCashAccountFailureDialog", "Companion", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsSettingDuxo extends OldBaseDuxo<OptionsSettingViewState> implements HasSavedState {
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final ExperimentsStore experimentsStore;
    private final InstantCashLogger instantCashLogger;
    private final LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final OptionSettingsStore optionSettingsStore;
    private final OptionUpgradeStore optionUpgradeStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final ComponentHierarchy L3_UPGRADE_UNSUPPORTED_COMPONENT_HIERARCHY = new ComponentHierarchy(new Component(Component.ComponentType.INFO_BANNER, "l3_options_unsupported_in_cash_account", null, 4, null), null, null, null, null, 30, null);

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsSettingDuxo(AccountProvider accountProvider, AccountAccessStore accountAccessStore, ExperimentsStore experimentsStore, LeveredMarginSettingsStore leveredMarginSettingsStore, OptionSettingsStore optionSettingsStore, OptionUpgradeStore optionUpgradeStore, InstantCashLogger instantCashLogger, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(new OptionsSettingViewState(null, null, false, false, false, null, null, false, null, false, false, false, 4095, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "leveredMarginSettingsStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionUpgradeStore, "optionUpgradeStore");
        Intrinsics.checkNotNullParameter(instantCashLogger, "instantCashLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.accountAccessStore = accountAccessStore;
        this.experimentsStore = experimentsStore;
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionUpgradeStore = optionUpgradeStore;
        this.instantCashLogger = instantCashLogger;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        Observable<String> observableJust;
        super.onResume();
        OptionsSettingsFragmentKey2 accountInfo = ((OptionsSettingsFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getAccountInfo();
        if ((accountInfo instanceof OptionsSettingsFragmentKey2.AccountNumber) || accountInfo == null) {
            OptionsSettingsFragmentKey2.AccountNumber accountNumber = (OptionsSettingsFragmentKey2.AccountNumber) accountInfo;
            String accountNumber2 = accountNumber != null ? accountNumber.getAccountNumber() : null;
            if (accountNumber2 == null) {
                observableJust = this.accountProvider.streamIndividualAccountNumber();
            } else {
                observableJust = Observable.just(accountNumber2);
                Intrinsics.checkNotNull(observableJust);
            }
        } else {
            if (!(accountInfo instanceof OptionsSettingsFragmentKey2.AccountType)) {
                throw new NoWhenBranchMatchedException();
            }
            BrokerageAccountType brokerageAccountTypeFromServerValue = BrokerageAccountType.INSTANCE.fromServerValue(((OptionsSettingsFragmentKey2.AccountType) accountInfo).getAccountType());
            if (brokerageAccountTypeFromServerValue == null || brokerageAccountTypeFromServerValue == BrokerageAccountType.UNKNOWN) {
                observableJust = this.accountProvider.streamIndividualAccountNumber();
            } else {
                observableJust = RxFactory.DefaultImpls.rxObservable$default(this, null, new OptionsSettingDuxo2(this, brokerageAccountTypeFromServerValue, null), 1, null);
            }
        }
        this.accountProvider.refresh(false);
        Observable<R> map = this.accountProvider.streamAllSelfDirectedAccounts().map(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.size() > 1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        final AccountProvider accountProvider = this.accountProvider;
        Observable<R> observableSwitchMap = observableJust.switchMap(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final Observable<Account> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return accountProvider.streamAccount(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$3(this.f$0, (Account) obj);
            }
        });
        Observable<String> observableDistinctUntilChanged = observableJust.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$4(this.f$0, (String) obj);
            }
        });
        final OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        Observable<R> observableSwitchMap2 = observableJust.switchMap(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.onResume.6
            @Override // io.reactivex.functions.Function
            public final Observable<OptionSettings> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return optionSettingsStore.streamOptionSettings(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$6(this.f$0, (OptionSettings) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsMarginRoutingExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableDistinctUntilChanged2 = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{Experiments.OptionsSelloutImprovementExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$10(this.f$0, (Boolean) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged3 = ExperimentsKt.streamWithExperiment(this.regionGateProvider, this.experimentsStore, SubzeroRegionGate.INSTANCE, Experiments.OptionsShortSellingExercise.INSTANCE, true).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$12(this.f$0, (Boolean) obj);
            }
        });
        Observable<R> observableSwitchMap3 = observableJust.switchMap(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.onResume.11
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Set<AccountFeature>> apply(String accountNumber3) {
                Intrinsics.checkNotNullParameter(accountNumber3, "accountNumber");
                OptionsSettingDuxo optionsSettingDuxo = OptionsSettingDuxo.this;
                return optionsSettingDuxo.asObservable(optionsSettingDuxo.accountAccessStore.getAccessibleFeatures(accountNumber3));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$14(this.f$0, (Set) obj);
            }
        });
        Observable<R> observableSwitchMap4 = observableJust.switchMap(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.onResume.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarginSettings> apply(String accountNumber3) {
                Intrinsics.checkNotNullParameter(accountNumber3, "accountNumber");
                return OptionsSettingDuxo.this.leveredMarginSettingsStore.streamMarginSettings(accountNumber3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableSwitchMap4, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, LeveredMarginRegionGate.INSTANCE, false, 2, null), null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$16(this.f$0, (MarginSettings) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OptionsSettingDuxo optionsSettingDuxo, final Boolean bool) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$1$lambda$0(bool, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$1$lambda$0(Boolean bool, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OptionsSettingViewState.copy$default(applyMutation, null, null, bool.booleanValue(), false, false, null, null, false, null, false, false, false, 4091, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OptionsSettingDuxo optionsSettingDuxo, final Account account) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$3$lambda$2(account, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$3$lambda$2(Account account, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (account.isManaged()) {
            return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, null, new UiEvent(Unit.INSTANCE), false, null, false, false, false, 4031, null);
        }
        return OptionsSettingViewState.copy$default(applyMutation, account, null, false, false, false, null, null, false, null, false, false, false, 4094, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(OptionsSettingDuxo optionsSettingDuxo, String str) {
        OptionSettingsStore optionSettingsStore = optionsSettingDuxo.optionSettingsStore;
        Intrinsics.checkNotNull(str);
        optionSettingsStore.refresh(true, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(OptionsSettingDuxo optionsSettingDuxo, final OptionSettings optionSettings) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$6$lambda$5(optionSettings, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$6$lambda$5(OptionSettings optionSettings, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, optionSettings.getTradingOnExpirationState(), null, false, null, false, false, optionSettings.getShortSharesOnOptionEventsEnabled(), 2015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OptionsSettingDuxo optionsSettingDuxo, final boolean z) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$8$lambda$7(z, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$8$lambda$7(boolean z, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, z, false, null, null, false, null, false, false, false, 4087, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OptionsSettingDuxo optionsSettingDuxo, final Boolean bool) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$10$lambda$9(bool, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$10$lambda$9(Boolean bool, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, null, null, false, null, bool.booleanValue(), false, false, 3583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(OptionsSettingDuxo optionsSettingDuxo, final Boolean bool) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$12$lambda$11(bool, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$12$lambda$11(Boolean bool, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, null, null, false, null, false, bool.booleanValue(), false, 3071, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(OptionsSettingDuxo optionsSettingDuxo, final Set set) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$14$lambda$13(set, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$14$lambda$13(Set set, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, null, null, set.contains(AccountFeature.MARGIN), null, false, false, false, 3967, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(OptionsSettingDuxo optionsSettingDuxo, final MarginSettings marginSettings) {
        optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.onResume$lambda$16$lambda$15(marginSettings, (OptionsSettingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState onResume$lambda$16$lambda$15(MarginSettings marginSettings, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, false, null, null, false, marginSettings, false, false, false, 3839, null);
    }

    public final void forceRefreshExperiments() {
        this.experimentsStore.refresh(true);
    }

    public final void toggleTradeOnExpiration(final boolean newTradeOnExpirationSetting, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleTradeOnExpiration$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account account = ((OptionsSettingViewState) it).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionsSettingDuxo$toggleTradeOnExpiration$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Completable completableSwitchMapCompletable = ObservablesKt.filterIsPresent(map).take(1L).switchMapCompletable(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.toggleTradeOnExpiration.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(String resolvedAccountNumber) {
                Intrinsics.checkNotNullParameter(resolvedAccountNumber, "resolvedAccountNumber");
                return OptionsSettingDuxo.this.optionSettingsStore.toggleFridayTradingCompletable(resolvedAccountNumber, newTradeOnExpirationSetting);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, onError);
    }

    /* compiled from: OptionsSettingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1", m3645f = "OptionsSettingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1 */
    static final class C236851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $checked;
        final /* synthetic */ Function1<Throwable, Unit> $onError;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C236851(boolean z, Function1<? super Throwable, Unit> function1, Continuation<? super C236851> continuation) {
            super(2, continuation);
            this.$checked = z;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionsSettingDuxo.this.new C236851(this.$checked, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C236851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionsSettingViewState> statesFlow = OptionsSettingDuxo.this.getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<String>() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsSettingDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Account account = ((OptionsSettingViewState) obj).getAccount();
                                String accountNumber = account != null ? account.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(OptionsSettingDuxo.this, this.$checked, this.$onError, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OptionsSettingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$2", m3645f = "OptionsSettingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.settings.OptionsSettingDuxo$toggleShortSelling$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $checked;
            final /* synthetic */ Function1<Throwable, Unit> $onError;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionsSettingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(OptionsSettingDuxo optionsSettingDuxo, boolean z, Function1<? super Throwable, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsSettingDuxo;
                this.$checked = z;
                this.$onError = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$checked, this.$onError, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        String str = (String) this.L$0;
                        OptionSettingsStore optionSettingsStore = this.this$0.optionSettingsStore;
                        boolean z = this.$checked;
                        this.label = 1;
                        if (optionSettingsStore.toggleShortSelling(str, z, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    this.$onError.invoke(th);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void toggleShortSelling(boolean checked, Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C236851(checked, onError, null), 3, null);
    }

    public final void downgradeOptionLevel(final String optionLevel) {
        applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.downgradeOptionLevel$lambda$19((OptionsSettingViewState) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$downgradeOptionLevel$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account account = ((OptionsSettingViewState) it).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionsSettingDuxo$downgradeOptionLevel$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMap = ObservablesKt.filterIsPresent(map).take(1L).switchMap(new Function() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo.downgradeOptionLevel.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionUpgradeStore2> apply(String resolvedAccountNumber) {
                Intrinsics.checkNotNullParameter(resolvedAccountNumber, "resolvedAccountNumber");
                return OptionUpgradeStore.changeOptionLevelForResult$default(OptionsSettingDuxo.this.optionUpgradeStore, resolvedAccountNumber, optionLevel, true, null, 8, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        bind(observableSwitchMap, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsSettingDuxo.downgradeOptionLevel$lambda$24(this.f$0, optionLevel, (OptionUpgradeStore2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState downgradeOptionLevel$lambda$19(OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, null, false, false, true, null, null, false, null, false, false, false, 4077, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downgradeOptionLevel$lambda$24(OptionsSettingDuxo optionsSettingDuxo, final String str, final OptionUpgradeStore2 optionUpgradeStore2) {
        if (optionUpgradeStore2 instanceof OptionUpgradeStore2.Pending) {
            optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSettingDuxo.downgradeOptionLevel$lambda$24$lambda$21(str, (OptionsSettingViewState) obj);
                }
            });
        } else if (optionUpgradeStore2 instanceof OptionUpgradeStore2.Success) {
            optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSettingDuxo.downgradeOptionLevel$lambda$24$lambda$22(str, (OptionsSettingViewState) obj);
                }
            });
        } else {
            if (!(optionUpgradeStore2 instanceof OptionUpgradeStore2.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            optionsSettingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.options.settings.OptionsSettingDuxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionsSettingDuxo.downgradeOptionLevel$lambda$24$lambda$23(str, optionUpgradeStore2, (OptionsSettingViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState downgradeOptionLevel$lambda$24$lambda$21(String str, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, new UiEvent(new ChangeOptionLevelState(str, ChangeOptionLevelState.Result.PENDING, null, 4, null)), false, false, false, null, null, false, null, false, false, false, 4077, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState downgradeOptionLevel$lambda$24$lambda$22(String str, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, new UiEvent(new ChangeOptionLevelState(str, ChangeOptionLevelState.Result.SUCCESS, null, 4, null)), false, false, false, null, null, false, null, false, false, false, 4077, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsSettingViewState downgradeOptionLevel$lambda$24$lambda$23(String str, OptionUpgradeStore2 optionUpgradeStore2, OptionsSettingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionsSettingViewState.copy$default(applyMutation, null, new UiEvent(new ChangeOptionLevelState(str, ChangeOptionLevelState.Result.FAILURE, ((OptionUpgradeStore2.Failure) optionUpgradeStore2).getThrowable())), false, false, false, null, null, false, null, false, false, false, 4077, null);
    }

    public final void logLaunchMarginUpgrade() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.SWITCH_TO_MARGIN_ACCOUNT.getValue();
        ComponentHierarchy componentHierarchy = L3_UPGRADE_UNSUPPORTED_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, null, null, null, componentType, value, componentHierarchy, false, 7, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, null, null, componentHierarchy, false, 3, null);
    }

    public final void logDismissEnableSpreads() {
        InstantCashLogger instantCashLogger = this.instantCashLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        String value = InstantCashLogger2.DISMISS.getValue();
        ComponentHierarchy componentHierarchy = L3_UPGRADE_UNSUPPORTED_COMPONENT_HIERARCHY;
        InstantCashLogger.logTap$default(instantCashLogger, null, action, null, componentType, value, componentHierarchy, false, 5, null);
        InstantCashLogger.logScreenDisappear$default(this.instantCashLogger, null, null, componentHierarchy, false, 3, null);
    }

    public final void logSeenCashAccountFailureDialog() {
        InstantCashLogger.logScreenAppear$default(this.instantCashLogger, null, null, L3_UPGRADE_UNSUPPORTED_COMPONENT_HIERARCHY, false, 3, null);
    }

    /* compiled from: OptionsSettingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/settings/OptionsSettingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/options/settings/OptionsSettingDuxo;", "Lcom/robinhood/android/options/contracts/OptionsSettingsFragmentKey;", "<init>", "()V", "L3_UPGRADE_UNSUPPORTED_COMPONENT_HIERARCHY", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "feature-options-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionsSettingDuxo, OptionsSettingsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSettingsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionsSettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionsSettingsFragmentKey getArgs(OptionsSettingDuxo optionsSettingDuxo) {
            return (OptionsSettingsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionsSettingDuxo);
        }
    }
}
