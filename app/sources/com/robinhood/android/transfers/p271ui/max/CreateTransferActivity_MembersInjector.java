package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.transfers.preference.DirectDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureResetPref;
import com.robinhood.android.transfers.preference.RecurringDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.RhsRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.RhyRecurringDepositHookExposureCountPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.security.screenprotect.ScreenProtectManager;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: CreateTransferActivity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "directDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "recurringDepositUpsellExposureCountPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferActivity_MembersInjector implements MembersInjector<CreateTransferActivity> {
    private final Provider<IntPreference> directDepositUpsellExposureCountPref;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore;
    private final Provider<IntPreference> goldDepositHookExposureCountPref;
    private final Provider<IntPreference> goldDepositUpsellExposureCountPref;
    private final Provider<BooleanPreference> goldDepositUpsellExposureResetPref;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<IntPreference> recurringDepositUpsellExposureCountPref;
    private final Provider<IntPreference> rhyRecurringDepositHookExposureCountPref;
    private final Provider<ScreenProtectManager> screenProtectManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<TransferAccountStore> transferAccountStore;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CreateTransferActivity> create(Provider<BaseActivitySingletons> provider, Provider<IntPreference> provider2, Provider<IntPreference> provider3, Provider<IntPreference> provider4, Provider<IntPreference> provider5, Provider<BooleanPreference> provider6, Provider<IntPreference> provider7, Provider<EventLogger> provider8, Provider<ExperimentsStore> provider9, Provider<TransferAccountStore> provider10, Provider<ScreenProtectManager> provider11, Provider<SurveyManager3> provider12, Provider<GoldDepositBoostMaxAwarenessStore> provider13, Provider<MicrogramComponent.Factory> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    @DirectDepositUpsellExposureCountPref
    public static final void injectDirectDepositUpsellExposureCountPref(CreateTransferActivity createTransferActivity, IntPreference intPreference) {
        INSTANCE.injectDirectDepositUpsellExposureCountPref(createTransferActivity, intPreference);
    }

    @JvmStatic
    public static final void injectEventLogger(CreateTransferActivity createTransferActivity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(createTransferActivity, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(CreateTransferActivity createTransferActivity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(createTransferActivity, experimentsStore);
    }

    @JvmStatic
    public static final void injectGoldDepositBoostMaxAwarenessStore(CreateTransferActivity createTransferActivity, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore) {
        INSTANCE.injectGoldDepositBoostMaxAwarenessStore(createTransferActivity, goldDepositBoostMaxAwarenessStore);
    }

    @RhsRecurringDepositHookExposureCountPref
    @JvmStatic
    public static final void injectGoldDepositHookExposureCountPref(CreateTransferActivity createTransferActivity, IntPreference intPreference) {
        INSTANCE.injectGoldDepositHookExposureCountPref(createTransferActivity, intPreference);
    }

    @JvmStatic
    @GoldDepositUpsellExposureCountPref
    public static final void injectGoldDepositUpsellExposureCountPref(CreateTransferActivity createTransferActivity, IntPreference intPreference) {
        INSTANCE.injectGoldDepositUpsellExposureCountPref(createTransferActivity, intPreference);
    }

    @JvmStatic
    @GoldDepositUpsellExposureResetPref
    public static final void injectGoldDepositUpsellExposureResetPref(CreateTransferActivity createTransferActivity, BooleanPreference booleanPreference) {
        INSTANCE.injectGoldDepositUpsellExposureResetPref(createTransferActivity, booleanPreference);
    }

    @JvmStatic
    public static final void injectMicrogramComponentFactory(CreateTransferActivity createTransferActivity, MicrogramComponent.Factory factory) {
        INSTANCE.injectMicrogramComponentFactory(createTransferActivity, factory);
    }

    @JvmStatic
    @RecurringDepositUpsellExposureCountPref
    public static final void injectRecurringDepositUpsellExposureCountPref(CreateTransferActivity createTransferActivity, IntPreference intPreference) {
        INSTANCE.injectRecurringDepositUpsellExposureCountPref(createTransferActivity, intPreference);
    }

    @RhyRecurringDepositHookExposureCountPref
    @JvmStatic
    public static final void injectRhyRecurringDepositHookExposureCountPref(CreateTransferActivity createTransferActivity, IntPreference intPreference) {
        INSTANCE.injectRhyRecurringDepositHookExposureCountPref(createTransferActivity, intPreference);
    }

    @JvmStatic
    public static final void injectScreenProtectManager(CreateTransferActivity createTransferActivity, ScreenProtectManager screenProtectManager) {
        INSTANCE.injectScreenProtectManager(createTransferActivity, screenProtectManager);
    }

    @JvmStatic
    public static final void injectTransferAccountStore(CreateTransferActivity createTransferActivity, TransferAccountStore transferAccountStore) {
        INSTANCE.injectTransferAccountStore(createTransferActivity, transferAccountStore);
    }

    @JvmStatic
    public static final void injectUserLeapManager(CreateTransferActivity createTransferActivity, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(createTransferActivity, surveyManager3);
    }

    public CreateTransferActivity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<IntPreference> rhyRecurringDepositHookExposureCountPref, Provider<IntPreference> directDepositUpsellExposureCountPref, Provider<IntPreference> goldDepositHookExposureCountPref, Provider<IntPreference> goldDepositUpsellExposureCountPref, Provider<BooleanPreference> goldDepositUpsellExposureResetPref, Provider<IntPreference> recurringDepositUpsellExposureCountPref, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<TransferAccountStore> transferAccountStore, Provider<ScreenProtectManager> screenProtectManager, Provider<SurveyManager3> userLeapManager, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
        Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
        Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        this.singletons = singletons;
        this.rhyRecurringDepositHookExposureCountPref = rhyRecurringDepositHookExposureCountPref;
        this.directDepositUpsellExposureCountPref = directDepositUpsellExposureCountPref;
        this.goldDepositHookExposureCountPref = goldDepositHookExposureCountPref;
        this.goldDepositUpsellExposureCountPref = goldDepositUpsellExposureCountPref;
        this.goldDepositUpsellExposureResetPref = goldDepositUpsellExposureResetPref;
        this.recurringDepositUpsellExposureCountPref = recurringDepositUpsellExposureCountPref;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.transferAccountStore = transferAccountStore;
        this.screenProtectManager = screenProtectManager;
        this.userLeapManager = userLeapManager;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.microgramComponentFactory = microgramComponentFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateTransferActivity instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseActivity_MembersInjector.Companion companion = BaseActivity_MembersInjector.INSTANCE;
        BaseActivitySingletons baseActivitySingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseActivitySingletons, "get(...)");
        companion.injectSingletons(instance, baseActivitySingletons);
        Companion companion2 = INSTANCE;
        IntPreference intPreference = this.rhyRecurringDepositHookExposureCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference, "get(...)");
        companion2.injectRhyRecurringDepositHookExposureCountPref(instance, intPreference);
        IntPreference intPreference2 = this.directDepositUpsellExposureCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference2, "get(...)");
        companion2.injectDirectDepositUpsellExposureCountPref(instance, intPreference2);
        IntPreference intPreference3 = this.goldDepositHookExposureCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference3, "get(...)");
        companion2.injectGoldDepositHookExposureCountPref(instance, intPreference3);
        IntPreference intPreference4 = this.goldDepositUpsellExposureCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference4, "get(...)");
        companion2.injectGoldDepositUpsellExposureCountPref(instance, intPreference4);
        BooleanPreference booleanPreference = this.goldDepositUpsellExposureResetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectGoldDepositUpsellExposureResetPref(instance, booleanPreference);
        IntPreference intPreference5 = this.recurringDepositUpsellExposureCountPref.get();
        Intrinsics.checkNotNullExpressionValue(intPreference5, "get(...)");
        companion2.injectRecurringDepositUpsellExposureCountPref(instance, intPreference5);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        TransferAccountStore transferAccountStore = this.transferAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(transferAccountStore, "get(...)");
        companion2.injectTransferAccountStore(instance, transferAccountStore);
        ScreenProtectManager screenProtectManager = this.screenProtectManager.get();
        Intrinsics.checkNotNullExpressionValue(screenProtectManager, "get(...)");
        companion2.injectScreenProtectManager(instance, screenProtectManager);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
        GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore = this.goldDepositBoostMaxAwarenessStore.get();
        Intrinsics.checkNotNullExpressionValue(goldDepositBoostMaxAwarenessStore, "get(...)");
        companion2.injectGoldDepositBoostMaxAwarenessStore(instance, goldDepositBoostMaxAwarenessStore);
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        companion2.injectMicrogramComponentFactory(instance, factory);
    }

    /* compiled from: CreateTransferActivity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÒ\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0007J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u0018\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0018\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u0018\u0010(\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0018\u0010.\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferActivity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "directDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "recurringDepositUpsellExposureCountPref", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "injectRhyRecurringDepositHookExposureCountPref", "", "instance", "injectDirectDepositUpsellExposureCountPref", "injectGoldDepositHookExposureCountPref", "injectGoldDepositUpsellExposureCountPref", "injectGoldDepositUpsellExposureResetPref", "injectRecurringDepositUpsellExposureCountPref", "injectEventLogger", "injectExperimentsStore", "injectTransferAccountStore", "injectScreenProtectManager", "injectUserLeapManager", "injectGoldDepositBoostMaxAwarenessStore", "injectMicrogramComponentFactory", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CreateTransferActivity> create(Provider<BaseActivitySingletons> singletons, Provider<IntPreference> rhyRecurringDepositHookExposureCountPref, Provider<IntPreference> directDepositUpsellExposureCountPref, Provider<IntPreference> goldDepositHookExposureCountPref, Provider<IntPreference> goldDepositUpsellExposureCountPref, Provider<BooleanPreference> goldDepositUpsellExposureResetPref, Provider<IntPreference> recurringDepositUpsellExposureCountPref, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<TransferAccountStore> transferAccountStore, Provider<ScreenProtectManager> screenProtectManager, Provider<SurveyManager3> userLeapManager, Provider<GoldDepositBoostMaxAwarenessStore> goldDepositBoostMaxAwarenessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
            Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
            Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            return new CreateTransferActivity_MembersInjector(singletons, rhyRecurringDepositHookExposureCountPref, directDepositUpsellExposureCountPref, goldDepositHookExposureCountPref, goldDepositUpsellExposureCountPref, goldDepositUpsellExposureResetPref, recurringDepositUpsellExposureCountPref, eventLogger, experimentsStore, transferAccountStore, screenProtectManager, userLeapManager, goldDepositBoostMaxAwarenessStore, microgramComponentFactory);
        }

        @RhyRecurringDepositHookExposureCountPref
        @JvmStatic
        public final void injectRhyRecurringDepositHookExposureCountPref(CreateTransferActivity instance, IntPreference rhyRecurringDepositHookExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
            instance.setRhyRecurringDepositHookExposureCountPref(rhyRecurringDepositHookExposureCountPref);
        }

        @JvmStatic
        @DirectDepositUpsellExposureCountPref
        public final void injectDirectDepositUpsellExposureCountPref(CreateTransferActivity instance, IntPreference directDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
            instance.setDirectDepositUpsellExposureCountPref(directDepositUpsellExposureCountPref);
        }

        @RhsRecurringDepositHookExposureCountPref
        @JvmStatic
        public final void injectGoldDepositHookExposureCountPref(CreateTransferActivity instance, IntPreference goldDepositHookExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
            instance.setGoldDepositHookExposureCountPref(goldDepositHookExposureCountPref);
        }

        @JvmStatic
        @GoldDepositUpsellExposureCountPref
        public final void injectGoldDepositUpsellExposureCountPref(CreateTransferActivity instance, IntPreference goldDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
            instance.setGoldDepositUpsellExposureCountPref(goldDepositUpsellExposureCountPref);
        }

        @JvmStatic
        @GoldDepositUpsellExposureResetPref
        public final void injectGoldDepositUpsellExposureResetPref(CreateTransferActivity instance, BooleanPreference goldDepositUpsellExposureResetPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
            instance.setGoldDepositUpsellExposureResetPref(goldDepositUpsellExposureResetPref);
        }

        @JvmStatic
        @RecurringDepositUpsellExposureCountPref
        public final void injectRecurringDepositUpsellExposureCountPref(CreateTransferActivity instance, IntPreference recurringDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
            instance.setRecurringDepositUpsellExposureCountPref(recurringDepositUpsellExposureCountPref);
        }

        @JvmStatic
        public final void injectEventLogger(CreateTransferActivity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectExperimentsStore(CreateTransferActivity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectTransferAccountStore(CreateTransferActivity instance, TransferAccountStore transferAccountStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
            instance.setTransferAccountStore(transferAccountStore);
        }

        @JvmStatic
        public final void injectScreenProtectManager(CreateTransferActivity instance, ScreenProtectManager screenProtectManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            instance.setScreenProtectManager(screenProtectManager);
        }

        @JvmStatic
        public final void injectUserLeapManager(CreateTransferActivity instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @JvmStatic
        public final void injectGoldDepositBoostMaxAwarenessStore(CreateTransferActivity instance, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
            instance.setGoldDepositBoostMaxAwarenessStore(goldDepositBoostMaxAwarenessStore);
        }

        @JvmStatic
        public final void injectMicrogramComponentFactory(CreateTransferActivity instance, MicrogramComponent.Factory microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            instance.setMicrogramComponentFactory(microgramComponentFactory);
        }
    }
}
