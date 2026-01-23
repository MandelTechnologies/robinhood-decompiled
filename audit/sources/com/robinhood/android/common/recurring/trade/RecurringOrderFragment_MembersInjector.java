package com.robinhood.android.common.recurring.trade;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "showDropFromRecurringCreationSurveyPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RecurringOrderFragment_MembersInjector implements MembersInjector<RecurringOrderFragment> {
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<BooleanPreference> showDropFromRecurringCreationSurveyPref;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<RecurringOrderFragment> create(Provider<BaseFragmentSingletons> provider, Provider<MicrogramManager> provider2, Provider<CryptoExperimentsStore> provider3, Provider<EventLogger> provider4, Provider<BooleanPreference> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final void injectCryptoExperimentsStore(RecurringOrderFragment recurringOrderFragment, CryptoExperimentsStore cryptoExperimentsStore) {
        INSTANCE.injectCryptoExperimentsStore(recurringOrderFragment, cryptoExperimentsStore);
    }

    @JvmStatic
    public static final void injectEventLogger(RecurringOrderFragment recurringOrderFragment, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(recurringOrderFragment, eventLogger);
    }

    @JvmStatic
    public static final void injectMicrogramManager(RecurringOrderFragment recurringOrderFragment, MicrogramManager microgramManager) {
        INSTANCE.injectMicrogramManager(recurringOrderFragment, microgramManager);
    }

    @JvmStatic
    @ShowDropFromRecurringCreationSurvey
    public static final void injectShowDropFromRecurringCreationSurveyPref(RecurringOrderFragment recurringOrderFragment, BooleanPreference booleanPreference) {
        INSTANCE.injectShowDropFromRecurringCreationSurveyPref(recurringOrderFragment, booleanPreference);
    }

    public RecurringOrderFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<MicrogramManager> microgramManager, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EventLogger> eventLogger, Provider<BooleanPreference> showDropFromRecurringCreationSurveyPref) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurveyPref, "showDropFromRecurringCreationSurveyPref");
        this.singletons = singletons;
        this.microgramManager = microgramManager;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.eventLogger = eventLogger;
        this.showDropFromRecurringCreationSurveyPref = showDropFromRecurringCreationSurveyPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecurringOrderFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        companion2.injectMicrogramManager(instance, microgramManager);
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        companion2.injectCryptoExperimentsStore(instance, cryptoExperimentsStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion2.injectEventLogger(instance, eventLogger);
        BooleanPreference booleanPreference = this.showDropFromRecurringCreationSurveyPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion2.injectShowDropFromRecurringCreationSurveyPref(instance, booleanPreference);
    }

    /* compiled from: RecurringOrderFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "showDropFromRecurringCreationSurveyPref", "Lcom/robinhood/prefs/BooleanPreference;", "injectMicrogramManager", "", "instance", "injectCryptoExperimentsStore", "injectEventLogger", "injectShowDropFromRecurringCreationSurveyPref", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<RecurringOrderFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<MicrogramManager> microgramManager, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EventLogger> eventLogger, Provider<BooleanPreference> showDropFromRecurringCreationSurveyPref) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurveyPref, "showDropFromRecurringCreationSurveyPref");
            return new RecurringOrderFragment_MembersInjector(singletons, microgramManager, cryptoExperimentsStore, eventLogger, showDropFromRecurringCreationSurveyPref);
        }

        @JvmStatic
        public final void injectMicrogramManager(RecurringOrderFragment instance, MicrogramManager microgramManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            instance.setMicrogramManager(microgramManager);
        }

        @JvmStatic
        public final void injectCryptoExperimentsStore(RecurringOrderFragment instance, CryptoExperimentsStore cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            instance.setCryptoExperimentsStore(cryptoExperimentsStore);
        }

        @JvmStatic
        public final void injectEventLogger(RecurringOrderFragment instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        @ShowDropFromRecurringCreationSurvey
        public final void injectShowDropFromRecurringCreationSurveyPref(RecurringOrderFragment instance, BooleanPreference showDropFromRecurringCreationSurveyPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(showDropFromRecurringCreationSurveyPref, "showDropFromRecurringCreationSurveyPref");
            instance.setShowDropFromRecurringCreationSurveyPref(showDropFromRecurringCreationSurveyPref);
        }
    }
}
