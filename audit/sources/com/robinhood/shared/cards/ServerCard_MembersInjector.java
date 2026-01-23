package com.robinhood.shared.cards;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.cards.BaseAnalyticsNotificationCard_MembersInjector;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ServerCard_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/cards/ServerCard_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/ServerCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ServerCard_MembersInjector implements MembersInjector<ServerCard> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CardStore> cardStore;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<Navigator> navigator;
    private final Provider<StringPreference> topCardRhIdPref;
    private final Provider<SurveyManager3> userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ServerCard> create(Provider<AnalyticsLogger> provider, Provider<CoroutineScope> provider2, Provider<CardStore> provider3, Provider<StringPreference> provider4, Provider<Navigator> provider5, Provider<SurveyManager3> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final void injectCardStore(ServerCard serverCard, CardStore cardStore) {
        INSTANCE.injectCardStore(serverCard, cardStore);
    }

    @JvmStatic
    @RootCoroutineScope
    public static final void injectCoroutineScope(ServerCard serverCard, CoroutineScope coroutineScope) {
        INSTANCE.injectCoroutineScope(serverCard, coroutineScope);
    }

    @JvmStatic
    public static final void injectNavigator(ServerCard serverCard, Navigator navigator) {
        INSTANCE.injectNavigator(serverCard, navigator);
    }

    @JvmStatic
    @TopCardRhIdPref
    public static final void injectTopCardRhIdPref(ServerCard serverCard, StringPreference stringPreference) {
        INSTANCE.injectTopCardRhIdPref(serverCard, stringPreference);
    }

    @JvmStatic
    public static final void injectUserLeapManager(ServerCard serverCard, SurveyManager3 surveyManager3) {
        INSTANCE.injectUserLeapManager(serverCard, surveyManager3);
    }

    public ServerCard_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<CoroutineScope> coroutineScope, Provider<CardStore> cardStore, Provider<StringPreference> topCardRhIdPref, Provider<Navigator> navigator, Provider<SurveyManager3> userLeapManager) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        this.analytics = analytics;
        this.coroutineScope = coroutineScope;
        this.cardStore = cardStore;
        this.topCardRhIdPref = topCardRhIdPref;
        this.navigator = navigator;
        this.userLeapManager = userLeapManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ServerCard instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseAnalyticsNotificationCard_MembersInjector.Companion companion = BaseAnalyticsNotificationCard_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        Companion companion2 = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        companion2.injectCoroutineScope(instance, coroutineScope);
        CardStore cardStore = this.cardStore.get();
        Intrinsics.checkNotNullExpressionValue(cardStore, "get(...)");
        companion2.injectCardStore(instance, cardStore);
        StringPreference stringPreference = this.topCardRhIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion2.injectTopCardRhIdPref(instance, stringPreference);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
        SurveyManager3 surveyManager3 = this.userLeapManager.get();
        Intrinsics.checkNotNullExpressionValue(surveyManager3, "get(...)");
        companion2.injectUserLeapManager(instance, surveyManager3);
    }

    /* compiled from: ServerCard_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/cards/ServerCard_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/ServerCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "topCardRhIdPref", "Lcom/robinhood/prefs/StringPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "injectCoroutineScope", "", "instance", "injectCardStore", "injectTopCardRhIdPref", "injectNavigator", "injectUserLeapManager", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ServerCard> create(Provider<AnalyticsLogger> analytics, Provider<CoroutineScope> coroutineScope, Provider<CardStore> cardStore, Provider<StringPreference> topCardRhIdPref, Provider<Navigator> navigator, Provider<SurveyManager3> userLeapManager) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            return new ServerCard_MembersInjector(analytics, coroutineScope, cardStore, topCardRhIdPref, navigator, userLeapManager);
        }

        @JvmStatic
        @RootCoroutineScope
        public final void injectCoroutineScope(ServerCard instance, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            instance.setCoroutineScope(coroutineScope);
        }

        @JvmStatic
        public final void injectCardStore(ServerCard instance, CardStore cardStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(cardStore, "cardStore");
            instance.setCardStore(cardStore);
        }

        @JvmStatic
        @TopCardRhIdPref
        public final void injectTopCardRhIdPref(ServerCard instance, StringPreference topCardRhIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            instance.setTopCardRhIdPref(topCardRhIdPref);
        }

        @JvmStatic
        public final void injectNavigator(ServerCard instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectUserLeapManager(ServerCard instance, SurveyManager3 userLeapManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
            instance.setUserLeapManager(userLeapManager);
        }
    }
}
