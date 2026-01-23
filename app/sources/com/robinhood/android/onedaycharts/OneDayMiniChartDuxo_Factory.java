package com.robinhood.android.onedaycharts;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.OneDayChartStore;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OneDayMiniChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "oneDayChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OneDayMiniChartDuxo_Factory implements Factory<OneDayMiniChartDuxo> {
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<OneDayChartStore> oneDayChartStore;
    private final Provider<OneDayMiniChartDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OneDayMiniChartDuxo_Factory create(Provider<OneDayChartStore> provider, Provider<Clock> provider2, Provider<OneDayMiniChartDuxo4> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OneDayMiniChartDuxo newInstance(OneDayChartStore oneDayChartStore, Clock clock, OneDayMiniChartDuxo4 oneDayMiniChartDuxo4, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(oneDayChartStore, clock, oneDayMiniChartDuxo4, duxoBundle);
    }

    public OneDayMiniChartDuxo_Factory(Provider<OneDayChartStore> oneDayChartStore, Provider<Clock> clock, Provider<OneDayMiniChartDuxo4> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(oneDayChartStore, "oneDayChartStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.oneDayChartStore = oneDayChartStore;
        this.clock = clock;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OneDayMiniChartDuxo get() {
        Companion companion = INSTANCE;
        OneDayChartStore oneDayChartStore = this.oneDayChartStore.get();
        Intrinsics.checkNotNullExpressionValue(oneDayChartStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        OneDayMiniChartDuxo4 oneDayMiniChartDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(oneDayMiniChartDuxo4, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(oneDayChartStore, clock, oneDayMiniChartDuxo4, duxoBundle);
    }

    /* compiled from: OneDayMiniChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore;", "oneDayChartStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo_Factory;", "Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/OneDayChartStore;Lj$/time/Clock;Lcom/robinhood/android/onedaycharts/OneDayMiniChartItemStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/onedaycharts/OneDayMiniChartDuxo;", "lib-one-day-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OneDayMiniChartDuxo_Factory create(Provider<OneDayChartStore> oneDayChartStore, Provider<Clock> clock, Provider<OneDayMiniChartDuxo4> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(oneDayChartStore, "oneDayChartStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OneDayMiniChartDuxo_Factory(oneDayChartStore, clock, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OneDayMiniChartDuxo newInstance(OneDayChartStore oneDayChartStore, Clock clock, OneDayMiniChartDuxo4 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(oneDayChartStore, "oneDayChartStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OneDayMiniChartDuxo(oneDayChartStore, clock, stateProvider, duxoBundle);
        }
    }
}
