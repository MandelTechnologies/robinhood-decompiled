package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdateWorker_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker;", "updater", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetUpdateWorker_MembersInjector implements MembersInjector<PortfolioWidgetUpdateWorker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher;
    private final Provider<PortfolioWidgetUpdater> updater;

    @JvmStatic
    public static final MembersInjector<PortfolioWidgetUpdateWorker> create(Provider<PortfolioWidgetUpdater> provider, Provider<PortfolioWidgetUpdateDispatcher> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectUpdateDispatcher(PortfolioWidgetUpdateWorker portfolioWidgetUpdateWorker, PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher) {
        INSTANCE.injectUpdateDispatcher(portfolioWidgetUpdateWorker, portfolioWidgetUpdateDispatcher);
    }

    @JvmStatic
    public static final void injectUpdater(PortfolioWidgetUpdateWorker portfolioWidgetUpdateWorker, PortfolioWidgetUpdater portfolioWidgetUpdater) {
        INSTANCE.injectUpdater(portfolioWidgetUpdateWorker, portfolioWidgetUpdater);
    }

    public PortfolioWidgetUpdateWorker_MembersInjector(Provider<PortfolioWidgetUpdater> updater, Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
        this.updater = updater;
        this.updateDispatcher = updateDispatcher;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PortfolioWidgetUpdateWorker instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        PortfolioWidgetUpdater portfolioWidgetUpdater = this.updater.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetUpdater, "get(...)");
        companion.injectUpdater(instance, portfolioWidgetUpdater);
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher = this.updateDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetUpdateDispatcher, "get(...)");
        companion.injectUpdateDispatcher(instance, portfolioWidgetUpdateDispatcher);
    }

    /* compiled from: PortfolioWidgetUpdateWorker_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker;", "updater", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "injectUpdater", "", "instance", "injectUpdateDispatcher", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PortfolioWidgetUpdateWorker> create(Provider<PortfolioWidgetUpdater> updater, Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher) {
            Intrinsics.checkNotNullParameter(updater, "updater");
            Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
            return new PortfolioWidgetUpdateWorker_MembersInjector(updater, updateDispatcher);
        }

        @JvmStatic
        public final void injectUpdater(PortfolioWidgetUpdateWorker instance, PortfolioWidgetUpdater updater) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(updater, "updater");
            instance.setUpdater(updater);
        }

        @JvmStatic
        public final void injectUpdateDispatcher(PortfolioWidgetUpdateWorker instance, PortfolioWidgetUpdateDispatcher updateDispatcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
            instance.setUpdateDispatcher(updateDispatcher);
        }
    }
}
