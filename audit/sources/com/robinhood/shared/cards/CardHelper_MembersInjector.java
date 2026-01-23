package com.robinhood.shared.cards;

import android.content.SharedPreferences;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.cards.prefs.PromptedForReviewPref;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import com.robinhood.store.base.PortfolioStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardHelper_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/CardHelper;", "portfolioStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/base/PortfolioStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CardHelper_MembersInjector implements MembersInjector<CardHelper> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CardStore> cardStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Navigator> navigator;
    private final Provider<PortfolioStore> portfolioStore;
    private final Provider<LongPreference> promptedForReviewPref;
    private final Provider<StringPreference> topCardRhIdPref;
    private final Provider<SharedPreferences> userPrefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CardHelper> create(Provider<PortfolioStore> provider, Provider<AnalyticsLogger> provider2, Provider<CardStore> provider3, Provider<ExperimentsStore> provider4, Provider<SharedPreferences> provider5, Provider<StringPreference> provider6, Provider<LongPreference> provider7, Provider<Navigator> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final void injectAnalytics(CardHelper cardHelper, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(cardHelper, analyticsLogger);
    }

    @JvmStatic
    public static final void injectCardStore(CardHelper cardHelper, CardStore cardStore) {
        INSTANCE.injectCardStore(cardHelper, cardStore);
    }

    @JvmStatic
    public static final void injectExperimentsStore(CardHelper cardHelper, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(cardHelper, experimentsStore);
    }

    @JvmStatic
    public static final void injectNavigator(CardHelper cardHelper, Navigator navigator) {
        INSTANCE.injectNavigator(cardHelper, navigator);
    }

    @JvmStatic
    public static final void injectPortfolioStore(CardHelper cardHelper, PortfolioStore portfolioStore) {
        INSTANCE.injectPortfolioStore(cardHelper, portfolioStore);
    }

    @JvmStatic
    @PromptedForReviewPref
    public static final void injectPromptedForReviewPref(CardHelper cardHelper, LongPreference longPreference) {
        INSTANCE.injectPromptedForReviewPref(cardHelper, longPreference);
    }

    @JvmStatic
    @TopCardRhIdPref
    public static final void injectTopCardRhIdPref(CardHelper cardHelper, StringPreference stringPreference) {
        INSTANCE.injectTopCardRhIdPref(cardHelper, stringPreference);
    }

    @JvmStatic
    @UserPrefs
    public static final void injectUserPrefs(CardHelper cardHelper, SharedPreferences sharedPreferences) {
        INSTANCE.injectUserPrefs(cardHelper, sharedPreferences);
    }

    public CardHelper_MembersInjector(Provider<PortfolioStore> portfolioStore, Provider<AnalyticsLogger> analytics, Provider<CardStore> cardStore, Provider<ExperimentsStore> experimentsStore, Provider<SharedPreferences> userPrefs, Provider<StringPreference> topCardRhIdPref, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
        Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.portfolioStore = portfolioStore;
        this.analytics = analytics;
        this.cardStore = cardStore;
        this.experimentsStore = experimentsStore;
        this.userPrefs = userPrefs;
        this.topCardRhIdPref = topCardRhIdPref;
        this.promptedForReviewPref = promptedForReviewPref;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardHelper instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        PortfolioStore portfolioStore = this.portfolioStore.get();
        Intrinsics.checkNotNullExpressionValue(portfolioStore, "get(...)");
        companion.injectPortfolioStore(instance, portfolioStore);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        CardStore cardStore = this.cardStore.get();
        Intrinsics.checkNotNullExpressionValue(cardStore, "get(...)");
        companion.injectCardStore(instance, cardStore);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion.injectExperimentsStore(instance, experimentsStore);
        SharedPreferences sharedPreferences = this.userPrefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        companion.injectUserPrefs(instance, sharedPreferences);
        StringPreference stringPreference = this.topCardRhIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectTopCardRhIdPref(instance, stringPreference);
        LongPreference longPreference = this.promptedForReviewPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion.injectPromptedForReviewPref(instance, longPreference);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
    }

    /* compiled from: CardHelper_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J~\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bH\u0007J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006\""}, m3636d2 = {"Lcom/robinhood/shared/cards/CardHelper_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/CardHelper;", "portfolioStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/base/PortfolioStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", SharedPreferencesModule.USER_PREFS_NAME, "Landroid/content/SharedPreferences;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectPortfolioStore", "", "instance", "injectAnalytics", "injectCardStore", "injectExperimentsStore", "injectUserPrefs", "injectTopCardRhIdPref", "injectPromptedForReviewPref", "injectNavigator", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CardHelper> create(Provider<PortfolioStore> portfolioStore, Provider<AnalyticsLogger> analytics, Provider<CardStore> cardStore, Provider<ExperimentsStore> experimentsStore, Provider<SharedPreferences> userPrefs, Provider<StringPreference> topCardRhIdPref, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new CardHelper_MembersInjector(portfolioStore, analytics, cardStore, experimentsStore, userPrefs, topCardRhIdPref, promptedForReviewPref, navigator);
        }

        @JvmStatic
        public final void injectPortfolioStore(CardHelper instance, PortfolioStore portfolioStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
            instance.setPortfolioStore(portfolioStore);
        }

        @JvmStatic
        public final void injectAnalytics(CardHelper instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectCardStore(CardHelper instance, CardStore cardStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            instance.setCardStore(cardStore);
        }

        @JvmStatic
        public final void injectExperimentsStore(CardHelper instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        @UserPrefs
        public final void injectUserPrefs(CardHelper instance, SharedPreferences userPrefs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
            instance.setUserPrefs(userPrefs);
        }

        @JvmStatic
        @TopCardRhIdPref
        public final void injectTopCardRhIdPref(CardHelper instance, StringPreference topCardRhIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            instance.setTopCardRhIdPref(topCardRhIdPref);
        }

        @JvmStatic
        @PromptedForReviewPref
        public final void injectPromptedForReviewPref(CardHelper instance, LongPreference promptedForReviewPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
            instance.setPromptedForReviewPref(promptedForReviewPref);
        }

        @JvmStatic
        public final void injectNavigator(CardHelper instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
