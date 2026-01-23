package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.widget.util.PortfolioWidgetInfoPref;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetUpdateDispatcher_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "widgetInfoPref", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PortfolioWidgetUpdateDispatcher_Factory implements Factory<PortfolioWidgetUpdateDispatcher> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PortfolioWidgetInfoPref> widgetInfoPref;

    @JvmStatic
    public static final PortfolioWidgetUpdateDispatcher_Factory create(Provider<PortfolioWidgetInfoPref> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final PortfolioWidgetUpdateDispatcher newInstance(PortfolioWidgetInfoPref portfolioWidgetInfoPref) {
        return INSTANCE.newInstance(portfolioWidgetInfoPref);
    }

    public PortfolioWidgetUpdateDispatcher_Factory(Provider<PortfolioWidgetInfoPref> widgetInfoPref) {
        Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
        this.widgetInfoPref = widgetInfoPref;
    }

    @Override // javax.inject.Provider
    public PortfolioWidgetUpdateDispatcher get() {
        Companion companion = INSTANCE;
        PortfolioWidgetInfoPref portfolioWidgetInfoPref = this.widgetInfoPref.get();
        Intrinsics.checkNotNullExpressionValue(portfolioWidgetInfoPref, "get(...)");
        return companion.newInstance(portfolioWidgetInfoPref);
    }

    /* compiled from: PortfolioWidgetUpdateDispatcher_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher_Factory;", "widgetInfoPref", "Ljavax/inject/Provider;", "Lcom/robinhood/android/widget/util/PortfolioWidgetInfoPref;", "newInstance", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioWidgetUpdateDispatcher_Factory create(Provider<PortfolioWidgetInfoPref> widgetInfoPref) {
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            return new PortfolioWidgetUpdateDispatcher_Factory(widgetInfoPref);
        }

        @JvmStatic
        public final PortfolioWidgetUpdateDispatcher newInstance(PortfolioWidgetInfoPref widgetInfoPref) {
            Intrinsics.checkNotNullParameter(widgetInfoPref, "widgetInfoPref");
            return new PortfolioWidgetUpdateDispatcher(widgetInfoPref);
        }
    }
}
