package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseActivitySingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.transfers.preference.DirectDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.GoldDepositUpsellExposureResetPref;
import com.robinhood.android.transfers.preference.RecurringDepositUpsellExposureCountPref;
import com.robinhood.android.transfers.preference.RhsRecurringDepositHookExposureCountPref;
import com.robinhood.android.transfers.preference.RhyRecurringDepositHookExposureCountPref;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
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

/* compiled from: CreateTransferV2Activity_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "directDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "recurringDepositUpsellExposureCountPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CreateTransferV2Activity_MembersInjector implements MembersInjector<CreateTransferV2Activity> {
    private final Provider<IntPreference> directDepositUpsellExposureCountPref;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IntPreference> goldDepositHookExposureCountPref;
    private final Provider<IntPreference> goldDepositUpsellExposureCountPref;
    private final Provider<BooleanPreference> goldDepositUpsellExposureResetPref;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<IntPreference> recurringDepositUpsellExposureCountPref;
    private final Provider<IntPreference> rhyRecurringDepositHookExposureCountPref;
    private final Provider<ScreenProtectManager> screenProtectManager;
    private final Provider<BaseActivitySingletons> singletons;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CreateTransferV2Activity> create(Provider<BaseActivitySingletons> provider, Provider<IntPreference> provider2, Provider<IntPreference> provider3, Provider<IntPreference> provider4, Provider<IntPreference> provider5, Provider<BooleanPreference> provider6, Provider<IntPreference> provider7, Provider<ExperimentsStore> provider8, Provider<EventLogger> provider9, Provider<ScreenProtectManager> provider10, Provider<SurveyManager3> provider11, Provider<MicrogramComponent.Factory> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    @DirectDepositUpsellExposureCountPref
    public static final void injectDirectDepositUpsellExposureCountPref(CreateTransferV2Activity createTransferV2Activity, IntPreference intPreference) {
        INSTANCE.injectDirectDepositUpsellExposureCountPref(createTransferV2Activity, intPreference);
    }

    @JvmStatic
    public static final void injectEventLogger(CreateTransferV2Activity createTransferV2Activity, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(createTransferV2Activity, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(CreateTransferV2Activity createTransferV2Activity, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(createTransferV2Activity, experimentsStore);
    }

    @RhsRecurringDepositHookExposureCountPref
    @JvmStatic
    public static final void injectGoldDepositHookExposureCountPref(CreateTransferV2Activity createTransferV2Activity, IntPreference intPreference) {
        INSTANCE.injectGoldDepositHookExposureCountPref(createTransferV2Activity, intPreference);
    }

    @JvmStatic
    @GoldDepositUpsellExposureCountPref
    public static final void injectGoldDepositUpsellExposureCountPref(CreateTransferV2Activity createTransferV2Activity, IntPreference intPreference) {
        INSTANCE.injectGoldDepositUpsellExposureCountPref(createTransferV2Activity, intPreference);
    }

    @JvmStatic
    @GoldDepositUpsellExposureResetPref
    public static final void injectGoldDepositUpsellExposureResetPref(CreateTransferV2Activity createTransferV2Activity, BooleanPreference booleanPreference) {
        INSTANCE.injectGoldDepositUpsellExposureResetPref(createTransferV2Activity, booleanPreference);
    }

    @JvmStatic
    public static final void injectMicrogramComponentFactory(CreateTransferV2Activity createTransferV2Activity, MicrogramComponent.Factory factory) {
        INSTANCE.injectMicrogramComponentFactory(createTransferV2Activity, factory);
    }

    @JvmStatic
    @RecurringDepositUpsellExposureCountPref
    public static final void injectRecurringDepositUpsellExposureCountPref(CreateTransferV2Activity createTransferV2Activity, IntPreference intPreference) {
        INSTANCE.injectRecurringDepositUpsellExposureCountPref(createTransferV2Activity, intPreference);
    }

    @RhyRecurringDepositHookExposureCountPref
    @JvmStatic
    public static final void injectRhyRecurringDepositHookExposureCountPref(CreateTransferV2Activity createTransferV2Activity, IntPreference intPreference) {
        INSTANCE.injectRhyRecurringDepositHookExposureCountPref(createTransferV2Activity, intPreference);
    }

    @JvmStatic
    public static final void injectScreenProtectManager(CreateTransferV2Activity createTransferV2Activity, ScreenProtectManager screenProtectManager) {
        INSTANCE.injectScreenProtectManager(createTransferV2Activity, screenProtectManager);
    }

    @JvmStatic
    public static final void injectUserLeapManager(CreateTransferV2Activity createTransferV2Activity, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(createTransferV2Activity, surveyManager3);
    }

    public CreateTransferV2Activity_MembersInjector(Provider<BaseActivitySingletons> singletons, Provider<IntPreference> rhyRecurringDepositHookExposureCountPref, Provider<IntPreference> directDepositUpsellExposureCountPref, Provider<IntPreference> goldDepositHookExposureCountPref, Provider<IntPreference> goldDepositUpsellExposureCountPref, Provider<BooleanPreference> goldDepositUpsellExposureResetPref, Provider<IntPreference> recurringDepositUpsellExposureCountPref, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<ScreenProtectManager> screenProtectManager, Provider<SurveyManager3> userLeapManager, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
        Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
        Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        this.singletons = singletons;
        this.rhyRecurringDepositHookExposureCountPref = rhyRecurringDepositHookExposureCountPref;
        this.directDepositUpsellExposureCountPref = directDepositUpsellExposureCountPref;
        this.goldDepositHookExposureCountPref = goldDepositHookExposureCountPref;
        this.goldDepositUpsellExposureCountPref = goldDepositUpsellExposureCountPref;
        this.goldDepositUpsellExposureResetPref = goldDepositUpsellExposureResetPref;
        this.recurringDepositUpsellExposureCountPref = recurringDepositUpsellExposureCountPref;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.screenProtectManager = screenProtectManager;
        this.userLeapManager = userLeapManager;
        this.microgramComponentFactory = microgramComponentFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateTransferV2Activity instance) {
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
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(instance, experimentsStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        ScreenProtectManager screenProtectManager = this.screenProtectManager.get();
        Intrinsics.checkNotNullExpressionValue(screenProtectManager, "get(...)");
        companion2.injectScreenProtectManager(instance, screenProtectManager);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        companion2.injectMicrogramComponentFactory(instance, factory);
    }

    /* compiled from: CreateTransferV2Activity_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¶\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\bH\u0007J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0007J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0007J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Activity;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseActivitySingletons;", "rhyRecurringDepositHookExposureCountPref", "Lcom/robinhood/prefs/IntPreference;", "directDepositUpsellExposureCountPref", "goldDepositHookExposureCountPref", "goldDepositUpsellExposureCountPref", "goldDepositUpsellExposureResetPref", "Lcom/robinhood/prefs/BooleanPreference;", "recurringDepositUpsellExposureCountPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "screenProtectManager", "Lcom/robinhood/security/screenprotect/ScreenProtectManager;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "injectRhyRecurringDepositHookExposureCountPref", "", "instance", "injectDirectDepositUpsellExposureCountPref", "injectGoldDepositHookExposureCountPref", "injectGoldDepositUpsellExposureCountPref", "injectGoldDepositUpsellExposureResetPref", "injectRecurringDepositUpsellExposureCountPref", "injectExperimentsStore", "injectEventLogger", "injectScreenProtectManager", "injectUserLeapManager", "injectMicrogramComponentFactory", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CreateTransferV2Activity> create(Provider<BaseActivitySingletons> singletons, Provider<IntPreference> rhyRecurringDepositHookExposureCountPref, Provider<IntPreference> directDepositUpsellExposureCountPref, Provider<IntPreference> goldDepositHookExposureCountPref, Provider<IntPreference> goldDepositUpsellExposureCountPref, Provider<BooleanPreference> goldDepositUpsellExposureResetPref, Provider<IntPreference> recurringDepositUpsellExposureCountPref, Provider<ExperimentsStore> experimentsStore, Provider<EventLogger> eventLogger, Provider<ScreenProtectManager> screenProtectManager, Provider<SurveyManager3> userLeapManager, Provider<MicrogramComponent.Factory> microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
            Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
            Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            return new CreateTransferV2Activity_MembersInjector(singletons, rhyRecurringDepositHookExposureCountPref, directDepositUpsellExposureCountPref, goldDepositHookExposureCountPref, goldDepositUpsellExposureCountPref, goldDepositUpsellExposureResetPref, recurringDepositUpsellExposureCountPref, experimentsStore, eventLogger, screenProtectManager, userLeapManager, microgramComponentFactory);
        }

        @RhyRecurringDepositHookExposureCountPref
        @JvmStatic
        public final void injectRhyRecurringDepositHookExposureCountPref(CreateTransferV2Activity instance, IntPreference rhyRecurringDepositHookExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rhyRecurringDepositHookExposureCountPref, "rhyRecurringDepositHookExposureCountPref");
            instance.setRhyRecurringDepositHookExposureCountPref(rhyRecurringDepositHookExposureCountPref);
        }

        @JvmStatic
        @DirectDepositUpsellExposureCountPref
        public final void injectDirectDepositUpsellExposureCountPref(CreateTransferV2Activity instance, IntPreference directDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(directDepositUpsellExposureCountPref, "directDepositUpsellExposureCountPref");
            instance.setDirectDepositUpsellExposureCountPref(directDepositUpsellExposureCountPref);
        }

        @RhsRecurringDepositHookExposureCountPref
        @JvmStatic
        public final void injectGoldDepositHookExposureCountPref(CreateTransferV2Activity instance, IntPreference goldDepositHookExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositHookExposureCountPref, "goldDepositHookExposureCountPref");
            instance.setGoldDepositHookExposureCountPref(goldDepositHookExposureCountPref);
        }

        @JvmStatic
        @GoldDepositUpsellExposureCountPref
        public final void injectGoldDepositUpsellExposureCountPref(CreateTransferV2Activity instance, IntPreference goldDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureCountPref, "goldDepositUpsellExposureCountPref");
            instance.setGoldDepositUpsellExposureCountPref(goldDepositUpsellExposureCountPref);
        }

        @JvmStatic
        @GoldDepositUpsellExposureResetPref
        public final void injectGoldDepositUpsellExposureResetPref(CreateTransferV2Activity instance, BooleanPreference goldDepositUpsellExposureResetPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(goldDepositUpsellExposureResetPref, "goldDepositUpsellExposureResetPref");
            instance.setGoldDepositUpsellExposureResetPref(goldDepositUpsellExposureResetPref);
        }

        @JvmStatic
        @RecurringDepositUpsellExposureCountPref
        public final void injectRecurringDepositUpsellExposureCountPref(CreateTransferV2Activity instance, IntPreference recurringDepositUpsellExposureCountPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(recurringDepositUpsellExposureCountPref, "recurringDepositUpsellExposureCountPref");
            instance.setRecurringDepositUpsellExposureCountPref(recurringDepositUpsellExposureCountPref);
        }

        @JvmStatic
        public final void injectExperimentsStore(CreateTransferV2Activity instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectEventLogger(CreateTransferV2Activity instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectScreenProtectManager(CreateTransferV2Activity instance, ScreenProtectManager screenProtectManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenProtectManager, "screenProtectManager");
            instance.setScreenProtectManager(screenProtectManager);
        }

        @JvmStatic
        public final void injectUserLeapManager(CreateTransferV2Activity instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }

        @JvmStatic
        public final void injectMicrogramComponentFactory(CreateTransferV2Activity instance, MicrogramComponent.Factory microgramComponentFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            instance.setMicrogramComponentFactory(microgramComponentFactory);
        }
    }
}
