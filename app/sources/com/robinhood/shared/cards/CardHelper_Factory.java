package com.robinhood.shared.cards;

import android.content.SharedPreferences;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.IacCardImpressionLimiter;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.cards.CardHelper_MembersInjector;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardHelper_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/cards/CardHelper;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "cardImpressionLimiter", "Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;", "portfolioStore", "Lcom/robinhood/store/base/PortfolioStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CardHelper_Factory implements Factory<CardHelper> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<IacCardImpressionLimiter> cardImpressionLimiter;
    private final Provider<CardStore> cardStore;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Navigator> navigator;
    private final Provider<PortfolioStore> portfolioStore;
    private final Provider<LongPreference> promptedForReviewPref;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<StringPreference> topCardRhIdPref;
    private final Provider<SharedPreferences> userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CardHelper_Factory create(Provider<CoroutineScope> provider, Provider<RhProcessLifecycleOwner> provider2, Provider<IacCardImpressionLimiter> provider3, Provider<PortfolioStore> provider4, Provider<AnalyticsLogger> provider5, Provider<CardStore> provider6, Provider<ExperimentsStore> provider7, Provider<SharedPreferences> provider8, Provider<StringPreference> provider9, Provider<LongPreference> provider10, Provider<Navigator> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final CardHelper newInstance(CoroutineScope coroutineScope, RhProcessLifecycleOwner rhProcessLifecycleOwner, IacCardImpressionLimiter iacCardImpressionLimiter) {
        return INSTANCE.newInstance(coroutineScope, rhProcessLifecycleOwner, iacCardImpressionLimiter);
    }

    public CardHelper_Factory(Provider<CoroutineScope> coroutineScope, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<IacCardImpressionLimiter> cardImpressionLimiter, Provider<PortfolioStore> portfolioStore, Provider<AnalyticsLogger> analytics, Provider<CardStore> cardStore, Provider<ExperimentsStore> experimentsStore, Provider<SharedPreferences> userPrefs, Provider<StringPreference> topCardRhIdPref, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(cardImpressionLimiter, "cardImpressionLimiter");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
        Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.coroutineScope = coroutineScope;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.cardImpressionLimiter = cardImpressionLimiter;
        this.portfolioStore = portfolioStore;
        this.analytics = analytics;
        this.cardStore = cardStore;
        this.experimentsStore = experimentsStore;
        this.userPrefs = userPrefs;
        this.topCardRhIdPref = topCardRhIdPref;
        this.promptedForReviewPref = promptedForReviewPref;
        this.navigator = navigator;
    }

    @Override // javax.inject.Provider
    public CardHelper get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        IacCardImpressionLimiter iacCardImpressionLimiter = this.cardImpressionLimiter.get();
        Intrinsics.checkNotNullExpressionValue(iacCardImpressionLimiter, "get(...)");
        CardHelper cardHelperNewInstance = companion.newInstance(coroutineScope, rhProcessLifecycleOwner, iacCardImpressionLimiter);
        CardHelper_MembersInjector.Companion companion2 = CardHelper_MembersInjector.INSTANCE;
        PortfolioStore portfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(portfolioStore, "get(...)");
        companion2.injectPortfolioStore(cardHelperNewInstance, portfolioStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion2.injectAnalytics(cardHelperNewInstance, analyticsLogger);
        CardStore cardStore = this.cardStore.get();
        Intrinsics.checkNotNullExpressionValue(cardStore, "get(...)");
        companion2.injectCardStore(cardHelperNewInstance, cardStore);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion2.injectExperimentsStore(cardHelperNewInstance, experimentsStore);
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion2.injectUserPrefs(cardHelperNewInstance, sharedPreferences);
        StringPreference stringPreference = this.topCardRhIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectTopCardRhIdPref(cardHelperNewInstance, stringPreference);
        LongPreference longPreference = this.promptedForReviewPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion2.injectPromptedForReviewPref(cardHelperNewInstance, longPreference);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(cardHelperNewInstance, navigator);
        return cardHelperNewInstance;
    }

    /* compiled from: CardHelper_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/cards/CardHelper_Factory;", "coroutineScope", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "cardImpressionLimiter", "Lcom/robinhood/librobinhood/data/store/IacCardImpressionLimiter;", "portfolioStore", "Lcom/robinhood/store/base/PortfolioStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "newInstance", "Lcom/robinhood/shared/cards/CardHelper;", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CardHelper_Factory create(Provider<CoroutineScope> coroutineScope, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner, Provider<IacCardImpressionLimiter> cardImpressionLimiter, Provider<PortfolioStore> portfolioStore, Provider<AnalyticsLogger> analytics, Provider<CardStore> cardStore, Provider<ExperimentsStore> experimentsStore, Provider<SharedPreferences> userPrefs, Provider<StringPreference> topCardRhIdPref, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(cardImpressionLimiter, "cardImpressionLimiter");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new CardHelper_Factory(coroutineScope, rhProcessLifecycleOwner, cardImpressionLimiter, portfolioStore, analytics, cardStore, experimentsStore, userPrefs, topCardRhIdPref, promptedForReviewPref, navigator);
        }

        @JvmStatic
        public final CardHelper newInstance(CoroutineScope coroutineScope, RhProcessLifecycleOwner rhProcessLifecycleOwner, IacCardImpressionLimiter cardImpressionLimiter) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            Intrinsics.checkNotNullParameter(cardImpressionLimiter, "cardImpressionLimiter");
            return new CardHelper(coroutineScope, rhProcessLifecycleOwner, cardImpressionLimiter);
        }
    }
}
