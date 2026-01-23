package com.robinhood.android.equityscreener.datadisplay;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerDataDisplayDuxo_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "indicatorsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class ScreenerDataDisplayDuxo_MembersInjector implements MembersInjector<ScreenerDataDisplayDuxo> {
    private final Provider<IndicatorsStore> indicatorsStore;
    private final Provider<ScanStore> scanStore;
    private final Provider<ScreenersStore> screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ScreenerDataDisplayDuxo> create(Provider<IndicatorsStore> provider, Provider<ScreenersStore> provider2, Provider<ScanStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final void injectIndicatorsStore(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, IndicatorsStore indicatorsStore) {
        INSTANCE.injectIndicatorsStore(screenerDataDisplayDuxo, indicatorsStore);
    }

    @JvmStatic
    public static final void injectScanStore(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, ScanStore scanStore) {
        INSTANCE.injectScanStore(screenerDataDisplayDuxo, scanStore);
    }

    @JvmStatic
    public static final void injectScreenersStore(ScreenerDataDisplayDuxo screenerDataDisplayDuxo, ScreenersStore screenersStore) {
        INSTANCE.injectScreenersStore(screenerDataDisplayDuxo, screenersStore);
    }

    public ScreenerDataDisplayDuxo_MembersInjector(Provider<IndicatorsStore> indicatorsStore, Provider<ScreenersStore> screenersStore, Provider<ScanStore> scanStore) {
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(scanStore, "scanStore");
        this.indicatorsStore = indicatorsStore;
        this.screenersStore = screenersStore;
        this.scanStore = scanStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ScreenerDataDisplayDuxo instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        IndicatorsStore indicatorsStore = this.indicatorsStore.get();
        Intrinsics.checkNotNullExpressionValue(indicatorsStore, "get(...)");
        companion.injectIndicatorsStore(instance, indicatorsStore);
        ScreenersStore screenersStore = this.screenersStore.get();
        Intrinsics.checkNotNullExpressionValue(screenersStore, "get(...)");
        companion.injectScreenersStore(instance, screenersStore);
        ScanStore scanStore = this.scanStore.get();
        Intrinsics.checkNotNullExpressionValue(scanStore, "get(...)");
        companion.injectScanStore(instance, scanStore);
    }

    /* compiled from: ScreenerDataDisplayDuxo_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/equityscreener/datadisplay/ScreenerDataDisplayDuxo;", "indicatorsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "injectIndicatorsStore", "", "instance", "injectScreenersStore", "injectScanStore", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ScreenerDataDisplayDuxo> create(Provider<IndicatorsStore> indicatorsStore, Provider<ScreenersStore> screenersStore, Provider<ScanStore> scanStore) {
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            Intrinsics.checkNotNullParameter(scanStore, "scanStore");
            return new ScreenerDataDisplayDuxo_MembersInjector(indicatorsStore, screenersStore, scanStore);
        }

        @JvmStatic
        public final void injectIndicatorsStore(ScreenerDataDisplayDuxo instance, IndicatorsStore indicatorsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
            instance.setIndicatorsStore(indicatorsStore);
        }

        @JvmStatic
        public final void injectScreenersStore(ScreenerDataDisplayDuxo instance, ScreenersStore screenersStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
            instance.setScreenersStore(screenersStore);
        }

        @JvmStatic
        public final void injectScanStore(ScreenerDataDisplayDuxo instance, ScanStore scanStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(scanStore, "scanStore");
            instance.setScanStore(scanStore);
        }
    }
}
