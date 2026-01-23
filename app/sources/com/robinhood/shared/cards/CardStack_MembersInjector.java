package com.robinhood.shared.cards;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.cards.prefs.TopCardRhIdPref;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardStack_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardStack_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/CardStack;", "topCardRhIdPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CardStack_MembersInjector implements MembersInjector<CardStack> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<StringPreference> topCardRhIdPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<CardStack> create(Provider<StringPreference> provider, Provider<AnalyticsLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectAnalytics(CardStack cardStack, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(cardStack, analyticsLogger);
    }

    @JvmStatic
    @TopCardRhIdPref
    public static final void injectTopCardRhIdPref(CardStack cardStack, StringPreference stringPreference) {
        INSTANCE.injectTopCardRhIdPref(cardStack, stringPreference);
    }

    public CardStack_MembersInjector(Provider<StringPreference> topCardRhIdPref, Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.topCardRhIdPref = topCardRhIdPref;
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardStack instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        StringPreference stringPreference = this.topCardRhIdPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        companion.injectTopCardRhIdPref(instance, stringPreference);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: CardStack_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/cards/CardStack_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/CardStack;", "topCardRhIdPref", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/StringPreference;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectTopCardRhIdPref", "", "instance", "injectAnalytics", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<CardStack> create(Provider<StringPreference> topCardRhIdPref, Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new CardStack_MembersInjector(topCardRhIdPref, analytics);
        }

        @JvmStatic
        @TopCardRhIdPref
        public final void injectTopCardRhIdPref(CardStack instance, StringPreference topCardRhIdPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(topCardRhIdPref, "topCardRhIdPref");
            instance.setTopCardRhIdPref(topCardRhIdPref);
        }

        @JvmStatic
        public final void injectAnalytics(CardStack instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
