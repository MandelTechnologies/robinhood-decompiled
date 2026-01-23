package com.robinhood.android.equitydetail.p123ui.carousel;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.carousel.InstrumentCard_MembersInjector;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityInstrumentCard_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityInstrumentCard_MembersInjector implements MembersInjector<EquityInstrumentCard> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<Navigator> navigator;
    private final Provider<QuoteStore> quoteStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EquityInstrumentCard> create(Provider<AnalyticsLogger> provider, Provider<InstrumentStore> provider2, Provider<QuoteStore> provider3, Provider<Navigator> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectInstrumentStore(EquityInstrumentCard equityInstrumentCard, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(equityInstrumentCard, instrumentStore);
    }

    @JvmStatic
    public static final void injectNavigator(EquityInstrumentCard equityInstrumentCard, Navigator navigator) {
        INSTANCE.injectNavigator(equityInstrumentCard, navigator);
    }

    @JvmStatic
    public static final void injectQuoteStore(EquityInstrumentCard equityInstrumentCard, QuoteStore quoteStore) {
        INSTANCE.injectQuoteStore(equityInstrumentCard, quoteStore);
    }

    public EquityInstrumentCard_MembersInjector(Provider<AnalyticsLogger> analytics, Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.analytics = analytics;
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.navigator = navigator;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EquityInstrumentCard instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        InstrumentCard_MembersInjector.Companion companion = InstrumentCard_MembersInjector.INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        companion.injectAnalytics(instance, analyticsLogger);
        Companion companion2 = INSTANCE;
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(instance, instrumentStore);
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        companion2.injectQuoteStore(instance, quoteStore);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion2.injectNavigator(instance, navigator);
    }

    /* compiled from: EquityInstrumentCard_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equitydetail/ui/carousel/EquityInstrumentCard;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "injectInstrumentStore", "", "instance", "injectQuoteStore", "injectNavigator", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EquityInstrumentCard> create(Provider<AnalyticsLogger> analytics, Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new EquityInstrumentCard_MembersInjector(analytics, instrumentStore, quoteStore, navigator);
        }

        @JvmStatic
        public final void injectInstrumentStore(EquityInstrumentCard instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectQuoteStore(EquityInstrumentCard instance, QuoteStore quoteStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            instance.setQuoteStore(quoteStore);
        }

        @JvmStatic
        public final void injectNavigator(EquityInstrumentCard instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }
    }
}
