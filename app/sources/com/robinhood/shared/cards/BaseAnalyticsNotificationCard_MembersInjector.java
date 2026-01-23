package com.robinhood.shared.cards;

import android.view.View;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAnalyticsNotificationCard_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0001\rB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard_MembersInjector;", "T", "Landroid/view/View;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BaseAnalyticsNotificationCard_MembersInjector<T extends View> implements MembersInjector<BaseAnalyticsNotificationCard<T>> {
    private final Provider<AnalyticsLogger> analytics;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final <T extends View> MembersInjector<BaseAnalyticsNotificationCard<T>> create(Provider<AnalyticsLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final <T extends View> void injectAnalytics(BaseAnalyticsNotificationCard<T> baseAnalyticsNotificationCard, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(baseAnalyticsNotificationCard, analyticsLogger);
    }

    public BaseAnalyticsNotificationCard_MembersInjector(Provider<AnalyticsLogger> analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.analytics = analytics;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseAnalyticsNotificationCard<T> instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
    }

    /* compiled from: BaseAnalyticsNotificationCard_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\b\b\u0001\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J(\u0010\f\u001a\u00020\r\"\b\b\u0001\u0010\u0007*\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\t\u001a\u00020\u000bH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/cards/BaseAnalyticsNotificationCard;", "T", "Landroid/view/View;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "injectAnalytics", "", "instance", "lib-cards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <T extends View> MembersInjector<BaseAnalyticsNotificationCard<T>> create(Provider<AnalyticsLogger> analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            return new BaseAnalyticsNotificationCard_MembersInjector(analytics);
        }

        @JvmStatic
        public final <T extends View> void injectAnalytics(BaseAnalyticsNotificationCard<T> instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }
    }
}
