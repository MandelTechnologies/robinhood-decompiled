package com.robinhood.android.cortex.digest.asset.splash;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestSplashDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;", "assetDigestOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestSplashDuxo_Factory implements Factory<AssetDigestSplashDuxo> {
    private final Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsProvider> experimentsProvider;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AssetDigestSplashDuxo_Factory create(Provider<AssetDigestOnboardingStore> provider, Provider<ExperimentsProvider> provider2, Provider<SavedStateHandle> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final AssetDigestSplashDuxo newInstance(AssetDigestOnboardingStore assetDigestOnboardingStore, ExperimentsProvider experimentsProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(assetDigestOnboardingStore, experimentsProvider, savedStateHandle, duxoBundle);
    }

    public AssetDigestSplashDuxo_Factory(Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore, Provider<ExperimentsProvider> experimentsProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.assetDigestOnboardingStore = assetDigestOnboardingStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public AssetDigestSplashDuxo get() {
        Companion companion = INSTANCE;
        AssetDigestOnboardingStore assetDigestOnboardingStore = this.assetDigestOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(assetDigestOnboardingStore, "get(...)");
        ExperimentsProvider experimentsProvider = this.experimentsProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(assetDigestOnboardingStore, experimentsProvider, savedStateHandle, duxoBundle);
    }

    /* compiled from: AssetDigestSplashDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo_Factory;", "assetDigestOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetDigestSplashDuxo_Factory create(Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore, Provider<ExperimentsProvider> experimentsProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AssetDigestSplashDuxo_Factory(assetDigestOnboardingStore, experimentsProvider, savedStateHandle, duxoBundle);
        }

        @JvmStatic
        public final AssetDigestSplashDuxo newInstance(AssetDigestOnboardingStore assetDigestOnboardingStore, ExperimentsProvider experimentsProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
            Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new AssetDigestSplashDuxo(assetDigestOnboardingStore, experimentsProvider, savedStateHandle, duxoBundle);
        }
    }
}
