package com.robinhood.android.options.p208ui.detail;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "historyNavigator", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "resources", "Landroid/content/res/Resources;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionsDetailPageStateProvider_Factory implements Factory<OptionsDetailPageStateProvider> {
    private final Provider<HistoryNavigator> historyNavigator;
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsDetailPageStateProvider_Factory create(Provider<HistoryNavigator> provider, Provider<Resources> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final OptionsDetailPageStateProvider newInstance(HistoryNavigator historyNavigator, Resources resources) {
        return INSTANCE.newInstance(historyNavigator, resources);
    }

    public OptionsDetailPageStateProvider_Factory(Provider<HistoryNavigator> historyNavigator, Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.historyNavigator = historyNavigator;
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public OptionsDetailPageStateProvider get() {
        Companion companion = INSTANCE;
        HistoryNavigator historyNavigator = this.historyNavigator.get();
        Intrinsics.checkNotNullExpressionValue(historyNavigator, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.newInstance(historyNavigator, resources);
    }

    /* compiled from: OptionsDetailPageStateProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider_Factory;", "historyNavigator", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "resources", "Landroid/content/res/Resources;", "newInstance", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageStateProvider;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsDetailPageStateProvider_Factory create(Provider<HistoryNavigator> historyNavigator, Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new OptionsDetailPageStateProvider_Factory(historyNavigator, resources);
        }

        @JvmStatic
        public final OptionsDetailPageStateProvider newInstance(HistoryNavigator historyNavigator, Resources resources) {
            Intrinsics.checkNotNullParameter(historyNavigator, "historyNavigator");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new OptionsDetailPageStateProvider(historyNavigator, resources);
        }
    }
}
