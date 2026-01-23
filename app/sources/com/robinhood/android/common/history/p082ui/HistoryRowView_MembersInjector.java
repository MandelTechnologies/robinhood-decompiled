package com.robinhood.android.common.history.p082ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryRowView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class HistoryRowView_MembersInjector implements MembersInjector<HistoryRowView> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<HistoryRowDuxo> duxo;
    private final Provider<HistoryNavigator> historyNavigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<HistoryRowView> create(Provider<HistoryRowDuxo> provider, Provider<AnalyticsLogger> provider2, Provider<HistoryNavigator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectAnalytics(HistoryRowView historyRowView, AnalyticsLogger analyticsLogger) {
        INSTANCE.injectAnalytics(historyRowView, analyticsLogger);
    }

    @JvmStatic
    public static final void injectDuxo(HistoryRowView historyRowView, HistoryRowDuxo historyRowDuxo) {
        INSTANCE.injectDuxo(historyRowView, historyRowDuxo);
    }

    @JvmStatic
    public static final void injectHistoryNavigator(HistoryRowView historyRowView, HistoryNavigator historyNavigator) {
        INSTANCE.injectHistoryNavigator(historyRowView, historyNavigator);
    }

    public HistoryRowView_MembersInjector(Provider<HistoryRowDuxo> duxo, Provider<AnalyticsLogger> analytics, Provider<HistoryNavigator> historyNavigator) {
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        this.duxo = duxo;
        this.analytics = analytics;
        this.historyNavigator = historyNavigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HistoryRowView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        HistoryRowDuxo historyRowDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(historyRowDuxo, "get(...)");
        companion.injectDuxo(instance, historyRowDuxo);
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        HistoryNavigator historyNavigator = this.historyNavigator.get();
        Intrinsics.checkNotNullExpressionValue(historyNavigator, "get(...)");
        companion.injectHistoryNavigator(instance, historyNavigator);
    }

    /* compiled from: HistoryRowView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "duxo", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/history/ui/HistoryRowDuxo;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "injectDuxo", "", "instance", "injectAnalytics", "injectHistoryNavigator", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<HistoryRowView> create(Provider<HistoryRowDuxo> duxo, Provider<AnalyticsLogger> analytics, Provider<HistoryNavigator> historyNavigator) {
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            return new HistoryRowView_MembersInjector(duxo, analytics, historyNavigator);
        }

        @JvmStatic
        public final void injectDuxo(HistoryRowView instance, HistoryRowDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }

        @JvmStatic
        public final void injectAnalytics(HistoryRowView instance, AnalyticsLogger analytics) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            instance.setAnalytics(analytics);
        }

        @JvmStatic
        public final void injectHistoryNavigator(HistoryRowView instance, HistoryNavigator historyNavigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            instance.setHistoryNavigator(historyNavigator);
        }
    }
}
