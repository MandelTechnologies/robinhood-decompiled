package com.robinhood.android.widget.p277ui;

import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.navigation.Navigator;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioWidgetViewsBuilder_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "nightModeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PortfolioWidgetViewsBuilder_Factory implements Factory<PortfolioWidgetViewsBuilder> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<Navigator> navigator;
    private final Provider<NightModeManager> nightModeManager;

    @JvmStatic
    public static final PortfolioWidgetViewsBuilder_Factory create(Provider<NightModeManager> provider, Provider<ColorSchemeManager> provider2, Provider<Navigator> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final PortfolioWidgetViewsBuilder newInstance(NightModeManager nightModeManager, ColorSchemeManager colorSchemeManager, Navigator navigator) {
        return INSTANCE.newInstance(nightModeManager, colorSchemeManager, navigator);
    }

    public PortfolioWidgetViewsBuilder_Factory(Provider<NightModeManager> nightModeManager, Provider<ColorSchemeManager> colorSchemeManager, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.nightModeManager = nightModeManager;
        this.colorSchemeManager = colorSchemeManager;
        this.navigator = navigator;
    }

    @Override // javax.inject.Provider
    public PortfolioWidgetViewsBuilder get() {
        Companion companion = INSTANCE;
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        return companion.newInstance(nightModeManager, colorSchemeManager, navigator);
    }

    /* compiled from: PortfolioWidgetViewsBuilder_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder_Factory;", "nightModeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "newInstance", "Lcom/robinhood/android/widget/ui/PortfolioWidgetViewsBuilder;", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioWidgetViewsBuilder_Factory create(Provider<NightModeManager> nightModeManager, Provider<ColorSchemeManager> colorSchemeManager, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new PortfolioWidgetViewsBuilder_Factory(nightModeManager, colorSchemeManager, navigator);
        }

        @JvmStatic
        public final PortfolioWidgetViewsBuilder newInstance(NightModeManager nightModeManager, ColorSchemeManager colorSchemeManager, Navigator navigator) {
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new PortfolioWidgetViewsBuilder(nightModeManager, colorSchemeManager, navigator);
        }
    }
}
