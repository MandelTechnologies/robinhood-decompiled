package com.robinhood.android.mcw.mcwconversionorderdetails;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.p166fx.provider.FxOrderProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversionOrderDetailsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsDuxo;", "fxOrderProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-mcw-conversion-order-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ConversionOrderDetailsDuxo_Factory implements Factory<ConversionOrderDetailsDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<FxOrderProvider> fxOrderProvider;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ConversionOrderDetailsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ConversionOrderDetailsDuxo_Factory create(Provider<FxOrderProvider> provider, Provider<RegionGateProvider> provider2, Provider<SavedStateHandle> provider3, Provider<DuxoBundle> provider4, Provider<ConversionOrderDetailsStateProvider> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final ConversionOrderDetailsDuxo newInstance(FxOrderProvider fxOrderProvider, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, ConversionOrderDetailsStateProvider conversionOrderDetailsStateProvider) {
        return INSTANCE.newInstance(fxOrderProvider, regionGateProvider, savedStateHandle, duxoBundle, conversionOrderDetailsStateProvider);
    }

    public ConversionOrderDetailsDuxo_Factory(Provider<FxOrderProvider> fxOrderProvider, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<ConversionOrderDetailsStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(fxOrderProvider, "fxOrderProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.fxOrderProvider = fxOrderProvider;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public ConversionOrderDetailsDuxo get() {
        Companion companion = INSTANCE;
        FxOrderProvider fxOrderProvider = this.fxOrderProvider.get();
        Intrinsics.checkNotNullExpressionValue(fxOrderProvider, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        ConversionOrderDetailsStateProvider conversionOrderDetailsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(conversionOrderDetailsStateProvider, "get(...)");
        return companion.newInstance(fxOrderProvider, regionGateProvider, savedStateHandle, duxoBundle, conversionOrderDetailsStateProvider);
    }

    /* compiled from: ConversionOrderDetailsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsDuxo_Factory;", "fxOrderProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsStateProvider;", "newInstance", "Lcom/robinhood/android/mcw/mcwconversionorderdetails/ConversionOrderDetailsDuxo;", "feature-mcw-conversion-order-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ConversionOrderDetailsDuxo_Factory create(Provider<FxOrderProvider> fxOrderProvider, Provider<RegionGateProvider> regionGateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<ConversionOrderDetailsStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(fxOrderProvider, "fxOrderProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ConversionOrderDetailsDuxo_Factory(fxOrderProvider, regionGateProvider, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final ConversionOrderDetailsDuxo newInstance(FxOrderProvider fxOrderProvider, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, ConversionOrderDetailsStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(fxOrderProvider, "fxOrderProvider");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new ConversionOrderDetailsDuxo(fxOrderProvider, regionGateProvider, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}
