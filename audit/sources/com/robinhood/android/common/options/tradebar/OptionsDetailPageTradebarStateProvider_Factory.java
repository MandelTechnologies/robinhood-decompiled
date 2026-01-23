package com.robinhood.android.common.options.tradebar;

import android.content.res.Resources;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionsDetailPageTradebarStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/res/Resources;", "resources", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "Ljavax/inject/Provider;", "Companion", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionsDetailPageTradebarStateProvider_Factory implements Factory<OptionsDetailPageTradebarStateProvider> {
    private final Provider<Clock> clock;
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsDetailPageTradebarStateProvider_Factory create(Provider<Clock> provider, Provider<Resources> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final OptionsDetailPageTradebarStateProvider newInstance(Clock clock, Resources resources) {
        return INSTANCE.newInstance(clock, resources);
    }

    public OptionsDetailPageTradebarStateProvider_Factory(Provider<Clock> clock, Provider<Resources> resources) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.clock = clock;
        this.resources = resources;
    }

    @Override // javax.inject.Provider
    public OptionsDetailPageTradebarStateProvider get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        return companion.newInstance(clock, resources);
    }

    /* compiled from: OptionsDetailPageTradebarStateProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider_Factory;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "newInstance", "(Lj$/time/Clock;Landroid/content/res/Resources;)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsDetailPageTradebarStateProvider_Factory create(Provider<Clock> clock, Provider<Resources> resources) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new OptionsDetailPageTradebarStateProvider_Factory(clock, resources);
        }

        @JvmStatic
        public final OptionsDetailPageTradebarStateProvider newInstance(Clock clock, Resources resources) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(resources, "resources");
            return new OptionsDetailPageTradebarStateProvider(clock, resources);
        }
    }
}
