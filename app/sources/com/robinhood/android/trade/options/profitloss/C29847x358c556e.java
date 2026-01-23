package com.robinhood.android.trade.options.profitloss;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.scarlet.transition.StylePropertyTransition;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory */
/* loaded from: classes20.dex */
public final class C29847x358c556e implements Factory<StylePropertyTransition<?, ?>> {
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C29847x358c556e create(Provider<Resources> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final StylePropertyTransition<?, ?> providePositiveAreaColor(Resources resources) {
        return INSTANCE.providePositiveAreaColor(resources);
    }

    public C29847x358c556e(Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public StylePropertyTransition<?, ?> get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.providePositiveAreaColor(resources);
    }

    /* compiled from: FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001d\u0010\t\u001a\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000b2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/options/profitloss/FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory;", "resources", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "providePositiveAreaColor", "Lcom/robinhood/scarlet/transition/StylePropertyTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.profitloss.FeatureOptionsProfitLossChartScarletTransitionsModule_ProvidePositiveAreaColorFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C29847x358c556e create(Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new C29847x358c556e(resources);
        }

        @JvmStatic
        public final StylePropertyTransition<?, ?> providePositiveAreaColor(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Object objCheckNotNull = Preconditions.checkNotNull(FeatureOptionsProfitLossChartScarletTransitionsModule.INSTANCE.providePositiveAreaColor(resources), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (StylePropertyTransition) objCheckNotNull;
        }
    }
}
