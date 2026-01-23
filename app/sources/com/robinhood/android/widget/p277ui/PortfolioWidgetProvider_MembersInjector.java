package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetProvider_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider;", "updateDispatcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetProvider_MembersInjector implements MembersInjector<PortfolioWidgetProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher;
    private final Provider<PortfolioWidgetInfoPref> widgetInfoPref;

    @JvmStatic
    public static final MembersInjector<PortfolioWidgetProvider> create(Provider<PortfolioWidgetUpdateDispatcher> provider, Provider<PortfolioWidgetInfoPref> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectUpdateDispatcher(PortfolioWidgetProvider portfolioWidgetProvider, PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher) {
        INSTANCE.injectUpdateDispatcher(portfolioWidgetProvider, portfolioWidgetUpdateDispatcher);
    }

    @JvmStatic
    public static final void injectWidgetInfoPref(PortfolioWidgetProvider portfolioWidgetProvider, PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        INSTANCE.injectWidgetInfoPref(portfolioWidgetProvider, portfolioWidgetInfoPref);
    }

    public PortfolioWidgetProvider_MembersInjector(Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher, Provider<PortfolioWidgetInfoPref> widgetInfoPref) {
        Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
        Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
        this.updateDispatcher = updateDispatcher;
        this.widgetInfoPref = widgetInfoPref;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PortfolioWidgetProvider instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher = this.updateDispatcher.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetUpdateDispatcher, "get(...)");
        companion.injectUpdateDispatcher(instance, portfolioWidgetUpdateDispatcher);
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetInfoPref.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetInfoPref, "get(...)");
        companion.injectWidgetInfoPref(instance, portfolioWidgetInfoPref);
    }

    /* compiled from: PortfolioWidgetProvider_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider;", "updateDispatcher", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "widgetInfoPref", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "injectUpdateDispatcher", "", "instance", "injectWidgetInfoPref", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<PortfolioWidgetProvider> create(Provider<PortfolioWidgetUpdateDispatcher> updateDispatcher, Provider<PortfolioWidgetInfoPref> widgetInfoPref) {
            Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            return new PortfolioWidgetProvider_MembersInjector(updateDispatcher, widgetInfoPref);
        }

        @JvmStatic
        public final void injectUpdateDispatcher(PortfolioWidgetProvider instance, PortfolioWidgetUpdateDispatcher updateDispatcher) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(updateDispatcher, "updateDispatcher");
            instance.setUpdateDispatcher(updateDispatcher);
        }

        @JvmStatic
        public final void injectWidgetInfoPref(PortfolioWidgetProvider instance, PortfolioWidgetInfoPref widgetInfoPref) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            instance.setWidgetInfoPref(widgetInfoPref);
        }
    }
}
