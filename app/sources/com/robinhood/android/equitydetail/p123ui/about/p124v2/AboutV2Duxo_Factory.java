package com.robinhood.android.equitydetail.p123ui.about.p124v2;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EtpDetailsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AboutV2Duxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo;", "instrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fundamentalStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2StateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AboutV2Duxo_Factory implements Factory<AboutV2Duxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EtpDetailsStore> etpDetailsStore;
    private final Provider<FundamentalStore> fundamentalStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<AboutV2StateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AboutV2Duxo_Factory create(Provider<InstrumentStore> provider, Provider<QuoteStore> provider2, Provider<FundamentalStore> provider3, Provider<EtpDetailsStore> provider4, Provider<DuxoBundle> provider5, Provider<AboutV2StateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final AboutV2Duxo newInstance(InstrumentStore instrumentStore, QuoteStore quoteStore, FundamentalStore fundamentalStore, EtpDetailsStore etpDetailsStore, DuxoBundle duxoBundle, AboutV2StateProvider aboutV2StateProvider) {
        return INSTANCE.newInstance(instrumentStore, quoteStore, fundamentalStore, etpDetailsStore, duxoBundle, aboutV2StateProvider);
    }

    public AboutV2Duxo_Factory(Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<FundamentalStore> fundamentalStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<DuxoBundle> duxoBundle, Provider<AboutV2StateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.fundamentalStore = fundamentalStore;
        this.etpDetailsStore = etpDetailsStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public AboutV2Duxo get() {
        Companion companion = INSTANCE;
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        FundamentalStore fundamentalStore = this.fundamentalStore.get();
        Intrinsics.checkNotNullExpressionValue(fundamentalStore, "get(...)");
        EtpDetailsStore etpDetailsStore = this.etpDetailsStore.get();
        Intrinsics.checkNotNullExpressionValue(etpDetailsStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        AboutV2StateProvider aboutV2StateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(aboutV2StateProvider, "get(...)");
        return companion.newInstance(instrumentStore, quoteStore, fundamentalStore, etpDetailsStore, duxoBundle, aboutV2StateProvider);
    }

    /* compiled from: AboutV2Duxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo_Factory;", "instrumentStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fundamentalStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "etpDetailsStore", "Lcom/robinhood/librobinhood/data/store/EtpDetailsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2StateProvider;", "newInstance", "Lcom/robinhood/android/equitydetail/ui/about/v2/AboutV2Duxo;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AboutV2Duxo_Factory create(Provider<InstrumentStore> instrumentStore, Provider<QuoteStore> quoteStore, Provider<FundamentalStore> fundamentalStore, Provider<EtpDetailsStore> etpDetailsStore, Provider<DuxoBundle> duxoBundle, Provider<AboutV2StateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new AboutV2Duxo_Factory(instrumentStore, quoteStore, fundamentalStore, etpDetailsStore, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final AboutV2Duxo newInstance(InstrumentStore instrumentStore, QuoteStore quoteStore, FundamentalStore fundamentalStore, EtpDetailsStore etpDetailsStore, DuxoBundle duxoBundle, AboutV2StateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
            Intrinsics.checkNotNullParameter(etpDetailsStore, "etpDetailsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new AboutV2Duxo(instrumentStore, quoteStore, fundamentalStore, etpDetailsStore, duxoBundle, stateProvider);
        }
    }
}
