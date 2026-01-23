package com.robinhood.shared.cards;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.prefs.LongPreference;
import com.robinhood.shared.cards.BaseAnalyticsNotificationCard_MembersInjector;
import com.robinhood.shared.cards.prefs.PromptedForReviewPref;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptForReviewNotificationCard_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/cards/PromptForReviewNotificationCard_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/PromptForReviewNotificationCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PromptForReviewNotificationCard_MembersInjector implements MembersInjector<PromptForReviewNotificationCard> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<Navigator> navigator;
    private final Provider<LongPreference> promptedForReviewPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<PromptForReviewNotificationCard> create(Provider<AnalyticsLogger> provider, Provider<LongPreference> provider2, Provider<Navigator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectNavigator(PromptForReviewNotificationCard promptForReviewNotificationCard, Navigator navigator) {
        INSTANCE.injectNavigator(promptForReviewNotificationCard, navigator);
    }

    @JvmStatic
    @PromptedForReviewPref
    public static final void injectPromptedForReviewPref(PromptForReviewNotificationCard promptForReviewNotificationCard, LongPreference longPreference) {
        INSTANCE.injectPromptedForReviewPref(promptForReviewNotificationCard, longPreference);
    }

    public PromptForReviewNotificationCard_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.analytics = analytics;
        this.promptedForReviewPref = promptedForReviewPref;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PromptForReviewNotificationCard instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseAnalyticsNotificationCard_MembersInjector.Companion companion = BaseAnalyticsNotificationCard_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        Companion companion2 = INSTANCE;
        LongPreference longPreference = this.promptedForReviewPref.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        companion2.injectPromptedForReviewPref(instance, longPreference);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
    }

    /* compiled from: PromptForReviewNotificationCard_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/cards/PromptForReviewNotificationCard_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/PromptForReviewNotificationCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "promptedForReviewPref", "Lcom/robinhood/prefs/LongPreference;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectPromptedForReviewPref", "", "instance", "injectNavigator", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PromptForReviewNotificationCard> create(Provider<AnalyticsLogger> analytics, Provider<LongPreference> promptedForReviewPref, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new PromptForReviewNotificationCard_MembersInjector(analytics, promptedForReviewPref, navigator);
        }

        @JvmStatic
        @PromptedForReviewPref
        public final void injectPromptedForReviewPref(PromptForReviewNotificationCard instance, LongPreference promptedForReviewPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(promptedForReviewPref, "promptedForReviewPref");
            instance.setPromptedForReviewPref(promptedForReviewPref);
        }

        @JvmStatic
        public final void injectNavigator(PromptForReviewNotificationCard instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
