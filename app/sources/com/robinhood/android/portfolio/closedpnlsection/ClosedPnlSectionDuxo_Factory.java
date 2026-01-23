package com.robinhood.android.portfolio.closedpnlsection;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.portfolio.pnl.ProfitAndLossHubSectionStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: ClosedPnlSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "pnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-closed-pnl-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ClosedPnlSectionDuxo_Factory implements Factory<ClosedPnlSectionDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ProfitAndLossHubSectionStore> pnlStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ClosedPnlSectionDuxo_Factory create(Provider<ProfitAndLossHubSectionStore> provider, Provider<Clock> provider2, Provider<DuxoBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ClosedPnlSectionDuxo newInstance(ProfitAndLossHubSectionStore profitAndLossHubSectionStore, Clock clock, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(profitAndLossHubSectionStore, clock, duxoBundle);
    }

    public ClosedPnlSectionDuxo_Factory(Provider<ProfitAndLossHubSectionStore> pnlStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(pnlStore, "pnlStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pnlStore = pnlStore;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public ClosedPnlSectionDuxo get() {
        Companion companion = INSTANCE;
        ProfitAndLossHubSectionStore profitAndLossHubSectionStore = this.pnlStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossHubSectionStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(profitAndLossHubSectionStore, clock, duxoBundle);
    }

    /* compiled from: ClosedPnlSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;", "pnlStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo_Factory;", "Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "newInstance", "(Lcom/robinhood/android/portfolio/pnl/ProfitAndLossHubSectionStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/portfolio/closedpnlsection/ClosedPnlSectionDuxo;", "lib-closed-pnl-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ClosedPnlSectionDuxo_Factory create(Provider<ProfitAndLossHubSectionStore> pnlStore, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(pnlStore, "pnlStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ClosedPnlSectionDuxo_Factory(pnlStore, clock, duxoBundle);
        }

        @JvmStatic
        public final ClosedPnlSectionDuxo newInstance(ProfitAndLossHubSectionStore pnlStore, Clock clock, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(pnlStore, "pnlStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new ClosedPnlSectionDuxo(pnlStore, clock, duxoBundle);
        }
    }
}
