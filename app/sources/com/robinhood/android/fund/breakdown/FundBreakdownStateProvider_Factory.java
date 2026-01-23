package com.robinhood.android.fund.breakdown;

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

/* compiled from: FundBreakdownStateProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider;", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider;", "Ljavax/inject/Provider;", "Companion", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FundBreakdownStateProvider_Factory implements Factory<FundBreakdownStateProvider> {
    private final Provider<Clock> clock;
    private final Provider<Resources> resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final FundBreakdownStateProvider_Factory create(Provider<Resources> provider, Provider<Clock> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final FundBreakdownStateProvider newInstance(Resources resources, Clock clock) {
        return INSTANCE.newInstance(resources, clock);
    }

    public FundBreakdownStateProvider_Factory(Provider<Resources> resources, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.resources = resources;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public FundBreakdownStateProvider get() {
        Companion companion = INSTANCE;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(resources, clock);
    }

    /* compiled from: FundBreakdownStateProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider_Factory;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider;", "newInstance", "(Landroid/content/res/Resources;Lj$/time/Clock;)Lcom/robinhood/android/fund/breakdown/FundBreakdownStateProvider;", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FundBreakdownStateProvider_Factory create(Provider<Resources> resources, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new FundBreakdownStateProvider_Factory(resources, clock);
        }

        @JvmStatic
        public final FundBreakdownStateProvider newInstance(Resources resources, Clock clock) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new FundBreakdownStateProvider(resources, clock);
        }
    }
}
