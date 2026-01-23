package com.robinhood.android.acatsin;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringSetPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0091\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004¢\u0006\u0004\b*\u0010+J\b\u0010,\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/acatsin/AcatsInDuxo;", "acatsInActivityStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "introWithFeeShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "introBonusLastShownIdPref", "Lcom/robinhood/prefs/StringPreference;", "failedBottomSheetShownPref", "Lcom/robinhood/prefs/StringSetPreference;", "packageName", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "stateProvider", "Lcom/robinhood/android/acatsin/AcatsInStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AcatsInDuxo_Factory implements Factory<AcatsInDuxo> {
    private final Provider<AcatsBonusStore> acatsBonusStore;
    private final Provider<AcatsInActivityStore> acatsInActivityStore;
    private final Provider<AcatsPlaidStore> acatsPlaidStore;
    private final Provider<AcatsService> acatsService;
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AcatsBrokerageStore> brokerageStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentExposureLogger> experimentExposureLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StringSetPreference> failedBottomSheetShownPref;
    private final Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase;
    private final Provider<StringPreference> introBonusLastShownIdPref;
    private final Provider<BooleanPreference> introWithFeeShownPref;
    private final Provider<LeveredMarginSettingsStore> marginSettingsStore;
    private final Provider<String> packageName;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<AcatsInStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AcatsInDuxo_Factory create(Provider<AcatsInActivityStore> provider, Provider<AcatsPlaidStore> provider2, Provider<AcatsBrokerageStore> provider3, Provider<AcatsBonusStore> provider4, Provider<LeveredMarginSettingsStore> provider5, Provider<AccountProvider> provider6, Provider<ExperimentsStore> provider7, Provider<EventLogger> provider8, Provider<AccountAccessStore> provider9, Provider<FetchAccountNamesUseCase> provider10, Provider<BooleanPreference> provider11, Provider<StringPreference> provider12, Provider<StringSetPreference> provider13, Provider<String> provider14, Provider<SavedStateHandle> provider15, Provider<ExperimentExposureLogger> provider16, Provider<AcatsService> provider17, Provider<AcatsInStateProvider> provider18, Provider<DuxoBundle> provider19) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    @JvmStatic
    public static final AcatsInDuxo newInstance(AcatsInActivityStore acatsInActivityStore, AcatsPlaidStore acatsPlaidStore, AcatsBrokerageStore acatsBrokerageStore, AcatsBonusStore acatsBonusStore, LeveredMarginSettingsStore leveredMarginSettingsStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, BooleanPreference booleanPreference, StringPreference stringPreference, StringSetPreference stringSetPreference, String str, SavedStateHandle savedStateHandle, ExperimentExposureLogger experimentExposureLogger, AcatsService acatsService, AcatsInStateProvider acatsInStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(acatsInActivityStore, acatsPlaidStore, acatsBrokerageStore, acatsBonusStore, leveredMarginSettingsStore, accountProvider, experimentsStore, eventLogger, accountAccessStore, fetchAccountNamesUseCase, booleanPreference, stringPreference, stringSetPreference, str, savedStateHandle, experimentExposureLogger, acatsService, acatsInStateProvider, duxoBundle);
    }

    public AcatsInDuxo_Factory(Provider<AcatsInActivityStore> acatsInActivityStore, Provider<AcatsPlaidStore> acatsPlaidStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<AcatsBonusStore> acatsBonusStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<AccountAccessStore> accountAccessStore, Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase, Provider<BooleanPreference> introWithFeeShownPref, Provider<StringPreference> introBonusLastShownIdPref, Provider<StringSetPreference> failedBottomSheetShownPref, Provider<String> packageName, Provider<SavedStateHandle> savedStateHandle, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<AcatsService> acatsService, Provider<AcatsInStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
        Intrinsics.checkNotNullParameter(introWithFeeShownPref, "introWithFeeShownPref");
        Intrinsics.checkNotNullParameter(introBonusLastShownIdPref, "introBonusLastShownIdPref");
        Intrinsics.checkNotNullParameter(failedBottomSheetShownPref, "failedBottomSheetShownPref");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsInActivityStore = acatsInActivityStore;
        this.acatsPlaidStore = acatsPlaidStore;
        this.brokerageStore = brokerageStore;
        this.acatsBonusStore = acatsBonusStore;
        this.marginSettingsStore = marginSettingsStore;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.accountAccessStore = accountAccessStore;
        this.fetchAccountNamesUseCase = fetchAccountNamesUseCase;
        this.introWithFeeShownPref = introWithFeeShownPref;
        this.introBonusLastShownIdPref = introBonusLastShownIdPref;
        this.failedBottomSheetShownPref = failedBottomSheetShownPref;
        this.packageName = packageName;
        this.savedStateHandle = savedStateHandle;
        this.experimentExposureLogger = experimentExposureLogger;
        this.acatsService = acatsService;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AcatsInDuxo get() {
        Companion companion = INSTANCE;
        AcatsInActivityStore acatsInActivityStore = this.acatsInActivityStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsInActivityStore, "get(...)");
        AcatsPlaidStore acatsPlaidStore = this.acatsPlaidStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsPlaidStore, "get(...)");
        AcatsBrokerageStore acatsBrokerageStore = this.brokerageStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBrokerageStore, "get(...)");
        AcatsBonusStore acatsBonusStore = this.acatsBonusStore.get();
        Intrinsics.checkNotNullExpressionValue(acatsBonusStore, "get(...)");
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(leveredMarginSettingsStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        FetchAccountNamesUseCase fetchAccountNamesUseCase = this.fetchAccountNamesUseCase.get();
        Intrinsics.checkNotNullExpressionValue(fetchAccountNamesUseCase, "get(...)");
        BooleanPreference booleanPreference = this.introWithFeeShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        StringPreference stringPreference = this.introBonusLastShownIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringSetPreference stringSetPreference = this.failedBottomSheetShownPref.get();
        Intrinsics.checkNotNullExpressionValue(stringSetPreference, "get(...)");
        String str = this.packageName.get();
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        String str2 = str;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        ExperimentExposureLogger experimentExposureLogger = this.experimentExposureLogger.get();
        Intrinsics.checkNotNullExpressionValue(experimentExposureLogger, "get(...)");
        ExperimentExposureLogger experimentExposureLogger2 = experimentExposureLogger;
        AcatsService acatsService = this.acatsService.get();
        Intrinsics.checkNotNullExpressionValue(acatsService, "get(...)");
        AcatsService acatsService2 = acatsService;
        AcatsInStateProvider acatsInStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(acatsInStateProvider, "get(...)");
        AcatsInStateProvider acatsInStateProvider2 = acatsInStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(acatsInActivityStore, acatsPlaidStore, acatsBrokerageStore, acatsBonusStore, leveredMarginSettingsStore, accountProvider, experimentsStore, eventLogger, accountAccessStore, fetchAccountNamesUseCase, booleanPreference, stringPreference, stringSetPreference, str2, savedStateHandle2, experimentExposureLogger2, acatsService2, acatsInStateProvider2, duxoBundle);
    }

    /* compiled from: AcatsInDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0092\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0007H\u0007J \u0001\u0010-\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/acatsin/AcatsInDuxo_Factory;", "acatsInActivityStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "introWithFeeShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "introBonusLastShownIdPref", "Lcom/robinhood/prefs/StringPreference;", "failedBottomSheetShownPref", "Lcom/robinhood/prefs/StringSetPreference;", "packageName", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "stateProvider", "Lcom/robinhood/android/acatsin/AcatsInStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/acatsin/AcatsInDuxo;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AcatsInDuxo_Factory create(Provider<AcatsInActivityStore> acatsInActivityStore, Provider<AcatsPlaidStore> acatsPlaidStore, Provider<AcatsBrokerageStore> brokerageStore, Provider<AcatsBonusStore> acatsBonusStore, Provider<LeveredMarginSettingsStore> marginSettingsStore, Provider<AccountProvider> accountProvider, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<AccountAccessStore> accountAccessStore, Provider<FetchAccountNamesUseCase> fetchAccountNamesUseCase, Provider<BooleanPreference> introWithFeeShownPref, Provider<StringPreference> introBonusLastShownIdPref, Provider<StringSetPreference> failedBottomSheetShownPref, Provider<String> packageName, Provider<SavedStateHandle> savedStateHandle, Provider<ExperimentExposureLogger> experimentExposureLogger, Provider<AcatsService> acatsService, Provider<AcatsInStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
            Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
            Intrinsics.checkNotNullParameter(introWithFeeShownPref, "introWithFeeShownPref");
            Intrinsics.checkNotNullParameter(introBonusLastShownIdPref, "introBonusLastShownIdPref");
            Intrinsics.checkNotNullParameter(failedBottomSheetShownPref, "failedBottomSheetShownPref");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(acatsService, "acatsService");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInDuxo_Factory(acatsInActivityStore, acatsPlaidStore, brokerageStore, acatsBonusStore, marginSettingsStore, accountProvider, experimentsStore, eventLogger, accountAccessStore, fetchAccountNamesUseCase, introWithFeeShownPref, introBonusLastShownIdPref, failedBottomSheetShownPref, packageName, savedStateHandle, experimentExposureLogger, acatsService, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final AcatsInDuxo newInstance(AcatsInActivityStore acatsInActivityStore, AcatsPlaidStore acatsPlaidStore, AcatsBrokerageStore brokerageStore, AcatsBonusStore acatsBonusStore, LeveredMarginSettingsStore marginSettingsStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, BooleanPreference introWithFeeShownPref, StringPreference introBonusLastShownIdPref, StringSetPreference failedBottomSheetShownPref, String packageName, SavedStateHandle savedStateHandle, ExperimentExposureLogger experimentExposureLogger, AcatsService acatsService, AcatsInStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
            Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
            Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
            Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
            Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
            Intrinsics.checkNotNullParameter(introWithFeeShownPref, "introWithFeeShownPref");
            Intrinsics.checkNotNullParameter(introBonusLastShownIdPref, "introBonusLastShownIdPref");
            Intrinsics.checkNotNullParameter(failedBottomSheetShownPref, "failedBottomSheetShownPref");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
            Intrinsics.checkNotNullParameter(acatsService, "acatsService");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AcatsInDuxo(acatsInActivityStore, acatsPlaidStore, brokerageStore, acatsBonusStore, marginSettingsStore, accountProvider, experimentsStore, eventLogger, accountAccessStore, fetchAccountNamesUseCase, introWithFeeShownPref, introBonusLastShownIdPref, failedBottomSheetShownPref, packageName, savedStateHandle, experimentExposureLogger, acatsService, stateProvider, duxoBundle);
        }
    }
}
